import java.util.ArrayList;

public interface CatalogueUser {

	public ArrayList<Produit> getListProduit();
	public ArrayList<Produit> searchProduit(String search);
	public ArrayList<Produit> searchProduit(int iD);
	public String toString();
}

