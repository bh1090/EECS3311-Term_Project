package test.java.org.apache.maven.archetypes.maven_archetype_quickstart.Oscar;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
    AddSensorControllerTest.class,
    CancelledStateTest.class,
    CheckinControllerTest.class,
    CheckInStateTest.class,
    CheckoutControllerTest.class,
    GuestSelectActionControllerTest.class,
    OccupancySensorDataTest.class,
    OccupancySensorTest.class,
    PaymentViewControllerTest.class,
    RescheduleBookingControllerTest.class,
    RoomBookingRequirementsControllerTest.class,
    ScanIDSensorDataTest.class,
    ScanIDSensorTest.class,
    SensorRepositoryTest.class,
    SensorServiceTest.class,
    SensorsListControllerTest.class,
})

public class Oscar {
}

