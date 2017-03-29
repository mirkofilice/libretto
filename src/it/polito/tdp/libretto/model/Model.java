package it.polito.tdp.libretto.model;

import java.util.*;

import it.polito.tdp.libretto.db.EsameDAO;

public class Model {
	
	private List<Esame> esami;

	public Model() {
		this.esami= new ArrayList<Esame>();
	}
	
	/**
	 * Aggiunge un nuovo esame all'elenco degli esami presenti
	 * verificando che non ci sia già
	 * @param e
	 * return true se ha inserito, return false se esisteva già e non ha inserito
	 */
	public boolean addEsame (Esame e){
		/*if (esami.contains(e)==false){
			esami.add(e);
			return true;
		}
		else {
			return false;
		}*/
		
		EsameDAO dao=new EsameDAO();
		
		return dao.create(e);
	}
	/**
	 * Ricerca se esiste un esame con il codice specificato.
	 * Se esiste, lo restituisce, altrimenti restituisce null
	 * @param codice
	 * @return l'esame trovato, oppure null se non trovato
	 */
	public Esame trovaEsame(String codice) {
		/*int pos=esami.indexOf(new Esame (codice, null ,null));	//indexOf riceve come parametro un oggetto e se questo 
		if (pos==-1)											//è contenuto nella lista ne restituisce l'indice
			return null;
		else
			return esami.get(pos);*/
		
		EsameDAO dao=new EsameDAO();
		
		Esame e=dao.find(codice);
		
		return e;
	}

}
