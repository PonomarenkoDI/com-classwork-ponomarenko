package cw03102022.taskInterface;

public interface Motor extends Go, Signal, PedalGazAndTormoz, Transmission {
    void zapuskMotor();

    default void GoCar() {

    }

}


