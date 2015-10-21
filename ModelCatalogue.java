import java.util.ArrayList;

public class ModelCatalogue {

	protected ArrayList<Produit> listProduit;
	
	public ModelCatalogue() {
		
		this.listProduit = new ArrayList<Produit>();
	}

	public ArrayList<Produit> getListProduit() {
		return listProduit;
	}

	public void setListProduit(ArrayList<Produit> listProduit) {
		this.listProduit = listProduit;
	}
		
}
