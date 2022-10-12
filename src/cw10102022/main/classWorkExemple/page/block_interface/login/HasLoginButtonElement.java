package classWorkExemple.page.block_interface.login;

import classWorkExemple.page.element.login.LoginButtonElement;

public interface HasLoginButtonElement {
    LoginButtonElement getLoginButtonElement();

    default void showLoginButtonElementSelector () {
        System.out.println(getLoginButtonElement().elementSelector);
    }
}
