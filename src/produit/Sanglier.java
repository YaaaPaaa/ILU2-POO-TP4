package produit;

import personnages.Gaulois;

public class Sanglier extends Produit{
	private int poids;
	private Gaulois chasseur;
	
	public Sanglier(String nom, int poids, Gaulois chasseur) {
		super(nom);
		if (!"sanglier".equals(nom)) {
			throw new IllegalArgumentException("Le Sanglier n'est pas un " + nom + ".");
		}
		this.poids = poids;
		this.chasseur = chasseur;
	}

	@Override
	public void decrireProduit(String produit) {
		System.out.println(produit + " de " + poids + " " + Unite.KILOGRAMME + "chasses par " + chasseur + ".");
	}
}
