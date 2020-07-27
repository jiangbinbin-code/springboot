package designMode.handler.handler1;

public class Son implements IHandler {
    @Override
    public void handlerMessage(IWomen women) {
        System.out.println("son处理请求");
    }
}
