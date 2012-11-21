package model;

public class SubTreatment {

	private String name;
	private int minDryTime;
	private int idealDryTime;
	private int maxDryTime;
	
	public SubTreatment(String name, int minDryTime, int idealDryTime,
			int maxDryTime) {
		this.name = name;
		this.minDryTime = minDryTime;
		this.idealDryTime = idealDryTime;
		this.maxDryTime = maxDryTime;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMinDryTime() {
		return minDryTime;
	}

	public void setMinDryTime(int minDryTime) {
		this.minDryTime = minDryTime;
	}

	public int getIdealDryTime() {
		return idealDryTime;
	}

	public void setIdealDryTime(int idealDryTime) {
		this.idealDryTime = idealDryTime;
	}

	public int getMaxDryTime() {
		return maxDryTime;
	}

	public void setMaxDryTime(int maxDryTime) {
		this.maxDryTime = maxDryTime;
	}

	public String toString() {
		return name;
	}
}
