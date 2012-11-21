package model;

import java.util.ArrayList;
import java.util.Date;

public class Product {
	private String serialNr;
	private ProductType productType;
	private ArrayList<SubTreatmentTime> subTreatmentTimes; //TODO Array vs. ArrayList !!!
	
	public Product(String serialNr, ProductType productType){
		this.serialNr = serialNr;
		//TODO null
		this.productType = productType;
		subTreatmentTimes = new ArrayList<SubTreatmentTime>();
		for(int i = 0; i<productType.getTreatment().getSubTreatments().size(); i++){
			createSubTreatmentTime(productType.getTreatment().getSubTreatments().get(i));
		}
	}
	
	public int timeFromMax(){
		//TODO
		return 1;
	}
	
	public ProductType getProductType(){
		return productType;
	}
	
	public SubTreatmentTime createSubTreatmentTime(SubTreatment subTreatment){
		SubTreatmentTime subTreatmentTime = new SubTreatmentTime(null, subTreatment);
		subTreatmentTimes.add(subTreatmentTime);
		return subTreatmentTime;
	}
	
	public ArrayList<SubTreatmentTime> getSubTreatmentTimes(){
		return new ArrayList<SubTreatmentTime>(subTreatmentTimes);
	}
	
	public void deleteSubTreatmentTime(SubTreatmentTime subTreatmentTime){
		//TODO
		if(subTreatmentTimes.contains(subTreatmentTime)){
			subTreatmentTimes.remove(subTreatmentTime);
		}
	}
	
	public String getSerialNr(){
		return serialNr;
	}
	
}