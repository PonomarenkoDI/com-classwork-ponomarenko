package classWorkExemple.page.block_interface.login;

import classWorkExemple.page.element.login.PasswordFieldElement;

public interface HasPasswordFieldElement {

    PasswordFieldElement getPasswordFieldElement();

    default void showPasswordFieldElementSelector () {
        System.out.println(getPasswordFieldElement().elementSelector);
    }
}
