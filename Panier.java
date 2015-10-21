import java.util.ArrayList;

public class Panier extends ModelCatalogue{

	private ArrayList<Integer> quantiteProduit = new ArrayList<Integer>();
	
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
	
	public void addProduit(Produit p)
	{
		Boolean res = true;
		for (int i = 0; i < listProduit.size(); i++) {
			
			if (listProduit.get(i).getName() == p.getName() && listProduit.get(i).getType() == p.getType())
			{
				quantiteProduit.set(i, quantiteProduit.get(i) + 1);
				res = false;
			}			
		}	
		
		if (res == true) { 
			
			listProduit.add(p);
			quantiteProduit.add(1);
		}
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
