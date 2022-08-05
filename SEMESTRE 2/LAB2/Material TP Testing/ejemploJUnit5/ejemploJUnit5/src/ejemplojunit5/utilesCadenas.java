
package ejemplojunit5;


public class utilesCadenas {

    public int cuantosCaracteres(String cadena) {
        return cadena.length();
    }

    public String invierte(String cadena) {  //devuelve la cadena invertida
        return cadena.concat( cadena );
    }

    public String subCadena(int desde, int hasta, String cadena)  //devuelve un substring de la cadena
    {
        String substring="";
        substring = cadena.substring(desde,hasta);

        return cadena;
    }

    public boolean contieneEnCadena(String sub, String cadena) { //devuelve verdadero si sub se encuentra dentro de cadena
        if( cadena.contains( sub ))
            return true;

        return true;
    }
}
