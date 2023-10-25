package tn.esprit.gestionzoo.entities;

public non-sealed abstract class Aquatic extends Animal {

    protected String habitat;

    public Aquatic() {
    }

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    public abstract void swim();
    // {
    // System.out.println("This aquatic animal is swimming.");
    // }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Aquatic other = (Aquatic) obj;

        return getName().equals(other.getName())
                && getAge() == other.getAge()
                && habitat.equals(other.habitat);
    }

    @Override
    public String toString() {
        return super.toString() + ", habitat:" + habitat;
    }
}
