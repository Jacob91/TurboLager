package model;

import java.util.ArrayList;

public class Treatment {
	private String name;
	private ArrayList<SubTreatment> subTreatments;

	public Treatment(String name) {
		this.name = name;
		subTreatments = new ArrayList<SubTreatment>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<SubTreatment> getSubTreatments() {
		return new ArrayList(subTreatments);
	}

	public void addSubTreatment(SubTreatment subTreatment) {
		if(!subTreatments.contains(subTreatment)){
			subTreatments.add(subTreatment);
		}
	}
	
	public void removeSubTreatment(SubTreatment subTreatment){
		if(subTreatments.contains(subTreatment)){
			subTreatments.remove(subTreatment);
		}
	}
	
	public String toString() {
		return name;
	}
}
