/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PaisesMongo;

import Model.Pais;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoDatabase;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import static java.nio.charset.StandardCharsets.UTF_8;
import org.apache.commons.io.IOUtils;
import com.mongodb.client.MongoCollection;
import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Filters.ne;
import com.mongodb.client.model.Indexes;
import static com.mongodb.client.model.Indexes.ascending;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import org.bson.Document;
import org.bson.types.ObjectId;

/**
 *
 * @author Emi Chiófalo
 */
public class TP2MongoDB {
 
    public static void main(String[] args) {
        
        try{
            MongoClient mongoClient = crearConexion();
            MongoDatabase db = mongoClient.getDatabase("paises_db");
            MongoCollection<Document> paises = db.getCollection("paises");
//
//            for (int i = 1; i < 301; i++) {
//                Pais p = readCountries(i);
//                if(p != null){
//
//                    String numCode = p.getNumericCode();
//                    Document filter = new Document("codigoPais", numCode);
//                    long count = paises.count(filter);
////                    System.out.println(count);
//
//                    if(count > 0){
//                        Document pais = new Document("$set", new Document("codigoPais", p.getNumericCode())
//                            .append("nombrePais", p.getName())
//                            .append("capitalPais", p.getCapital())
//                            .append("region", p.getRegion())
//                            .append("poblacion", p.getPopulation())
//                            .append("latitud", p.getLatlng().get(0))
//                            .append("longitud", p.getLatlng().get(1)));
//                        paises.updateOne(filter, pais);
//                        System.out.println("Pais actualizado con éxito");
//                    }else{
//                        Document pais = new Document("_id", new ObjectId())
//                            .append("codigoPais", p.getNumericCode())
//                            .append("nombrePais", p.getName())
//                            .append("capitalPais", p.getCapital())
//                            .append("region", p.getRegion())
//                            .append("poblacion", p.getPopulation())
//                            .append("latitud", p.getLatlng().get(0))
//                            .append("longitud", p.getLatlng().get(1));
//                        paises.insertOne(pais);
//                        System.out.println("Pais insertado con éxito");
//                    }                    
//                }
//
//            }
//            
//            
            System.out.println("1 ------------------------------------------------------------------------");
            FindIterable<Document> americas = paises.find(eq("region", "Americas"));
            for(Document doc : americas){
                System.out.println(doc);
            }
         
            System.out.println("2 ------------------------------------------------------------------------");
            Document filter1 = new Document("region", "Americas");
            Document filter2 = new Document("poblacion", new Document("$gt", 100000000));
            List<Document> filtros = new ArrayList<>();
                filtros.add(filter1);
                filtros.add(filter2);
            Document query = new Document("$and", filtros);
            FindIterable<Document> result = paises.find(query);
            for(Document doc : result){
                System.out.println(doc);
            }
            
            System.out.println("3 ------------------------------------------------------------------------");
            FindIterable<Document> noAfrica = paises.find(ne("region", "Africa"));
            for(Document doc : noAfrica){
                System.out.println(doc);
            }
            
            System.out.println("4 ------------------------------------------------------------------------");
            Document egipto = new Document("$set", new Document("nombrePais", "Egipto")
                            .append("poblacion", 95000000));
                        paises.updateOne(eq("nombrePais", "Egypt"), egipto);
            
            System.out.println("5 ------------------------------------------------------------------------");
            paises.deleteOne(eq("codigoPais", 528));
            
            System.out.println("6 ------------------------------------------------------------------------");
            System.out.println("Drop se usa para eliminar una coleccion o una base de datos completa.");
              
            System.out.println("7 ------------------------------------------------------------------------");
            Document filter3 = new Document("poblacion", new Document("lt", 150000000));
            Document filter4 = new Document("poblacion", new Document("$gt", 50000000));
            List<Document> filtros2 = new ArrayList<>();
                filtros2.add(filter3);
                filtros2.add(filter4);
            Document query2 = new Document("$and", filtros2);
            FindIterable<Document> result2 = paises.find(query2);
            for(Document doc : result2){
                System.out.println(doc);
            }

            System.out.println("8 ------------------------------------------------------------------------");
            FindIterable<Document> nombreOrdenado = paises.find().sort(ascending("nombrePais"));
            for(Document doc : nombreOrdenado){
                System.out.println(doc);
            }
            
            System.out.println("9 ------------------------------------------------------------------------");
            System.out.println("El método skip() es una función que se utiliza en MongoDB para omitir un "
                    + "cierto número de documentos en el resultado de una consulta a una colección. ");
            FindIterable<Document> result3 = paises.find().skip(20).sort(ascending("nombrePais"));
            for(Document doc : result3){
                System.out.println(doc);
            }
            
            System.out.println("10 -----------------------------------------------------------------------");
            System.out.println("""
                               Las expresiones regulares pueden usarse para reemplazar el uso de la clausula LIKE de SQL. 
                               Pueden usarse para buscar patrones de texto: ^Ch""");
            Document queryCH = new Document("nombrePais", Pattern.compile("^Ch"));
            FindIterable<Document> result4 = paises.find(queryCH);
            for(Document doc : result4){
                System.out.println(doc);
            }
            System.out.println("Pueden usarse para buscar patrones de texto más flexibles con comodines: il");
            Document queryIL = new Document("nombrePais", Pattern.compile("il"));
            FindIterable<Document> result5 = paises.find(queryIL);
            for(Document doc : result5){
                System.out.println(doc);
            }
            System.out.println("Pueden usarse para especificar opciones de coincidencia en las expresiones regulares: IL");
            Document queryILi = new Document("nombrePais", Pattern.compile("IL", Pattern.CASE_INSENSITIVE));
            FindIterable<Document> result6 = paises.find(queryILi);
            for(Document doc : result6){
                System.out.println(doc);
            }
            
            System.out.println("11 -----------------------------------------------------------------------");
            System.out.println("El método createIndex() en MongoDB es una función que se utiliza para crear "
                    + "\n índices en una colección específica. Los índices son estructuras de datos que mejoran "
                    + "\n el rendimiento de las consultas en una base de datos, permitiendo búsquedas y "
                    + "\n clasificaciones más rápidas en función de los campos indexados.");
            paises.createIndex(Indexes.ascending("codigoPais"));
            
            System.out.println("12 -----------------------------------------------------------------------");
            System.out.println("Podemos realizar un backup de la base de datos con el siguiente comando en una terminal del SO: "
                    + "\n mongodump --db países_db"
                    + "\n El comando creará una carpeta con el nombre de la base de datos en el directorio actual, "
                    + "\n que contendrá los archivos de respaldo de la base de datos \"países_db\".");
            
            mongoClient.close();
            
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    
    public static Pais readCountries(int code){
        Pais[] pais = null;
        try{
            URL url = new URL("https://restcountries.com/v2/callingcode/" + code);
            String jsonStr = IOUtils.toString(url, UTF_8); 
            if (!jsonStr.contains("Not found")) {
                ObjectMapper objectMapper = new ObjectMapper();
                pais = objectMapper.readValue(jsonStr, Pais[].class);
            }
        }catch (MalformedURLException e) { 
            System.out.println(e.getMessage());    
        } 
        catch (IOException e) {  
            System.out.println(e.getMessage()); 
        }
        if(pais==null){
            return null; 
        }else{
            return pais[0];
        }
    }
    
    private static MongoClient crearConexion() {
        MongoClient mongo = null;
        try {
            mongo = new MongoClient("localhost", 27017);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mongo;
    }

    private static Object gt(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
