
public class Car extends Vehicle{
	
	private int doors;
	private int passengers;
	
	public Car(String make, String model, String plate, int doors, int passengers){
		super(make, model, plate);
		this.doors = doors;
		this.passengers = passengers;
		
	}
	
	public int getDoors() {
		return this.doors;
	}
	
	public int getPassengers() {
		return this.passengers;
	}
	
	public String toString() {
		String result = String.format("%d-door %s %s with license %s.", this.getDoors() super.getMake(), super.getModel(), super.getPlate());
		return result;
	}
	
	public boolean equals(Object other) {
		if(!(other instanceof Car)) {
			return false;
		}
		
		Car otherCar = (Car) other;
		
		 if(super.equals(otherCar && this.getDoors() == otherCar.getDoors() && this.getPassengers() == otherCar.getPassengers()) {
			 return true;
		 }
		 else {
			 return false;
		 }
	
	
	}
	public Car copy(){
	// get the data
		int doors = this.getDoors();
		int passengers = this.getPassengers();
		String make = super.getMake();
		String model = super.getModel();
		String plate = super.getPlate();
		
		// create and return a copy
		Car theCopy = new Car(make, model, plate, doors, passengers);
		
		// return the copy of the car
		return theCopy;
	}
	
	

}
	
	
	
}