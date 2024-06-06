package org.tradiv.afrique.entities;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Produit implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Declaration des variables
	 */
	@Id @GeneratedValue
	private Long id;
	private String service;
	private double prix;
	private int quantite;
	
	/**
	 * Getters & Setters
	 * @return
	 */
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	
	/**
	 * Constructor
	 */
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Produit(String service, double prix, int quantite) {
		super();
		this.service = service;
		this.prix = prix;
		this.quantite = quantite;
	}
	public Produit(Long id, String service, double prix, int quantite) {
		super();
		this.id = id;
		this.service = service;
		this.prix = prix;
		this.quantite = quantite;
	}
	
	/**
	 * Methods ToString
	 */
	@Override
	public String toString() {
		return "Produit [id=" + id + ", service=" + service + ", prix=" + prix + ", quantite=" + quantite + "]";
	}
	
	
	

}
