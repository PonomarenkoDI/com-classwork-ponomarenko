package cw06102022;

import cw06102022.elements.ButtonClose;


public interface HasButtonClose {
    ButtonClose getButtonClose();

    default void verifyButtonClose() {
        if (getButtonClose().getNumber() == 5) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}
