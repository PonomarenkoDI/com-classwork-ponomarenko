package cw06102022;

import cw06102022.elements.ButtonOpen;

public interface HasButtonOpen {

    ButtonOpen getButtonOpen();

    default void verifyButtonOpen() {
        if (getButtonOpen().getNumber() == 10) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}
