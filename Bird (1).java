public class Bird extends Animal {

    public Bird(int id, String name, int age, String gender) {

        super(id, name, age, gender);
    }

    // Method Overriding
    @Override
    public void displayInfo() {

        System.out.println("\n--- BIRD ---");

        super.displayInfo();
    }
}