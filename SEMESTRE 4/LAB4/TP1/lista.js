const cargarUsuarios = async() => {
    
    try{
        let url = "http://168.194.207.98:8081/tp/lista.php?action=BUSCAR";
        const userSearch = document.getElementById("userSearch");
        if(userSearch != ""){
            url = "http://168.194.207.98:8081/tp/lista.php?action=BUSCAR&usuario=" + userSearch.value;
        }

        let respuesta = await fetch(url);

        console.log(respuesta);
    
        let usuarios = await respuesta.json(); 
    
        console.log(usuarios); 
    
        let contentUsuarios = "<table> <tr> <th>ID</th> <th>Usuario</th> <th>Bloqueado</th> <th>Apellido</th>\
                    <th>Nombre</th> <th>Bloquear</th> <th>Desbloquear</th> </tr>";
        for(const user of usuarios){
            let backgroundColor = user.bloqueado === "N"? "<tr style='background-color: #cef8c6'>" : "<tr style='background-color: #fd9f8b'>";
            contentUsuarios += backgroundColor +`
                    <td>${user.id}</td>
                    <td>${user.usuario}</td>
                    <td>${user.bloqueado}</td>
                    <td>${user.apellido}</td>
                    <td>${user.nombre}</td>
                    <td><img src="images/bloquear.png" alt="bloquear" height="35px" onclick="bloquearUsuario(${user.id})" style="cursor:pointer"></td>
                    <td><img src="images/desbloquear.png" alt="desbloquear" height="35px" onclick="desbloquearUsuario(${user.id})" style="cursor:pointer"></td>
                </tr>
            `;
        }
        contentUsuarios += "</table>";
        document.getElementById('tblUsuarios').innerHTML = contentUsuarios; 
    }catch(error){
        console.log(error);
    }

}

const bloquearUsuario = async(userID) => {
    try{
        let respuesta = await fetch(`http://168.194.207.98:8081/tp/lista.php?action=BLOQUEAR&idUser=${userID}&estado=Y`);

        console.log(respuesta);
        cargarUsuarios();

    }catch(error){
        console.log(error);
    }
}

const desbloquearUsuario = async(userID) => {
    try{
        let respuesta = await fetch(`http://168.194.207.98:8081/tp/lista.php?action=BLOQUEAR&idUser=${userID}&estado=N`);

        console.log(respuesta);
        cargarUsuarios();

    }catch(error){
        console.log(error);
    }
}

window.addEventListener('load', cargarUsuarios);





