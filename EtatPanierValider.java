public class EtatPanierValider extends EtatPanier {

	private Panier panier;
	public EtatPanierValider(Panier panier)
	{
		this.panier = panier;
	}
	
	@Override
	public Boolean addProduit(Produit produit) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteProduit(Produit produit) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean modifQuantiteProduit(Produit produit, Integer quantite) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		return "Validé";
	}
	
	

	



}
