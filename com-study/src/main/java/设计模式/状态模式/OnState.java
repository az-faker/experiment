package 设计模式.状态模式;

/**
 * @author faker
 * @date 2018/8/2
 */
public class OnState implements TvState {
    @Override
    public void next() {
        System.out.println("下个频道");
    }

    @Override
    public void prev() {
        System.out.println("上个频道");
    }

    @Override
    public void up() {
        System.out.println("调高声音");
    }

    @Override
    public void down() {
        System.out.println("调低声音");
    }
}
