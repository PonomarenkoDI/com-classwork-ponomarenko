package classWorkExemple.page.block_interface.login.language_element;

import classWorkExemple.page.element.login.language_element.LanguageElement;

public interface HasLanguageElement {

    LanguageElement getLanguageElement();

    default void showLanguageElementSelector () {
        System.out.println(getLanguageElement().elementSelector);
    }

}
