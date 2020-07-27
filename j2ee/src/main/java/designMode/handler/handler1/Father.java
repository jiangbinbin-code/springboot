package designMode.handler.handler1;

public class Father implements IHandler {
    @Override
    public void handlerMessage(IWomen women) {
        System.out.println("father处理请求");
    }
}
