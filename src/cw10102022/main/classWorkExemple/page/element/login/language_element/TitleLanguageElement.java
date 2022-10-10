package classWorkExemple.page.element.login.language_element;

import classWorkExemple.annatation.Element;
import classWorkExemple.page.element.Label;

@Element(elementName = "Title language element")
public class TitleLanguageElement extends Label {
    public TitleLanguageElement(String elementSelector) {
        super(elementSelector);
    }
}
