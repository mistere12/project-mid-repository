public class Cat extends Animal {

    public Cat(int id, String name, int age, String gender) {

        super(id, name, age, gender);
    }

    // Method Overriding
    @Override
    public void displayInfo() {

        System.out.println("\n--- CAT ---");

        super.displayInfo();
    }
}
