function getVillano (nombre:string, edad?:number, arma:string = "pistola"): string {
    let mensaje : string; 
    if (edad){
        mensaje = `${nombre} tiene una edad de ${edad} y arma: ${arma}`;
    } else {
        mensaje = `${nombre} tiene un ${arma}`;
    }
    return mensaje; 
}

console.log(getVillano("Felipe", 30, "cuchillo")); 
console.log(getVillano("Antonio", undefined ,"cuchillo")); 
console.log(getVillano("Felipe", 30)); 

