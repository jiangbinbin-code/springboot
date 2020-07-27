package designMode.adater;

import java.util.Map;

public class OuterUserInfo extends OuterUser implements  IUserInfo {

    private Map baseInfo=super.getUserBaseInfo();
    private Map homeInfo=super.getUserHomeInfo();
    private Map officeInfo=super.getUserOfficeInfo();
    @Override
    public String getUserName() {

        return (String) this.homeInfo.get("userName");
    }

    @Override
    public String getMobileNumber() {
        return null;
    }

    @Override
    public String getOfficeTelNumber() {
        return null;
    }

    @Override
    public String getJobPosition() {
        return null;
    }

    @Override
    public String getHomeTelNumber() {
        return null;
    }
}
