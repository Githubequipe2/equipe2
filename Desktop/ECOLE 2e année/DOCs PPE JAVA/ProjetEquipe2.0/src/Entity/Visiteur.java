/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.Date;

/**
 *
 * @author alexk
 */
public class Visiteur {
    private int visMatricule;
    private String visNom;
    private String visPrenom;
    private String visAdresse;
    private String visCp;
    private String visVille;
    private Date visDateEmbauche;
    private int secCode;
    private int laboCode;
    
    public Visiteur(){
        
    }
    public Visiteur(int unVisMat, String unVisNom, String unVisPre, String unVisAd, String unVisCp, String unVisVille, String unVisDateEmb, Date uneDateEmb, int unSecCode, int unLaboCode){
        
        visMatricule=unVisMat;
        visNom=unVisNom;
        visPrenom=unVisPre;
        visAdresse=unVisAd;
        visCp=unVisCp;
        visVille=unVisVille;
        visDateEmbauche=uneDateEmb;
        secCode=unSecCode;
        laboCode=unLaboCode;
        
        
    }

    /**
     * @return the visMatricule
     */
    public int getVisMatricule() {
        return visMatricule;
    }

    /**
     * @param visMatricule the visMatricule to set
     */
    public void setVisMatricule(int visMatricule) {
        this.visMatricule = visMatricule;
    }

    /**
     * @return the visNom
     */
    public String getVisNom() {
        return visNom;
    }

    /**
     * @param visNom the visNom to set
     */
    public void setVisNom(String visNom) {
        this.visNom = visNom;
    }

    /**
     * @return the visPrenom
     */
    public String getVisPrenom() {
        return visPrenom;
    }

    /**
     * @param visPrenom the visPrenom to set
     */
    public void setVisPrenom(String visPrenom) {
        this.visPrenom = visPrenom;
    }

    /**
     * @return the visAdresse
     */
    public String getVisAdresse() {
        return visAdresse;
    }

    /**
     * @param visAdresse the visAdresse to set
     */
    public void setVisAdresse(String visAdresse) {
        this.visAdresse = visAdresse;
    }

    /**
     * @return the visCp
     */
    public String getVisCp() {
        return visCp;
    }

    /**
     * @param visCp the visCp to set
     */
    public void setVisCp(String visCp) {
        this.visCp = visCp;
    }

    /**
     * @return the visVille
     */
    public String getVisVille() {
        return visVille;
    }

    /**
     * @param visVille the visVille to set
     */
    public void setVisVille(String visVille) {
        this.visVille = visVille;
    }

    /**
     * @return the visDateEmbauche
     */
    public Date getVisDateEmbauche() {
        return visDateEmbauche;
    }

    /**
     * @param visDateEmbauche the visDateEmbauche to set
     */
    public void setVisDateEmbauche(Date visDateEmbauche) {
        this.visDateEmbauche = visDateEmbauche;
    }

    /**
     * @return the secCode
     */
    public int getSecCode() {
        return secCode;
    }

    /**
     * @param secCode the secCode to set
     */
    public void setSecCode(int secCode) {
        this.secCode = secCode;
    }

    /**
     * @return the laboCode
     */
    public int getLaboCode() {
        return laboCode;
    }

    /**
     * @param laboCode the laboCode to set
     */
    public void setLaboCode(int laboCode) {
        this.laboCode = laboCode;
    }
}
