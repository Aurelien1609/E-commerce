import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class priceListener implements ActionListener {

	private Fenetre fenetre;
	
	public priceListener(Fenetre fenetre)
	{
		this.fenetre = fenetre;
	}
	
	public void actionPerformed(ActionEvent e) {
		
		fenetre.validerPanier();
	}

	
}
