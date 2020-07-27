package designMode.observer.observer1;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnSingleCandidate;

@AllArgsConstructor
@NoArgsConstructor
public class Spy implements  Runnable {

    private HanFeiZi hfz;
    private LiSi ls;
    private String type;
    @Override
    public void run() {
        while(true){
            if(this.type.endsWith("")){
                if(this.hfz.isHavingBreakFast()){
                    this.ls.update("");
                    this.hfz.setHavingBreakFast(false);
                }
            }else{
                if(this.hfz.isHavingFun()){
                    this.ls.update("");
                    this.hfz.setHavingFun(false);
                }

            }
        }

    }
}
