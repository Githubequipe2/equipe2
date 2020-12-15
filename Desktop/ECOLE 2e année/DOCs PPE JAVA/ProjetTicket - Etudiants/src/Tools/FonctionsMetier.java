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
        ArrayList<Ticket> Tick = new ArrayList<>();
        try {
            Connection cnx = ConnexionBDD.getCnx();
            PreparedStatement stm = cnx.prepareStatement("select idTicket, nomTicket, dateTicket, etats.nomEtat from etats, tickets where etats.idEtat=tickets.numEtat");
            System.out.println(stm);
            ResultSet rs = stm.executeQuery();
            while(rs.next())
            {
                Ticket t = new Ticket(rs.getInt("idTicket"), rs.getString("nomTicket"), "2020-12-15", rs.getString("etats.nomEtat"));
                Tick.add(t);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Tick;
    }

    @Override
    public ArrayList<Ticket> GetAllTicketsByIdUser(int idUser)
    {
        ArrayList<Ticket> Tick = new ArrayList<>();
        try {
            Connection cnx = ConnexionBDD.getCnx();
            PreparedStatement stm = cnx.prepareStatement("select idTicket, nomTicket, dateTicket, etats.nomEtat as nomEtat from etats, tickets where etats.idEtat=tickets.numEtat and numUser="+idUser);
            System.out.println(stm);
            ResultSet rs = stm.executeQuery();
            while(rs.next())
            {
                Ticket t = new Ticket(rs.getInt("idTicket"), rs.getString("nomTicket"), rs.getString("dateTicket"), rs.getString("nomEtat"));
                Tick.add(t);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Tick;
    }

    @Override
    public void InsererTicket(int idTicket, String nomTicket, String dateTicket, int idUser, int idEtat) 
    {
        try {
            Connection cnx = ConnexionBDD.getCnx();
            PreparedStatement stm = cnx.prepareCall("insert into tickets Values("+idTicket+",'"+nomTicket+"','2020-12-15',"+idUser+","+idEtat+")");
            System.out.println(stm);
            stm.executeUpdate();
            stm.close();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }

    @Override
    public void ModifierEtatTicket(int idTicket, int idEtat) 
    {
        try {
            Connection cnx = ConnexionBDD.getCnx();
            PreparedStatement stm = cnx.prepareStatement("update tickets set numEtat = "+idEtat+" where idTicket="+idTicket);
            stm.executeUpdate();
            stm.close();
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @Override
    public ArrayList<User> GetAllUsers()
    {
        ArrayList<User> Us = new ArrayList<>();
        try {
            Connection cnx = ConnexionBDD.getCnx();
            PreparedStatement stm = cnx.prepareStatement("select idUser, nomUser , prenomUser, statutUser from users");
            System.out.println(stm);
            ResultSet rs = stm.executeQuery();
            while(rs.next())
            {
                User u = new User(rs.getInt("idUser"), rs.getString("nomUser"), rs.getString("prenomUser"), rs.getString("statutUser"));
                Us.add(u);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Us;
           
    }

    @Override
    public int GetLastIdTicket()
    {
        int lastId = 0;
        try {
            Connection cnx = ConnexionBDD.getCnx();
            PreparedStatement ps = cnx.prepareStatement("select max(idTicket) as id from tickets");
            ResultSet rs = ps.executeQuery();
            rs.next();
            lastId = rs.getInt("id") + 1;
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lastId;
    }

    @Override
    public int GetIdEtat(String nomEtat)
    {
        int id=0;
        try {
            Connection cnx = ConnexionBDD.getCnx();
            PreparedStatement stm = cnx.prepareStatement("select idEtat from etats where nomEtat ='"+nomEtat+"'");
            System.out.println(stm);
            ResultSet rs = stm.executeQuery();
            rs.next();
            id = rs.getInt("idEtat");
            rs.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }

    @Override
    public ArrayList<Etat> GetAllEtats()
    {
        ArrayList<Etat> etat = new ArrayList<>();
        try {
            Connection cnx = ConnexionBDD.getCnx();
            PreparedStatement stm = cnx.prepareStatement("select idEtat , nomEtat from etats");
            System.out.println(stm);
            ResultSet rs = stm.executeQuery();
            while(rs.next())
            {
                Etat e = new Etat(rs.getInt("idEtat"), rs.getString("nomEtat"));
                etat.add(e);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return etat;
    }
}
