package classWorkExemple.page.block.login;

import classWorkExemple.annatation.Block;
import classWorkExemple.page.block.BaseBlock;
import classWorkExemple.page.element.login.language_element.LanguageElement;
import classWorkExemple.page.element.login.language_element.TitleLanguageElement;

@Block(blockName = "Language login block")
public class LanguageBlock extends BaseBlock {

    private LanguageElement languageElement = new LanguageElement("selector for language element");
    private TitleLanguageElement titleLanguageElement = new TitleLanguageElement("selector for title language");

}
