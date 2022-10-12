package classWorkExemple.page;


import classWorkExemple.annatation.Page;
import classWorkExemple.page.block.TopMenuBlock;
import classWorkExemple.page.block.left_menu.FooterLeftMenuBlock;
import classWorkExemple.page.block.left_menu.HeaderLeftMenuBlock;
import classWorkExemple.page.block.left_menu.NavigationLeftMenuBlock;
import classWorkExemple.page.block.present.HeaderBlock;
import classWorkExemple.page.block.present.MaterialInformationBlock;
import classWorkExemple.page.block.present.NavigationBlock;
import classWorkExemple.page.block.present.StudentTableBlock;
import classWorkExemple.page.page_interface.HasTopMenuBlock;
import classWorkExemple.page.page_interface.left_menu.HasFooterLeftMenuBlock;
import classWorkExemple.page.page_interface.left_menu.HasHeaderLeftMenuBlock;
import classWorkExemple.page.page_interface.left_menu.HasNavigationLeftMenuBlock;
import classWorkExemple.page.page_interface.present.HasHeaderBlock;
import classWorkExemple.page.page_interface.present.HasMaterialInformationBlock;
import classWorkExemple.page.page_interface.present.HasNavigationBlock;
import classWorkExemple.page.page_interface.present.HasStudentTableBlock;

@Page(pageName = "Present page")
public class PresentsPage extends BasePage implements HasTopMenuBlock, HasFooterLeftMenuBlock, HasHeaderLeftMenuBlock, HasNavigationLeftMenuBlock,
        HasHeaderBlock, HasMaterialInformationBlock, HasNavigationBlock, HasStudentTableBlock {

    private TopMenuBlock topMenuBlock = new TopMenuBlock();
    private FooterLeftMenuBlock footerLeftMenuBlock = new FooterLeftMenuBlock();
    private HeaderLeftMenuBlock headerLeftMenuBlock = new HeaderLeftMenuBlock();
    private NavigationLeftMenuBlock navigationLeftMenuBlock = new NavigationLeftMenuBlock();
    private HeaderBlock headerBlock = new HeaderBlock();
    private MaterialInformationBlock materialInformationBlock = new MaterialInformationBlock();
    private NavigationBlock navigationBlock = new NavigationBlock();
    private StudentTableBlock studentTableBlock = new StudentTableBlock();


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
    public HeaderBlock getHeaderBlock() {
        return headerBlock;
    }

    @Override
    public MaterialInformationBlock getMaterialInformationBlock() {
        return materialInformationBlock;
    }

    @Override
    public NavigationBlock getNavigationBlock() {
        return navigationBlock;
    }

    @Override
    public StudentTableBlock getStudentTableBlock() {
        return studentTableBlock;
    }
}
