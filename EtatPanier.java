public abstract class EtatPanier {
			
	protected Panier panier;
	public EtatPanier(Panier panier)
	{
		this.panier = panier;
	}
	
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
	
}

