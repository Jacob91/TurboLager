package model;

public class ProductType {
	private String name;
	private Treatment treatment;
	
	public ProductType(String name, Treatment treatment){
		this.name = name;
		if(treatment != null){
		this.treatment = treatment;
		}
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public Treatment getTreatment(){
		return treatment;
	}
	
	public void setTreatment(Treatment treatment){
		if(treatment != null){
			this.treatment = treatment;
			}
	}
}

