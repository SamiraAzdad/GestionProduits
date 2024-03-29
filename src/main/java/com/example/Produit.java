package com.example;

public class Produit 
{
	private Long id;
    private String nom;
    private double prix;
    private int quantite;
    
    public Produit() {} 
    
    public Produit(Long id, String nom, double prix, int quantite) 
    {
        this.id = id;
        this.nom = nom;
        this.prix = prix;
        this.quantite = quantite;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
    	
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
    	if(prix <0)
    	{
    		throw new IllegalArgumentException("le prix doit etre positive");
    	}
        this.prix = prix;
    }

    public int getQuantite() 
    {
        return quantite;
    }

    public void setQuantite(int quantite)
    {
    	if(quantite <0)
    	{
    		throw new IllegalArgumentException("le prix doit etre positive");
    	}
        this.quantite = quantite;
    }
    @Override
	public String toString() {
		return "Produit [id=" + id + ", nom=" + nom + ", prix=" + prix + ", quantite=" + quantite + "]";
	}}
    
