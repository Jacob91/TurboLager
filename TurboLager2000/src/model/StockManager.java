package model;

public class StockManager {
	private Product[] products;

	public StockManager(int size){
		products = new Product[size];
	}

	public Product getNextProduct(){
		//TODO
		return null;
	}

	public void addProduct(Product product){
		
	}

	public Product findProduct(String serialNumber){
		for(int i = 0; i < products.length; i++){
			if(serialNumber.equals(products[i].getSerialNr())){
				return products[i];
			}
		}
		return null;
	}

	public void removeProduct(Product product){
		for(int i = 0; i < products.length; i++){
			if(product.equals(products[i])){
				products[i]=null;
				return;
			}
		}
	}
}

