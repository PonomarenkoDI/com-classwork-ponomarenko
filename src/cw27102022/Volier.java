package cw27102022;

public class Volier <E>{

    private E animal;

    public void setAnimal(E animal) {
        this.animal = animal;
    }

    @Override
    public String toString() {
        return "Volier: " +
                "animal=" + animal;
    }
}
