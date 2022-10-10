package classWorkExemple.page.element.login.language_element;

import classWorkExemple.annatation.Element;
import classWorkExemple.page.element.Link;

@Element(elementName = "Language element")
public class LanguageElement extends Link {
    public LanguageElement(String elementSelector) {
        super(elementSelector);
    }
}
