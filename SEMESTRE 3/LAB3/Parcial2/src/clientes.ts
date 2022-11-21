let id:number = 0; 

class Cliente {
    id:number = 0; 
    nombre: string = "";
    apellido: string = "";
    saldo: number = 0; 
    domicilio: string = "";
    telefono: number = 0;
    cuit: number = 0;
}

async function getClientesJSON(){
    let urlServer = 'http://localhost:3000/clientes';
    const txtSearch = document.getElementById("txtSearch") as HTMLInputElement;
    if(txtSearch.value.toUpperCase() && txtSearch.value.toUpperCase() != ""){
        urlServer = 'http://localhost:3000/clientes/'+txtSearch.value;
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
    let datos:Cliente[] = await response.json();
    let grillaHTML = "";
    grillaHTML = getEncabezado(grillaHTML);
    for (const c of datos){
        grillaHTML += '<div class="row">';
        grillaHTML += '<div class="col">' + c.id + '</div>';
        grillaHTML += '<div class="col">' + c.nombre + '</div>';
        grillaHTML += '<div class="col">' + c.apellido + '</div>';
        grillaHTML += '<div class="col">' + c.saldo + '</div>';
        grillaHTML += '<div class="col">' + c.domicilio + '</div>';
        grillaHTML += '<div class="col">' + c.telefono + '</div>';
        grillaHTML += '<div class="col">' + c.cuit + '</div>';
        grillaHTML += '<div class="col" onclick="editarCliente('+c.id+')" style="cursor:pointer; color:green">Editar</div>';
        grillaHTML += '<div class="col" onclick="eliminarCliente('+c.id+')" style="cursor:pointer; color:red">Eliminar</div>';
        grillaHTML += '</div>';
    };
    var divArt = document.getElementById("listaClientes");
    if(divArt)  {
        divArt.innerHTML  = grillaHTML;
    }
}

async function limpiarDatos(){
    const cId = document.getElementById("cId") as HTMLInputElement;
    cId.value = "0";
    id = 0;
}

async function insertarActualizarDatos(){

    const cNombre = document.getElementById("cNombre") as HTMLInputElement;
    const cApellido = document.getElementById("cApellido") as HTMLInputElement;
    const cSaldo = document.getElementById("cSaldo") as HTMLInputElement;
    const cDomicilio = document.getElementById("cDomicilio") as HTMLInputElement;
    const cTelefono = document.getElementById("cTelefono") as HTMLInputElement;
    const cCuit = document.getElementById("cCuit") as HTMLSelectElement;
    
    if(!cNombre.value || !cApellido.value || !cSaldo.value || !cDomicilio.value  || !cTelefono.value  || !cCuit.value){
        let txtMensaje = document.getElementById("txtMensaje");
        if(txtMensaje)
            txtMensaje.innerHTML = "Ingrese todos los datos del cliente.";
        return;
    }

    let urlServer:string = "http://localhost:3000/insert";
    let metodo:string = "POST";
    let cliente:Cliente = new Cliente();
    if(id > 0){
        cliente.id = id;
        urlServer = "http://localhost:3000/update";
        metodo = "PUT";
    }
    cliente.nombre = cNombre.value.toUpperCase();
    cliente.apellido = cApellido.value.toUpperCase();
    cliente.saldo = Number(cSaldo.value);
    cliente.domicilio = cDomicilio.value.toUpperCase();
    cliente.telefono = Number(cTelefono.value);
    cliente.cuit = Number(cCuit.value);

    const response = await fetch(urlServer, {
    method: metodo,
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    },
    body: JSON.stringify(cliente),
    });
    
    response.json().then(data => {
        let txtMensaje = document.getElementById("txtMensaje");
        if(txtMensaje)
            txtMensaje.innerHTML = data.message;
        getClientesJSON();
    });
}

async function editarCliente(numId:number){
    id = numId;
    let urlServer = 'http://localhost:3000/cliente/'+id;
	let response = await fetch(urlServer, {
		method: 'GET',
        headers: {
			'Content-type': 'application/json',
			'Access-Control-Allow-Origin':'*'
		},
        mode: 'cors'
	});

    const cId = document.getElementById("cId") as HTMLInputElement;
    const cNombre = document.getElementById("cNombre") as HTMLInputElement;
    const cApellido = document.getElementById("cApellido") as HTMLInputElement;
    const cSaldo = document.getElementById("cSaldo") as HTMLInputElement;
    const cDomicilio = document.getElementById("cDomicilio") as HTMLInputElement;
    const cTelefono = document.getElementById("cTelefono") as HTMLInputElement;
    const cCuit = document.getElementById("cCuit") as HTMLSelectElement;
    
	let cliente:Cliente = await response.json() as Cliente;
    cId.value = cliente.id.toString();
    cNombre.value = cliente.nombre;
    cApellido.value = cliente.apellido;
    cSaldo.value = cliente.saldo.toString();
    cDomicilio.value = cliente.domicilio;
    cTelefono.value = cliente.telefono.toString();
    cCuit.value = cliente.cuit.toString();
}

async function eliminarCliente(numId:number){
    let urlServer = 'http://localhost:3000/delete/'+numId;
	await fetch(urlServer, {
		method: 'DELETE',
        headers: {
			'Content-type': 'application/json',
			'Access-Control-Allow-Origin':'*'
		},
        mode: 'cors'
	});
    getClientesJSON();
}

function getEncabezado(grillaHTML:string){
    grillaHTML += '<div class="row">';
    grillaHTML += '<div class="col"><b>ID</b></div>';
    grillaHTML += '<div class="col"><b>NOMBRE</b></div>';
    grillaHTML += '<div class="col"><b>APELLIDO</b></div>';
    grillaHTML += '<div class="col"><b>SALDO</b></div>';
    grillaHTML += '<div class="col"><b>DOMICILIO</b></div>';
    grillaHTML += '<div class="col"><b>TELÉFONO</b></div>';
    grillaHTML += '<div class="col"><b>CUIT</b></div>';
    grillaHTML += '<div class="col"></div>';
    grillaHTML += '<div class="col"></div>';
    grillaHTML += '</div>';
    return grillaHTML;
}