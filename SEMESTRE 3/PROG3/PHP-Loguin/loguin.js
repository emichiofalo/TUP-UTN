/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/javascript.js to edit this template
 */

function validar (){
    var user = document.getElementById("user");
    var pass = document.getElementById("pass");
    var userErr = document.getElementById("userError");
    var passErr = document.getElementById("passError");
    var error = false;
    limpiarError();
    
    if (user.value === null || user.value === "") {
        userErr.style.display = "inline";
        error = true;
    }
    if (pass.value === null || pass.value === "" || pass.value.length < 6) {
        passErr.style.display = "inline";
        error = true;
    }
    if (!error) {
        window.location = "http://localhost/Loguin/index.php?usuario=" +user.value+"&clave="+pass.value;
    }
    
}

function limpiarError(){
    var userErr = document.getElementById("userError");
    var passErr = document.getElementById("passError");
    
    userErr.style.display = "none";
    passErr.style.display = "none";
}
