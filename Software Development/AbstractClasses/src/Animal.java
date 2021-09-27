public abstract class Animal {
    public String name, race, colour;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
       // this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" + "name='" + name + '\'' + ", race='" + race + '\'' + ", colour='" + colour + '\'' + ", age=" + age + '}';
    }
}
