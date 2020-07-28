package designMode.handler.handler2;

public abstract class Handler {

    public static final int FATHER_LEVEL = 1;
    public static final int HUSBAND_LEVEL = 2;
    public static final int SON_LEVEL = 3;

    private int level = 0;


    public Handler(int _level) {
        this.level = _level;
    }


    public Handler nextHandler;

    public final void handlerMessage(IWomen women) {
        if (women.getType() == this.level) {
            this.responsae(women);
        } else {
            if (this.nextHandler != null) {
                this.nextHandler.handlerMessage(women);
            } else {
                System.out.println("无人处理");
            }
        }


    }

    public void setNextHandler(Handler _handler) {
        this.nextHandler = _handler;
    }

    protected abstract void responsae(IWomen women);


}
