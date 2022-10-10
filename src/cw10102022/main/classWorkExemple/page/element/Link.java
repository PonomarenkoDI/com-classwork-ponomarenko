package classWorkExemple.page.element;

import classWorkExemple.annatation.Element;

@Element(elementName = "Link root element")
public class Link extends BaseElement {
    public Link (String elementSelector) {
        super.elementSelector = elementSelector;
    }
}