package cw27102022;

import java.util.ArrayList;
import java.util.List;

public class Zoo<E>{

    List<E> animals;

    public Zoo() {
        this.animals = new ArrayList<>();
    }

    public void addAnimals (E animal){
        animals.add(animal);
    }

    public List<E> getAnimals (){
        return animals;
    }
}
