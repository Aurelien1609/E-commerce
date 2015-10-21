public class Produit {

	private static int ID = 1;
	private int iD;
	private String name;
	private double price;
	private String description;
	private String type;
	
	public Produit(String name, double price, String description, String type)
	{
		this.setName(name);
		this.setDescription(description);
		this.setPrice(price);
		this.setType(type);
		this.setiD(ID);
		ID += 1;
	}
		
	public int getiD() {
		return iD;
	}

	public void setiD(int iD) {
		this.iD = iD;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		
		if (price >= 0) {this.price = price;}		
		else {this.price = 0.0;}
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public String toString()
	{
//		return "Code du produit : " + this.getiD() + System.getProperty("line.separator") +
//				"Nom du produit : " + this.getName() + System.getProperty("line.separator") + 
//				"Type du produit : " + this.getType() + System.getProperty("line.separator") + 
//				"Prix du produit : " + this.getPrice() + " euros" + System.getProperty("line.separator") + 
//				"Description du produit : " + this.getDescription() + System.getProperty("line.separator");
		
		return this.getName() +  " " + this.getPrice() + " euros"; 
	}

}
