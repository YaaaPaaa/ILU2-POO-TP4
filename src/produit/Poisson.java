package produit;

public class Poisson extends Produit{
	private String jour;
	
	public Poisson(String nom, String jour) {
		super(nom);
		if (!"poisson".equals(nom)) {
			throw new IllegalArgumentException("Le Poisson n'est pas un " + nom + ".");
		}
		
		this.jour = jour;
	}

	@Override
	public void decrireProduit(String produit) {
		System.out.println(produit + " peches " + jour + ".");
	}
}