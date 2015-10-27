public class Main {
	
	public static void main(String [] args) 
	{     
		Model model = new Model();
		Fenetre fenetre = new Fenetre();
		Controler controler = new Controler(fenetre, model);

		fenetre.getButtonDeletePanier().addActionListener(controler.deleteProduit());
		fenetre.addWindowListener(controler.initList());
		fenetre.getbuttonShowPrice().addActionListener(controler.pricePanier());
		fenetre.getbuttonAddPanier().addActionListener(controler.addProduit());



	}
}
