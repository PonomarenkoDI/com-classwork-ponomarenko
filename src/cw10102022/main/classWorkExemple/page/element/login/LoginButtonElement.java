package classWorkExemple.page.element.login;

import classWorkExemple.annatation.Element;
import classWorkExemple.page.element.Button;

@Element(elementName = "Login button element")
public class LoginButtonElement extends Button {
    public LoginButtonElement(String elementSelector) {
        super(elementSelector);
    }
}
