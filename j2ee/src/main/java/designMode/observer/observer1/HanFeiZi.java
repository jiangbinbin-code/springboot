package designMode.observer.observer1;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Data
@Getter
@Setter
public class HanFeiZi implements IHanFeiZi {

    private boolean isHavingBreakFast=false;
    private boolean isHavingFun=false;
    @Override
    public void haveBreakFast() {
        System.out.println("吃饭");
        this.isHavingBreakFast=true;
    }

    @Override
    public void haveFun() {
        System.out.println("娱乐");
        this.isHavingFun=true;
    }
}
