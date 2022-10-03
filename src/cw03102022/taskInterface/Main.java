package cw03102022.taskInterface;

public class Main {
    public static void main(String[] args) {
        Motor [] a = new Motor[2];
        a[0] = new Audi();
        a[1] = new BMW();

        for (Motor element: a
             ) { element.BipBip();
             element.GoOnRoot();
             element.zapuskMotor();
             

        }

        Signal [] s = new Signal[2];
        s[0] = new BMW();
        s[1] = new Audi();


    }
}
