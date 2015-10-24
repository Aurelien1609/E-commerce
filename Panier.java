import java.util.ArrayList;

public class Panier {
	
	private ArrayList<Integer> quantiteProduit;
	private ArrayList<Produit> listProduit;
	private EtatPanier etat;
	private EtatPanierLibre libre;
	private EtatPanierValider valider;
	private EtatPanierPreValider preValider;


	public Panier() {
		
		this.quantiteProduit = new ArrayList<Integer>();
		this.listProduit = new ArrayList<Produit>();
		setLibre(new EtatPanierLibre(this));
		setValider(new EtatPanierValider(this));
		setPreValider(new EtatPanierPreValider(this));
		this.etat = libre;
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
		return etat.addProduit(produit);
	}
	
	public Boolean deleteProduit(Produit produit)
	{
		return etat.deleteProduit(produit);
	}
	
	public Boolean modifQuantiteProduit(Produit produit, Integer quantite)
	{
		return etat.modifQuantiteProduit(produit, quantite);
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
	
	
	public EtatPanier getEtat() {
		return etat;
	}

	public void setEtat(EtatPanier etat) {
		this.etat = etat;
	}

	public EtatPanierLibre getLibre() {
		return libre;
	}

	public void setLibre(EtatPanierLibre libre) {
		this.libre = libre;
	}

	public EtatPanierValider getValider() {
		return valider;
	}

	public void setValider(EtatPanierValider valider) {
		this.valider = valider;
	}

	public EtatPanierPreValider getPreValider() {
		return preValider;
	}

	public void setPreValider(EtatPanierPreValider preValider) {
		this.preValider = preValider;
	}

	public void setQuantiteProduit(ArrayList<Integer> quantiteProduit) {
		this.quantiteProduit = quantiteProduit;
	}

	public void setListProduit(ArrayList<Produit> listProduit) {
		this.listProduit = listProduit;
	}


}
