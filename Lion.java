public class Lion extends Animal{
    public Lion() {
        super("Lion");
    }

    public void roar() {
        System.out.println("Лев ричить!");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Лев - хижак");
    }
}

