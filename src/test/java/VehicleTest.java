import org.hamcrest.core.Is;
import org.junit.Test;

import static org.junit.Assert.*;

public final class VehicleTest {
    @Test
    public void GetNameOfVehicle() {
        Vehicle vehicle = new Vehicle("Outlander", "4WD", 20, 10);
        assertThat(vehicle.getName(), Is.is("Outlander"));
    }

    @Test
    public void GetSizeOfVehicle() {
        Vehicle vehicle = new Vehicle("CX5", "AWD", 20, 10);
        assertThat(vehicle.getSize(), Is.is("AWD"));
    }

    @Test
    public void GetCurrentVelocity() {
        Vehicle vehicle = new Vehicle("CX5", "AWD", 0, 10);
        assertThat(vehicle.getVelocity(), Is.is(0));
    }

    @Test
    public void GetCurrentDirection() {
        Vehicle vehicle = new Vehicle("CX5", "AWD", 20, 10);
        assertThat(vehicle.getDirection(), Is.is(10));
    }

    @Test
    public void ShouldSteerInADirection() {
        Vehicle vehicle = new Vehicle("CX5", "AWD", 20, 10);
        vehicle.steer(10);
        assertThat(vehicle.getDirection(), Is.is(10));
    }

    @Test
    public void ShouldMoveWithVelocityAndDirection() {
        Vehicle vehicle = new Vehicle("CX5", "AWD", 20, 10);
        vehicle.move(60, 10);
        assertThat(vehicle.getVelocity(), Is.is(60));
        assertThat(vehicle.getDirection(), Is.is(10));
    }

    @Test
    public void ShouldStopTheVehicle() {
        Vehicle vehicle = new Vehicle("CX5", "AWD", 20, 10);
        vehicle.stop();
        assertThat(vehicle.getVelocity(), Is.is(0));
    }
}