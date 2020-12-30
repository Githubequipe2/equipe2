/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author alexk
 */
public class Region {
    
    private int regCode;
    private int secCode;
    private String regNom;
    
    public Region(){
        
    }
    
    public Region(int unRegCode, int unSecCode, String unRegNom){
        
        regCode=unRegCode;
        secCode=unSecCode;
        regNom=unRegNom;
        
    }

    /**
     * @return the regCode
     */
    public int getRegCode() {
        return regCode;
    }

    /**
     * @return the secCode
     */
    public int getSecCode() {
        return secCode;
    }

    /**
     * @return the regNom
     */
    public String getRegNom() {
        return regNom;
    }

    /**
     * @param regCode the regCode to set
     */
    public void setRegCode(int regCode) {
        this.regCode = regCode;
    }

    /**
     * @param secCode the secCode to set
     */
    public void setSecCode(int secCode) {
        this.secCode = secCode;
    }

    /**
     * @param regNom the regNom to set
     */
    public void setRegNom(String regNom) {
        this.regNom = regNom;
    }
            
    
    
}
