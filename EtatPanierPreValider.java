public class EtatPanierPreValider extends EtatPanier {

	private Panier panier;
	public EtatPanierPreValider(Panier panier)
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
		return "Pré-Validé";
	}

}
