package 设计模式.状态模式;

/**
 * @author faker
 * @date 2018/8/2
 */
public interface TvState {
    public void next();
    public void prev();
    public void up();
    public void down();
}
