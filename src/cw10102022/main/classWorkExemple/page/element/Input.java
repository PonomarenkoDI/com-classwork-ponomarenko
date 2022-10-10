package classWorkExemple.page.element;

import classWorkExemple.annatation.Element;

@Element(elementName = "Input root element")
public class Input extends BaseElement {
    public Input(String elementSelector) {
        super.elementSelector = elementSelector;
    }
}