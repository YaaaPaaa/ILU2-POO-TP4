package produit;

public class Poisson extends Produit{
	private String jour;
	
	public Poisson(String jour) {
		super("poisson", Unite.PIECE);
		this.jour = jour;
	}

	@Override
	public void decrireProduit(Produit produit) {
		System.out.println(produit.getNom() + " peches " + jour + ".");
	}
}