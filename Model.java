public class Model {

	private Catalogue catalogue;
	private PanierContext panier;
	
	public Model()
	{
		this.catalogue = new Catalogue();
		catalogue.addProduit(new Produit("Macbook Air", 2000, "Produit de très haute qualité.", "Ordinateur"));
		catalogue.addProduit(new Produit("L'odyssée de l'espace", 10, "Film incontournable.", "DVD"));
		catalogue.addProduit(new Produit("Armoire de chambre IKEA", 130, "Montage très facile.", "Meuble"));
		catalogue.addProduit(new Livre("Seigneur des anneaux : le retour du roi", 50, "Histoire épique.", "Livre", "Tolkien"));
		catalogue.addProduit(new Produit("Imprimante HP", 40, "Bonne qualité.", "Imprimante"));		
		this.panier = new PanierContext(new Panier());
	}

	public PanierContext getPanier() {
		return panier;
	}

	public void setPanier(PanierContext panier) {
		this.panier = panier;
	}

	public Catalogue getCatalogue() {
		return catalogue;
	}

	public void setCatalogue(Catalogue catalogue) {
		this.catalogue = catalogue;
	}
}
