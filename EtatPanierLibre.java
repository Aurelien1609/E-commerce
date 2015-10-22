public class EtatPanierLibre extends EtatPanier {

	private Panier panier;
	public EtatPanierLibre(Panier panier)
	{
		this.panier = panier;
	}
	
	@Override
	public Boolean addProduit(Produit produit) {
		int i = 0;
		while (i < panier.getListProduit().size()) {
			
			if (panier.getListProduit().get(i) == produit)
			{
				panier.getQuantiteProduit().set(i, panier.getQuantiteProduit().get(i) + 1);
				return true;
			}	
			i += 1;
		}
			
		panier.getListProduit().add(produit);
		panier.getQuantiteProduit().add(1);
		return true;
	}

	@Override
	public Boolean deleteProduit(Produit produit) {
		int i = 0;
		while (i < panier.getListProduit().size()) {
			
			if (panier.getListProduit().get(i) == produit)
			{
				panier.getListProduit().remove(i);
				panier.getQuantiteProduit().remove(i);
				return true;
			}	
			i += 1;
		}
		
		return false;
	}

	@Override
	public Boolean modifQuantiteProduit(Produit produit, Integer quantite) {
		panier.modifQuantiteProduit(produit, quantite);
		return null;
	}
	
	@Override
	public String toString() {
		return "Non Validé";
	}


}
