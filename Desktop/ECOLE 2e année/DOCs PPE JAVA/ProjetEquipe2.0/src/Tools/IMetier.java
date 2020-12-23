/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tools;

import Entity.Laboratoire;
import Entity.Region;
import Entity.Secteur;
import Entity.Visiteur;
import java.util.ArrayList;

/**
 *
 * @author alexk
 */
public interface IMetier {
    public void InsererRegion(int regCode, int secCode, String regNom);
    public int GetLastCodeRegion();
    public ArrayList<Secteur> GetAllSecteurs();
    public int GetCodeSecteur();
    
    public ArrayList<Region> GetAllRegions();
    public void ModifierRegion(String regNom);
    public String GetNomRegion();
    
    public void InsererVisiteur(int visMat, String visNom, String visPrenom, String visAdresse, String visCp, String visVille, String visDateEmbauche, int secCode, int laboCode);
    public int GetLastMatricule();
    public ArrayList<Laboratoire> GetAllLaboratoire();
    
    public ArrayList<Visiteur> GetAllVisiteur();
    public void ModifierVisiteur(String visNom, String visVille, String visAdresse, String visCp, int secCode, int laboCode);
    
    public void VisiteurInsererRegion(int visMatricule, String JJMMAA, int regCode, String traRole);
    
}


