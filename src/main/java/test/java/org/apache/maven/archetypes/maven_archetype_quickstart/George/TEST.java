package test.java.org.apache.maven.archetypes.maven_archetype_quickstart.George;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
	AddRoomControllerTest.class,
	AdminSelectActionControllerTest.class,
	ChiefEventCoordinatorControllerTest.class,
	CompletedStateTest.class,
	ConfirmedStateTest.class,
	EventCoordinatorTest.class,
	RoomDisabledStateTest.class,
})
public class TEST {

}

