import javax.swing.JLabel;
import javax.swing.JTextField;

public class LignePanier {
	
	private JLabel jlb1;
	private JTextField jtf;
	private JLabel jlb2;
		
	public LignePanier(JLabel jlb1, JTextField jtf, JLabel jlb2) {
		super();
		this.jlb1 = jlb1;
		this.jtf = jtf;
		this.jlb2 = jlb2;
	}
	public JLabel getJlb1() {
		return jlb1;
	}
	public void setJlb1(JLabel jlb1) {
		this.jlb1 = jlb1;
	}
	public JTextField getJtf() {
		return jtf;
	}
	public void setJtf(JTextField jtf) {
		this.jtf = jtf;
	}
	public JLabel getJlb2() {
		return jlb2;
	}
	public void setJlb2(JLabel jlb2) {
		this.jlb2 = jlb2;
	}
	
}
