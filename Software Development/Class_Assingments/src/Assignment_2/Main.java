package Assignment_2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<Phone> phones = CreatePhonesArrayList();
        //  SERIALIZE
        try {
            FileOutputStream fileOut = new FileOutputStream("phone.ser");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            SerializeMembers(phones, objectOut);
            objectOut.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //  DESERIALIZE
        try {
            FileInputStream fileIn = new FileInputStream("phone.ser");
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            DeserializeMembers(phones, objectIn);
            objectIn.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("---------------------------------------------------------------------------------------------------------------");
        Phone p8 = new Phone("New phone", "A1023", 8, 9.3, 2.4, false, 50);
        phones.remove(phones.size() - 1);
        phones.add(p8);

        try {
            FileOutputStream fileOut = new FileOutputStream("phone.ser");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            SerializeMembers(phones, objectOut);
            objectOut.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //  DESERIALIZE
        try {
            FileInputStream fileIn = new FileInputStream("phone.ser");
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            DeserializeMembers(phones, objectIn);
            objectIn.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
    private static void SerializeMembers(ArrayList<Phone> phones, ObjectOutputStream objectOut) throws IOException {
        for (int i = 0; i < phones.size(); i++) {
            objectOut.writeObject(phones.get(i));
        }

    }
    private static void DeserializeMembers(ArrayList<Phone> phones,  ObjectInputStream objectIn) throws IOException, ClassNotFoundException {
        Phone new_phone_1 = (Phone) objectIn.readObject();
        Phone new_phone_2 = (Phone) objectIn.readObject();
        Phone new_phone_3 = (Phone) objectIn.readObject();
        Phone new_phone_4 = (Phone) objectIn.readObject();
        Phone new_phone_5 = (Phone) objectIn.readObject();
        Phone new_phone_6 = (Phone) objectIn.readObject();
       Phone new_phone_7 = (Phone) objectIn.readObject();

        print_object(new_phone_1);
        print_object(new_phone_2);
        print_object(new_phone_3);
        print_object(new_phone_4);
        print_object(new_phone_5);
        print_object(new_phone_6);
        print_object(new_phone_7);
    }
    private static ArrayList<Phone> CreatePhonesArrayList() {
        ArrayList<Phone> phones = new ArrayList<>();
        Phone p1 = new Phone("Sony", "Experia X", 32, 12.5, 4.6, true, 150);
        Phone p2 = new Phone("Sony", "Experia Z", 64, 14.2, 5.6, true, 175);
        Phone p3 = new Phone("Samsung", "Galaxy M", 64, 14.5, 5.4, true, 180);
        Phone p4 = new Phone("Nokia", "3330", 16, 13.2, 2.3, false, 90);
        Phone p5 = new Phone("Motorola", "M1", 8, 11.3, 4.9, true, 100);
        Phone p6 = new Phone("IPhone", "6", 32, 13.5, 6.4, false, 250);
        Phone p7 = new Phone("Alcatel", "A3", 8, 9.3, 2.4, false, 50);
        phones.add(p1);
        phones.add(p2);
        phones.add(p3);
        phones.add(p4);
        phones.add(p5);
        phones.add(p6);
        phones.add(p7);
        return phones;



    }
    private static String convertBooleanToYesNo(boolean value) {
        if (value) {
            return "Yes";
        } else {
            return "No";
        }
    }
    private static void print_object(Phone new_phone) {
        System.out.println(new_phone.getMake() + " " + new_phone.getModel() + " " + new_phone.getMemory() + " " + new_phone.getCamera() + " " + new_phone.getScreen_size() + " " + convertBooleanToYesNo(new_phone.getSmart())  + " " + new_phone.getPrice() + " ");

    }
}
