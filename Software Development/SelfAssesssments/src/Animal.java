public class Animal {
    String name, type, ownersName, colour;
    int legs, age;

    public Animal(String name, String type, String ownersName, String colour, int legs, int age) {
        this.name = name;
        this.type = type;
        this.ownersName = ownersName;
        this.colour = colour;
        this.legs = legs;
        this.age = age;
    }

    public Animal() {

    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getOwnersName() {
        return ownersName;
    }

    public String getColour() {
        return colour;
    }

    public int getLegs() {
        return legs;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setOwnersName(String ownersName) {
        this.ownersName = ownersName;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void PrintDetails() {
        String print = "Animal{" + "name='" + name + '\'' + ", type='" + type + '\'' + ", ownersName='" + ownersName + '\'' + ", colour='" + colour + '\'' + ", legs=" + legs + ", age=" + age + '}';
        System.out.println(print);
    }
}
