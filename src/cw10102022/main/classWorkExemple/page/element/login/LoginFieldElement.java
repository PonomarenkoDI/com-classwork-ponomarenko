package classWorkExemple.page.element.login;

import classWorkExemple.annatation.Element;
import classWorkExemple.page.element.Input;

@Element(elementName = "Login field element")
public class LoginFieldElement extends Input {
    public LoginFieldElement(String elementSelector) {
        super(elementSelector);
    }
}
