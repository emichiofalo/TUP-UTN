import IngredienteCantidad from "./IngredienteCantidad";
import PlatoIngrediente from "./PlatoIngrediente";

export default class Plato{

    id:number = 0;
    imagenPath:string = "";
    nombre:string = "";
    precio:number = 0;
    rubro:string = "";
    ingredientes?:IngredienteCantidad[] = [];
    ingredientesPlato?:PlatoIngrediente[] = [];
    urlImagenPath?:string = "";
    strPrecio?:string = "";

}
