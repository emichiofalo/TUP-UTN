window.addEventListener('load', inicializarEventos, false);
function inicializarEventos() {
    var ob = document.getElementById('confirmar');
    ob.addEventListener('click', validar, false);
}
function validar(e) {
    var usu = document.getElementById('usuario');
    var error = '';
    if (usu.value == '') {
        error = 'Debe ingresar el nombre de usuario';
    }
    var cla = document.getElementById('clave');
    if (cla.value == '') {
        error = error + 'Debe ingresar la clave.';
    }
    var cla2 = document.getElementById('claveRepe');
    if (cla2.value == '') {
        error = error + 'Debe repetir la clave.';
    }
    if (cla.value != cla2.value){
        error = error + 'Las contraseñas no coinciden.';
    }
    if (error != '') {
        e.preventDefault();
        var er = document.getElementById('error');
        er.innerHTML = error;
        er.style.display = 'block';
    }
}