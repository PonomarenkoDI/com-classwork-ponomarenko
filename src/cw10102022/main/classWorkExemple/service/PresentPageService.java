package classWorkExemple.service;

import classWorkExemple.annatation.Service;
import classWorkExemple.page.PresentsPage;
import classWorkExemple.service.service_interface.HasPresentPage;

@Service(serviceName = "Present page service")
public class PresentPageService extends BaseService implements HasPresentPage {

    private PresentsPage presentsPage = new PresentsPage();

    @Override
    public PresentsPage getPresentPage() {
        return presentsPage;
    }
}
