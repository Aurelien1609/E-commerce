import java.util.ArrayList;

public class PanierContext extends Panier {

	private Panier panier;
	private EtatPanier etat;
	private EtatPanierLibre libre;
	private EtatPanierValider valider;
	private EtatPanierPreValider preValider;
	
	public PanierContext(Panier panier)
	{
		this.setPanier(panier);
		setLibre(new EtatPanierLibre(panier));
		setValider(new EtatPanierValider(panier));
		setPreValider(new EtatPanierPreValider(panier));
		this.etat = libre;
	}
	
	public ArrayList<Produit> getListProduit() {
		return panier.getListProduit();
	}
	
	public ArrayList<Integer> getQuantiteProduit() {
		return panier.getQuantiteProduit();
	}
	
	public double pricePanier() {
		return panier.pricePanier();
	}

	public Boolean addProduit(Produit produit) {
		return etat.addProduit(produit);
	}

	public Boolean deleteProduit(Produit produit) {
		return etat.deleteProduit(produit);
	}

	public Boolean modifQuantiteProduit(Produit produit, Integer quantite) {
		return etat.modifQuantiteProduit(produit, quantite);
	}

	public EtatPanier getEtat() {
		return etat;
	}

	public void setEtat(EtatPanier etat) {
		this.etat = etat;
	}

	public EtatPanierPreValider getPreValider() {
		return preValider;
	}

	public void setPreValider(EtatPanierPreValider preValider) {
		this.preValider = preValider;
	}

	public EtatPanierValider getValider() {
		return valider;
	}

	public void setValider(EtatPanierValider valider) {
		this.valider = valider;
	}

	public EtatPanierLibre getLibre() {
		return libre;
	}

	public void setLibre(EtatPanierLibre libre) {
		this.libre = libre;
	}

	public Panier getPanier() {
		return panier;
	}

	public void setPanier(Panier panier) {
		this.panier = panier;
	}

	
	
	
}
