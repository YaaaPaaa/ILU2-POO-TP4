package villagegaulois;

import personnages.Gaulois;
import produit.Produit;

public class Etal<P extends Produit> implements IEtal {
	private Gaulois vendeur;
	private P produit ;
	private int quantiteDebutMarche;
	private int quantite;
	private boolean etalOccupe = false;
	
	public void occuperEtal(Gaulois vendeur, Produit produit, int quantite) {
		this.vendeur = vendeur;
		this.produit = (P) produit;
		this.quantite = quantite;
		quantiteDebutMarche = quantite;
		etalOccupe = true;
	}

	public boolean isEtalOccupe() {
		return etalOccupe;
	}

	public Gaulois getVendeur() {
		return vendeur;
	}

	public int getQuantite() {
		return quantite;
	}
	
	public Produit getProduit() {
		return produit;
	}

}
