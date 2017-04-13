
package DAO;
import java.sql.*;
import java.util.*;

import DAO.ConnexionSQL;

public interface DAO<Type> {

	public static Connection connexion = ConnexionSQL.getConnexion();
	/*
	 * R�cuperer donn�es par identifiant
	 */
	public Type recuperer(int id); 
	/*
	 * Permet de recup�rer toutes les infos en renvoyant une liste.
	 */
	public List<Type> recupererTout();
	public Type ajouter(Type objet);
	public Type modifier(Type objet);
	public void supprimer(Type objet);
}
