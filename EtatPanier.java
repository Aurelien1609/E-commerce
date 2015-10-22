public abstract class EtatPanier {
			
	public abstract Boolean addProduit(Produit produit);
	public abstract Boolean deleteProduit(Produit produit);
	public abstract Boolean modifQuantiteProduit(Produit produit, Integer quantite);
	
}

