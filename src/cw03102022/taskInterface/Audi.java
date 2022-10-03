package cw03102022.taskInterface;

public class Audi implements Motor {
    @Override
    public void GoOnRoot() {
        System.out.println("Едем по дороге на AUDI");
    }

    @Override
    public void zapuskMotor() {
        System.out.println("Заводим автомобиль AUDI");
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
