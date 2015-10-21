import java.awt.GridLayout;
import java.util.Vector;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class Fenetre extends JFrame {
	
	private static final long serialVersionUID = 8164118974463460991L;
	
	private JPanel container1;
	private JPanel container11;
	private JPanel container111;
	private JPanel container112;
	private JPanel container12;


	private JButton buttonShowPrice; private JButton buttonAddPanier;
	private JLabel labelCatalogue;
	private Panier panier;
	private Catalogue catalogue;
	private JList<Produit> listProduit;
	private JTabbedPane ongletPanier;

	public Fenetre(Panier panier, Catalogue catalogue) {
		
		super("E-commerce");
		this.panier = panier;
		this.catalogue = catalogue;
		container1 = new JPanel(); 
		container11 = new JPanel(); 
		container111 = new JPanel();
		container112 = new JPanel();
		container12 = new JPanel(); 

		buttonShowPrice = new JButton("Commander le panier"); 
		buttonAddPanier = new JButton("Ajouter au panier");
		setLabelCatalogue(new JLabel("Catalogue")); 
		
		// transforme la liste des produits du catalogue en une JLIST.
		Vector<Produit> list = new Vector<Produit>();
		for (Produit produit : this.catalogue.getListProduit()) {list.add(produit);}
		listProduit = new JList<Produit>(list); 
		
		ongletPanier = new JTabbedPane();
		
		this.initFrame();    
	}

	public void initFrame()
	{
	    //this.setSize(800, 500);
	    this.setLocationRelativeTo(null);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Création du container principal
		container1.setLayout(new BoxLayout(container1, 0)); // new GridLayout(1, 2)
		container1.add(container11);
		container1.add(container12);

		// Création du container du panier		
		container11.setLayout(new BoxLayout(container11, 1));
		container111.setLayout(new GridLayout(1, 3));
		ongletPanier.addTab("Panier", container111);
		ongletPanier.addTab("Panier", container112);
		container11.add(ongletPanier);
		container11.add(buttonShowPrice);
		
		// Création du container du catalogue
		container12.setLayout(new BoxLayout(container12, 1));
		container12.add(labelCatalogue);
		container12.add(listProduit);
		container12.add(buttonAddPanier);

		this.setContentPane(container1);
	    this.pack();
	    this.setVisible(true);	    
	    
	}
	
	public void validerPanier()
	{
		this.buttonAddPanier.setEnabled(false);		
//		this.container1.add(new JLabel("Le prix totale du panier sera de : " + String.valueOf(panier.pricePanier()) + " euros"));
		
	}
	
	public void refreshOngletPanier()
	{
		int size = panier.getListProduit().size();
		container111.removeAll();
		container111.setLayout(new GridLayout(size, 3));
		for (int i = 0; i < size; i++) 
		{
			// Création d'un objet composé de deux labels et d'un textField
			ListObjectPanier tmp = new ListObjectPanier(panier.getListProduit().get(i).getType(), 
														panier.getQuantiteProduit().get(i), 
														panier.getListProduit().get(i).getPrice() * panier.getQuantiteProduit().get(i));
			
			
			// Ajouts des composants graphiques dans le container
			container111.add(tmp.getLabel1()); container111.add(tmp.getTextField()); container111.add(tmp.getLabel2());
		}
		
		this.pack();
	}

	public JButton getbuttonShowPrice() {
		return buttonShowPrice;
	}

	public void setbuttonShowPrice(JButton b1) {
		this.buttonShowPrice = b1;
	}

	public JButton getbuttonAddPanier() {
		return buttonAddPanier;
	}

	public void setbuttonAddPanier(JButton b2) {
		this.buttonAddPanier = b2;
	}

	public JList<Produit> getListCatalogue() {
		return listProduit;
	}

	public void setListCatalogue(JList<Produit> listCatalogue) {
		this.listProduit = listCatalogue;
	}

	public JLabel getLabelCatalogue() {
		return labelCatalogue;
	}

	public void setLabelCatalogue(JLabel labelCatalogue) {
		this.labelCatalogue = labelCatalogue;
	}

}
