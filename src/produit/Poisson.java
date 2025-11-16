package produit;

public class Poisson extends Produit{
	private String jour;
	
	public Poisson(String jour) {
		super("poisson", Unite.PIECE);
		this.jour = jour;
	}

	@Override
	public String decrireProduit() {
		return getNom() + " peches " + jour + ".";
	}

	@Override
	public int calculerPrix(int prix) {
		return prix;
	}
}