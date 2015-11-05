public class Model {

	private Catalogue catalogue;
	private User user;
	
	public Model()
	{
		this.catalogue = new Catalogue();
		catalogue.addProduit(new Produit("Macbook Air", 2000, "Produit de très haute qualité.", "Ordinateur"));
		catalogue.addProduit(new Produit("L'odyssée de l'espace", 10, "Film incontournable.", "DVD"));
		catalogue.addProduit(new Produit("Armoire de chambre IKEA", 130, "Montage très facile.", "Meuble"));
		catalogue.addProduit(new Livre("Seigneur des anneaux : le retour du roi", 50, "Histoire épique.", "Livre", "Tolkien"));
		catalogue.addProduit(new Produit("Imprimante HP", 40, "Bonne qualité.", "Imprimante"));		
		
		this.user = new User(new Panier());
	}

	public Panier getPanier() {
		return user.getPanierOn();
	}

	public Catalogue getCatalogue() {
		return catalogue;
	}

	public void setCatalogue(Catalogue catalogue) {
		this.catalogue = catalogue;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
