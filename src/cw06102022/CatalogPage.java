package cw06102022;


import cw06102022.blok.Regitar;
import cw06102022.elements.ButtonClose;
import cw06102022.elements.ButtonSave;

public class CatalogPage extends BasePage implements HasButtonClose, HasButtonSave{
    @Override
    public ButtonClose getButtonClose() {
        return  new Regitar().buttonClose;
    }

    @Override
    public ButtonSave getButtonSave() {
        return new Regitar().buttonSave;
    }
}
