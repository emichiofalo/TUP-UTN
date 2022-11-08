let idArticulo:number = 0;

class Articulo {
    id:number = 0;
    fechaAlta: string = "";
    codigo: string = "";
    denominacion: string = "";
    precio: number = 0;
    publicado: string = "";
}

async function getArticulosJSON(){
	let urlServer = 'http://localhost:3000/articulos';
    const txtSearch = document.getElementById("txtSearch") as HTMLInputElement;
    if(txtSearch.value && txtSearch.value != ""){
        urlServer = 'http://localhost:3000/searcharticulo/'+txtSearch.value;
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
    let datos:Articulo[] = await response.json();
    let grillaHTML = "";
    grillaHTML = getEncabezado(grillaHTML);
    for (const art of datos){
        grillaHTML += '<div class="row">';
        grillaHTML += '<div class="col">' + art.id + '</div>';
        grillaHTML += '<div class="col">' + art.fechaAlta + '</div>';
        grillaHTML += '<div class="col">' + art.codigo + '</div>';
        grillaHTML += '<div class="col">' + art.denominacion + '</div>';
        grillaHTML += '<div class="col">' + art.precio + '</div>';
        grillaHTML += '<div class="col">' + art.publicado + '</div>';
        grillaHTML += '<div class="col" onclick="editarArticulo('+art.id+')" style="cursor:pointer; color:green">Editar</div>';
        grillaHTML += '<div class="col" onclick="eliminarArticulo('+art.id+')" style="cursor:pointer; color:red">Eliminar</div>';
        grillaHTML += '</div>';
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
    var divArt = document.getElementById("listaArticulos");
    if(divArt)  {
        divArt.innerHTML  = grillaHTML;
    }
}

async function limpiarDatos(){
    const artID = document.getElementById("artID") as HTMLInputElement;
    artID.value = "0";
    idArticulo = 0;
}

async function insertarActualizarDatos(){

    const artCodigo = document.getElementById("artCodigo") as HTMLInputElement;
    const artDenominacion = document.getElementById("artDenominacion") as HTMLInputElement;
    const artPrecio = document.getElementById("artPrecio") as HTMLInputElement;
    const artPublicado = document.getElementById("artPublicado") as HTMLSelectElement;
    const fechaAlta = new Date().getFullYear() + "-" + new Date().getMonth() + "-" + new Date().getDay();
    
    if(!artCodigo.value || !artDenominacion.value || !artPrecio.value || !artPublicado.value){
        let txtMensaje = document.getElementById("txtMensaje");
        if(txtMensaje)
            txtMensaje.innerHTML = "Ingrese los datos del articulo";
        return;
    }

    let urlServer:string = "http://localhost:3000/insert";
    let metodo:string = "POST";
    let articulo:Articulo = new Articulo();
    if(idArticulo > 0){
        articulo.id = idArticulo;
        urlServer = "http://localhost:3000/update";
        metodo = "PUT";
    }else{
        articulo.fechaAlta = fechaAlta;
    }
    articulo.codigo = artCodigo.value;
    articulo.denominacion = artDenominacion.value;
    articulo.precio = parseFloat(artPrecio.value);
    articulo.publicado = artPublicado.value;

    const response = await fetch(urlServer, {
    method: metodo,
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    },
    body: JSON.stringify(articulo),
    });
    
    response.json().then(data => {
        let txtMensaje = document.getElementById("txtMensaje");
        if(txtMensaje)
            txtMensaje.innerHTML = data.message;
        getArticulosJSON();
    });
    
}


async function editarArticulo(id:number){
    idArticulo = id;
    let urlServer = 'http://localhost:3000/articulo/'+id;
	let response = await fetch(urlServer, {
		method: 'GET',
        headers: {
			'Content-type': 'application/json',
			'Access-Control-Allow-Origin':'*'
		},
        mode: 'cors'
	});

    const artID = document.getElementById("artID") as HTMLInputElement;
    const artCodigo = document.getElementById("artCodigo") as HTMLInputElement;
    const artDenominacion = document.getElementById("artDenominacion") as HTMLInputElement;
    const artPrecio = document.getElementById("artPrecio") as HTMLInputElement;
    const artPublicado = document.getElementById("artPublicado") as HTMLSelectElement;
    const artFecha = document.getElementById("artFecha") as HTMLInputElement;

	let articulo:Articulo = await response.json() as Articulo;
    artID.value = articulo.id.toString();
    artCodigo.value = articulo.codigo;
    artDenominacion.value = articulo.denominacion;
    artPrecio.value = articulo.precio.toString();
    artPublicado.value = articulo.publicado;
    artFecha.value = articulo.fechaAlta;
}

async function eliminarArticulo(id:number){
    let urlServer = 'http://localhost:3000/delete/'+id;
	await fetch(urlServer, {
		method: 'DELETE',
        headers: {
			'Content-type': 'application/json',
			'Access-Control-Allow-Origin':'*'
		},
        mode: 'cors'
	});
    getArticulosJSON();
}

function getEncabezado(grillaHTML:string){
    grillaHTML += '<div class="row">';
    grillaHTML += '<div class="col"><b>ID</b></div>';
    grillaHTML += '<div class="col"><b>FECHA ALTA</b></div>';
    grillaHTML += '<div class="col"><b>CODIGO</b></div>';
    grillaHTML += '<div class="col"><b>DENOMINACION</b></div>';
    grillaHTML += '<div class="col"><b>PRECIO</b></div>';
    grillaHTML += '<div class="col"><b>PUBLICADO</b></div>';
    grillaHTML += '<div class="col"></div>';
    grillaHTML += '<div class="col"></div>';
    grillaHTML += '</div>';
    return grillaHTML;
}

function getFila(grillaHTML:string, art:Articulo){
        grillaHTML += '<div class="row">';
        grillaHTML += '<div class="col">' + art.id + '</div>';
        grillaHTML += '<div class="col">' + art.fechaAlta + '</div>';
        grillaHTML += '<div class="col">' + art.codigo + '</div>';
        grillaHTML += '<div class="col">' + art.denominacion + '</div>';
        grillaHTML += '<div class="col">' + art.precio + '</div>';
        grillaHTML += '<div class="col">' + art.publicado + '</div>';
        grillaHTML += '<div class="col" onclick="editarArticulo('+art.id+')" style="cursor:pointer; color:green">Editar</div>';
        grillaHTML += '<div class="col" onclick="eliminarArticulo('+art.id+')" style="cursor:pointer; color:red">Eliminar</div>';
        grillaHTML += '</div>';
        return grillaHTML;
}