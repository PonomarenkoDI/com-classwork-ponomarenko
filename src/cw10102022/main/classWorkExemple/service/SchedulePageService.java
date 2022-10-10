package classWorkExemple.service;

import classWorkExemple.annatation.Service;
import classWorkExemple.page.SchedulePage;
import classWorkExemple.service.service_interface.HasSchedulePage;

@Service(serviceName = "Schedule page service")
public class SchedulePageService extends BaseService implements HasSchedulePage {

    private SchedulePage schedulePage = new SchedulePage();

    @Override
    public SchedulePage getSchedulePage() {
        return schedulePage;
    }
}
