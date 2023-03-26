
public class Nurse extends HospitalEmployee{
	
	int numofPatients;
	
	public Nurse(String name, int number, int numofPatients) {
		super(name, number);
		this.numofPatients = numofPatients;
	}

	public int getNumofpatients() {
		return numofPatients;
	}

	public void setNumofpatients(int numofpatients) {
		this.numofPatients = numofpatients;
	}

	@Override
	public String toString() {
		return " " + name + " " + number+ "has"+ numofPatients +" patients";
	}
	
	@Override
	public void work() {
		System.out.println(name+ " works for the hospital."+ name+ "is a nurse with" + numofPatients+ "patient");
	}

	
	

}
