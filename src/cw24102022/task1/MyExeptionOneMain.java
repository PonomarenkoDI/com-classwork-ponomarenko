package cw24102022.task1;

public class MyExeptionOneMain {
    public static void main(String[] args) {

        MyExeptionOneMain obj = new MyExeptionOneMain();

        try {
            obj.myMethodOne();
        } catch (MyExeptionOne ex) {
            System.err.println(ex.getMessage());
        }

    }

    public void myMethodOne() throws MyExeptionOne {
        throw new MyExeptionOne("Hello my Exeption One");

    }
}
