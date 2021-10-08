public class Abstract_Animal_Tester {
    public static void main(String[] args) {
        Animal dog = new Dog("DOG", "DOG", "JACK", "GREEN", 4, 36);
        Animal cat = new Cat("CAT", "CAT", "JACK", "GREEN", 4, 12);
        Animal bird = new Bird();
        Animal fish = new Fish();

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
