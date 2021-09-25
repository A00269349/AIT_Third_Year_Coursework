public class CarTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = new Car();
		
		c1.setBody("Saloon");
		c1.setTransmission("Manual");
		c1.setDoors(5);
		
		c2.setBody("Saloon");
		c2.setTransmission("Automatic");
		c2.setDoors(5);
		
		c3.setBody("Hatchback");
		c3.setTransmission("Manual");
		c3.setDoors(2);
		
		
		System.out.println("Body Type: " + c1.getBody());
		System.out.println("Transmission: " + c1.getTransmission());
		System.out.println("Number of Doors: " + c1.getDoors());
		System.out.println("**********************************");

		System.out.println("Body Type: " + c2.getBody());
		System.out.println("Transmission: " + c2.getTransmission());
		System.out.println("Number of Doors: " + c2.getDoors());
		System.out.println("**********************************");

		System.out.println("Body Type: " + c3.getBody());
		System.out.println("Transmission: " + c3.getTransmission());
		System.out.println("Number of Doors: " + c3.getDoors());
		System.out.println("**********************************");
		
		
		Car c4 = new Car("Saloon", "Manual", 5);
		Car c5 = new Car("Saloon", "Automatic", 5);
		Car c6 = new Car("Hatchback", "Manual", 2);
		
		
		c4.printDetails();
		c5.printDetails();
		c6.printDetails();
		
	}

}
