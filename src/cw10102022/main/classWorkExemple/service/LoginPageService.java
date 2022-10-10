package classWorkExemple.service;

import classWorkExemple.annatation.Service;
import classWorkExemple.page.LoginPage;
import classWorkExemple.service.service_interface.HasLoginPage;

@Service(serviceName = "Login page service")
public class LoginPageService extends BaseService implements HasLoginPage {

    private LoginPage loginPage = new LoginPage();

    @Override
    public LoginPage getLoginPage() {
        return loginPage;
    }
}
