package classWorkExemple.page.block_interface.login.language_element;

import classWorkExemple.page.element.login.language_element.TitleLanguageElement;

public interface HasTitleLanguageElement {
    TitleLanguageElement getTitleLanguageElement();

    default void showTitleLanguageElementSelector () {
        System.out.println(getTitleLanguageElement().elementSelector);
    }

}
