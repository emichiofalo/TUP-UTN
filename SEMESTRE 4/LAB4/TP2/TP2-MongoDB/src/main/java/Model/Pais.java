/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Data.PaisManager;
import java.util.ArrayList;

/**
 *
 * @author Emi Chiófalo
 */
public class Pais{
    public String name;
    public ArrayList<String> topLevelDomain;
    public String alpha2Code;
    public String alpha3Code;
    public ArrayList<String> callingCodes;
    public String capital;
    public ArrayList<String> altSpellings;
    public String subregion;
    public String region;
    public long population;
    public ArrayList<Double> latlng;
    public String demonym;
    public double area;
    public double gini;
    public ArrayList<String> timezones;
    public ArrayList<String> borders;
    public String nativeName;
    public String numericCode;
    public Flags flags;
    public ArrayList<Currency> currencies;
    public ArrayList<Language> languages;
    public Translations translations;
    public String flag;
    public ArrayList<RegionalBloc> regionalBlocs;
    public String cioc;
    public boolean independent;
    public PaisManager pm = new PaisManager();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public String getNumericCode() {
        return numericCode;
    }

    public void setNumericCode(String numericCode) {
        this.numericCode = numericCode;
    }

    public ArrayList<Double> getLatlng() {
        return latlng;
    }

    public void setLatlng(ArrayList<Double> latlng) {
        this.latlng = latlng;
    }
    
    public void addLatlng(Double num){
        if(this.latlng == null){
            this.latlng = new ArrayList();
        }
        this.latlng.add(num);
    }
    
    public void insertPais(Pais pais){
        pm.insert(pais);
    }

    public void updatePais(Pais pais){
        pm.update(pais);
    }
    
    public Boolean paisExists(long numCode){
        return pm.exists(numCode);
    }
}

