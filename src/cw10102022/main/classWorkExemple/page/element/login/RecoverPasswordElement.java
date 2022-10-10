package classWorkExemple.page.element.login;

import classWorkExemple.annatation.Element;
import classWorkExemple.page.element.Link;

@Element(elementName = "Recover password element")
public class RecoverPasswordElement extends Link {
    public RecoverPasswordElement(String elementSelector) {
        super(elementSelector);
    }
}
