public class AnimalTester {
    public static void main(String[] args) {
        Animal dog = new Animal("DOG", "DOG", "JACK", "GREEN", 4, 36);
        Animal cat = new Animal("CAT", "CAT", "JACK", "GREEN", 4, 12);
        Animal bird = new Animal();
        Animal fish = new Animal();

        bird.setName("Gun");
        bird.setType("Type");
        bird.setAge(23);
        bird.setOwnersName("ownersname");
        bird.setColour("red");
        bird.setLegs(3);


        fish.setName("Gun");
        fish.setType("Type");
        fish.setAge(23);
        fish.setOwnersName("ownersname");
        fish.setColour("red");
        fish.setLegs(3);

        dog.PrintDetails();
        cat.PrintDetails();
        bird.PrintDetails();
        fish.PrintDetails();
    }


}
