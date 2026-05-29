public class Animal {

    // Encapsulation
    private int id;
    private String name;
    private int age;
    private String gender;
    private boolean adopted;

    // Constructor
    public Animal(int id, String name, int age, String gender) {

        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        adopted = false;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public boolean isAdopted() {
        return adopted;
    }

    // Setter
    public void setAdopted(boolean adopted) {
        this.adopted = adopted;
    }

    // Method Overloading
    public void show() {
        System.out.println(name);
    }

    public void show(String message) {
        System.out.println(message + " " + name);
    }

    // Method for Polymorphism
    public void displayInfo() {

        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }
}