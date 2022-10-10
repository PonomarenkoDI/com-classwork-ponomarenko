package classWorkExemple.page.element;

import classWorkExemple.annatation.Element;

@Element(elementName = "Label root element")
public class Label extends BaseElement {
    public Label(String elementSelector) {
        super.elementSelector = elementSelector;
    }
}