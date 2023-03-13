const user = document.getElementById("user");
const pass = document.getElementById("pass");
const btnLogin = document.getElementById("btnLogin");
const msjError = document.getElementById("labelError")

btnLogin.addEventListener('click', async() => {
    try{
        let respuesta = await fetch(`http://168.194.207.98:8081/tp/login.php?user=${user.value}&pass=${pass.value}`);
        
        console.log(respuesta);

        let datos = await respuesta.json();

        console.log(datos);

        if(datos.respuesta === "ERROR"){
            msjError.innerHTML = datos.mje;
        }else if(datos.respuesta === "OK"){
            window.location.href = "lista.html";
        }
    }catch(error){
        console.log(error);
    }
});
