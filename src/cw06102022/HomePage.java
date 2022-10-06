package cw06102022;

import cw06102022.blok.Login;
import cw06102022.elements.ButtonClose;
import cw06102022.elements.ButtonSave;

public class HomePage extends BasePage implements HasButtonClose,HasButtonSave{

    @Override
    public ButtonClose getButtonClose() {
        return new Login().buttonClose;
    }


    @Override
    public ButtonSave getButtonSave() {
        return new Login().buttonSave;
    }
}
