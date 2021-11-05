import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MainClass {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Staff s1 = new Staff("12345", "John Burke", "Dublin", 50000);
		Staff s2 = new Staff("12346", "Mary Smith", "Athlone", 75000);

		try {
			//Deserializing
			FileInputStream fileIn = new FileInputStream("allStaff.ser");
			ObjectInputStream objectIn = new ObjectInputStream(fileIn);
			Staff newStaff = (Staff) objectIn.readObject();
			
			objectIn.close();
			System.out.println(newStaff.getName() + " " + newStaff.getAddress());

		}catch (FileNotFoundException e){
			System.out.println("Sorry file is not available... will create one!");

			//Serializing
			FileOutputStream fileOut = new FileOutputStream("allStaff.ser");
			ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
			objectOut.writeObject(s1);
			
			objectOut.close();
			//e.printStackTrace();	
		}
	}
}
