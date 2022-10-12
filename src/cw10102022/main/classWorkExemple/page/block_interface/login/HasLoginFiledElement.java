package classWorkExemple.page.block_interface.login;

import classWorkExemple.page.element.login.LoginFieldElement;

public interface HasLoginFiledElement {

    LoginFieldElement getLoginFieldElement();

    default void showLoginFieldElementSelector () {
        System.out.println(getLoginFieldElement().elementSelector);
    }
}
