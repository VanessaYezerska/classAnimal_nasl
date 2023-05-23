public class Elephant extends Animal{
    public Elephant() {
        super("Elephant");
    }

    public void trumpet() {
        System.out.println("Слон тубить!");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Слон - ссавець");
    }
}


