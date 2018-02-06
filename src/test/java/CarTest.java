import org.hamcrest.core.Is;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public final class CarTest {
    @Test
    public void ShouldGetTheInitialGear() {
        Car car = new Car("CX5", "AWD", 10, 5);
        assertThat(car.getCurrentGear(), Is.is(0));
    }

    @Test
    public void ShouldChangeGearWhenToldSo() {
        Car car = new Car("CX5", "AWD", 10, 5);
        car.changeGear(3);
        assertThat(car.getCurrentGear(), Is.is(3));
    }

    @Test
    public void ShouldChangeSpeedWhenChangeVelocity() {
        Car car = new Car("CX5", "AWD", 10, 5);
        car.changeVelocity(20, 2);
        assertThat(car.getVelocity(), Is.is(30));
    }
}
