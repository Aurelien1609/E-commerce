public class Main {
	
	public static void main(String [] args) 
	{     
		Model model = new Model();

		Fenetre fenetre = new Fenetre(model.getPanier());
		Controler controler = new Controler(fenetre, model);

		fenetre.addWindowListener(controler.initList());
		fenetre.getbuttonShowPrice().addActionListener(controler);
		fenetre.getListCatalogue().addListSelectionListener(controler);
		fenetre.getbuttonAddPanier().addActionListener(controler);



	}
}
