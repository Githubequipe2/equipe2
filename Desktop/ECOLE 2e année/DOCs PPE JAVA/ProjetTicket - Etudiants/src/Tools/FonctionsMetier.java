/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tools;

import Entity.Etat;
import Entity.Ticket;
import Entity.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jbuffeteau
 */
public class FonctionsMetier implements IMetier
{
    @Override
    public User GetUnUser(String login, String mdp)
    {
        User us = null;
        try {
            Connection cnx = ConnexionBDD.getCnx();
            PreparedStatement stm = cnx.prepareStatement("select idUser, nomUser, prenomUser, statutUser from users where loginUser='"+login+"' and pwdUser='"+mdp+"'");
            System.out.println(stm);
            ResultSet rs = stm.executeQuery();
            rs.next();
            us = new User(rs.getInt("idUser"), rs.getString("nomUser"), rs.getString("prenomUser"), rs.getString("statutUser"));
            
            
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return us;
    }

    @Override
    public ArrayList<Ticket> GetAllTickets()
    {
        
        return null;
    }

    @Override
    public ArrayList<Ticket> GetAllTicketsByIdUser(int idUser)
    {
        
        return null;
    }

    @Override
    public void InsererTicket(int idTicket, String nomTicket, String dateTicket, int idUser, int idEtat) 
    {
        
        
    }

    @Override
    public void ModifierEtatTicket(int idTicket, int idEtat) 
    {
        
        
    }

    @Override
    public ArrayList<User> GetAllUsers()
    {
        
        return null;   
    }

    @Override
    public int GetLastIdTicket()
    {
        
        return 0;
    }

    @Override
    public int GetIdEtat(String nomEtat)
    {
        
        return 0;
    }

    @Override
    public ArrayList<Etat> GetAllEtats()
    {
        
        return null;    
    }
}
