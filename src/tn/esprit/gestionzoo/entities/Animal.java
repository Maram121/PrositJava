package tn.esprit.gestionzoo.entities;

public class Animal {

    private String family;
    private String name;
    private int age;
    boolean isMammal;

    public Animal() {

    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }

    }

    public int getAge() {
        return this.age;

    }

    public void setName(String name) {
        if (name.isBlank()) {
            this.name = name;
        }
    }

    public String getName() {
        return this.name;

    }

    public void setFamily(String family) {
        if (family.isBlank()) {
            this.family = family;
        }

    }

    public String getFamily() {
        return this.family;

    }

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    @Override
    public String toString() {
        return "tn.esprit.gestionzoo.entities.Animal{" +
                "family='" + getFamily() + '\'' +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", isMammal=" + isMammal +
                '}';
    }
}
