import java.util.ArrayList;

public class Panier {
	
	private ArrayList<Integer> quantiteProduit;
	private ArrayList<Produit> listProduit;
	
	public Panier() {
		
		this.quantiteProduit = new ArrayList<Integer>();
		this.listProduit = new ArrayList<Produit>();
	}

	public ArrayList<Produit> getListProduit() {
		return listProduit;
	}
	
	public ArrayList<Integer> getQuantiteProduit() {
		return quantiteProduit;
	}
	
	public double pricePanier()
	{
		double res = 0;
		for (int i = 0; i < listProduit.size(); i++) {
			
			res += listProduit.get(i).getPrice() * quantiteProduit.get(i);
		}
		
		return res;
	}
	
	public Boolean addProduit(Produit produit)
	{
		int i = 0;
		while (i < listProduit.size()) {
			
			if (listProduit.get(i) == produit)
			{
				quantiteProduit.set(i, quantiteProduit.get(i) + 1);
				return true;
			}	
			i += 1;
		}
			
		listProduit.add(produit);
		quantiteProduit.add(1);
		return true;
	}
	
	public Boolean deleteProduit(Produit produit)
	{
		int i = 0;
		while (i < listProduit.size()) {
			
			if (listProduit.get(i) == produit)
			{
				listProduit.remove(i);
				quantiteProduit.remove(i);
				return true;
			}	
			i += 1;
		}
		
		return false;
	}
	
	public Boolean modifQuantiteProduit(Produit produit, Integer quantite)
	{
		for (int i = 0; i < listProduit.size(); i++) {
			
			if (listProduit.get(i) == produit)
			{
				quantiteProduit.set(i, quantite);
				return true;
			}	
		}
		
		return false;
	}
	
	public String toString()
	{
		String res = "Dans mon panier : " + System.getProperty("line.separator");
		for (int i = 0; i < listProduit.size(); i++) {
			
			res += "Produit : " + listProduit.get(i).getName() + ", " +
					" Quantité : " + quantiteProduit.get(i) + System.getProperty("line.separator");
		}
		
		return res;
	}

	
	
	



}
