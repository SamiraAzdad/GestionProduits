package com.example;

import java.util.ArrayList;
import java.util.List;

public class ProduitService 
{
	
	
private List<Produit> produits = new ArrayList<>();
//ajout
public void ajouterProduit(Produit produit) {
    if (!produitExiste(produit.getId(), produit.getNom())) {
        if (estDonneesValides(produit.getPrix(), produit.getQuantite())) {
            produits.add(produit);
        } else {
            // Gestion d'exception : Valeurs invalides
        	
            throw new IllegalArgumentException("Le prix et la quantité doivent être positifs.");
        }
    } else {
        // Gestion d'exception : Produit déjà existant
    	 	
        throw new IllegalArgumentException("Un produit avec le même ID ou nom existe déjà.");
    }
	}


public boolean produitExiste(Long id, String nom) {
    for (Produit p : produits) {
        if (p.getId().equals(id) || p.getNom().equals(nom)) {
            return true;
        }
    }
    return false;
}

public boolean estDonneesValides(double prix, int quantite) {
    return prix >= 0 && quantite >= 0;
}
		
/*
// read  
public Produit ReadProduit(Long id) {
    for (Produit produit : produits) {
        if (produit.getId().equals(id)) {
            return produit; // Retourne le produit si l'ID correspond
        }
    }
    
    // Gestion d'exception : Le produit n'existe pas
    throw new IllegalArgumentException("Le produit avec l'ID " + id + " n'existe pas.");
}
/*
// update   
    public void updateProduit(final Produit produit) {
    	
        Produit existingProduit = ReadProduit(produit.getId());
       
        if (existingProduit != null) {
            existingProduit.setNom(produit.getNom());
            existingProduit.setPrix(produit.getPrix());
            existingProduit.setQuantite(produit.getQuantite());
        } else 
        {
            throw new IllegalArgumentException("produit à modifier n'existe pas: " + produit.getId());
        }
    }
    
 // delete  
    public void supprimerProduitParId(Long id) {
        // Vérification d'existence du produit
        if (produitExiste(id, null)) {
            produits.removeIf(p -> p.getId().equals(id));
        } else {
            // Gestion d'exception : Produit non trouvé
            throw new IllegalArgumentException("Le produit à supprimer n'existe pas.");
        }
    }
*/
	
}
