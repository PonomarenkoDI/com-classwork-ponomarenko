package cw03102022.taskInterface;

public class Main {
    public static void main(String[] args) {
        Motor [] a = new Motor[2];
        a[0] = new Audi();
        a[1] = new BMW();

        for (Motor element: a
             ) { element.zapuskMotor();
             element.GoOnRoot();
             element.zapuskMotor();
             element.BipBip();
             element.GoCar();
             element.nagatieGazOrTormoz();
             element.switchTransmission();
            System.out.println();
        }

    }
}
