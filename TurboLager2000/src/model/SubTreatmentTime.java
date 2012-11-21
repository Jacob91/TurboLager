package model;

import java.util.Date;

public class SubTreatmentTime {
	private Date time;
	private SubTreatment subTreatment;
	
	SubTreatmentTime(Date time, SubTreatment subTreatment){
		this.time = time;
		//TODO Check for null
		this.subTreatment = subTreatment;
	}
	
	public SubTreatment getSubTreatment(){
		return subTreatment;
	}
	
	public void setSubTreatment(SubTreatment subTreatment){
		//TODO Check for null
		if(this.subTreatment!= subTreatment)
			this.subTreatment = subTreatment;
	}
	
	public int calculateTime(){
		//TODO
		return -1;
	}
}
