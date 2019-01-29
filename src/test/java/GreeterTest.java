import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GreeterTest {

    @Test
    public void hello() {
        assertThat(new Greeter().hello("Eddy")).isEqualTo("Hello Eddy");
    }
}