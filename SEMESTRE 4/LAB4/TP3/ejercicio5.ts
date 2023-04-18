export interface Reptil {
    nombre: string;
    tipo: string;
    paisOrigen: string;
    pesoPromedio: number;
    esVenenosa: boolean;
}

const reptil = {
    nombre: "cobra",
    tipo: "serpiente",
    paisOrigen: "India",
    pesoPromedio: 2.5,
    esVenenosa: true
  };
  
  
  if ((reptil as Reptil).nombre && (reptil as Reptil).tipo &&
      (reptil as Reptil).paisOrigen && (reptil as Reptil).pesoPromedio &&
      (reptil as Reptil).esVenenosa) {
    console.log("El objeto es un reptil válido");
  } else {
    console.log("El objeto no cumple con la estructura de un reptil");
  }