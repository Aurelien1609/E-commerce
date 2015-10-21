import java.util.ArrayList;

public class Catalogue extends ModelCatalogue implements CatalogueUser {
	
	
	public void addProduit(Produit p)
	{
		if (sameProduit(p) == false) {
			listProduit.add(p);			
		}
	}
	
	public Boolean deleteProduit(int iD)
	{
		Boolean res = false;
		for (int i = 0; i < listProduit.size(); i++) {
			
			if (listProduit.get(i).getiD() == iD)
			{
				listProduit.remove(i);
				res = true;
			}			
		}		
		return res;
	}
	
	public ArrayList<Produit> searchProduit(String search)
	{
		ArrayList<Produit> resList = new ArrayList<Produit>();
		for (Produit p : listProduit) {
			
			if (p.getName() == search || p.getType() == search)
			{
				resList.add(p);
			}
		}
		
		return resList;
	}
	
	public ArrayList<Produit> searchProduit(int iD)
	{
		ArrayList<Produit> resList = new ArrayList<Produit>();
		for (Produit p : listProduit) {
			
			if (p.getiD() == iD)
			{
				resList.add(p);
			}
		}
		
		return resList;
	}
	
	public Boolean sameProduit(Produit produit)
	{
		Boolean res = false;
		for (Produit p : listProduit) {
			
			if (p.getName() == produit.getName() && p.getType() == produit.getType())
			{
				res = true;
			}
		}
		
		return res;
	}
	
	public String toString()
	{
		String res = "Liste du catalogue : ";
		for (Produit p : listProduit) {
			
			res += p.getName() + ", ";
		}
		
		return res;
	}	
}
