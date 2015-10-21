public class Main {
	
	public static void main(String [] args) 
	{     
		Produit P1 = new Produit("Macbook Air", 2000, "Produit de très haute qualité.", "Ordinateur");
		Produit P2 = new Produit("L'odyssée de l'espace", 10, "Film incontournable.", "DVD");
		Produit P3 = new Produit("Armoire de chambre IKEA", 130, "Montage très facile.", "Meuble");
		Produit P4 = new Livre("Seigneur des anneaux : le retour du roi", 50, "Histoire épique.", "Livre", "Tolkien");
		Produit P5 = new Produit("Imprimante HP", 40, "Bonne qualité.", "Imprimante");

		
		Catalogue catalogue = new Catalogue();
		catalogue.addProduit(P1); catalogue.addProduit(P2); catalogue.addProduit(P3); catalogue.addProduit(P4); catalogue.addProduit(P5);
		
		Panier panier = new Panier();

		Fenetre fenetre = new Fenetre(panier, catalogue);
		panierListener controler = new panierListener(fenetre, panier);

		fenetre.getbuttonShowPrice().addActionListener(controler);
		fenetre.getListCatalogue().addListSelectionListener(controler);
		fenetre.getbuttonAddPanier().addActionListener(controler);



	}
}
