package designMode.adater;

public class App {

    public static void main(String[] args) {
        IUserInfo yonggire = new OuterUserInfo();
        yonggire.getMobileNumber();

    }
}
