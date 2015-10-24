import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Controler implements ListSelectionListener, ActionListener {

	private Fenetre fenetre;
	private Model model;
	
	public Controler(Fenetre fenetre, Model model)
	{
		this.fenetre = fenetre;
		this.model = model;
	}

	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == fenetre.getbuttonAddPanier())
		{
			if((Produit) fenetre.getListCatalogue().getSelectedValue() != null)
			{
				model.getPanier().addProduit((Produit) fenetre.getListCatalogue().getSelectedValue());
				fenetre.refreshOngletPanier(model.getPanier());
				
			}
		}
		
		if (e.getSource() == fenetre.getbuttonShowPrice())
		{
			model.getPanier().setEtat(model.getPanier().getValider());
			fenetre.validerPanier(model.getPanier());
		}
		

		if (e.getSource() == fenetre.getButtonDeletePanier())
		{
			if((Produit) fenetre.getListCatalogue().getSelectedValue() != null)
			{
				model.getPanier().deleteProduit(((Produit) fenetre.getListCatalogue().getSelectedValue()));
				fenetre.refreshOngletPanier(model.getPanier());
				
			}
		}
		

	}
	
	public WindowListener initList() {
		return new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				List<Produit> tmp = new ArrayList<Produit>();
				for (Produit i : model.getCatalogue().getListProduit()) {
					tmp.add(i);
				}
				fenetre.initCatalogue(tmp);

			}
		};
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	

	
}
