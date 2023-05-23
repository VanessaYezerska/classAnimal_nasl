
public class Animal { // Батьківський клас
    protected String species;

    public Animal(String species) {
        this.species = species;
    }

    public void displayInfo() {
        System.out.println("Вид: " + species);
    }
}
