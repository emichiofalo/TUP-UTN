/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package PaisesRelacional;

import Model.Pais;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import static java.nio.charset.StandardCharsets.UTF_8;
import org.apache.commons.io.IOUtils;

/**
 *
 * @author Emi Chiófalo
 */
public class TP2RelacionalDB {

    public static void main(String[] args) {
        
        for (int i = 1; i < 301; i++) {
            readCountries(i);
        }
        
    }
    
    public static void readCountries(int code){
        try{
            URL url = new URL("https://restcountries.com/v2/callingcode/" + code);
            String jsonStr = IOUtils.toString(url, UTF_8); 
            if (!jsonStr.contains("Not found")) {
                ObjectMapper objectMapper = new ObjectMapper();
                Pais[] pais = objectMapper.readValue(jsonStr, Pais[].class);
                if(pais[0].paisExists(Integer.parseInt(pais[0].getNumericCode()))){
                    pais[0].updatePais(pais[0]);
                }else{      
                    pais[0].insertPais(pais[0]);
                }
            }
        }catch (MalformedURLException e) { 
            System.out.println(e.getMessage());    
        } 
        catch (IOException e) {  
            System.out.println(e.getMessage()); 
        }
    }
}
