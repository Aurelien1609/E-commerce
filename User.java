import java.util.ArrayList;

public class User {
	
	private ArrayList<Panier> listPanier;
	private Panier panierOn; 
	
	public User(Panier panierOn) {
		
		this.panierOn = panierOn;
		this.listPanier = new ArrayList<Panier>();
		this.listPanier.add(this.panierOn);
		
	}

	public ArrayList<Panier> getListPanier() {
		return listPanier;
	}

	public void setListPanier(ArrayList<Panier> listPanier) {
		this.listPanier = listPanier;
	}

	public Panier getPanierOn() {
		return panierOn;
	}

	public void setPanierOn(Panier panierOn) {
		this.panierOn = panierOn;
	}	

}
