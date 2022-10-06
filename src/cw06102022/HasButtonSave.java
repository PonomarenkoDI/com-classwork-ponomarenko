package cw06102022;

import cw06102022.elements.ButtonSave;

public interface HasButtonSave {
    ButtonSave getButtonSave();

    default void verifyButtonSave() {
        if (getButtonSave().getNumber() == 8) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}
