class Rubro {
    id:number = 0;
    denominacion:string = "";
}

class Producto {
    id:number = 0;
    codigo:string = "";
    denominacion:string = "";
    precio:number = 0;
    idrubro:number = 0;
}

async function getRubrosJSON(){
    let urlServer = 'http://localhost:3000/rubros';
    let response = await fetch(urlServer, {
		method: 'GET',
        headers: {
			'Content-type': 'application/json',
			'Access-Control-Allow-Origin':'*'
		},
        mode: 'cors'
	});
    console.log(response);
    let datos:Rubro[] = await response.json();
    let selectContent = "";
    for (const rub of datos){
        selectContent += '<option value="'+ rub.id.toString() + '">'+ rub.denominacion.toUpperCase() + '</option>\n';
    };
    var slctRubs = document.getElementById("rubrosSLCT") as HTMLInputElement;
    if(slctRubs){
        slctRubs.innerHTML = selectContent;
    }
}

async function getProductosJSON(idRubro:number){
    const rubrosSLCT = document.getElementById("rubrosSLCT") as HTMLInputElement;
    let urlServer;
    if(rubrosSLCT.value){
        urlServer = 'http://localhost:3000/productos/'+rubrosSLCT.value;
        let response = await fetch(urlServer, {
            method: 'GET',
            headers: {
                'Content-type': 'application/json',
                'Access-Control-Allow-Origin':'*'
            },
            mode: 'cors'
        });
        console.log(response);
        let datos:Producto[] = await response.json();
        let tablaHTML = "";
        tablaHTML = getEncabezado(tablaHTML);
        for (const prod of datos){
            tablaHTML += '<tr>';
            tablaHTML += '<td>'+ prod.codigo +'</td>';
            tablaHTML += '<td>'+ prod.denominacion +'</td>';
            tablaHTML += '<td>'+ prod.precio +'</td>';
            tablaHTML += '</tr>';
        };
        tablaHTML += '</table></tr>';
        var divProds = document.getElementById("tablaProductos");
        if(divProds){
            divProds.innerHTML = tablaHTML;
        }
    }
}

function getEncabezado(tablaHTML:string){
    tablaHTML += '<table><tr>';
    tablaHTML += '<th>CÓDIGO</th>';
    tablaHTML += '<th>DENOMINACIÓN</th>';
    tablaHTML += '<th>PRECIO</th>';
    return tablaHTML;
}