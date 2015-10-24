public abstract class EtatPanier {
			
	protected Panier panier;
	public EtatPanier(Panier panier)
	{
		this.panier = panier;
	}
	
	public abstract Boolean addProduit(Produit produit);
	public abstract Boolean deleteProduit(Produit produit);
	public abstract Boolean modifQuantiteProduit(Produit produit, Integer quantite);
	
}

