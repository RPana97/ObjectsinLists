import java.util.Scanner;
import java.util.ArrayList;

public class Animal {
    private String name;
    private boolean isDog;

    public Animal (String name, boolean isDog) {
        this.name = name;
        this.isDog = isDog;
    }

    public String getName() {
        return name;
    }

    public boolean isDog() {
        return isDog;
    }

    @Override
    public String toString() {
        return getName() + " is a dog = " + isDog();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        ArrayList<Animal> animals = new ArrayList<>();

        while (true) {
            System.out.println ("Enter the name of the animal (or press enter to finish): ");
            String name = scanner.nextLine();
            if (name.isEmpty()){
                break;
            }
            System.out.println ("Is it a dog? Yes or no: ");
            String isDogStr = scanner.nextLine();
            boolean isDog = isDogStr.equalsIgnoreCase("yes");
            Animal animal = new Animal (name, isDog);
            animals.add(animal);
        }

        System.out.println("Animals entered:");
        for (Animal animal : animals) {
            System.out.println(animal);
        }

    }
}
