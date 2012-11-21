package dao;

import java.util.ArrayList;

import model.Product;
import model.ProductType;
import model.SubTreatment;
import model.Treatment;

public class Dao {
	
	private ArrayList<Treatment> treatments = new ArrayList<Treatment>();
	private ArrayList<SubTreatment> subtreatments = new ArrayList<SubTreatment>();
	private ArrayList<ProductType> productsTypes = new ArrayList<ProductType>();
	private ArrayList<Product> products = new ArrayList<Product>();
	
	public void addTreatment(Treatment treatment){
		if(!treatments.contains(treatment)){
			treatments.add(treatment);
		}
	}
	
	public void removeTreatment(Treatment treatment){
		if(treatments.contains(treatment)){
			treatments.remove(treatment);
		}
	}
	
	public ArrayList<Treatment> getTreatments(){
		return new ArrayList(treatments);
	}
	
	public void addSubTreatment(SubTreatment subTreatment){
		if(!subtreatments.contains(subTreatment)){
			subtreatments.add(subTreatment);
		}
	}
	
	public void removeSubTreatment(SubTreatment subTreatment){
		if(subtreatments.contains(subTreatment)){
			subtreatments.remove(subTreatment);
		}
	}
	
	public ArrayList<SubTreatment> getSubTreatments(){
		return new ArrayList(subtreatments);
	}
	
	public void addProductType(ProductType productType){
		if(!productsTypes.contains(productType)){
			productsTypes.add(productType);
		}
	}
	
	public void removeProductType(ProductType productType){
		if(productsTypes.contains(productType)){
			productsTypes.remove(productType);
		}
	}
	
	public ArrayList<ProductType> getProductTypes(){
		return new ArrayList(productsTypes);
	}
	
	public void addProduct(Product product){
		if(!products.contains(product)){
			products.add(product);
		}
	}
	
	public void removeProduct(Product product){
		if(products.contains(product)){
			products.remove(product);
		}
	}
	
	public ArrayList<Product> getProducts(){
		return new ArrayList(products);
	}
}
