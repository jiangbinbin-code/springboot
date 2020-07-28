package designMode.handler.handler1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * handler 责任链模式
 */
public class App {

    public static void main(String[] args) {
        Random random = new Random();
        List<IWomen> ws = new ArrayList<IWomen>();
        for (int i = 0; i < 5; i++) {
            ws.add(new Women(random.nextInt(4), "go out"));
        }
        Son son = new Son();
        Father father = new Father();
        Husband hus = new Husband();
        ws.forEach(w -> {
            if (w.getType() == 1) {
                son.handlerMessage(w);
            } else if (w.getType() == 2) {
                father.handlerMessage(w);
            } else {
                hus.handlerMessage(w);
            }
        });

    }
}
