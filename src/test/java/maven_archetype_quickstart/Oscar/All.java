package maven_archetype_quickstart.Oscar;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

import maven_archetype_quickstart.Bhavya.*;
import maven_archetype_quickstart.George.*;
import maven_archetype_quickstart.Peter.*;
import maven_archetype_quickstart.Richard.*;

@Suite
@SelectClasses({
    Oscar.class,
    AdminRoomProxyTest.class,
    BookingRepositoryTest.class,
    BookingTest.class,
    GuestRoomProxyTest.class,
    PaymentRepositoryTest.class,
    PaymentTest.class,
    RoomEnabledStateTest.class,
    RoomListFacadeTest.class,
    RoomProxyFactoryTest.class,
    RoomReadyForEnableStateTest.class,
    RoomRepositoryTest.class,
    RoomServiceTest.class,
    RoomTest.class,
    
    AddRoomControllerTest.class,
    AdminSelectActionControllerTest.class,
    ChiefEventCoordinatorControllerTest.class,
    CompletedStateTest.class,
    ConfirmedStateTest.class,
    EventCoordinatorTest.class,
    RoomDisabledStateTest.class,
    AccountTypeTest.class,
    AuthenticationExceptionTest.class,
    AuthenticationServiceTest.class,
    DatabaseTest.class,
    SessionDataTest.class,
    UserFactoryAndUserTest.class,
    UserRepositoryTest.class,
    UserServiceTest.class,
    AdminServiceRequestControllerTest.class,
    EditMaintenanceRequestServiceTest.class,
    EssentialServiceRequestTest.class,
    EvaluateRoomMaintenanceRelationshipServiceTest.class,
    GetMaintenanceRequestServiceTest.class,
    MaintenanceServiceRequestControllerTest.class,
    NonEssentialServiceRequestTest.class,
    SensorEssentialServiceRequestTest.class,
    ServiceRequestRepositoryTest.class,
    ServiceRequestTest.class,
    SubmitServiceRequestServiceTest.class,
})

public class All {
}

