package classWorkExemple.page;

import classWorkExemple.annatation.Page;
import classWorkExemple.page.block.login.LanguageBlock;
import classWorkExemple.page.block.login.LoginFormBlock;
import classWorkExemple.page.page_interface.login.HasLanguageBlock;
import classWorkExemple.page.page_interface.login.HasLoginFormBlock;


@Page(pageName = "Login page")
public class LoginPage extends BasePage implements HasLanguageBlock, HasLoginFormBlock {

    private LanguageBlock languageBlock = new LanguageBlock();
    private LoginFormBlock loginFormBlock = new LoginFormBlock();

    @Override
    public LanguageBlock getLanguageBlock() {
        return languageBlock;
    }

    @Override
    public LoginFormBlock getLoginFormBlock() {
        return loginFormBlock;
    }

}
