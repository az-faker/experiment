package mockito;

import org.junit.Test;
import org.mockito.Mockito;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;

/**
 * Test实体
 *
 * @author Faker
 * @version 1.0
 * @since 2019-04-08 16:02:37
 */
public class MockitoTest {

    // TODO: 2019-04-08 现在不能跑通，得依赖容器

    @Test
    public void test1() {
        NonFinalClassWithFinalMethod nonFinalClassWithFinalMethod = Mockito.mock(NonFinalClassWithFinalMethod.class);
        when(nonFinalClassWithFinalMethod.finalMethod()).thenReturn("hello");

        assertThat(nonFinalClassWithFinalMethod.finalMethod(), equalTo("hello"));
    }
}
