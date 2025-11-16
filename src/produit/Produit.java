package produit;

public abstract class Produit implements IProduit {
	private String nom;
	private Unite unite;
	
	protected Produit(String nom, Unite unite) {
		this.nom = nom;
		this.setUnite(unite);
	}
	
	@Override
	public String getNom() {
		return nom;
	}

	public Unite getUnite() {
		return unite;
	}

	public void setUnite(Unite unite) {
		this.unite = unite;
	}
}
