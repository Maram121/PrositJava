package tn.esprit.gestionzoo.entities;

public class Zoo {
    public Animal[] animals;
    private String name;
    private String city;
    final int nbrCages = 25;
    private Aquatic[] aquaticAnimals;
    int nbrAq;

    int nbrAnimals;
    public static int NBRAnimals = 0;

    public Zoo() {

    }

    public Zoo(String name, String city) {
        animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;
        this.aquaticAnimals = new Aquatic[10];

    }

    public void addAquaticAnimal(Aquatic aquatic) {
        if (nbrAq < 10) {

            aquaticAnimals[nbrAq] = aquatic;
            nbrAq++;
            System.out.println("aaaaaa" + animals[animals.length - 1] == null);

        } else {
            System.out.println("full");

        }
    }

    public Aquatic[] getAquaticAnimal() {
        return this.aquaticAnimals;

    }

    public void setName(String name) {
        if (name.isBlank()) {
            this.name = name;
        }

    }

    public String getName() {
        return this.name;

    }

    public void setCity(String city) {
        if (city.isBlank()) {
            this.city = city;
        }

    }

    public String getCity() {
        return this.city;

    }

    void displayZoo() {
        System.out.println("Name: " + name + ", City: " + getCity() + ", N° Cages/Animals: " + nbrCages);
    }

    public boolean addAnimal(Animal animal) {
        if (searchAnimal(animal) != -1)
            return false;
        // if (nbrAnimals == nbrCages)
        if (isZooFull()) {
            System.out.println("isZooFull() " + isZooFull());
            return false;
        } else {
            animals[nbrAnimals] = animal;
            NBRAnimals++;
            nbrAnimals++;
            return true;
        }

    }

    public boolean removeAnimal(Animal animal) {
        int indexAnimal = searchAnimal(animal);
        if (indexAnimal == -1)
            return false;
        for (int i = indexAnimal; i < nbrAnimals; i++) {
            animals[i] = animals[i + 1];
            animals[nbrAnimals] = null;
            this.nbrAnimals--;
        }
        return true;
    }

    public void displayAnimals() {
        System.out.println("Liste des animaux de " + name + ":");
        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println(animals[i]);
        }
    }

    public int searchAnimal(Animal animal) {
        int index = -1;
        for (int i = 0; i < nbrAnimals; i++) {
            if (animal.getName() == animals[i].getName())
                return i;
        }
        return index;
    }

    public boolean isZooFull() {
        return !(animals[animals.length - 1] == null);
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimals > z2.nbrAnimals) {
            return z1;
        } else if (z1.nbrAnimals > z2.nbrAnimals) {
            return z2;
        } else {
            System.out.println(" les nombres d'animeaux sont égaux ");
            return z2;
        }

    }

    public float maxPenguinSwimmingDepth() {
        float maxDepth = -1.0f;
        for (int i = 0; i < nbrAq; i++) {
            if (aquaticAnimals[i] instanceof Penguin) {
                Penguin penguin = (Penguin) aquaticAnimals[i];
                if (penguin.getSwimmingDepth() > maxDepth) {
                    maxDepth = penguin.getSwimmingDepth();
                }
            }
        }
        return maxDepth;
    }

    public void displayNumberOfAquaticsByType() {
        int dolphinCount = 0;
        int penguinCount = 0;

        for (int i = 0; i < nbrAq; i++) {
            if (aquaticAnimals[i] instanceof Dolphin) {
                dolphinCount++;
            } else if (aquaticAnimals[i] instanceof Penguin) {
                penguinCount++;
            }
        }

        System.out.println("Number of Dolphins: " + dolphinCount);
        System.out.println("Number of Penguins: " + penguinCount);
    }

    @Override
    public String toString() {
        return "Name: " + getName() + ", City: " + getCity() + ", N° Cages/Animals: " + nbrCages;
    }
}
