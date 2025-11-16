package produit;

public class Poisson extends Produit{
	private String jour;
	private Produit produit;
	
	public Poisson(String jour) {
		super("poisson", Unite.PIECE);
		this.jour = jour;
	}

	@Override
	public String decrireProduit() {
		return produit.getNom() + " peches " + jour + ".";
	}
}