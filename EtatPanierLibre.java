public class EtatPanierLibre extends EtatPanier {

	public EtatPanierLibre(Panier panier) {
		super(panier);
	}

	@Override
	public Boolean addProduit(Produit produit) {
		return panier.addProduit(produit);
	}

	@Override
	public Boolean deleteProduit(Produit produit) {
		return panier.deleteProduit(produit);
	}

	@Override
	public Boolean modifQuantiteProduit(Produit produit, Integer quantite) {
		return panier.modifQuantiteProduit(produit, quantite);
	}
	
	@Override
	public String toString() {
		return "Non Validé";
	}


}
