package classWorkExemple.page.block.login;

import classWorkExemple.annatation.Block;
import classWorkExemple.page.block.BaseBlock;
import classWorkExemple.page.block_interface.login.HasLoginButtonElement;
import classWorkExemple.page.block_interface.login.HasLoginFiledElement;
import classWorkExemple.page.block_interface.login.HasPasswordFieldElement;
import classWorkExemple.page.block_interface.login.HasRecoverPasswordElement;
import classWorkExemple.page.element.login.LoginButtonElement;
import classWorkExemple.page.element.login.LoginFieldElement;
import classWorkExemple.page.element.login.PasswordFieldElement;
import classWorkExemple.page.element.login.RecoverPasswordElement;

@Block(blockName = "Login form login block")
public class LoginFormBlock extends BaseBlock implements HasLoginButtonElement, HasLoginFiledElement, HasPasswordFieldElement, HasRecoverPasswordElement {

    private LoginButtonElement loginButtonElement = new LoginButtonElement("selector for Login Button");
    private LoginFieldElement loginFieldElement = new LoginFieldElement("selector for Login input");
    private PasswordFieldElement passwordFieldElement = new PasswordFieldElement("selector for Password input");
    private RecoverPasswordElement recoverPasswordElement = new RecoverPasswordElement("selector for recover link");

    @Override
    public LoginButtonElement getLoginButtonElement() {
        return loginButtonElement;
    }

    @Override
    public LoginFieldElement getLoginFieldElement() {
        return loginFieldElement;
    }

    @Override
    public PasswordFieldElement getPasswordFieldElement() {
        return passwordFieldElement;
    }

    @Override
    public RecoverPasswordElement getRecoverPasswordElement() {
        return recoverPasswordElement;
    }

}
