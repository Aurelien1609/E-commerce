import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;
import java.util.List;

public class Controler {

	private Fenetre fenetre;
	private Model model;
	
	public Controler(Fenetre fenetre, Model model)
	{
		this.fenetre = fenetre;
		this.model = model;
	}

	public ActionListener addProduit() {
		return new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if ((Produit) fenetre.getListCatalogue().getSelectedValue() != null)
				{
					model.getPanier().addProduit(((Produit) fenetre.getListCatalogue().getSelectedValue()));
					fenetre.refreshOngletPanier(model.getPanier());
				}
			}
		};
	}
	
	public ActionListener deleteProduit() {
		return new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if ((Produit) fenetre.getListCatalogue().getSelectedValue() != null)
				{
					model.getPanier().deleteProduit(((Produit) fenetre.getListCatalogue().getSelectedValue()));
					fenetre.refreshOngletPanier(model.getPanier());
				}
			}
		};
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
	
	public ActionListener pricePanier() {
		return new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (model.getPanier().getEtat() == model.getPanier().getLibre()){
					
					model.getPanier().setEtat(model.getPanier().getPreValider());}
			
				else {model.getPanier().setEtat(model.getPanier().getValider());}
			
					fenetre.validerPanier(model.getPanier());
			}
		};
	}


	
	

	
}
