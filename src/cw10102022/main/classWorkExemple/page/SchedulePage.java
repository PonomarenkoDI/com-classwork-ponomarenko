package classWorkExemple.page;

import classWorkExemple.annatation.Page;
import classWorkExemple.page.block.TopMenuBlock;
import classWorkExemple.page.block.left_menu.FooterLeftMenuBlock;
import classWorkExemple.page.block.left_menu.HeaderLeftMenuBlock;
import classWorkExemple.page.block.left_menu.NavigationLeftMenuBlock;
import classWorkExemple.page.page_interface.HasTopMenuBlock;
import classWorkExemple.page.page_interface.left_menu.HasFooterLeftMenuBlock;
import classWorkExemple.page.page_interface.left_menu.HasHeaderLeftMenuBlock;
import classWorkExemple.page.page_interface.left_menu.HasNavigationLeftMenuBlock;

@Page(pageName = "Schedule page")
public class SchedulePage extends BasePage implements HasTopMenuBlock, HasFooterLeftMenuBlock, HasHeaderLeftMenuBlock, HasNavigationLeftMenuBlock {

    private TopMenuBlock topMenuBlock = new TopMenuBlock();
    private FooterLeftMenuBlock footerLeftMenuBlock = new FooterLeftMenuBlock();
    private HeaderLeftMenuBlock headerLeftMenuBlock = new HeaderLeftMenuBlock();
    private NavigationLeftMenuBlock navigationLeftMenuBlock = new NavigationLeftMenuBlock();

    @Override
    public TopMenuBlock getTopMenuBlock() {
        return topMenuBlock;
    }

    @Override
    public FooterLeftMenuBlock getFooterLeftMenuBlock() {
        return footerLeftMenuBlock;
    }

    @Override
    public HeaderLeftMenuBlock getHeaderLeftMenuBlock() {
        return headerLeftMenuBlock;
    }

    @Override
    public NavigationLeftMenuBlock getNavigationLeftMenuBlock() {
        return navigationLeftMenuBlock;
    }
}
