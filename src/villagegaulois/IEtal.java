package villagegaulois;

import java.beans.PropertyEditor;

import personnages.Gaulois;
import produit.Produit;

public interface IEtal {
	
	public void occuperEtal(Gaulois vendeur, Produit produit , int quantite);

	boolean isEtalOccupe();

	Gaulois getVendeur();

	int getQuantite();

	Produit getProduit();
}