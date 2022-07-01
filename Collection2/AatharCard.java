package Collection2;

public class AatharCard {
	private long aatharNumber;
	private String personName;
	private int personAge;
	public void setAatharNumber(long aatharNumber) {
		this.aatharNumber=aatharNumber;
	}
	public void setPersonName(String personName) {
		this.personName=personName;
	}
	public void setPersonAge(int personAge) {
		this.personAge=personAge;
	}
	public long getAatharNumber() {
		return aatharNumber;
	}
	public String getPersonName() {
		return personName;
	}
	public int getPersonAge() {
		return personAge;
	}
	public AatharCard(long aatharNumber,String personName,int personAge) {
		this.aatharNumber=aatharNumber;
		this.personName=personName;
		this.personAge=personAge;
	}
	public String toString() {
		return getAatharNumber()+getPersonName()+getPersonAge();
	}
	}


