package classWorkExemple.page.element.login;

import classWorkExemple.annatation.Element;
import classWorkExemple.page.element.Input;

@Element(elementName = "Password field element")
public class PasswordFieldElement extends Input {
    public PasswordFieldElement(String elementSelector) {
        super(elementSelector);
    }
}
