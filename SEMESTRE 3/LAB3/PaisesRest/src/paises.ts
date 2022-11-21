class Pais {
    codigo : string = "";
    nombre : string = "";
    continente : string = "";
    poblacion : number = 0;
}
class Consulta{
    pmax : number = 0;
    pmin : number = 0;
}

async function getPaisesJSON(){
	let urlServer = 'http://localhost:3000/paises';
    const txtSearchMax = document.getElementById("txtSearchMax") as HTMLInputElement;
    const txtSearchMin = document.getElementById("txtSearchMin") as HTMLInputElement;
    if(txtSearchMax.value && txtSearchMax.value != "" && txtSearchMin.value && txtSearchMin.value != ""){
        urlServer = 'http://localhost:3000/paises/'+parseInt(txtSearchMax.value)+'-'+parseInt(txtSearchMin.value);
    }
    
	let response = await fetch(urlServer, {
		method: 'GET',
        headers: {
			'Content-type': 'application/json',
			'Access-Control-Allow-Origin':'*'
		},
        mode: 'cors'
	});
	console.log(response);
    let datos:Pais[] = await response.json();
    let grillaHTML = "";
    grillaHTML = getEncabezado(grillaHTML);
    for (const pais of datos){
        grillaHTML += '<tr>';
        grillaHTML += '<td>' + pais.codigo + '</td>';
        grillaHTML += '<td>' + pais.nombre + '</td>';
        grillaHTML += '<td>' + pais.continente + '</td>';
        grillaHTML += '<td>' + pais.poblacion + '</td>';
        grillaHTML += '</tr>';
    };
    //for clasico
    /*for(let i:number=0; i < datos.length; i++){
        grillaHTML += '<div class="row">';
        grillaHTML += '<div class="col">' + datos[i].id + '</div>';
        grillaHTML += '<div class="col">' + datos[i].fechaAlta + '</div>';
        grillaHTML += '<div class="col">' + datos[i].codigo + '</div>';
        grillaHTML += '<div class="col">' + datos[i].denominacion + '</div>';
        grillaHTML += '<div class="col">' + datos[i].precio + '</div>';
        grillaHTML += '<div class="col">' + datos[i].publicado + '</div>';
        grillaHTML += '</div>';
    }*/
    //NO USAR FOREACH PORQUE NO ES ASINCRONICO, HABRIA Q HACER UN CONTROLADOR PARA QUE MUESTRE LA GRILLA
    var divArt = document.getElementById("listaPaises");
    if(divArt)  {
        divArt.innerHTML  = grillaHTML;
    }
}

function getEncabezado(grillaHTML:string){
    grillaHTML += '<tr>';
    grillaHTML += '<td><b>CODIGO</b></td>';
    grillaHTML += '<td><b>NOMBRE</b></td>';
    grillaHTML += '<td><b>Continente</b></td>';
    grillaHTML += '<td><b>POBLACION</b></td>';
    grillaHTML += '</tr>';
    return grillaHTML;
}