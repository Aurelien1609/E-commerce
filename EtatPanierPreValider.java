public class EtatPanierPreValider extends EtatPanierLibre {


	public EtatPanierPreValider(Panier panier) {
		super(panier);
		// TODO Auto-generated constructor stub
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
