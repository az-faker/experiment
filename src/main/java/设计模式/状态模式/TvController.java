package 设计模式.状态模式;

/**
 * @author faker
 * @date 2018/8/2
 */
public class TvController {
    TvState state;

    public void setState(TvState state) {
        this.state = state;
    }

    public void powerOn() {
        setState(new OnState());
        System.out.println("电视开机啦");
    }

    public void powerOff() {
        setState(new OffState());
        System.out.println("电视关机啦");
    }

    public void next() {
        state.next();
    }

    public void prev() {
        state.prev();
    }

    public void up() {
        state.up();
    }

    public void down() {
        state.down();
    }
}
