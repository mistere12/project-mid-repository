import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Parent class array
        Animal[] animals = new Animal[20];

        int count = 0;

        int choice;

        do {

            System.out.println("\n===== ANIMAL SHELTER =====");

            System.out.println("1. Add Animal");
            System.out.println("2. Adopt Animal");
            System.out.println("3. Display Animals");
            System.out.println("4. Exit");

            System.out.print("Enter Choice: ");
            choice = input.nextInt();

            // ==========================
            // ADD ANIMAL
            // ==========================
            if(choice == 1) {

                System.out.println("\nChoose Animal Type");
                System.out.println("1. Dog");
                System.out.println("2. Cat");
                System.out.println("3. Bird");

                System.out.print("Enter Type: ");
                int type = input.nextInt();

                System.out.print("Enter ID: ");
                int id = input.nextInt();

                input.nextLine();

                System.out.print("Enter Name: ");
                String name = input.nextLine();

                System.out.print("Enter Age: ");
                int age = input.nextInt();

                input.nextLine();

                System.out.print("Enter Gender: ");
                String gender = input.nextLine();

                // Runtime Polymorphism
                if(type == 1) {

                    animals[count] =
                    new Dog(id, name, age, gender);
                }

                else if(type == 2) {

                    animals[count] =
                    new Cat(id, name, age, gender);
                }

                else if(type == 3) {

                    animals[count] =
                    new Bird(id, name, age, gender);
                }

                count++;

                System.out.println("Animal Added Successfully!");
            }

            
            // ADOPT ANIMAL
            
            else if(choice == 2) {

                System.out.println("\nChoose Animal Type");
                System.out.println("1. Dog");
                System.out.println("2. Cat");
                System.out.println("3. Bird");

                System.out.print("Enter Type: ");
                int type = input.nextInt();

                System.out.print("Enter Animal ID: ");
                int adoptId = input.nextInt();

                boolean found = false;

                for(int i = 0; i < count; i++) {

                    if(animals[i].getId() == adoptId &&
                       !animals[i].isAdopted()) {

                        if(type == 1 && animals[i] instanceof Dog) {

                            animals[i].setAdopted(true);

                            System.out.println(
                            animals[i].getName()
                            + " adopted successfully!");

                            found = true;
                        }

                        else if(type == 2 &&
                                animals[i] instanceof Cat) {

                            animals[i].setAdopted(true);

                            System.out.println(
                            animals[i].getName()
                            + " adopted successfully!");

                            found = true;
                        }

                        else if(type == 3 &&
                                animals[i] instanceof Bird) {

                            animals[i].setAdopted(true);

                            System.out.println(
                            animals[i].getName()
                            + " adopted successfully!");

                            found = true;
                        }
                    }
                }

                if(found == false) {

                    System.out.println("Animal Not Found.");
                }
            }

            
            // DISPLAY ANIMALS
           
            else if(choice == 3) {

                System.out.println("\nChoose Animal Type");
                System.out.println("1. Dog");
                System.out.println("2. Cat");
                System.out.println("3. Bird");

                System.out.print("Enter Type: ");
                int type = input.nextInt();

                boolean found = false;

                for(int i = 0; i < count; i++) {

                    if(!animals[i].isAdopted()) {

                        if(type == 1 &&
                           animals[i] instanceof Dog) {

                            animals[i].displayInfo();

                            found = true;
                        }

                        else if(type == 2 &&
                                animals[i] instanceof Cat) {

                            animals[i].displayInfo();

                            found = true;
                        }

                        else if(type == 3 &&
                                animals[i] instanceof Bird) {

                            animals[i].displayInfo();

                            found = true;
                        }
                    }
                }

                if(found == false) {

                    System.out.println("No Animals Available.");
                }
            }

        } while(choice != 4);

        System.out.println("Program Ended");

        input.close();
    }
}