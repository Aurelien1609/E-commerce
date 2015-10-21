import java.util.ArrayList;

public interface CatalogueAdmin {
	
	public ArrayList<Produit> getListProduit();
	public ArrayList<Produit> searchProduit(String search);
	public ArrayList<Produit> searchProduit(int iD);
	public String toString();
	public Boolean sameProduit(Produit produit);
	public Boolean deleteProduit(int iD);
	public void addProduit(Produit p);

}
