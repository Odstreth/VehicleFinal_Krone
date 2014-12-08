
public class Person {
	private String FirstName;
	private String LastName;
	private double PersonID;
	
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public double getPersonID(){
		return PersonID;
	}
	public void setPersonID(){
		PersonID = this.genID();
	}
	
	public double genID(){
		String ID = new Double((Math.random()*8) + 1).toString();
		for (int i =1; i<9; i++){
			ID += new Double(Math.random()*9).toString();
		}
		return Double.parseDouble(ID);
	}
}
