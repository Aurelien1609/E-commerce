import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class Fenetre extends JFrame {
	
	private static final long serialVersionUID = 8164118974463460991L;
	
	private JPanel container1;
	private JPanel container11;
	private JPanel container111;
	private JPanel container112;
	private JPanel container113;
	private JPanel container12;
	private JPanel container13;

	private JButton buttonShowPrice; 
	private JButton buttonAddPanier;
	private JButton buttonDeletePanier;
	private JButton buttonValiderCommande;
	
	private JLabel labelCatalogue;
	private JLabel labelValidation;
	private JLabel labelEtatValidation;
	
	private JList<Produit> listProduit;
	private JTabbedPane ongletPanier;
	
	public Fenetre() {
		
		super("E-commerce");
		container1 = new JPanel(); 
		container11 = new JPanel(); 
		container111 = new JPanel();
		container113 = new JPanel();
		container112 = new JPanel();
		container12 = new JPanel(); 
		container13 = new JPanel();

		listProduit = new JList<Produit>();

		buttonShowPrice = new JButton("Valider la commande"); 
		buttonAddPanier = new JButton("Ajouter au panier");
		buttonDeletePanier = new JButton("Supprimer du panier");
		setLabelCatalogue(new JLabel("Catalogue")); 
		labelValidation = new JLabel("Etat de la commande : ");
		labelEtatValidation = new JLabel("Non Validé");
		
		ongletPanier = new JTabbedPane();
		
		this.initFrame();    
	}

	public void initFrame()
	{
	    this.setSize(800, 500);
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
		container113.setLayout(new FlowLayout());
		container113.add(labelValidation);
		container113.add(labelEtatValidation);

		container11.add(container113);

		
		// Création du container du catalogue
		container12.setLayout(new BoxLayout(container12, 1));
		container12.add(labelCatalogue);
		container12.add(listProduit);
		container13.setLayout(new FlowLayout());
		container13.add(buttonAddPanier);
		container13.add(buttonDeletePanier);
		container12.add(container13);

		this.setContentPane(container1);
	    this.pack();
	    this.setVisible(true);	    
	    
	}
	
	public void initCatalogue(List<Produit> produits) {
		
		DefaultListModel<Produit> tmp = new DefaultListModel<Produit>();
		for (Produit produit : produits) {
			tmp.addElement(produit);
		}
		listProduit.setModel(tmp);
		this.pack();
	}
	
	public void validerPanier(Panier panier)
	{
		labelEtatValidation.setText(panier.getEtat().toString());
		JOptionPane.showMessageDialog(this, "Le prix de votre panier sera de : " + panier.pricePanier() + " euros.");
		this.pack();
	}

	public void refreshOngletPanier(Panier panier)
	{

		int size = panier.getListProduit().size();
		container111.removeAll();
		container111.setLayout(new GridLayout(size, 3));
		for (int i = 0; i < size; i++) 
		{
			
			JTextField jtf = new JTextField(String.valueOf(panier.getQuantiteProduit().get(i)));
			JLabel jlb = new JLabel(String.valueOf(panier.getListProduit().get(i).getPrice() * panier.getQuantiteProduit().get(i)));
			
			container111.add(new JLabel(panier.getListProduit().get(i).getType()));
			container111.add(jtf);
			container111.add(jlb);
			
			int index = i;
			jtf.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					
					panier.modifQuantiteProduit(panier.getListProduit().get(index), Integer.valueOf(jtf.getText()));
					jlb.setText(String.valueOf(panier.getListProduit().get(index).getPrice() * panier.getQuantiteProduit().get(index)));
					jtf.setText(String.valueOf(panier.getQuantiteProduit().get(index)));
					
					if (Integer.parseInt(jtf.getText()) == 0)
					{
						panier.deleteProduit(panier.getListProduit().get(index));
						refreshOngletPanier(panier);
					}
				
				}
			});

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

	public JButton getButtonDeletePanier() {
		return buttonDeletePanier;
	}

	public void setButtonDeletePanier(JButton buttonDeletePanier) {
		this.buttonDeletePanier = buttonDeletePanier;
	}

	public JButton getButtonValiderCommande() {
		return buttonValiderCommande;
	}

	public void setButtonValiderCommande(JButton buttonValiderCommande) {
		this.buttonValiderCommande = buttonValiderCommande;
	}

}
