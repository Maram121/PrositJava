package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class ZooManagement {

    public static void main(String[] args) {
        // PROSIT 3
        Animal lion = new Animal();
        lion.name = "Simba";
        lion.setAge(8);
        lion.family = "Cats";
        lion.isMammal = true;

        Zoo myZoo = new Zoo();
        myZoo.setName("Wildlife Park");
        myZoo.city = "Ariana";
        myZoo.animals = new Animal[25];

        Animal dog = new Animal("Canine", "Snoopy", 2, true);

        System.out.println(myZoo);
        System.out.println(myZoo.toString());

        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(dog));

        myZoo.displayAnimals();

        System.out.println(myZoo.searchAnimal(dog));
        Animal dog2 = new Animal("Canine", "Snoopy", 2, true);
        System.out.println(myZoo.searchAnimal(dog2));

        System.out.println(myZoo.removeAnimal(dog));
        myZoo.displayAnimals();

        System.out.println("-------------------------------");
        System.out.println(myZoo.NBRAnimals);
        System.out.println(myZoo.isZooFull());
        System.out.println("-------------------------------");

        Zoo myZoo2 = new Zoo(" Tozuer tn.esprit.gestionzoo.entities.Zoo", "Tozeur");
        Animal turtle = new Animal("slow", "donatello", 20, false);
        System.out.println(myZoo.addAnimal(turtle));
        System.out.println("hey " + turtle);

        System.out.println("-------------------------------");
        System.out.println(Zoo.NBRAnimals); // nom de classe

        System.out.println("-------------------------------");
        System.out.println(Zoo.comparerZoo(myZoo, myZoo2));

    }

}
