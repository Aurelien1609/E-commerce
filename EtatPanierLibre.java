public class EtatPanierLibre extends EtatPanier {

	public EtatPanierLibre(Panier panier) {
		super(panier);
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
		for (int i = 0; i < panier.getListProduit().size(); i++) {
					
					if (panier.getListProduit().get(i) == produit)
					{
						panier.getQuantiteProduit().set(i, quantite);
						return true;
					}	
				}
				
				return false;
	}
	
	@Override
	public String toString() {
		return "Non Validé";
	}


}
