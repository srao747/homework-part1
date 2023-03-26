public class surgeon extends Doctor{
	
	boolean isOperating;
	
	public String isHeOperating = "operating";
	
public surgeon(String name, int number, String specialty, boolean isOperating) {
		super(name, number, specialty);
		this.isOperating = isOperating;
	}		

	@Override
	public String toString() {
		return "" + name + " " + number+ " "+ specialty+" "+ isOperating;	
		
	}

	public surgeon(String name, int number, String specialty, boolean isOperating, String isHeOperating) {
		super(name, number, specialty);
		this.isOperating = isOperating;
		this.isHeOperating = isHeOperating;
	}
	
	@Override
	
	public void work() {
		if(!isOperating) {
			isHeOperating = "not operating";
		}
		System.out.println(name + "works for the hospital."+ name+ " is "+ isHeOperating+ " now");
	}
	
}
