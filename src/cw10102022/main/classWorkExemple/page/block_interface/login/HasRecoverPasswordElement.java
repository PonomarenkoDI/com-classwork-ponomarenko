package classWorkExemple.page.block_interface.login;

import classWorkExemple.page.element.login.RecoverPasswordElement;

public interface HasRecoverPasswordElement {
    RecoverPasswordElement getRecoverPasswordElement();

    default void showRecoverPasswordElementSelector () {
        System.out.println(getRecoverPasswordElement().elementSelector);
    }
}
