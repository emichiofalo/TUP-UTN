let legajo:number = 0; 

class Empleado {
    legajo:number = 0; 
    apellido: string = "";
    nombre: string = "";
    dni: number = 0; 
    sector: string = "";
    fecha_ingreso: string = "";
    activo: boolean = false;
}

async function getEmpleadosJSON(){
    let urlServer = 'http://localhost:3000/empleados';
    const txtSearch = document.getElementById("txtSearch") as HTMLInputElement;
    if(txtSearch.value.toUpperCase() && txtSearch.value.toUpperCase() != ""){
        urlServer = 'http://localhost:3000/empleados/'+txtSearch.value;
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
    let datos:Empleado[] = await response.json();
    let grillaHTML = "";
    grillaHTML = getEncabezado(grillaHTML);
    for (const emp of datos){
        grillaHTML += '<div class="row">';
        grillaHTML += '<div class="col">' + emp.legajo + '</div>';
        grillaHTML += '<div class="col">' + emp.apellido + '</div>';
        grillaHTML += '<div class="col">' + emp.nombre + '</div>';
        grillaHTML += '<div class="col">' + emp.dni + '</div>';
        grillaHTML += '<div class="col">' + emp.sector + '</div>';
        grillaHTML += '<div class="col">' + emp.fecha_ingreso.slice(0,10) + '</div>';
        grillaHTML += '<div class="col">' + (emp.activo==true ? "SI" : "NO") + '</div>';
        grillaHTML += '<div class="col" onclick="editarEmpleado('+emp.legajo+')" style="cursor:pointer; color:green">Editar</div>';
        grillaHTML += '<div class="col" onclick="eliminarEmpleado('+emp.legajo+')" style="cursor:pointer; color:red">Eliminar</div>';
        grillaHTML += '</div>';
    };
    var divArt = document.getElementById("listaEmpleados");
    if(divArt)  {
        divArt.innerHTML  = grillaHTML;
    }
}

async function limpiarDatos(){
    const empLgj = document.getElementById("empLgj") as HTMLInputElement;
    empLgj.value = "0";
    legajo = 0;
}

async function insertarActualizarDatos(){

    const empApellido = document.getElementById("empApellido") as HTMLInputElement;
    const empNombre = document.getElementById("empNombre") as HTMLInputElement;
    const empDNI = document.getElementById("empDNI") as HTMLInputElement;
    const empSector = document.getElementById("empSector") as HTMLInputElement;
    const empFecha = document.getElementById("empFecha") as HTMLInputElement;
    const empActivo = document.getElementById("empActivo") as HTMLSelectElement;
    
    if(!empApellido.value || !empNombre.value || !empDNI.value || !empSector.value  || !empFecha.value  || !empActivo.value){
        let txtMensaje = document.getElementById("txtMensaje");
        if(txtMensaje)
            txtMensaje.innerHTML = "Ingrese todos los datos del empleado";
        return;
    }

    let urlServer:string = "http://localhost:3000/insert";
    let metodo:string = "POST";
    let empleado:Empleado = new Empleado();
    if(legajo > 0){
        empleado.legajo = legajo;
        urlServer = "http://localhost:3000/update";
        metodo = "PUT";
    }
    empleado.apellido = empApellido.value.toUpperCase();
    empleado.nombre = empNombre.value.toUpperCase();
    empleado.dni = Number(empDNI.value);
    empleado.sector = empSector.value.toUpperCase();
    empleado.fecha_ingreso = empFecha.value.slice(0,10);
    empleado.activo = empActivo.value=="true" ? true : false;

    const response = await fetch(urlServer, {
    method: metodo,
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    },
    body: JSON.stringify(empleado),
    });
    
    response.json().then(data => {
        let txtMensaje = document.getElementById("txtMensaje");
        if(txtMensaje)
            txtMensaje.innerHTML = data.message;
        getEmpleadosJSON();
    });
}

async function editarEmpleado(lgj:number){
    legajo = lgj;
    let urlServer = 'http://localhost:3000/empleado/'+lgj;
	let response = await fetch(urlServer, {
		method: 'GET',
        headers: {
			'Content-type': 'application/json',
			'Access-Control-Allow-Origin':'*'
		},
        mode: 'cors'
	});

    const empLegajo = document.getElementById("empLgj") as HTMLInputElement;
    const empApellido = document.getElementById("empApellido") as HTMLInputElement;
    const empNombre = document.getElementById("empNombre") as HTMLInputElement;
    const empDNI = document.getElementById("empDNI") as HTMLInputElement;
    const empSector = document.getElementById("empSector") as HTMLInputElement;
    const empFecha = document.getElementById("empFecha") as HTMLInputElement;
    const empActivo = document.getElementById("empActivo") as HTMLSelectElement;
    
	let empleado:Empleado = await response.json() as Empleado;
    empLegajo.value = empleado.legajo.toString();
    empApellido.value = empleado.apellido;
    empNombre.value = empleado.nombre;
    empDNI.value = empleado.dni.toString();
    empSector.value = empleado.sector;
    empFecha.value = empleado.fecha_ingreso.slice(0,10);
    empActivo.value = empleado.activo==true ? "true" : "false";

    getEmpleadosJSON();
}

async function eliminarEmpleado(lgj:number){
    let urlServer = 'http://localhost:3000/delete/'+lgj;
	await fetch(urlServer, {
		method: 'DELETE',
        headers: {
			'Content-type': 'application/json',
			'Access-Control-Allow-Origin':'*'
		},
        mode: 'cors'
	});
    getEmpleadosJSON();
}

function getEncabezado(grillaHTML:string){
    grillaHTML += '<div class="row">';
    grillaHTML += '<div class="col"><b>LEGAJO</b></div>';
    grillaHTML += '<div class="col"><b>APELLIDO</b></div>';
    grillaHTML += '<div class="col"><b>NOMBRE</b></div>';
    grillaHTML += '<div class="col"><b>DNI</b></div>';
    grillaHTML += '<div class="col"><b>SECTOR</b></div>';
    grillaHTML += '<div class="col"><b>FECHA DE INGRESO</b></div>';
    grillaHTML += '<div class="col"><b>ACTIVO</b></div>';
    grillaHTML += '<div class="col"></div>';
    grillaHTML += '<div class="col"></div>';
    grillaHTML += '</div>';
    return grillaHTML;
}

function getFila(grillaHTML:string, emp:Empleado){
    grillaHTML += '<div class="row">';
    grillaHTML += '<div class="col">' + emp.legajo + '</div>';
    grillaHTML += '<div class="col">' + emp.apellido + '</div>';
    grillaHTML += '<div class="col">' + emp.nombre + '</div>';
    grillaHTML += '<div class="col">' + emp.dni + '</div>';
    grillaHTML += '<div class="col">' + emp.sector + '</div>';
    grillaHTML += '<div class="col">' + emp.fecha_ingreso + '</div>';
    grillaHTML += '<div class="col">' + emp.activo + '</div>';
    grillaHTML += '<div class="col" onclick="editarEmpleado('+emp.legajo+')" style="cursor:pointer; color:green">Editar</div>';
    grillaHTML += '<div class="col" onclick="eliminarEmpleado('+emp.legajo+')" style="cursor:pointer; color:red">Eliminar</div>';
    grillaHTML += '</div>';
    return grillaHTML;
}