package designMode.handler.handler2;

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
        Son son = new Son(3);
        Father father = new Father(1);
        Husband hus = new Husband(2);
        father.setNextHandler(hus);
        hus.setNextHandler(son);
        ws.forEach(w -> {

            father.handlerMessage(w);
        });

    }
}
