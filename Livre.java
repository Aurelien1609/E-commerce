public class Livre extends Produit {

	private String auteur;
	
	public Livre(String name, double price, String description, String type, String auteur) {
		super(name, price, description, type);
		this.setAuteur(auteur);
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

}
