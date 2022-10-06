package cw06102022;

import cw06102022.blok.Regitar;
import cw06102022.elements.ButtonClose;
import cw06102022.elements.ButtonOpen;
import cw06102022.elements.ButtonSave;

public class KorzinaPage extends BasePage implements HasButtonSave, HasButtonClose, HasButtonOpen {
    @Override
    public ButtonClose getButtonClose() {
        return new Regitar().buttonClose;
    }

    @Override
    public ButtonOpen getButtonOpen() {
        return new Regitar().buttonOpen;
    }

    @Override
    public ButtonSave getButtonSave() {
        return new Regitar().buttonSave;
    }
}
