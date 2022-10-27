package cw27102022;

public class Animal <E> {
    private E Leon;

    public Animal (E Leon){
        this.Leon = Leon;
    }

    public E getLeon (){
        return Leon;
    }
}
