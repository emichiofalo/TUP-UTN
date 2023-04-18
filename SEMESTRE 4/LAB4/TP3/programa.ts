class Vehiculo {
    marca : string; 
    modelo : string; 
    patente : string; 

    constructor(marca: string, modelo: string, patente: string) {
        this.marca = marca; 
        this.modelo = modelo; 
        this.patente = patente; 
    }
}
  
let vehiculos: Vehiculo[] = [];
  
function guardarVehiculo() {
    let marca = document.getElementById('marca') as HTMLInputElement;
    let modelo = document.getElementById('modelo') as HTMLInputElement;
    let patente = document.getElementById('patente') as HTMLInputElement;

    let vehiculo = new Vehiculo(marca.value, modelo.value, patente.value);

    vehiculos.push(vehiculo);

    let listadoVehiculos = document.getElementById('listadoVehiculos');
    if (listadoVehiculos) {
        listadoVehiculos.innerHTML = '';

        for (let vehiculo of vehiculos) {
            let li = document.createElement('li');
            li.textContent = `Marca: ${vehiculo.marca}, Modelo: ${vehiculo.modelo}, Patente: ${vehiculo.patente}`;
            listadoVehiculos.appendChild(li);
        }
    }
}