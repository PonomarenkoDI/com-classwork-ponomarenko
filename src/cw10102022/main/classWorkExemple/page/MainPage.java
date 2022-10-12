package classWorkExemple.page;

import classWorkExemple.annatation.Page;
import classWorkExemple.page.block.TopMenuBlock;
import classWorkExemple.page.block.left_menu.FooterLeftMenuBlock;
import classWorkExemple.page.block.left_menu.HeaderLeftMenuBlock;
import classWorkExemple.page.block.left_menu.NavigationLeftMenuBlock;
import classWorkExemple.page.block.main.EventBlock;
import classWorkExemple.page.block.main.NewsBlock;
import classWorkExemple.page.page_interface.HasTopMenuBlock;
import classWorkExemple.page.page_interface.left_menu.HasFooterLeftMenuBlock;
import classWorkExemple.page.page_interface.left_menu.HasHeaderLeftMenuBlock;
import classWorkExemple.page.page_interface.left_menu.HasNavigationLeftMenuBlock;
import classWorkExemple.page.page_interface.main.HasEventBlock;
import classWorkExemple.page.page_interface.main.HasNewsBlock;

@Page(pageName = "Main page")
public class MainPage extends BasePage implements HasTopMenuBlock, HasFooterLeftMenuBlock, HasHeaderLeftMenuBlock,
        HasNavigationLeftMenuBlock, HasEventBlock, HasNewsBlock {

    private TopMenuBlock topMenuBlock = new TopMenuBlock();
    private FooterLeftMenuBlock footerLeftMenuBlock = new FooterLeftMenuBlock();
    private HeaderLeftMenuBlock headerLeftMenuBlock = new HeaderLeftMenuBlock();
    private NavigationLeftMenuBlock navigationLeftMenuBlock = new NavigationLeftMenuBlock();
    private EventBlock eventBlock = new EventBlock();
    private NewsBlock newsBlock = new NewsBlock();

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

    @Override
    public EventBlock getEventBlock() {
        return eventBlock;
    }

    @Override
    public NewsBlock getNewsBlock() {
        return newsBlock;
    }
    }

