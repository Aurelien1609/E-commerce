import javax.swing.JLabel;
import javax.swing.JTextField;

public class ListObjectPanier {
	
	private JTextField textField;
	private JLabel label1;
	private JLabel label2;
	
	public ListObjectPanier(String type, int quantite, double price)
	{
		this.textField = new JTextField(3);
		this.label1 = new JLabel(type);
		this.label2 = new JLabel(String.valueOf(price) + " euros");
		textField.setText(String.valueOf(quantite));
		
	}

	public JTextField getTextField() {
		return textField;
	}

	public void setTextField(JTextField t1) {
		this.textField = t1;
	}

	public JLabel getLabel1() {
		return label1;
	}

	public void setLabel1(JLabel l1) {
		this.label1 = l1;
	}

	public JLabel getLabel2() {
		return label2;
	}

	public void setLabel2(JLabel l2) {
		this.label2 = l2;
	}

}
