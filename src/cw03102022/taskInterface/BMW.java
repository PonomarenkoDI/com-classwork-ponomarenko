package cw03102022.taskInterface;

public class BMW implements Motor {

    @Override
    public void GoOnRoot() {
        System.out.println("Едем по дороге");
    }

    @Override
    public void zapuskMotor() {
        System.out.println("Заводим автомобиль BMW");
    }

    @Override
    public void nagatieGazOrTormoz() {
        System.out.println("Нажимаем газ/тормоз");
    }

    @Override
    public void BipBip() {
        System.out.println("Сигналим");
    }

    @Override
    public void switchTransmission() {
        System.out.println("Передачи");

    }
}
