public class Car {
	private String bodyType;
	private String transmission;
	private int numberOfDoors;
	
	public Car(){
		this.bodyType=null;
		this.transmission=null;
		this.numberOfDoors=0;
	}
	
	public Car(String body, String transmission, int doors){
		this.bodyType = body;
		this.transmission = transmission;
		this.numberOfDoors = doors;
	}
	
	public void setBody(String b){
		this.bodyType = b;
	}
	
	public String getBody(){
		return this.bodyType;
	}
	
	public void setTransmission(String t){
		this.transmission = t;
	}
	
	public String getTransmission(){
		return this.transmission;
	}
	
	public void setDoors(int d){
		this.numberOfDoors = d;
	}
	
	public int getDoors(){
		return this.numberOfDoors;
	}
	
	public void printDetails(){
		System.out.println("Body Type: " + bodyType);
		System.out.println("Transmission: " + transmission);
		System.out.println("Number of Doors: " + numberOfDoors);
		System.out.println("**********************************");
	}
}
