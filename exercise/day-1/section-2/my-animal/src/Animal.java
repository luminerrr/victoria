abstract class Animal {
    String name;
    String species;

    abstract void sound();

    public Animal() {
        name = "animales";
        species = "presiden";
    }

    void eat() {
        System.out.println("this animal eats food");
    }

    void makeSound() {
        System.out.println("this animal makes sound");
    }

    public void setName (String name) {
        this.name = name;
    }

    public void setSpecies (String species) {
        this.species = species;
    }
}

