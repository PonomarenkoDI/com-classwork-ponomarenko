package cw24102022.task2;

public class MyExeption_2_Main {
    public static void main(String[] args) {
        MyExeption_2_Main myExeption_2_main = new MyExeption_2_Main();

        myExeption_2_main.MyMethod();
    }


    public void MyMethod () throws MyExeption_2{
        throw new MyExeption_2("Hello My Method");
    }
}
