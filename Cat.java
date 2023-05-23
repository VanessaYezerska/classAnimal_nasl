public class Cat extends Animal {
    public Cat() {
        super("Cat");
    }

    public void meow() {
        System.out.println("Кіт мурчить!");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Кіт - домашня тварина");
    }
}

