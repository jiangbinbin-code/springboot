package designMode.handler.handler2;

public class Father extends Handler {

    public Father(int _level) {
        super(Handler.FATHER_LEVEL);
    }

    @Override
    protected void responsae(IWomen women) {
            System.out.println("father"+women.getRequest());
    }
}
