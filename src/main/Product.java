package main;

public class Product {
	private String Name;
	private int ProdID;
	private Product NextProductName;
	
	public Product(String name, int ID) {
		setName(name);
		setProdID(ID);
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getProdID() {
		return ProdID;
	}

	public void setProdID(int prodID) {
		ProdID = prodID;
	}

	@Override
	public String toString() {
		return "Product [Name=" + Name + ", ProdID=" + ProdID + "]";
	}

	public Product getNextProductName() {
		return NextProductName;
	}

	public void setNextProductName(Product nextProductName) {
		NextProductName = nextProductName;
	}



}
