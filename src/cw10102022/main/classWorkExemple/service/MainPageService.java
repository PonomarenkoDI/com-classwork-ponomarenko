package classWorkExemple.service;

import classWorkExemple.annatation.Service;
import classWorkExemple.page.MainPage;
import classWorkExemple.service.service_interface.HaseMainPage;

@Service(serviceName = "Main page service")
public class MainPageService extends BaseService implements HaseMainPage {

    private MainPage mainPage = new MainPage();
    @Override
    public MainPage getMainPage() {
        return mainPage;
    }
}
