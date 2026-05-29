public class Dog extends Animal {

    public Dog(int id, String name, int age, String gender) {

        super(id, name, age, gender);
    }

    // Method Overriding
    @Override
    public void displayInfo() {

        System.out.println("\n--- DOG ---");

        super.displayInfo();
    }
}