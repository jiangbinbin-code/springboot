package designMode.handler.handler1;

public class Husband implements IHandler {
    @Override
    public void handlerMessage(IWomen women) {
        System.out.println("husband处理请求");
    }
}
