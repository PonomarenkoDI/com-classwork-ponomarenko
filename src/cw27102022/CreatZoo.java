package cw27102022;

public class CreatZoo {
    public static void main(String[] args) {

        Zoo<Volier> zoo = new Zoo<>();

        Volier<Leon> leonVolier = new Volier<>();
        Leon leon1 = new Leon();
        leonVolier.setAnimal(leon1);

        Volier<Wolf> wolfVolier = new Volier<>();
        Wolf wolf1 = new Wolf();
        wolfVolier.setAnimal(wolf1);

        zoo.addAnimals(wolfVolier);
        zoo.addAnimals(leonVolier);

        for (Volier v : zoo.getAnimals()) {
        }
        System.out.println(leonVolier.toString());
        System.out.println(wolfVolier.toString());

    }
}
