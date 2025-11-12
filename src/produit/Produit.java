package produit;

public abstract class Produit {
	private String nom;
	
	protected Produit(String nom) {
		this.nom = nom;
	}
	
	public String getNom() {
		return nom;
	}
	
	public abstract void decrireProduit(String produit);
}
