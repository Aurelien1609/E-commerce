import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class panierListener implements ListSelectionListener, ActionListener {

	private Fenetre fenetre;
	private Panier panier;
	private Produit produit;
	
	public panierListener(Fenetre fenetre, Panier panier)
	{
		this.fenetre = fenetre;
		this.panier = panier;
	}

	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == fenetre.getbuttonAddPanier())
		{
			if(produit != null)
			{
				panier.addProduit(produit);
				fenetre.refreshOngletPanier();
			}
		}
		
		if (e.getSource() == fenetre.getbuttonShowPrice())
		{
			panier.pricePanier();
			fenetre.validerPanier();
		}
		

	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		
		produit = (Produit) fenetre.getListCatalogue().getSelectedValue();
	}
	
	

	
}
