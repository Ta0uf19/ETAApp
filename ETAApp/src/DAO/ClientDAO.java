
package DAO;

import java.sql.*;
import java.util.*;

import Gestionnaire.*;

public class ClientDAO implements DAO<Client> {

	public ClientDAO() {
		super();
	}
	/*
	 * R�cup�rer objet par identifiant
	 * @see DAO.DAO#recuperer(int)
	 */
	public Client recuperer(int id) {
		
		Client agr = null;
		try {
			Statement stat = connexion.createStatement();
			ResultSet resultat = stat.executeQuery("SELECT * FROM client WHERE IdCl=" + id);
			if(resultat.first()) {
				if(resultat.getString("tyCl").equals("Coop�rative"))
					agr = new Client(resultat.getInt("IdCl"), resultat.getString("nomCl"), resultat.getString("adrCl"), resultat.getString("telCl"));
				else
					agr = new Client(resultat.getInt("IdCl"), resultat.getString("nomCl"), resultat.getString("preCl"), resultat.getString("adrCl"), resultat.getString("telCl"));
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return agr;
	}
	@Override
	public Client ajouter(Client objet) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Client modifier(Client objet) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void supprimer(Client objet) {
		// TODO Auto-generated method stub
		
	}
	/*
	 * R�cup�rer la liste de toutes les agriculteurs;
	 */
	@Override
	public List<Client> recupererTout() {
		List<Client> liste = new ArrayList<Client>();
		Client agr = null;
		try {
			Statement stat = connexion.createStatement();
			ResultSet resultat = stat.executeQuery("SELECT * FROM client");
			while(resultat.next()) {
				
				if(resultat.getString("tyCl").equals("Coop�rative"))
					agr = new Client(resultat.getInt("IdCl"), resultat.getString("nomCl"), resultat.getString("adrCl"), resultat.getString("telCl"));
				else
					agr = new Client(resultat.getInt("IdCl"), resultat.getString("nomCl"), resultat.getString("preCl"), resultat.getString("adrCl"), resultat.getString("telCl"));
			
				//agr = new Client(resultat.getInt("IdCl"), resultat.getString("nomCl"), resultat.getString("preCl"), resultat.getString("adrCl"), resultat.getString("telCl"));
				liste.add(agr);
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return liste;
	}


	



}
