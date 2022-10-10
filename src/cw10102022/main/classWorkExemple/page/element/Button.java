package classWorkExemple.page.element;

import classWorkExemple.annatation.Element;

@Element(elementName = "Button root element")
public class Button extends BaseElement {
    public Button (String elementSelector){
        super.elementSelector = elementSelector;
    }
}
