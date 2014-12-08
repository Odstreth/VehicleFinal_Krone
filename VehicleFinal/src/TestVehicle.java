
public class TestVehicle {
	
	public void test(){
		Person a = new Person();
		a.setFirstName("a");
		Car Acar = new Car();
		Acar.setOwner(a);
		Acar.setNumberOfDoors(4);
		Truck Atruck = new Truck();
		Atruck.setOwner(a);
		Atruck.setNumberOfAxels(2);
		
		Person b = new Person();
		Atruck.setOwner(b);
		
		MotorCycle test = new MotorCycle();
		test.setHasSideCar(false);
		
	
	}
}
