import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test501");
        Model.ServiceRequest.SensorEssentialServiceRequest sensorEssentialServiceRequest5 = new Model.ServiceRequest.SensorEssentialServiceRequest(1, "COMPLETED", "Service.AuthenticationException: ", (int) 'a', (int) (short) -1);
        sensorEssentialServiceRequest5.assignRoomID(100);
        sensorEssentialServiceRequest5.assignRoomID((int) (short) 10);
        sensorEssentialServiceRequest5.assignRoomID((int) (byte) -1);
        boolean boolean12 = sensorEssentialServiceRequest5.isEssential;
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        Service.RoomService roomService0 = new Service.RoomService();
        roomService0.update(true, (int) (short) 10);
        Model.Room.Booking booking5 = roomService0.getBookingDetails("src/main/data/users.csv");
        boolean boolean7 = roomService0.cancelBooking("hi!");
        roomService0.disableRoom("hi!");
        Service.RoomService roomService10 = roomService0.getInstance();
        java.lang.String str14 = roomService0.createRoom("49", 100.0d, "32");
        org.junit.Assert.assertNull(booking5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(roomService10);
// flaky "1) test502(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "71" + "'", str14, "71");
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        Database.Database database0 = Database.Database.getInstance();
        java.lang.String str1 = database0.getRoomCsvPath();
        java.lang.String str2 = database0.getSensorsCsvPath();
        java.lang.String str3 = database0.getPaymentCsvPath();
        java.lang.String str4 = database0.getMaintenanceRequestsCsvPath();
        java.lang.String str5 = database0.getMaintenanceRequestsCsvPath();
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EECS3311 Course Project Database - Rooms.csv" + "'", str1, "EECS3311 Course Project Database - Rooms.csv");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "src/main/data/sensors.csv" + "'", str2, "src/main/data/sensors.csv");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EECS3311 Course Project Database - payments.csv" + "'", str3, "EECS3311 Course Project Database - payments.csv");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "src/main/data/MaintenanceRequests.csv" + "'", str4, "src/main/data/MaintenanceRequests.csv");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "src/main/data/MaintenanceRequests.csv" + "'", str5, "src/main/data/MaintenanceRequests.csv");
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        Model.User.EventCoordinator eventCoordinator0 = Model.User.EventCoordinator.getInstance();
        java.lang.String str1 = eventCoordinator0.getChiefEventCoordinatorName();
        java.lang.String str2 = eventCoordinator0.getChiefEventCoordinatorEmail();
        java.lang.String str3 = eventCoordinator0.getChiefEventCoordinatorPassword();
        java.lang.String str4 = eventCoordinator0.getChiefEventCoordinatorName();
        org.junit.Assert.assertNotNull(eventCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "John Smith" + "'", str1, "John Smith");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jsmith@yorku.ca" + "'", str2, "jsmith@yorku.ca");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!Password123" + "'", str3, "!Password123");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "John Smith" + "'", str4, "John Smith");
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        Model.State.RoomEnabledState roomEnabledState0 = new Model.State.RoomEnabledState();
        java.lang.String str1 = roomEnabledState0.getStateName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ENABLED" + "'", str1, "ENABLED");
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        Repository.SensorRepository sensorRepository0 = new Repository.SensorRepository();
        java.util.List<Model.Sensor.OccupancySensorData> occupancySensorDataList1 = sensorRepository0.getOccupancySensorLogsList();
        Model.Sensor.ScanIDSensorData scanIDSensorData2 = null;
        boolean boolean3 = sensorRepository0.writeScanIDSensorLog(scanIDSensorData2);
        Model.Sensor.OccupancySensor occupancySensor9 = new Model.Sensor.OccupancySensor("", "1", "1", "EECS3311 Course Project Database - Rooms.csv", true);
        boolean boolean10 = false; // flaky "2) test506(RegressionTest1)": sensorRepository0.writeSensor((Model.Sensor.Sensor) occupancySensor9);
        boolean boolean11 = occupancySensor9.getOccupied();
        Model.ServiceRequest.SensorEssentialServiceRequest sensorEssentialServiceRequest17 = new Model.ServiceRequest.SensorEssentialServiceRequest(1, "COMPLETED", "Service.AuthenticationException: ", (int) 'a', (int) (short) -1);
        sensorEssentialServiceRequest17.assignRoomID(100);
        java.lang.String str20 = sensorEssentialServiceRequest17.getStatus();
        sensorEssentialServiceRequest17.isEssential = true;
        sensorEssentialServiceRequest17.assignRoomID(10);
        int int25 = sensorEssentialServiceRequest17.getRoomID();
        boolean boolean26 = occupancySensor9.equals((java.lang.Object) sensorEssentialServiceRequest17);
// flaky "1) test506(RegressionTest1)":         org.junit.Assert.assertNotNull(occupancySensorDataList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "1) test506(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Service.AuthenticationException: " + "'", str20, "Service.AuthenticationException: ");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        Service.RoomService roomService0 = new Service.RoomService();
        roomService0.maintenanceCompleted("");
        boolean boolean4 = roomService0.performCheckOut("");
        roomService0.maintenanceCompleted("1");
        Model.Room.Booking booking8 = roomService0.getBookingDetails("EECS3311 Course Project Database - Rooms.csv");
        roomService0.update(true, (int) (byte) 1);
        Service.RoomService roomService12 = roomService0.getInstance();
        boolean boolean14 = roomService0.performCheckOut("64");
// flaky "3) test507(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(booking8);
        org.junit.Assert.assertNotNull(roomService12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        java.time.LocalDateTime localDateTime2 = null;
        Model.Sensor.OccupancySensorData occupancySensorData3 = new Model.Sensor.OccupancySensorData("", "", localDateTime2);
        occupancySensorData3.sensorID = "";
        java.time.LocalDateTime localDateTime6 = null;
        occupancySensorData3.dateTime = localDateTime6;
        java.lang.String str8 = occupancySensorData3.getSensorID();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        Model.State.CompletedState completedState0 = new Model.State.CompletedState();
        java.time.LocalDate localDate4 = null;
        java.time.LocalDate localDate5 = null;
        java.time.LocalTime localTime6 = null;
        java.time.LocalTime localTime7 = null;
        Model.Room.Booking booking9 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate4, localDate5, localTime6, localTime7, "");
        completedState0.checkOut(booking9);
        java.lang.String str11 = completedState0.getStatus();
        Model.State.CompletedState completedState12 = new Model.State.CompletedState();
        java.time.LocalDate localDate16 = null;
        java.time.LocalDate localDate17 = null;
        java.time.LocalTime localTime18 = null;
        java.time.LocalTime localTime19 = null;
        Model.Room.Booking booking21 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate16, localDate17, localTime18, localTime19, "");
        completedState12.checkOut(booking21);
        java.time.LocalDate localDate26 = null;
        java.time.LocalDate localDate27 = null;
        java.time.LocalTime localTime28 = null;
        java.time.LocalTime localTime29 = null;
        Model.Room.Booking booking31 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate26, localDate27, localTime28, localTime29, "");
        completedState12.checkOut(booking31);
        completedState0.checkIn(booking31);
        java.lang.String str34 = completedState0.getStatus();
        Model.State.CheckInState checkInState35 = new Model.State.CheckInState();
        java.lang.String str36 = checkInState35.getStatus();
        java.lang.String str37 = checkInState35.getStatus();
        Model.State.CompletedState completedState38 = new Model.State.CompletedState();
        java.time.LocalDate localDate42 = null;
        java.time.LocalDate localDate43 = null;
        java.time.LocalTime localTime44 = null;
        java.time.LocalTime localTime45 = null;
        Model.Room.Booking booking47 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate42, localDate43, localTime44, localTime45, "");
        completedState38.checkOut(booking47);
        java.time.LocalDate localDate49 = booking47.getEndDate();
        checkInState35.cancel(booking47);
        Model.State.CompletedState completedState51 = new Model.State.CompletedState();
        java.time.LocalDate localDate55 = null;
        java.time.LocalDate localDate56 = null;
        java.time.LocalTime localTime57 = null;
        java.time.LocalTime localTime58 = null;
        Model.Room.Booking booking60 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate55, localDate56, localTime57, localTime58, "");
        completedState51.checkOut(booking60);
        java.time.LocalDate localDate65 = null;
        java.time.LocalDate localDate66 = null;
        java.time.LocalTime localTime67 = null;
        java.time.LocalTime localTime68 = null;
        Model.Room.Booking booking70 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate65, localDate66, localTime67, localTime68, "");
        completedState51.checkOut(booking70);
        checkInState35.checkOut(booking70);
        completedState0.cancel(booking70);
        booking70.performCancel();
        java.lang.String str75 = booking70.getRoomId();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "COMPLETED" + "'", str11, "COMPLETED");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "COMPLETED" + "'", str34, "COMPLETED");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "CHECKED_IN" + "'", str36, "CHECKED_IN");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "CHECKED_IN" + "'", str37, "CHECKED_IN");
        org.junit.Assert.assertNull(localDate49);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "src/main/data/users.csv" + "'", str75, "src/main/data/users.csv");
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        Model.State.RoomDisabledState roomDisabledState0 = new Model.State.RoomDisabledState();
        Model.State.RoomDisabledState roomDisabledState1 = new Model.State.RoomDisabledState();
        boolean boolean2 = roomDisabledState1.isBookable();
        boolean boolean3 = roomDisabledState1.isBookable();
        boolean boolean4 = roomDisabledState1.isBookable();
        Model.Room.Room room9 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        boolean boolean10 = room9.isAvailable();
        roomDisabledState1.maintain(room9);
        roomDisabledState0.maintain(room9);
        java.lang.String str13 = roomDisabledState0.getStateName();
        Model.State.RoomEnabledState roomEnabledState14 = new Model.State.RoomEnabledState();
        Model.Room.Room room19 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        boolean boolean20 = room19.isAvailable();
        Model.Room.AdminRoomProxy adminRoomProxy21 = new Model.Room.AdminRoomProxy(room19);
        roomEnabledState14.disable(room19);
        boolean boolean23 = room19.isAvailable();
        roomDisabledState0.maintain(room19);
        Repository.RoomRepository roomRepository25 = Repository.RoomRepository.getInstance();
        Model.Room.Room room27 = roomRepository25.findById("2");
// flaky "4) test510(RegressionTest1)":         roomDisabledState0.maintain(room27);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "DISABLED" + "'", str13, "DISABLED");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(roomRepository25);
// flaky "2) test510(RegressionTest1)":         org.junit.Assert.assertNotNull(room27);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        Repository.UserRepository userRepository0 = Repository.UserRepository.getInstance();
        int int1 = userRepository0.getAll();
        Model.User.User user3 = userRepository0.findByEmail("PENDING");
        int int4 = userRepository0.getAll();
        Repository.UserRepository userRepository5 = Repository.UserRepository.getInstance();
        int int6 = userRepository5.getAll();
        Model.User.User user8 = userRepository5.findByEmail("PENDING");
        int int9 = userRepository5.getAll();
        Model.User.StudentUser studentUser16 = new Model.User.StudentUser("hi!", "", "", "src/main/data/users.csv", false, "src/main/data/users.csv");
        java.lang.String str17 = studentUser16.getEmail();
        userRepository5.save((Model.User.User) studentUser16);
        userRepository0.save((Model.User.User) studentUser16);
        Model.User.User user21 = userRepository0.findByEmail("48");
        org.junit.Assert.assertNotNull(userRepository0);
// flaky "5) test511(RegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 38 + "'", int1 == 38);
        org.junit.Assert.assertNull(user3);
// flaky "3) test511(RegressionTest1)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 38 + "'", int4 == 38);
        org.junit.Assert.assertNotNull(userRepository5);
// flaky "2) test511(RegressionTest1)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 38 + "'", int6 == 38);
        org.junit.Assert.assertNull(user8);
// flaky "1) test511(RegressionTest1)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 38 + "'", int9 == 38);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(user21);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        Model.State.CompletedState completedState0 = new Model.State.CompletedState();
        java.time.LocalDate localDate4 = null;
        java.time.LocalDate localDate5 = null;
        java.time.LocalTime localTime6 = null;
        java.time.LocalTime localTime7 = null;
        Model.Room.Booking booking9 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate4, localDate5, localTime6, localTime7, "");
        completedState0.checkOut(booking9);
        java.time.LocalDate localDate11 = booking9.getEndDate();
        java.lang.String str12 = booking9.getRoomId();
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "src/main/data/users.csv" + "'", str12, "src/main/data/users.csv");
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        Service.EvaluateRoomMaintenanceRelationshipService evaluateRoomMaintenanceRelationshipService0 = Service.EvaluateRoomMaintenanceRelationshipService.getInstance();
        evaluateRoomMaintenanceRelationshipService0.notifyObservers();
        Service.RoomService roomService2 = new Service.RoomService();
        roomService2.update(true, (int) (short) 10);
        Model.Room.Booking booking7 = roomService2.getBookingDetails("src/main/data/users.csv");
        boolean boolean9 = roomService2.cancelBooking("hi!");
        Controller.AddRoomController addRoomController10 = new Controller.AddRoomController(roomService2);
        evaluateRoomMaintenanceRelationshipService0.removeObserver((Model.Room.Observer) roomService2);
        Service.RoomService roomService12 = new Service.RoomService();
        roomService12.maintenanceCompleted("");
        evaluateRoomMaintenanceRelationshipService0.removeObserver((Model.Room.Observer) roomService12);
        evaluateRoomMaintenanceRelationshipService0.evaluateRoomMaintenanceRelationship((int) (short) 1);
        Service.RoomService roomService18 = new Service.RoomService();
        roomService18.update(true, (int) (short) 10);
        boolean boolean23 = roomService18.performCheckOut("hi!");
        java.lang.String str27 = roomService18.createRoom("", (double) '4', "src/main/data/users.csv");
        Service.RoomService roomService28 = roomService18.getInstance();
        Controller.AddRoomController addRoomController29 = new Controller.AddRoomController(roomService28);
        evaluateRoomMaintenanceRelationshipService0.registerObserver((Model.Room.Observer) roomService28);
        Service.RoomService roomService31 = new Service.RoomService();
        java.lang.String str35 = roomService31.createRoom("Service.AuthenticationException: ", (double) ' ', "1");
        evaluateRoomMaintenanceRelationshipService0.removeObserver((Model.Room.Observer) roomService31);
        evaluateRoomMaintenanceRelationshipService0.evaluateRoomMaintenanceRelationship(4);
        Service.EvaluateRoomMaintenanceRelationshipService evaluateRoomMaintenanceRelationshipService39 = Service.EvaluateRoomMaintenanceRelationshipService.getInstance();
        evaluateRoomMaintenanceRelationshipService39.notifyObservers();
        evaluateRoomMaintenanceRelationshipService39.evaluateRoomMaintenanceRelationship((-1));
        Service.EvaluateRoomMaintenanceRelationshipService evaluateRoomMaintenanceRelationshipService43 = Service.EvaluateRoomMaintenanceRelationshipService.getInstance();
        evaluateRoomMaintenanceRelationshipService43.notifyObservers();
        Service.RoomService roomService45 = new Service.RoomService();
        roomService45.update(true, (int) (short) 10);
        Model.Room.Booking booking50 = roomService45.getBookingDetails("src/main/data/users.csv");
        boolean boolean52 = roomService45.cancelBooking("hi!");
        Controller.AddRoomController addRoomController53 = new Controller.AddRoomController(roomService45);
        evaluateRoomMaintenanceRelationshipService43.removeObserver((Model.Room.Observer) roomService45);
        Service.RoomService roomService55 = new Service.RoomService();
        roomService55.maintenanceCompleted("");
        evaluateRoomMaintenanceRelationshipService43.removeObserver((Model.Room.Observer) roomService55);
        evaluateRoomMaintenanceRelationshipService39.registerObserver((Model.Room.Observer) roomService55);
        Service.RoomService roomService60 = new Service.RoomService();
        roomService60.update(true, (int) (short) 10);
        java.lang.String str67 = roomService60.createRoom("EECS3311 Course Project Database - Rooms.csv", (double) 0.0f, "");
        java.lang.String str71 = roomService60.createRoom("src/main/data/occupancy_sensor_logs.csv", (double) 0.0f, "21");
        evaluateRoomMaintenanceRelationshipService39.registerObserver((Model.Room.Observer) roomService60);
        evaluateRoomMaintenanceRelationshipService0.removeObserver((Model.Room.Observer) roomService60);
        org.junit.Assert.assertNotNull(evaluateRoomMaintenanceRelationshipService0);
        org.junit.Assert.assertNull(booking7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
// flaky "6) test513(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "73" + "'", str27, "73");
        org.junit.Assert.assertNotNull(roomService28);
// flaky "4) test513(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "74" + "'", str35, "74");
        org.junit.Assert.assertNotNull(evaluateRoomMaintenanceRelationshipService39);
        org.junit.Assert.assertNotNull(evaluateRoomMaintenanceRelationshipService43);
        org.junit.Assert.assertNull(booking50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
// flaky "3) test513(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str67 + "' != '" + "75" + "'", str67, "75");
// flaky "2) test513(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str71 + "' != '" + "76" + "'", str71, "76");
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        Database.Database database0 = Database.Database.getInstance();
        java.lang.String str1 = database0.getSensorsCsvPath();
        java.lang.String str2 = database0.getOccupancySensorLogsPath();
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "src/main/data/sensors.csv" + "'", str1, "src/main/data/sensors.csv");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "src/main/data/occupancy_sensor_logs.csv" + "'", str2, "src/main/data/occupancy_sensor_logs.csv");
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        Model.State.CheckInState checkInState0 = new Model.State.CheckInState();
        java.lang.String str1 = checkInState0.getStatus();
        java.lang.String str2 = checkInState0.getStatus();
        Model.State.CompletedState completedState3 = new Model.State.CompletedState();
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        java.time.LocalTime localTime9 = null;
        java.time.LocalTime localTime10 = null;
        Model.Room.Booking booking12 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate7, localDate8, localTime9, localTime10, "");
        completedState3.checkOut(booking12);
        java.time.LocalDate localDate14 = booking12.getEndDate();
        checkInState0.cancel(booking12);
        Model.State.CompletedState completedState16 = new Model.State.CompletedState();
        java.time.LocalDate localDate20 = null;
        java.time.LocalDate localDate21 = null;
        java.time.LocalTime localTime22 = null;
        java.time.LocalTime localTime23 = null;
        Model.Room.Booking booking25 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate20, localDate21, localTime22, localTime23, "");
        completedState16.checkOut(booking25);
        java.time.LocalDate localDate30 = null;
        java.time.LocalDate localDate31 = null;
        java.time.LocalTime localTime32 = null;
        java.time.LocalTime localTime33 = null;
        Model.Room.Booking booking35 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate30, localDate31, localTime32, localTime33, "");
        completedState16.checkOut(booking35);
        checkInState0.checkOut(booking35);
        java.lang.String str38 = booking35.getUserId();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CHECKED_IN" + "'", str1, "CHECKED_IN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CHECKED_IN" + "'", str2, "CHECKED_IN");
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        Repository.ServiceRequestRepository serviceRequestRepository0 = Repository.ServiceRequestRepository.getInstance();
        Repository.ServiceRequestRepository serviceRequestRepository1 = Repository.ServiceRequestRepository.getInstance();
        Model.ServiceRequest.SensorEssentialServiceRequest sensorEssentialServiceRequest7 = new Model.ServiceRequest.SensorEssentialServiceRequest(1, "COMPLETED", "Service.AuthenticationException: ", (int) 'a', (int) (short) -1);
        sensorEssentialServiceRequest7.assignRoomID(100);
        java.lang.String str10 = sensorEssentialServiceRequest7.getStatus();
        serviceRequestRepository1.updateExistingServiceRequest((Model.ServiceRequest.ServiceRequest) sensorEssentialServiceRequest7);
        Model.ServiceRequest.SensorEssentialServiceRequest sensorEssentialServiceRequest17 = new Model.ServiceRequest.SensorEssentialServiceRequest((int) (short) 100, "CHECKED_IN", "EECS3311 Course Project Database - Bookings.csv", 0, (int) (byte) 0);
        serviceRequestRepository1.updateExistingServiceRequest((Model.ServiceRequest.ServiceRequest) sensorEssentialServiceRequest17);
        Model.ServiceRequest.ServiceRequest serviceRequest19 = serviceRequestRepository0.addServiceRequest((Model.ServiceRequest.ServiceRequest) sensorEssentialServiceRequest17);
        sensorEssentialServiceRequest17.assignRoomID((int) (byte) 100);
        org.junit.Assert.assertNotNull(serviceRequestRepository0);
        org.junit.Assert.assertNotNull(serviceRequestRepository1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Service.AuthenticationException: " + "'", str10, "Service.AuthenticationException: ");
        org.junit.Assert.assertNotNull(serviceRequest19);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        Model.State.ConfirmedState confirmedState0 = new Model.State.ConfirmedState();
        java.time.LocalDate localDate4 = null;
        java.time.LocalDate localDate5 = null;
        java.time.LocalTime localTime6 = null;
        java.time.LocalTime localTime7 = null;
        Model.Room.Booking booking9 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate4, localDate5, localTime6, localTime7, "");
        java.lang.String str10 = booking9.getBookingId();
        Model.State.BookingState bookingState11 = null;
        booking9.setState(bookingState11);
        Model.State.CompletedState completedState13 = new Model.State.CompletedState();
        booking9.setState((Model.State.BookingState) completedState13);
        java.time.LocalTime localTime15 = booking9.getEndTime();
        booking9.performCheckIn();
        confirmedState0.cancel(booking9);
        java.lang.String str18 = confirmedState0.getStatus();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(localTime15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "CONFIRMED" + "'", str18, "CONFIRMED");
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        Repository.ServiceRequestRepository serviceRequestRepository0 = Repository.ServiceRequestRepository.getInstance();
        Model.ServiceRequest.SensorEssentialServiceRequest sensorEssentialServiceRequest6 = new Model.ServiceRequest.SensorEssentialServiceRequest(1, "COMPLETED", "Service.AuthenticationException: ", (int) 'a', (int) (short) -1);
        sensorEssentialServiceRequest6.assignRoomID(100);
        java.lang.String str9 = sensorEssentialServiceRequest6.getStatus();
        serviceRequestRepository0.updateExistingServiceRequest((Model.ServiceRequest.ServiceRequest) sensorEssentialServiceRequest6);
        Model.ServiceRequest.SensorEssentialServiceRequest sensorEssentialServiceRequest16 = new Model.ServiceRequest.SensorEssentialServiceRequest((int) (short) 100, "CHECKED_IN", "EECS3311 Course Project Database - Bookings.csv", 0, (int) (byte) 0);
        serviceRequestRepository0.updateExistingServiceRequest((Model.ServiceRequest.ServiceRequest) sensorEssentialServiceRequest16);
        java.util.Map<java.lang.Integer, java.util.List<Model.ServiceRequest.ServiceRequest>> intMap20 = serviceRequestRepository0.parseCsvFileToMap("EECS3311 Course Project Database - Bookings.csv", true);
        Model.ServiceRequest.SensorEssentialServiceRequest sensorEssentialServiceRequest26 = new Model.ServiceRequest.SensorEssentialServiceRequest((int) (short) -1, "4", "hi!", (-1), (int) ' ');
        sensorEssentialServiceRequest26.setDescription("src/main/data/scanid_sensor_logs.csv");
        int int29 = sensorEssentialServiceRequest26.getServiceRequestID();
        serviceRequestRepository0.updateExistingServiceRequest((Model.ServiceRequest.ServiceRequest) sensorEssentialServiceRequest26);
        java.lang.Integer int32 = serviceRequestRepository0.generateNextId((int) '#');
        org.junit.Assert.assertNotNull(serviceRequestRepository0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Service.AuthenticationException: " + "'", str9, "Service.AuthenticationException: ");
        org.junit.Assert.assertNotNull(intMap20);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        java.time.LocalTime localTime5 = null;
        java.time.LocalTime localTime6 = null;
        Model.Room.Booking booking8 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate3, localDate4, localTime5, localTime6, "");
        java.lang.String str9 = booking8.getBookingId();
        Model.State.BookingState bookingState10 = null;
        booking8.setState(bookingState10);
        Model.State.CompletedState completedState12 = new Model.State.CompletedState();
        booking8.setState((Model.State.BookingState) completedState12);
        java.lang.String str14 = completedState12.getStatus();
        java.lang.String str15 = completedState12.getStatus();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "COMPLETED" + "'", str14, "COMPLETED");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "COMPLETED" + "'", str15, "COMPLETED");
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        Model.User.AccountType accountType0 = Model.User.AccountType.PARTNER;
        Model.User.User user4 = Model.User.UserFactory.createUser(accountType0, "12", "2", "32");
        Application.SessionData.setCurrentUser(user4);
        org.junit.Assert.assertTrue("'" + accountType0 + "' != '" + Model.User.AccountType.PARTNER + "'", accountType0.equals(Model.User.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(user4);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        Model.User.FacultyUser facultyUser3 = new Model.User.FacultyUser("COMPLETED", "3", "EECS3311 Course Project Database - Rooms.csv");
        java.lang.String str4 = facultyUser3.getName();
        java.lang.String str5 = facultyUser3.getRole();
        Application.SessionData.setCurrentUser((Model.User.User) facultyUser3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "COMPLETED" + "'", str4, "COMPLETED");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FACULTY" + "'", str5, "FACULTY");
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        Model.ServiceRequest.SensorEssentialServiceRequest sensorEssentialServiceRequest5 = new Model.ServiceRequest.SensorEssentialServiceRequest(1, "COMPLETED", "Service.AuthenticationException: ", (int) 'a', (int) (short) -1);
        sensorEssentialServiceRequest5.assignRoomID(100);
        java.lang.String str8 = sensorEssentialServiceRequest5.getStatus();
        sensorEssentialServiceRequest5.isEssential = true;
        int int11 = sensorEssentialServiceRequest5.getServiceRequestID();
        boolean boolean12 = sensorEssentialServiceRequest5.isEssential();
        boolean boolean13 = sensorEssentialServiceRequest5.isEssential();
        boolean boolean14 = sensorEssentialServiceRequest5.isEssential;
        sensorEssentialServiceRequest5.assignRoomID((int) (short) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Service.AuthenticationException: " + "'", str8, "Service.AuthenticationException: ");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        Repository.ServiceRequestRepository serviceRequestRepository0 = Repository.ServiceRequestRepository.getInstance();
        Model.ServiceRequest.SensorEssentialServiceRequest sensorEssentialServiceRequest6 = new Model.ServiceRequest.SensorEssentialServiceRequest(1, "COMPLETED", "Service.AuthenticationException: ", (int) 'a', (int) (short) -1);
        sensorEssentialServiceRequest6.assignRoomID(100);
        java.lang.String str9 = sensorEssentialServiceRequest6.getStatus();
        serviceRequestRepository0.updateExistingServiceRequest((Model.ServiceRequest.ServiceRequest) sensorEssentialServiceRequest6);
        Model.ServiceRequest.SensorEssentialServiceRequest sensorEssentialServiceRequest16 = new Model.ServiceRequest.SensorEssentialServiceRequest(1, "COMPLETED", "Service.AuthenticationException: ", (int) 'a', (int) (short) -1);
        sensorEssentialServiceRequest16.assignRoomID(100);
        java.lang.String str19 = sensorEssentialServiceRequest16.getStatus();
        sensorEssentialServiceRequest16.assignRoomID((int) (byte) 1);
        java.lang.String str22 = sensorEssentialServiceRequest16.getDescription();
        serviceRequestRepository0.updateExistingServiceRequest((Model.ServiceRequest.ServiceRequest) sensorEssentialServiceRequest16);
        boolean boolean24 = sensorEssentialServiceRequest16.isEssential();
        org.junit.Assert.assertNotNull(serviceRequestRepository0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Service.AuthenticationException: " + "'", str9, "Service.AuthenticationException: ");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Service.AuthenticationException: " + "'", str19, "Service.AuthenticationException: ");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "COMPLETED" + "'", str22, "COMPLETED");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        Service.AuthenticationService authenticationService0 = new Service.AuthenticationService();
        boolean boolean2 = authenticationService0.isYorkEmail("Service.AuthenticationException: ");
        boolean boolean4 = authenticationService0.properEmail("jsmith@yorku.ca");
        authenticationService0.logout();
        Model.User.AccountType accountType9 = Model.User.AccountType.STUDENT;
        // The following exception was thrown during execution in test generation
        try {
            Model.User.User user10 = authenticationService0.register("!Password123", "71", "39", accountType9);
            org.junit.Assert.fail("Expected exception of type Service.AuthenticationException; message: Please enter a valid email address.");
        } catch (Service.AuthenticationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + accountType9 + "' != '" + Model.User.AccountType.STUDENT + "'", accountType9.equals(Model.User.AccountType.STUDENT));
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        Model.ServiceRequest.EssentialServiceRequest essentialServiceRequest4 = new Model.ServiceRequest.EssentialServiceRequest((int) (byte) 100, "38", "32", (int) (short) 10);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        Service.UserService userService0 = new Service.UserService();
        Controller.ChiefEventCoordinatorController chiefEventCoordinatorController1 = new Controller.ChiefEventCoordinatorController(userService0);
        chiefEventCoordinatorController1.createAdmin("8", "src/main/data/MaintenanceRequests.csv", "17");
        chiefEventCoordinatorController1.createAdmin("src/main/data/scanid_sensor_logs.csv", "", "src/main/data/users.csv");
        chiefEventCoordinatorController1.createAdmin("DISABLED", "44", "src/main/data/MaintenanceRequests.csv");
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        Repository.RoomRepository roomRepository0 = new Repository.RoomRepository();
        java.lang.String str1 = roomRepository0.generateNextId();
        java.lang.String str2 = roomRepository0.generateNextId();
        java.lang.String str3 = roomRepository0.generateNextId();
        Model.Room.Room room5 = roomRepository0.findById("src/main/data/users.csv");
        Model.State.RoomEnabledState roomEnabledState6 = new Model.State.RoomEnabledState();
        boolean boolean7 = roomEnabledState6.isBookable();
        Model.State.RoomReadyForEnableState roomReadyForEnableState8 = new Model.State.RoomReadyForEnableState();
        boolean boolean9 = roomReadyForEnableState8.isBookable();
        Model.Room.Room room14 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        roomReadyForEnableState8.disable(room14);
        roomEnabledState6.maintain(room14);
        roomRepository0.save(room14);
        java.lang.String str18 = room14.getLocation();
// flaky "7) test527(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "77" + "'", str1, "77");
// flaky "5) test527(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "77" + "'", str2, "77");
// flaky "4) test527(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "77" + "'", str3, "77");
        org.junit.Assert.assertNull(room5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        java.time.LocalDateTime localDateTime2 = null;
        Model.Sensor.OccupancySensorData occupancySensorData3 = new Model.Sensor.OccupancySensorData("", "hi!", localDateTime2);
        java.time.LocalDateTime localDateTime4 = occupancySensorData3.getLocalDateTime();
        java.lang.String str5 = occupancySensorData3.getLogID();
        occupancySensorData3.sensorID = "21";
        java.lang.String str8 = occupancySensorData3.getLogID();
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        Model.User.StaffUser staffUser6 = new Model.User.StaffUser("14", "76", "57197862-2463-4972-b3b2-977245133f34", "EECS3311 Course Project Database - Rooms.csv", true, "1bec99b6-9fd5-4eb6-be48-3e7f52439881");
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        Model.State.RoomDisabledState roomDisabledState0 = new Model.State.RoomDisabledState();
        boolean boolean1 = roomDisabledState0.isBookable();
        boolean boolean2 = roomDisabledState0.isBookable();
        boolean boolean3 = roomDisabledState0.isBookable();
        Model.Room.Room room8 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        boolean boolean9 = room8.isAvailable();
        roomDisabledState0.maintain(room8);
        Model.Room.GuestRoomProxy guestRoomProxy11 = new Model.Room.GuestRoomProxy(room8);
        java.lang.String str12 = guestRoomProxy11.getRoomId();
        guestRoomProxy11.showRoomDetails();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "COMPLETED" + "'", str12, "COMPLETED");
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        Model.User.StaffUser staffUser6 = new Model.User.StaffUser("1bec99b6-9fd5-4eb6-be48-3e7f52439881", "38", "32", "EECS3311 Course Project Database - Bookings.csv", true, "PENDING");
        java.lang.String str7 = staffUser6.getId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1bec99b6-9fd5-4eb6-be48-3e7f52439881" + "'", str7, "1bec99b6-9fd5-4eb6-be48-3e7f52439881");
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        View.GuestSelectActionView guestSelectActionView0 = null;
        Model.User.PartnerUser partnerUser7 = new Model.User.PartnerUser("COMPLETED", "", "CHECKED_IN", "src/main/data/MaintenanceRequests.csv", true, "Service.AuthenticationException: ");
        // The following exception was thrown during execution in test generation
        try {
            Controller.GuestSelectActionController guestSelectActionController8 = new Controller.GuestSelectActionController(guestSelectActionView0, (java.lang.Object) "src/main/data/MaintenanceRequests.csv");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"availableRoomsButton\" because \"view\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        Service.UserService userService0 = new Service.UserService();
        Model.User.AccountType accountType1 = Model.User.AccountType.PARTNER;
        Model.User.User user5 = userService0.createUser(accountType1, "src/main/data/scanid_sensor_logs.csv", "CHECKED_IN", "EECS3311 Course Project Database - Rooms.csv");
        Model.User.AccountType accountType6 = Model.User.AccountType.FACULTY;
        Model.User.User user10 = userService0.createUser(accountType6, "45", "4", "31");
        org.junit.Assert.assertTrue("'" + accountType1 + "' != '" + Model.User.AccountType.PARTNER + "'", accountType1.equals(Model.User.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertTrue("'" + accountType6 + "' != '" + Model.User.AccountType.FACULTY + "'", accountType6.equals(Model.User.AccountType.FACULTY));
        org.junit.Assert.assertNotNull(user10);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        Service.UserService userService0 = new Service.UserService();
        Controller.ChiefEventCoordinatorController chiefEventCoordinatorController1 = new Controller.ChiefEventCoordinatorController(userService0);
        Controller.ChiefEventCoordinatorController chiefEventCoordinatorController2 = new Controller.ChiefEventCoordinatorController(userService0);
        Controller.ChiefEventCoordinatorController chiefEventCoordinatorController3 = new Controller.ChiefEventCoordinatorController(userService0);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        Model.Sensor.Sensor sensor5 = new Model.Sensor.Sensor("CHECKED_IN", "EECS3311 Course Project Database - Bookings.csv", "7", "4", false);
        java.lang.String str6 = sensor5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "7" + "'", str6, "7");
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        Model.State.RoomEnabledState roomEnabledState0 = new Model.State.RoomEnabledState();
        Model.State.RoomDisabledState roomDisabledState1 = new Model.State.RoomDisabledState();
        boolean boolean2 = roomDisabledState1.isBookable();
        boolean boolean3 = roomDisabledState1.isBookable();
        boolean boolean4 = roomDisabledState1.isBookable();
        Model.Room.Room room9 = new Model.Room.Room("COMPLETED", "hi!", (double) 100.0f, "2");
        roomDisabledState1.maintain(room9);
        room9.requestEnable();
        roomEnabledState0.enable(room9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        Model.Sensor.Sensor sensor5 = new Model.Sensor.Sensor("26", "17", "DISABLED", "src/main/data/scanid_sensor_logs.csv", false);
        sensor5.setOccupied(true);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        Model.User.FacultyUser facultyUser6 = new Model.User.FacultyUser("EECS3311 Course Project Database - Bookings.csv", "READY_FOR_ENABLE", "jsmith@yorku.ca", "hi!", false, "hi!");
        Service.UserService userService7 = new Service.UserService();
        Model.User.AccountType accountType8 = Model.User.AccountType.PARTNER;
        Model.User.User user12 = userService7.createUser(accountType8, "", "DISABLED", "4");
        Model.User.User user16 = Model.User.UserFactory.createUser(accountType8, "3", "9", "EECS3311 Course Project Database - Bookings.csv");
        facultyUser6.setAccountType(accountType8);
        java.lang.String str18 = facultyUser6.getName();
        org.junit.Assert.assertTrue("'" + accountType8 + "' != '" + Model.User.AccountType.PARTNER + "'", accountType8.equals(Model.User.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(user12);
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "READY_FOR_ENABLE" + "'", str18, "READY_FOR_ENABLE");
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        Repository.RoomRepository roomRepository0 = new Repository.RoomRepository();
        java.lang.String str1 = roomRepository0.generateNextId();
        java.lang.String str2 = roomRepository0.generateNextId();
        java.lang.String str3 = roomRepository0.generateNextId();
        Model.Room.Room room5 = roomRepository0.findById("src/main/data/users.csv");
        Model.State.RoomReadyForEnableState roomReadyForEnableState6 = new Model.State.RoomReadyForEnableState();
        boolean boolean7 = roomReadyForEnableState6.isBookable();
        java.lang.String str8 = roomReadyForEnableState6.getStateName();
        boolean boolean9 = roomReadyForEnableState6.isBookable();
        Model.State.RoomDisabledState roomDisabledState10 = new Model.State.RoomDisabledState();
        boolean boolean11 = roomDisabledState10.isBookable();
        boolean boolean12 = roomDisabledState10.isBookable();
        boolean boolean13 = roomDisabledState10.isBookable();
        Model.Room.Room room18 = new Model.Room.Room("COMPLETED", "hi!", (double) 100.0f, "2");
        roomDisabledState10.maintain(room18);
        Model.Room.Room room24 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        roomDisabledState10.enable(room24);
        roomReadyForEnableState6.enable(room24);
        boolean boolean27 = roomReadyForEnableState6.isBookable();
        Model.Room.Room room28 = null;
        roomReadyForEnableState6.maintain(room28);
        boolean boolean30 = roomReadyForEnableState6.isBookable();
        Model.State.RoomDisabledState roomDisabledState31 = new Model.State.RoomDisabledState();
        boolean boolean32 = roomDisabledState31.isBookable();
        boolean boolean33 = roomDisabledState31.isBookable();
        boolean boolean34 = roomDisabledState31.isBookable();
        Model.State.RoomDisabledState roomDisabledState35 = new Model.State.RoomDisabledState();
        boolean boolean36 = roomDisabledState35.isBookable();
        boolean boolean37 = roomDisabledState35.isBookable();
        Model.State.RoomEnabledState roomEnabledState38 = new Model.State.RoomEnabledState();
        Model.Room.Room room43 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        boolean boolean44 = room43.isAvailable();
        Model.Room.AdminRoomProxy adminRoomProxy45 = new Model.Room.AdminRoomProxy(room43);
        roomEnabledState38.disable(room43);
        roomDisabledState35.enable(room43);
        Model.State.RoomDisabledState roomDisabledState48 = new Model.State.RoomDisabledState();
        boolean boolean49 = roomDisabledState48.isBookable();
        boolean boolean50 = roomDisabledState48.isBookable();
        Model.State.RoomEnabledState roomEnabledState51 = new Model.State.RoomEnabledState();
        Model.Room.Room room56 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        boolean boolean57 = room56.isAvailable();
        Model.Room.AdminRoomProxy adminRoomProxy58 = new Model.Room.AdminRoomProxy(room56);
        roomEnabledState51.disable(room56);
        roomDisabledState48.enable(room56);
        roomDisabledState35.maintain(room56);
        roomDisabledState31.disable(room56);
        roomReadyForEnableState6.disable(room56);
        roomRepository0.save(room56);
        java.lang.String str65 = room56.getLocation();
// flaky "8) test539(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "77" + "'", str1, "77");
// flaky "6) test539(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "77" + "'", str2, "77");
// flaky "5) test539(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "77" + "'", str3, "77");
        org.junit.Assert.assertNull(room5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "READY_FOR_ENABLE" + "'", str8, "READY_FOR_ENABLE");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        java.time.LocalDateTime localDateTime4 = null;
        Model.Sensor.ScanIDSensorData scanIDSensorData5 = new Model.Sensor.ScanIDSensorData("hi!", "22", "EECS3311 Course Project Database - Bookings.csv", "23", localDateTime4);
        java.lang.String str6 = scanIDSensorData5.getLogID();
        scanIDSensorData5.sensorID = "";
        java.lang.String str9 = scanIDSensorData5.getSensorID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        Repository.PaymentRepository paymentRepository0 = Repository.PaymentRepository.getInstance();
        Model.Payment.Payment payment3 = new Model.Payment.Payment("", (double) (short) 10);
        paymentRepository0.save(payment3);
        Model.Payment.Payment payment7 = new Model.Payment.Payment("COMPLETED", (double) 0.0f);
        paymentRepository0.save(payment7);
        Model.Payment.Payment payment11 = new Model.Payment.Payment("", (double) (byte) -1);
        java.lang.String str12 = payment11.getStatus();
        java.lang.String str13 = payment11.getPaymentId();
        payment11.completePayment();
        paymentRepository0.save(payment11);
        double double16 = payment11.getAmount();
        org.junit.Assert.assertNotNull(paymentRepository0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PENDING" + "'", str12, "PENDING");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        Repository.SensorRepository sensorRepository0 = new Repository.SensorRepository();
        java.util.List<Model.Sensor.OccupancySensorData> occupancySensorDataList1 = sensorRepository0.getOccupancySensorLogsList();
        Model.Sensor.ScanIDSensorData scanIDSensorData2 = null;
        boolean boolean3 = sensorRepository0.writeScanIDSensorLog(scanIDSensorData2);
        Model.Sensor.OccupancySensor occupancySensor9 = new Model.Sensor.OccupancySensor("", "1", "1", "EECS3311 Course Project Database - Rooms.csv", true);
        boolean boolean10 = false; // flaky "9) test542(RegressionTest1)": sensorRepository0.writeSensor((Model.Sensor.Sensor) occupancySensor9);
        java.util.List<Model.Sensor.ScanIDSensorData> scanIDSensorDataList11 = sensorRepository0.getScanIDSensorLogsList();
        Model.Sensor.Sensor sensor13 = null; // flaky "7) test542(RegressionTest1)": sensorRepository0.getSensorByID("EECS3311 Course Project Database - Bookings.csv");
        java.time.LocalDateTime localDateTime16 = null;
        Model.Sensor.OccupancySensorData occupancySensorData17 = new Model.Sensor.OccupancySensorData("", "hi!", localDateTime16);
        java.time.LocalDateTime localDateTime18 = null;
        occupancySensorData17.dateTime = localDateTime18;
        boolean boolean20 = false; // flaky "6) test542(RegressionTest1)": sensorRepository0.writeOccupancySensorLog(occupancySensorData17);
        java.util.List<Model.Sensor.Sensor> sensorList21 = sensorRepository0.getSensorsList();
        Model.Sensor.Sensor sensor23 = null; // flaky "3) test542(RegressionTest1)": sensorRepository0.getSensorByID("");
// flaky "1) test542(RegressionTest1)":         org.junit.Assert.assertNotNull(occupancySensorDataList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "1) test542(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky "1) test542(RegressionTest1)":         org.junit.Assert.assertNotNull(scanIDSensorDataList11);
        org.junit.Assert.assertNull(sensor13);
// flaky "1) test542(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
// flaky "1) test542(RegressionTest1)":         org.junit.Assert.assertNotNull(sensorList21);
// flaky "1) test542(RegressionTest1)":         org.junit.Assert.assertNotNull(sensor23);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        java.time.LocalDateTime localDateTime4 = null;
        Model.Sensor.ScanIDSensorData scanIDSensorData5 = new Model.Sensor.ScanIDSensorData("38", "512a0e7c-3268-4bb7-bc77-c6d32a14e20d", "9", "CONFIRMED", localDateTime4);
        java.lang.String str6 = scanIDSensorData5.sensorID;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "512a0e7c-3268-4bb7-bc77-c6d32a14e20d" + "'", str6, "512a0e7c-3268-4bb7-bc77-c6d32a14e20d");
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        Model.Room.Room room4 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        Model.Room.GuestRoomProxy guestRoomProxy5 = new Model.Room.GuestRoomProxy(room4);
        boolean boolean6 = room4.isAvailable();
        Model.Room.GuestRoomProxy guestRoomProxy7 = new Model.Room.GuestRoomProxy(room4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        java.time.LocalDateTime localDateTime4 = null;
        Model.Sensor.ScanIDSensorData scanIDSensorData5 = new Model.Sensor.ScanIDSensorData("38", "512a0e7c-3268-4bb7-bc77-c6d32a14e20d", "9", "CONFIRMED", localDateTime4);
        java.lang.String str6 = scanIDSensorData5.getScanOutcome();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CONFIRMED" + "'", str6, "CONFIRMED");
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        Model.State.RoomEnabledState roomEnabledState0 = new Model.State.RoomEnabledState();
        Model.Room.Room room5 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        boolean boolean6 = room5.isAvailable();
        Model.Room.AdminRoomProxy adminRoomProxy7 = new Model.Room.AdminRoomProxy(room5);
        roomEnabledState0.disable(room5);
        boolean boolean9 = roomEnabledState0.isBookable();
        Model.State.RoomEnabledState roomEnabledState10 = new Model.State.RoomEnabledState();
        boolean boolean11 = roomEnabledState10.isBookable();
        Model.State.RoomReadyForEnableState roomReadyForEnableState12 = new Model.State.RoomReadyForEnableState();
        boolean boolean13 = roomReadyForEnableState12.isBookable();
        Model.Room.Room room18 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        roomReadyForEnableState12.disable(room18);
        roomEnabledState10.maintain(room18);
        room18.performMaintenance();
        roomEnabledState0.disable(room18);
        double double23 = room18.getPrice();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        Model.ServiceRequest.SensorEssentialServiceRequest sensorEssentialServiceRequest5 = new Model.ServiceRequest.SensorEssentialServiceRequest((int) '#', "src/main/data/occupancy_sensor_logs.csv", "Service.AuthenticationException: Service.AuthenticationException: ", (int) (short) 10, 4);
        boolean boolean6 = sensorEssentialServiceRequest5.isEssential();
        sensorEssentialServiceRequest5.setStatus("30");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        Service.UserService userService0 = new Service.UserService();
        Controller.ChiefEventCoordinatorController chiefEventCoordinatorController1 = new Controller.ChiefEventCoordinatorController(userService0);
        chiefEventCoordinatorController1.createAdmin("8", "src/main/data/MaintenanceRequests.csv", "17");
        chiefEventCoordinatorController1.createAdmin("", "7", "14");
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        Model.State.ConfirmedState confirmedState0 = new Model.State.ConfirmedState();
        Model.State.CompletedState completedState1 = new Model.State.CompletedState();
        java.time.LocalDate localDate5 = null;
        java.time.LocalDate localDate6 = null;
        java.time.LocalTime localTime7 = null;
        java.time.LocalTime localTime8 = null;
        Model.Room.Booking booking10 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate5, localDate6, localTime7, localTime8, "");
        completedState1.checkOut(booking10);
        java.time.LocalDate localDate15 = null;
        java.time.LocalDate localDate16 = null;
        java.time.LocalTime localTime17 = null;
        java.time.LocalTime localTime18 = null;
        Model.Room.Booking booking20 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate15, localDate16, localTime17, localTime18, "");
        java.lang.String str21 = booking20.getBookingId();
        Model.State.BookingState bookingState22 = null;
        booking20.setState(bookingState22);
        Model.State.CompletedState completedState24 = new Model.State.CompletedState();
        booking20.setState((Model.State.BookingState) completedState24);
        completedState1.checkOut(booking20);
        booking20.performCheckOut();
        java.lang.String str28 = booking20.getBookingId();
        java.lang.String str29 = booking20.getUserId();
        java.lang.String str30 = booking20.getBookingId();
        confirmedState0.checkIn(booking20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        java.time.LocalDateTime localDateTime4 = null;
        Model.Sensor.ScanIDSensorData scanIDSensorData5 = new Model.Sensor.ScanIDSensorData("32", "25", "2", "56", localDateTime4);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        View.RescheduleBookingView rescheduleBookingView0 = null;
        Service.RoomService roomService1 = new Service.RoomService();
        roomService1.maintenanceCompleted("");
        boolean boolean5 = roomService1.performCheckOut("");
        roomService1.maintenanceCompleted("1");
        Model.Room.Booking booking9 = roomService1.getBookingDetails("EECS3311 Course Project Database - Rooms.csv");
        roomService1.update(true, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            Controller.RescheduleBookingController rescheduleBookingController13 = new Controller.RescheduleBookingController(rescheduleBookingView0, roomService1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"backButton\" because \"this.view\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "10) test551(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(booking9);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        Service.EvaluateRoomMaintenanceRelationshipService evaluateRoomMaintenanceRelationshipService0 = Service.EvaluateRoomMaintenanceRelationshipService.getInstance();
        evaluateRoomMaintenanceRelationshipService0.notifyObservers();
        Service.RoomService roomService2 = new Service.RoomService();
        roomService2.update(true, (int) (short) 10);
        Model.Room.Booking booking7 = roomService2.getBookingDetails("src/main/data/users.csv");
        boolean boolean9 = roomService2.cancelBooking("hi!");
        Controller.AddRoomController addRoomController10 = new Controller.AddRoomController(roomService2);
        evaluateRoomMaintenanceRelationshipService0.removeObserver((Model.Room.Observer) roomService2);
        Service.RoomService roomService12 = new Service.RoomService();
        roomService12.maintenanceCompleted("");
        evaluateRoomMaintenanceRelationshipService0.removeObserver((Model.Room.Observer) roomService12);
        Service.EvaluateRoomMaintenanceRelationshipService evaluateRoomMaintenanceRelationshipService16 = Service.EvaluateRoomMaintenanceRelationshipService.getInstance();
        evaluateRoomMaintenanceRelationshipService16.notifyObservers();
        Service.RoomService roomService18 = new Service.RoomService();
        roomService18.update(true, (int) (short) 10);
        Model.Room.Booking booking23 = roomService18.getBookingDetails("src/main/data/users.csv");
        boolean boolean25 = roomService18.cancelBooking("hi!");
        Controller.AddRoomController addRoomController26 = new Controller.AddRoomController(roomService18);
        evaluateRoomMaintenanceRelationshipService16.removeObserver((Model.Room.Observer) roomService18);
        Service.RoomService roomService28 = new Service.RoomService();
        roomService28.maintenanceCompleted("");
        evaluateRoomMaintenanceRelationshipService16.removeObserver((Model.Room.Observer) roomService28);
        Service.RoomService roomService32 = roomService28.getInstance();
        Service.RoomService roomService33 = roomService32.getInstance();
        evaluateRoomMaintenanceRelationshipService0.removeObserver((Model.Room.Observer) roomService32);
        roomService32.savePayment("FACULTY", (double) 100L);
        org.junit.Assert.assertNotNull(evaluateRoomMaintenanceRelationshipService0);
        org.junit.Assert.assertNull(booking7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(evaluateRoomMaintenanceRelationshipService16);
        org.junit.Assert.assertNull(booking23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(roomService32);
        org.junit.Assert.assertNotNull(roomService33);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        Model.State.RoomReadyForEnableState roomReadyForEnableState0 = new Model.State.RoomReadyForEnableState();
        boolean boolean1 = roomReadyForEnableState0.isBookable();
        Model.State.RoomEnabledState roomEnabledState2 = new Model.State.RoomEnabledState();
        Model.Room.Room room7 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        boolean boolean8 = room7.isAvailable();
        Model.Room.AdminRoomProxy adminRoomProxy9 = new Model.Room.AdminRoomProxy(room7);
        roomEnabledState2.disable(room7);
        roomReadyForEnableState0.maintain(room7);
        Model.Room.Room room16 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        boolean boolean17 = room16.isAvailable();
        roomReadyForEnableState0.maintain(room16);
        Model.State.RoomReadyForEnableState roomReadyForEnableState19 = new Model.State.RoomReadyForEnableState();
        Model.State.RoomEnabledState roomEnabledState20 = new Model.State.RoomEnabledState();
        boolean boolean21 = roomEnabledState20.isBookable();
        Model.State.RoomReadyForEnableState roomReadyForEnableState22 = new Model.State.RoomReadyForEnableState();
        boolean boolean23 = roomReadyForEnableState22.isBookable();
        Model.Room.Room room28 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        roomReadyForEnableState22.disable(room28);
        roomEnabledState20.maintain(room28);
        roomReadyForEnableState19.maintain(room28);
        roomReadyForEnableState0.maintain(room28);
        Model.State.RoomReadyForEnableState roomReadyForEnableState33 = new Model.State.RoomReadyForEnableState();
        boolean boolean34 = roomReadyForEnableState33.isBookable();
        Model.State.RoomEnabledState roomEnabledState35 = new Model.State.RoomEnabledState();
        Model.Room.Room room40 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        boolean boolean41 = room40.isAvailable();
        Model.Room.AdminRoomProxy adminRoomProxy42 = new Model.Room.AdminRoomProxy(room40);
        roomEnabledState35.disable(room40);
        roomReadyForEnableState33.maintain(room40);
        roomReadyForEnableState0.enable(room40);
        java.lang.String str46 = roomReadyForEnableState0.getStateName();
        boolean boolean47 = roomReadyForEnableState0.isBookable();
        boolean boolean48 = roomReadyForEnableState0.isBookable();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "READY_FOR_ENABLE" + "'", str46, "READY_FOR_ENABLE");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        Model.State.CheckInState checkInState0 = new Model.State.CheckInState();
        Model.State.CheckInState checkInState1 = new Model.State.CheckInState();
        java.time.LocalDate localDate5 = null;
        java.time.LocalDate localDate6 = null;
        java.time.LocalTime localTime7 = null;
        java.time.LocalTime localTime8 = null;
        Model.Room.Booking booking10 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate5, localDate6, localTime7, localTime8, "");
        java.lang.String str11 = booking10.getBookingId();
        checkInState1.checkIn(booking10);
        java.lang.String str13 = booking10.getUserId();
        checkInState0.cancel(booking10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        Service.RoomService roomService0 = new Service.RoomService();
        roomService0.update(true, (int) (short) 10);
        Model.Room.Booking booking5 = roomService0.getBookingDetails("src/main/data/users.csv");
        boolean boolean7 = roomService0.cancelBooking("hi!");
        Controller.AddRoomController addRoomController8 = new Controller.AddRoomController(roomService0);
        addRoomController8.handleAddRoomSubmission("EECS3311 Course Project Database - Rooms.csv", (int) (short) -1, (double) 1);
        Controller.AdminSelectActionController adminSelectActionController13 = new Controller.AdminSelectActionController(addRoomController8);
        org.junit.Assert.assertNull(booking5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        java.time.LocalDateTime localDateTime4 = null;
        Model.Sensor.ScanIDSensorData scanIDSensorData5 = new Model.Sensor.ScanIDSensorData("hi!", "22", "EECS3311 Course Project Database - Bookings.csv", "23", localDateTime4);
        java.lang.String str6 = scanIDSensorData5.getLogID();
        java.lang.String str7 = scanIDSensorData5.getUserID();
        java.lang.String str8 = scanIDSensorData5.getUserID();
        java.time.LocalDateTime localDateTime9 = null;
        scanIDSensorData5.dateTime = localDateTime9;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EECS3311 Course Project Database - Bookings.csv" + "'", str7, "EECS3311 Course Project Database - Bookings.csv");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EECS3311 Course Project Database - Bookings.csv" + "'", str8, "EECS3311 Course Project Database - Bookings.csv");
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        Database.Database database0 = Database.Database.getInstance();
        java.lang.String str1 = database0.getMaintenanceRequestsCsvPath();
        java.lang.String str2 = database0.getMaintenanceRequestsCsvPath();
        java.lang.String str3 = database0.getPaymentCsvPath();
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "src/main/data/MaintenanceRequests.csv" + "'", str1, "src/main/data/MaintenanceRequests.csv");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "src/main/data/MaintenanceRequests.csv" + "'", str2, "src/main/data/MaintenanceRequests.csv");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EECS3311 Course Project Database - payments.csv" + "'", str3, "EECS3311 Course Project Database - payments.csv");
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        Model.User.FacultyUser facultyUser3 = new Model.User.FacultyUser("src/main/data/MaintenanceRequests.csv", "27", "32");
        java.lang.String str4 = facultyUser3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "32" + "'", str4, "32");
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        Repository.ServiceRequestRepository serviceRequestRepository0 = Repository.ServiceRequestRepository.getInstance();
        Model.ServiceRequest.SensorEssentialServiceRequest sensorEssentialServiceRequest6 = new Model.ServiceRequest.SensorEssentialServiceRequest((int) (short) -1, "4", "hi!", (-1), (int) ' ');
        serviceRequestRepository0.updateExistingServiceRequest((Model.ServiceRequest.ServiceRequest) sensorEssentialServiceRequest6);
        Service.EditMaintenanceRequestService editMaintenanceRequestService8 = new Service.EditMaintenanceRequestService(serviceRequestRepository0);
        editMaintenanceRequestService8.update((int) (byte) 1, "EECS3311 Course Project Database - payments.csv", "PENDING", true, 33);
        org.junit.Assert.assertNotNull(serviceRequestRepository0);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        Model.State.CheckInState checkInState0 = new Model.State.CheckInState();
        java.lang.String str1 = checkInState0.getStatus();
        java.lang.String str2 = checkInState0.getStatus();
        Model.State.CompletedState completedState3 = new Model.State.CompletedState();
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        java.time.LocalTime localTime9 = null;
        java.time.LocalTime localTime10 = null;
        Model.Room.Booking booking12 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate7, localDate8, localTime9, localTime10, "");
        completedState3.checkOut(booking12);
        java.time.LocalDate localDate14 = booking12.getEndDate();
        checkInState0.cancel(booking12);
        Model.State.CheckInState checkInState16 = new Model.State.CheckInState();
        java.lang.String str17 = checkInState16.getStatus();
        java.lang.String str18 = checkInState16.getStatus();
        java.lang.String str19 = checkInState16.getStatus();
        java.time.LocalDate localDate23 = null;
        java.time.LocalDate localDate24 = null;
        java.time.LocalTime localTime25 = null;
        java.time.LocalTime localTime26 = null;
        Model.Room.Booking booking28 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate23, localDate24, localTime25, localTime26, "");
        java.lang.String str29 = booking28.getBookingId();
        java.time.LocalTime localTime30 = booking28.getStartTime();
        checkInState16.cancel(booking28);
        java.lang.String str32 = booking28.getUserId();
        checkInState0.cancel(booking28);
        java.time.LocalDate localDate37 = null;
        java.time.LocalDate localDate38 = null;
        java.time.LocalTime localTime39 = null;
        java.time.LocalTime localTime40 = null;
        Model.Room.Booking booking42 = new Model.Room.Booking("hi!", "EECS3311 Course Project Database - Bookings.csv", "src/main/data/MaintenanceRequests.csv", localDate37, localDate38, localTime39, localTime40, "EECS3311 Course Project Database - Rooms.csv");
        checkInState0.cancel(booking42);
        java.time.LocalDate localDate47 = null;
        java.time.LocalDate localDate48 = null;
        java.time.LocalTime localTime49 = null;
        java.time.LocalTime localTime50 = null;
        Model.Room.Booking booking52 = new Model.Room.Booking("src/main/data/MaintenanceRequests.csv", "34", "EECS3311 Course Project Database - Rooms.csv", localDate47, localDate48, localTime49, localTime50, "32");
        checkInState0.checkIn(booking52);
        Model.State.CheckInState checkInState54 = new Model.State.CheckInState();
        java.lang.String str55 = checkInState54.getStatus();
        java.lang.String str56 = checkInState54.getStatus();
        Model.State.CompletedState completedState57 = new Model.State.CompletedState();
        java.time.LocalDate localDate61 = null;
        java.time.LocalDate localDate62 = null;
        java.time.LocalTime localTime63 = null;
        java.time.LocalTime localTime64 = null;
        Model.Room.Booking booking66 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate61, localDate62, localTime63, localTime64, "");
        completedState57.checkOut(booking66);
        java.time.LocalDate localDate68 = booking66.getEndDate();
        checkInState54.cancel(booking66);
        java.time.LocalDate localDate73 = null;
        java.time.LocalDate localDate74 = null;
        java.time.LocalTime localTime75 = null;
        java.time.LocalTime localTime76 = null;
        Model.Room.Booking booking78 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate73, localDate74, localTime75, localTime76, "");
        java.lang.String str79 = booking78.getBookingId();
        java.time.LocalTime localTime80 = booking78.getStartTime();
        java.lang.String str81 = booking78.getBookingId();
        checkInState54.checkIn(booking78);
        checkInState0.cancel(booking78);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CHECKED_IN" + "'", str1, "CHECKED_IN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CHECKED_IN" + "'", str2, "CHECKED_IN");
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "CHECKED_IN" + "'", str17, "CHECKED_IN");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "CHECKED_IN" + "'", str18, "CHECKED_IN");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "CHECKED_IN" + "'", str19, "CHECKED_IN");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNull(localTime30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "CHECKED_IN" + "'", str55, "CHECKED_IN");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "CHECKED_IN" + "'", str56, "CHECKED_IN");
        org.junit.Assert.assertNull(localDate68);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertNull(localTime80);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        Service.RoomListFacade roomListFacade0 = new Service.RoomListFacade();
        java.util.List<Model.Room.RoomProxy> roomProxyList1 = roomListFacade0.getAllRoomsForAdmin();
        java.util.List<Model.Room.RoomProxy> roomProxyList2 = roomListFacade0.getAllRoomsForAdmin();
        java.util.List<Model.Room.RoomProxy> roomProxyList3 = roomListFacade0.getAllRoomsForAdmin();
        java.util.List<Model.Room.RoomProxy> roomProxyList4 = roomListFacade0.getAvailableRoomsForGuest();
        java.util.List<Model.Room.RoomProxy> roomProxyList5 = roomListFacade0.getAvailableRoomsForGuest();
        org.junit.Assert.assertNotNull(roomProxyList1);
        org.junit.Assert.assertNotNull(roomProxyList2);
        org.junit.Assert.assertNotNull(roomProxyList3);
        org.junit.Assert.assertNotNull(roomProxyList4);
        org.junit.Assert.assertNotNull(roomProxyList5);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
        Repository.ServiceRequestRepository serviceRequestRepository0 = Repository.ServiceRequestRepository.getInstance();
        java.lang.Integer int2 = serviceRequestRepository0.generateNextId((int) (byte) 100);
        Service.EditMaintenanceRequestService editMaintenanceRequestService3 = new Service.EditMaintenanceRequestService(serviceRequestRepository0);
        editMaintenanceRequestService3.update((int) (short) 0, "EECS3311 Course Project Database - Rooms.csv", "DISABLED", false, (int) (short) 100);
        editMaintenanceRequestService3.promoteServiceRequest((int) (byte) 0, "EECS3311 Course Project Database - Rooms.csv", "12", 38, "17");
        org.junit.Assert.assertNotNull(serviceRequestRepository0);
// flaky "11) test562(RegressionTest1)":         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
        Model.User.PartnerUser partnerUser6 = new Model.User.PartnerUser("", "hi!", "", "", true, "hi!");
        partnerUser6.setName("4");
        partnerUser6.setVerified(true);
        boolean boolean11 = partnerUser6.isVerified();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        Repository.SensorRepository sensorRepository0 = new Repository.SensorRepository();
        java.util.List<Model.Sensor.OccupancySensorData> occupancySensorDataList1 = sensorRepository0.getOccupancySensorLogsList();
        Model.Sensor.ScanIDSensorData scanIDSensorData2 = null;
        boolean boolean3 = sensorRepository0.writeScanIDSensorLog(scanIDSensorData2);
        Model.Sensor.OccupancySensor occupancySensor9 = new Model.Sensor.OccupancySensor("", "1", "1", "EECS3311 Course Project Database - Rooms.csv", true);
        boolean boolean10 = false; // flaky "12) test564(RegressionTest1)": sensorRepository0.writeSensor((Model.Sensor.Sensor) occupancySensor9);
        Model.Sensor.Sensor sensor12 = null; // flaky "8) test564(RegressionTest1)": sensorRepository0.getSensorByID("src/main/data/users.csv");
        java.util.List<Model.Sensor.Sensor> sensorList13 = sensorRepository0.getSensorsList();
        Model.Sensor.Sensor sensor15 = null; // flaky "7) test564(RegressionTest1)": sensorRepository0.getSensorByID("25");
        java.util.List<Model.Sensor.ScanIDSensorData> scanIDSensorDataList16 = sensorRepository0.getScanIDSensorLogsList();
// flaky "4) test564(RegressionTest1)":         org.junit.Assert.assertNotNull(occupancySensorDataList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "2) test564(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(sensor12);
// flaky "2) test564(RegressionTest1)":         org.junit.Assert.assertNotNull(sensorList13);
        org.junit.Assert.assertNull(sensor15);
// flaky "2) test564(RegressionTest1)":         org.junit.Assert.assertNotNull(scanIDSensorDataList16);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
        Model.Sensor.Sensor sensor5 = new Model.Sensor.Sensor("1", "", "src/main/data/users.csv", "hi!", true);
        java.lang.String str6 = sensor5.getRoomID();
        sensor5.setStatus("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        Model.State.RoomEnabledState roomEnabledState1 = new Model.State.RoomEnabledState();
        Model.Room.Room room6 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        boolean boolean7 = room6.isAvailable();
        Model.Room.AdminRoomProxy adminRoomProxy8 = new Model.Room.AdminRoomProxy(room6);
        roomEnabledState1.disable(room6);
        boolean boolean10 = room6.isAvailable();
        Model.Room.RoomProxy roomProxy11 = Model.Room.RoomProxyFactory.getProxy("17", room6);
        roomProxy11.showRoomDetails();
        java.lang.String str13 = roomProxy11.getRoomId();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(roomProxy11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "COMPLETED" + "'", str13, "COMPLETED");
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
        Model.State.RoomReadyForEnableState roomReadyForEnableState0 = new Model.State.RoomReadyForEnableState();
        boolean boolean1 = roomReadyForEnableState0.isBookable();
        java.lang.String str2 = roomReadyForEnableState0.getStateName();
        boolean boolean3 = roomReadyForEnableState0.isBookable();
        Model.State.RoomDisabledState roomDisabledState4 = new Model.State.RoomDisabledState();
        boolean boolean5 = roomDisabledState4.isBookable();
        boolean boolean6 = roomDisabledState4.isBookable();
        boolean boolean7 = roomDisabledState4.isBookable();
        Model.Room.Room room12 = new Model.Room.Room("COMPLETED", "hi!", (double) 100.0f, "2");
        roomDisabledState4.maintain(room12);
        Model.Room.Room room18 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        roomDisabledState4.enable(room18);
        roomReadyForEnableState0.enable(room18);
        boolean boolean21 = roomReadyForEnableState0.isBookable();
        Model.Room.Room room22 = null;
        roomReadyForEnableState0.maintain(room22);
        Model.Room.Room room24 = null;
        // The following exception was thrown during execution in test generation
        try {
            roomReadyForEnableState0.disable(room24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Model.Room.Room.setState(Model.State.RoomState)\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "READY_FOR_ENABLE" + "'", str2, "READY_FOR_ENABLE");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        Service.UserService userService0 = new Service.UserService();
        Controller.ChiefEventCoordinatorController chiefEventCoordinatorController1 = new Controller.ChiefEventCoordinatorController(userService0);
        chiefEventCoordinatorController1.createAdmin("8", "src/main/data/MaintenanceRequests.csv", "17");
        chiefEventCoordinatorController1.createAdmin("9", "CHECKED_IN", "READY_FOR_ENABLE");
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
        Model.ServiceRequest.EssentialServiceRequest essentialServiceRequest4 = new Model.ServiceRequest.EssentialServiceRequest(100, "EECS3311 Course Project Database - Rooms.csv", "DISABLED", 0);
        boolean boolean5 = essentialServiceRequest4.isEssential();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
        Controller.AdminServiceRequestController adminServiceRequestController0 = new Controller.AdminServiceRequestController();
        adminServiceRequestController0.promoteServiceRequest((int) (byte) 100, "25", "36");
        adminServiceRequestController0.handleAddServiceRequest("src/main/data/scanid_sensor_logs.csv", false, "21");
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
        Repository.SensorRepository sensorRepository0 = new Repository.SensorRepository();
        java.util.List<Model.Sensor.OccupancySensorData> occupancySensorDataList1 = sensorRepository0.getOccupancySensorLogsList();
        Model.Sensor.ScanIDSensorData scanIDSensorData2 = null;
        boolean boolean3 = sensorRepository0.writeScanIDSensorLog(scanIDSensorData2);
        Model.Sensor.OccupancySensor occupancySensor9 = new Model.Sensor.OccupancySensor("", "1", "1", "EECS3311 Course Project Database - Rooms.csv", true);
        boolean boolean10 = false; // flaky "13) test571(RegressionTest1)": sensorRepository0.writeSensor((Model.Sensor.Sensor) occupancySensor9);
// flaky "9) test571(RegressionTest1)":         sensorRepository0.deleteSensorByID("src/main/data/users.csv");
        java.util.List<Model.Sensor.OccupancySensorData> occupancySensorDataList13 = sensorRepository0.getOccupancySensorLogsList();
// flaky "8) test571(RegressionTest1)":         org.junit.Assert.assertNotNull(occupancySensorDataList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "5) test571(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky "3) test571(RegressionTest1)":         org.junit.Assert.assertNotNull(occupancySensorDataList13);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
        java.time.LocalDateTime localDateTime2 = null;
        Model.Sensor.OccupancySensorData occupancySensorData3 = new Model.Sensor.OccupancySensorData("", "hi!", localDateTime2);
        java.lang.String str4 = occupancySensorData3.getLogID();
        java.lang.String str5 = occupancySensorData3.getSensorID();
        java.time.LocalDateTime localDateTime6 = occupancySensorData3.getLocalDateTime();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(localDateTime6);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
        Model.State.CheckInState checkInState0 = new Model.State.CheckInState();
        java.time.LocalDate localDate4 = null;
        java.time.LocalDate localDate5 = null;
        java.time.LocalTime localTime6 = null;
        java.time.LocalTime localTime7 = null;
        Model.Room.Booking booking9 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate4, localDate5, localTime6, localTime7, "");
        java.lang.String str10 = booking9.getBookingId();
        checkInState0.checkIn(booking9);
        java.lang.String str12 = booking9.getRoomId();
        java.lang.String str13 = booking9.getPaymentId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "src/main/data/users.csv" + "'", str12, "src/main/data/users.csv");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
        java.time.LocalDateTime localDateTime4 = null;
        Model.Sensor.ScanIDSensorData scanIDSensorData5 = new Model.Sensor.ScanIDSensorData("20", "29", "23", "35", localDateTime4);
        java.time.LocalDateTime localDateTime6 = scanIDSensorData5.dateTime;
        java.lang.String str7 = scanIDSensorData5.getScanOutcome();
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "35" + "'", str7, "35");
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
        Service.RoomService roomService0 = new Service.RoomService();
        roomService0.update(true, (int) (short) 10);
        boolean boolean5 = roomService0.performCheckOut("hi!");
        java.lang.String str9 = roomService0.createRoom("", (double) '4', "src/main/data/users.csv");
        Service.RoomService roomService10 = roomService0.getInstance();
        Controller.AddRoomController addRoomController11 = new Controller.AddRoomController(roomService10);
        roomService10.savePayment("CONFIRMED", 40.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "14) test575(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "78" + "'", str9, "78");
        org.junit.Assert.assertNotNull(roomService10);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
        Service.SensorService sensorService0 = new Service.SensorService();
        Model.Sensor.Sensor sensor3 = null; // flaky "15) test576(RegressionTest1)": sensorService0.getSensorByRoomID("CHECKED_IN", "");
        java.util.List<java.util.List<java.lang.String>> strListList4 = null; // flaky "10) test576(RegressionTest1)": sensorService0.getSensorsFormatted();
        boolean boolean8 = false; // flaky "9) test576(RegressionTest1)": sensorService0.addScanIDSensorData("", "57197862-2463-4972-b3b2-977245133f34", "CONFIRMED");
        boolean boolean12 = false; // flaky "6) test576(RegressionTest1)": sensorService0.addScanIDSensorData("src/main/data/scanid_sensor_logs.csv", "44", "READY_FOR_ENABLE");
        org.junit.Assert.assertNull(sensor3);
// flaky "4) test576(RegressionTest1)":         org.junit.Assert.assertNotNull(strListList4);
// flaky "3) test576(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "3) test576(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
        Model.User.PartnerUser partnerUser6 = new Model.User.PartnerUser("32", "3b878a93-2f8d-4168-99fd-22b8dbe103f1", "3", "src/main/data/users.csv", false, "8903a9bb-0838-41ef-9768-131faa20dcdc");
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
        Model.State.RoomDisabledState roomDisabledState0 = new Model.State.RoomDisabledState();
        boolean boolean1 = roomDisabledState0.isBookable();
        boolean boolean2 = roomDisabledState0.isBookable();
        boolean boolean3 = roomDisabledState0.isBookable();
        Model.Room.Room room8 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        boolean boolean9 = room8.isAvailable();
        roomDisabledState0.maintain(room8);
        java.lang.String str11 = roomDisabledState0.getStateName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DISABLED" + "'", str11, "DISABLED");
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
        Model.Sensor.Sensor sensor5 = new Model.Sensor.Sensor("", "src/main/data/users.csv", "", "DISABLED", true);
        sensor5.setOccupied(false);
        java.lang.String str8 = sensor5.getType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "src/main/data/users.csv" + "'", str8, "src/main/data/users.csv");
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
        Service.UserService userService0 = new Service.UserService();
        Model.User.AccountType accountType1 = Model.User.AccountType.PARTNER;
        Model.User.User user5 = userService0.createUser(accountType1, "", "DISABLED", "4");
        Model.User.User user9 = Model.User.UserFactory.createUser(accountType1, "3", "9", "EECS3311 Course Project Database - Bookings.csv");
        java.lang.String str10 = user9.getEmail();
        org.junit.Assert.assertTrue("'" + accountType1 + "' != '" + Model.User.AccountType.PARTNER + "'", accountType1.equals(Model.User.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNotNull(user9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "9" + "'", str10, "9");
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
        Model.ServiceRequest.SensorEssentialServiceRequest sensorEssentialServiceRequest5 = new Model.ServiceRequest.SensorEssentialServiceRequest((int) (short) -1, "4", "hi!", (-1), (int) ' ');
        sensorEssentialServiceRequest5.setRoomID((int) (byte) -1);
        int int8 = sensorEssentialServiceRequest5.getSensorID();
        int int9 = sensorEssentialServiceRequest5.getSensorID();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
        Service.UserService userService0 = new Service.UserService();
        Controller.ChiefEventCoordinatorController chiefEventCoordinatorController1 = new Controller.ChiefEventCoordinatorController(userService0);
        Model.User.AccountType accountType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            Model.User.User user6 = userService0.createUser(accountType2, "3b878a93-2f8d-4168-99fd-22b8dbe103f1", "8903a9bb-0838-41ef-9768-131faa20dcdc", "74");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: wrong account type: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
        Service.RoomService roomService0 = new Service.RoomService();
        roomService0.update(true, (int) (short) 10);
        Model.Room.Booking booking5 = roomService0.getBookingDetails("src/main/data/users.csv");
        boolean boolean7 = roomService0.cancelBooking("hi!");
        Controller.AddRoomController addRoomController8 = new Controller.AddRoomController(roomService0);
        Controller.AdminSelectActionController adminSelectActionController9 = new Controller.AdminSelectActionController(addRoomController8);
        Controller.AdminSelectActionController adminSelectActionController10 = new Controller.AdminSelectActionController(addRoomController8);
        Controller.AdminSelectActionController adminSelectActionController11 = new Controller.AdminSelectActionController(addRoomController8);
        org.junit.Assert.assertNull(booking5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
        Repository.ServiceRequestRepository serviceRequestRepository0 = Repository.ServiceRequestRepository.getInstance();
        Model.ServiceRequest.SensorEssentialServiceRequest sensorEssentialServiceRequest6 = new Model.ServiceRequest.SensorEssentialServiceRequest(1, "COMPLETED", "Service.AuthenticationException: ", (int) 'a', (int) (short) -1);
        sensorEssentialServiceRequest6.assignRoomID(100);
        java.lang.String str9 = sensorEssentialServiceRequest6.getStatus();
        serviceRequestRepository0.updateExistingServiceRequest((Model.ServiceRequest.ServiceRequest) sensorEssentialServiceRequest6);
        Model.ServiceRequest.SensorEssentialServiceRequest sensorEssentialServiceRequest16 = new Model.ServiceRequest.SensorEssentialServiceRequest((int) (short) 100, "CHECKED_IN", "EECS3311 Course Project Database - Bookings.csv", 0, (int) (byte) 0);
        serviceRequestRepository0.updateExistingServiceRequest((Model.ServiceRequest.ServiceRequest) sensorEssentialServiceRequest16);
        java.util.Map<java.lang.Integer, java.util.List<Model.ServiceRequest.ServiceRequest>> intMap20 = serviceRequestRepository0.parseCsvFileToMap("EECS3311 Course Project Database - Bookings.csv", true);
        Model.ServiceRequest.NonEssentialServiceRequest nonEssentialServiceRequest25 = new Model.ServiceRequest.NonEssentialServiceRequest((int) 'a', "EECS3311 Course Project Database - Rooms.csv", "3", (int) (byte) -1);
        boolean boolean26 = nonEssentialServiceRequest25.isEssential();
        Model.ServiceRequest.ServiceRequest serviceRequest27 = serviceRequestRepository0.addServiceRequest((Model.ServiceRequest.ServiceRequest) nonEssentialServiceRequest25);
        nonEssentialServiceRequest25.setStatus("42");
        org.junit.Assert.assertNotNull(serviceRequestRepository0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Service.AuthenticationException: " + "'", str9, "Service.AuthenticationException: ");
        org.junit.Assert.assertNotNull(intMap20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(serviceRequest27);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
        Model.User.StaffUser staffUser3 = new Model.User.StaffUser("hi!", "", "hi!");
        boolean boolean4 = staffUser3.isVerified();
        Application.SessionData.setCurrentUser((Model.User.User) staffUser3);
        double double6 = staffUser3.getHourlyRate();
        staffUser3.setPassword("COMPLETED");
        staffUser3.setVerified(false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
        Model.State.CheckInState checkInState0 = new Model.State.CheckInState();
        java.time.LocalDate localDate4 = null;
        java.time.LocalDate localDate5 = null;
        java.time.LocalTime localTime6 = null;
        java.time.LocalTime localTime7 = null;
        Model.Room.Booking booking9 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate4, localDate5, localTime6, localTime7, "");
        java.lang.String str10 = booking9.getBookingId();
        checkInState0.checkIn(booking9);
        java.lang.String str12 = booking9.getRoomId();
        java.time.LocalDate localDate13 = booking9.getEndDate();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "src/main/data/users.csv" + "'", str12, "src/main/data/users.csv");
        org.junit.Assert.assertNull(localDate13);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
        Service.RoomService roomService0 = new Service.RoomService();
        roomService0.update(true, (int) (short) 10);
        Model.Room.Booking booking5 = roomService0.getBookingDetails("COMPLETED");
        boolean boolean7 = roomService0.performCheckOut("14");
        org.junit.Assert.assertNull(booking5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
        Model.User.StaffUser staffUser6 = new Model.User.StaffUser("", "COMPLETED", "COMPLETED", "DISABLED", true, "3");
        java.lang.String str7 = staffUser6.getRole();
        staffUser6.setVerified(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "3" + "'", str7, "3");
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
        Model.State.CheckInState checkInState0 = new Model.State.CheckInState();
        java.lang.String str1 = checkInState0.getStatus();
        java.lang.String str2 = checkInState0.getStatus();
        Model.State.CompletedState completedState3 = new Model.State.CompletedState();
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        java.time.LocalTime localTime9 = null;
        java.time.LocalTime localTime10 = null;
        Model.Room.Booking booking12 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate7, localDate8, localTime9, localTime10, "");
        completedState3.checkOut(booking12);
        java.time.LocalDate localDate14 = booking12.getEndDate();
        checkInState0.cancel(booking12);
        Model.State.CheckInState checkInState16 = new Model.State.CheckInState();
        java.lang.String str17 = checkInState16.getStatus();
        java.lang.String str18 = checkInState16.getStatus();
        java.lang.String str19 = checkInState16.getStatus();
        java.time.LocalDate localDate23 = null;
        java.time.LocalDate localDate24 = null;
        java.time.LocalTime localTime25 = null;
        java.time.LocalTime localTime26 = null;
        Model.Room.Booking booking28 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate23, localDate24, localTime25, localTime26, "");
        java.lang.String str29 = booking28.getBookingId();
        java.time.LocalTime localTime30 = booking28.getStartTime();
        checkInState16.cancel(booking28);
        java.lang.String str32 = booking28.getUserId();
        checkInState0.cancel(booking28);
        Model.State.CancelledState cancelledState34 = new Model.State.CancelledState();
        Model.State.CompletedState completedState35 = new Model.State.CompletedState();
        java.time.LocalDate localDate39 = null;
        java.time.LocalDate localDate40 = null;
        java.time.LocalTime localTime41 = null;
        java.time.LocalTime localTime42 = null;
        Model.Room.Booking booking44 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate39, localDate40, localTime41, localTime42, "");
        completedState35.checkOut(booking44);
        java.time.LocalDate localDate49 = null;
        java.time.LocalDate localDate50 = null;
        java.time.LocalTime localTime51 = null;
        java.time.LocalTime localTime52 = null;
        Model.Room.Booking booking54 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate49, localDate50, localTime51, localTime52, "");
        java.lang.String str55 = booking54.getBookingId();
        Model.State.BookingState bookingState56 = null;
        booking54.setState(bookingState56);
        Model.State.CompletedState completedState58 = new Model.State.CompletedState();
        booking54.setState((Model.State.BookingState) completedState58);
        completedState35.checkOut(booking54);
        booking54.performCheckOut();
        java.lang.String str62 = booking54.getBookingId();
        booking54.performCheckIn();
        cancelledState34.checkOut(booking54);
        checkInState0.cancel(booking54);
        java.lang.String str66 = booking54.getUserId();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CHECKED_IN" + "'", str1, "CHECKED_IN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CHECKED_IN" + "'", str2, "CHECKED_IN");
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "CHECKED_IN" + "'", str17, "CHECKED_IN");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "CHECKED_IN" + "'", str18, "CHECKED_IN");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "CHECKED_IN" + "'", str19, "CHECKED_IN");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNull(localTime30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
        Model.User.EventCoordinator eventCoordinator0 = Model.User.EventCoordinator.getInstance();
        java.lang.String str1 = eventCoordinator0.getChiefEventCoordinatorPassword();
        java.lang.String str2 = eventCoordinator0.getChiefEventCoordinatorName();
        java.lang.String str3 = eventCoordinator0.getChiefEventCoordinatorEmail();
        org.junit.Assert.assertNotNull(eventCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!Password123" + "'", str1, "!Password123");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "John Smith" + "'", str2, "John Smith");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jsmith@yorku.ca" + "'", str3, "jsmith@yorku.ca");
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
        Repository.SensorRepository sensorRepository0 = new Repository.SensorRepository();
        java.util.List<Model.Sensor.OccupancySensorData> occupancySensorDataList1 = sensorRepository0.getOccupancySensorLogsList();
        Model.Sensor.ScanIDSensorData scanIDSensorData2 = null;
        boolean boolean3 = sensorRepository0.writeScanIDSensorLog(scanIDSensorData2);
        Model.Sensor.OccupancySensor occupancySensor9 = new Model.Sensor.OccupancySensor("", "1", "1", "EECS3311 Course Project Database - Rooms.csv", true);
        boolean boolean10 = false; // flaky "16) test591(RegressionTest1)": sensorRepository0.writeSensor((Model.Sensor.Sensor) occupancySensor9);
        java.util.List<Model.Sensor.ScanIDSensorData> scanIDSensorDataList11 = sensorRepository0.getScanIDSensorLogsList();
        Model.Sensor.Sensor sensor13 = null; // flaky "11) test591(RegressionTest1)": sensorRepository0.getSensorByID("EECS3311 Course Project Database - Bookings.csv");
        java.time.LocalDateTime localDateTime16 = null;
        Model.Sensor.OccupancySensorData occupancySensorData17 = new Model.Sensor.OccupancySensorData("", "hi!", localDateTime16);
        java.time.LocalDateTime localDateTime18 = null;
        occupancySensorData17.dateTime = localDateTime18;
        boolean boolean20 = false; // flaky "10) test591(RegressionTest1)": sensorRepository0.writeOccupancySensorLog(occupancySensorData17);
        Model.Sensor.Sensor sensor22 = null; // flaky "7) test591(RegressionTest1)": sensorRepository0.getSensorByID("24");
        java.util.List<Model.Sensor.Sensor> sensorList23 = sensorRepository0.getSensorsList();
        java.util.List<Model.Sensor.ScanIDSensorData> scanIDSensorDataList24 = sensorRepository0.getScanIDSensorLogsList();
// flaky "5) test591(RegressionTest1)":         org.junit.Assert.assertNotNull(occupancySensorDataList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "4) test591(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky "4) test591(RegressionTest1)":         org.junit.Assert.assertNotNull(scanIDSensorDataList11);
        org.junit.Assert.assertNull(sensor13);
// flaky "2) test591(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(sensor22);
// flaky "2) test591(RegressionTest1)":         org.junit.Assert.assertNotNull(sensorList23);
// flaky "2) test591(RegressionTest1)":         org.junit.Assert.assertNotNull(scanIDSensorDataList24);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
        Service.GetMaintenanceRequestService getMaintenanceRequestService0 = Service.GetMaintenanceRequestService.getInstance();
        java.util.ArrayList<Model.ServiceRequest.ServiceRequest> serviceRequestList3 = getMaintenanceRequestService0.getServiceRequests(3, false);
        org.junit.Assert.assertNotNull(getMaintenanceRequestService0);
        org.junit.Assert.assertNotNull(serviceRequestList3);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test593");
        Model.ServiceRequest.NonEssentialServiceRequest nonEssentialServiceRequest4 = new Model.ServiceRequest.NonEssentialServiceRequest(15, "1", "24", 0);
        boolean boolean5 = nonEssentialServiceRequest4.isEssential();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test594");
        Model.State.CheckInState checkInState0 = new Model.State.CheckInState();
        java.time.LocalDate localDate4 = null;
        java.time.LocalDate localDate5 = null;
        java.time.LocalTime localTime6 = null;
        java.time.LocalTime localTime7 = null;
        Model.Room.Booking booking9 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate4, localDate5, localTime6, localTime7, "");
        java.time.LocalTime localTime10 = booking9.getStartTime();
        Model.State.CancelledState cancelledState11 = new Model.State.CancelledState();
        booking9.setState((Model.State.BookingState) cancelledState11);
        checkInState0.checkOut(booking9);
        org.junit.Assert.assertNull(localTime10);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
        Model.Payment.Payment payment2 = new Model.Payment.Payment("COMPLETED", (double) 0.0f);
        payment2.completePayment();
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test596");
        Model.User.PartnerUser partnerUser3 = new Model.User.PartnerUser("35", "31", "");
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test597");
        Repository.ServiceRequestRepository serviceRequestRepository0 = Repository.ServiceRequestRepository.getInstance();
        Model.ServiceRequest.SensorEssentialServiceRequest sensorEssentialServiceRequest6 = new Model.ServiceRequest.SensorEssentialServiceRequest(1, "COMPLETED", "Service.AuthenticationException: ", (int) 'a', (int) (short) -1);
        sensorEssentialServiceRequest6.assignRoomID(100);
        java.lang.String str9 = sensorEssentialServiceRequest6.getStatus();
        serviceRequestRepository0.updateExistingServiceRequest((Model.ServiceRequest.ServiceRequest) sensorEssentialServiceRequest6);
        Repository.ServiceRequestRepository serviceRequestRepository11 = Repository.ServiceRequestRepository.getInstance();
        Repository.ServiceRequestRepository serviceRequestRepository12 = Repository.ServiceRequestRepository.getInstance();
        Model.ServiceRequest.SensorEssentialServiceRequest sensorEssentialServiceRequest18 = new Model.ServiceRequest.SensorEssentialServiceRequest(1, "COMPLETED", "Service.AuthenticationException: ", (int) 'a', (int) (short) -1);
        sensorEssentialServiceRequest18.assignRoomID(100);
        java.lang.String str21 = sensorEssentialServiceRequest18.getStatus();
        serviceRequestRepository12.updateExistingServiceRequest((Model.ServiceRequest.ServiceRequest) sensorEssentialServiceRequest18);
        Model.ServiceRequest.SensorEssentialServiceRequest sensorEssentialServiceRequest28 = new Model.ServiceRequest.SensorEssentialServiceRequest((int) (short) 100, "CHECKED_IN", "EECS3311 Course Project Database - Bookings.csv", 0, (int) (byte) 0);
        serviceRequestRepository12.updateExistingServiceRequest((Model.ServiceRequest.ServiceRequest) sensorEssentialServiceRequest28);
        java.util.Map<java.lang.Integer, java.util.List<Model.ServiceRequest.ServiceRequest>> intMap32 = serviceRequestRepository12.parseCsvFileToMap("EECS3311 Course Project Database - Bookings.csv", true);
        boolean boolean34 = serviceRequestRepository11.saveMapToCsv(intMap32, "Service.AuthenticationException: ");
        java.util.Map<java.lang.Integer, java.util.List<Model.ServiceRequest.ServiceRequest>> intMap37 = serviceRequestRepository11.parseCsvFileToMap("14", false);
        java.util.ArrayList<Model.ServiceRequest.ServiceRequest> serviceRequestList39 = serviceRequestRepository11.loadAllServiceRequestsForRoom((int) 'a');
        java.util.ArrayList<Model.ServiceRequest.ServiceRequest> serviceRequestList41 = serviceRequestRepository11.loadAllServiceRequestsForRoom(1);
        java.util.Map<java.lang.Integer, java.util.List<Model.ServiceRequest.ServiceRequest>> intMap44 = serviceRequestRepository11.parseCsvFileToMap("3b878a93-2f8d-4168-99fd-22b8dbe103f1", true);
        boolean boolean46 = serviceRequestRepository0.saveMapToCsv(intMap44, "480fe243-ebb3-46f6-a6cc-09d57def1744");
        Model.ServiceRequest.EssentialServiceRequest essentialServiceRequest51 = new Model.ServiceRequest.EssentialServiceRequest((int) (byte) 0, "src/main/data/users.csv", "src/main/data/users.csv", (int) ' ');
        int int52 = essentialServiceRequest51.getServiceRequestID();
        boolean boolean53 = essentialServiceRequest51.isEssential();
        Model.ServiceRequest.ServiceRequest serviceRequest54 = serviceRequestRepository0.addServiceRequest((Model.ServiceRequest.ServiceRequest) essentialServiceRequest51);
        org.junit.Assert.assertNotNull(serviceRequestRepository0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Service.AuthenticationException: " + "'", str9, "Service.AuthenticationException: ");
        org.junit.Assert.assertNotNull(serviceRequestRepository11);
        org.junit.Assert.assertNotNull(serviceRequestRepository12);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Service.AuthenticationException: " + "'", str21, "Service.AuthenticationException: ");
        org.junit.Assert.assertNotNull(intMap32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(intMap37);
        org.junit.Assert.assertNotNull(serviceRequestList39);
        org.junit.Assert.assertNotNull(serviceRequestList41);
        org.junit.Assert.assertNotNull(intMap44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(serviceRequest54);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test598");
        Repository.BookingRepository bookingRepository0 = Repository.BookingRepository.getInstance();
        java.time.LocalDate localDate4 = null;
        java.time.LocalDate localDate5 = null;
        java.time.LocalTime localTime6 = null;
        java.time.LocalTime localTime7 = null;
        Model.Room.Booking booking9 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate4, localDate5, localTime6, localTime7, "");
        java.lang.String str10 = booking9.getBookingId();
        Model.State.BookingState bookingState11 = null;
        booking9.setState(bookingState11);
        Model.State.CompletedState completedState13 = new Model.State.CompletedState();
        booking9.setState((Model.State.BookingState) completedState13);
        bookingRepository0.save(booking9);
        java.time.LocalTime localTime16 = booking9.getEndTime();
        booking9.performCheckOut();
        org.junit.Assert.assertNotNull(bookingRepository0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(localTime16);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test599");
        Model.ServiceRequest.SensorEssentialServiceRequest sensorEssentialServiceRequest5 = new Model.ServiceRequest.SensorEssentialServiceRequest(1, "COMPLETED", "Service.AuthenticationException: ", (int) 'a', (int) (short) -1);
        sensorEssentialServiceRequest5.assignRoomID(100);
        java.lang.String str8 = sensorEssentialServiceRequest5.getStatus();
        int int9 = sensorEssentialServiceRequest5.getServiceRequestID();
        java.lang.String str10 = sensorEssentialServiceRequest5.getStatus();
        boolean boolean11 = sensorEssentialServiceRequest5.isEssential();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Service.AuthenticationException: " + "'", str8, "Service.AuthenticationException: ");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Service.AuthenticationException: " + "'", str10, "Service.AuthenticationException: ");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test600");
        Model.Sensor.Sensor sensor5 = new Model.Sensor.Sensor("1", "", "src/main/data/users.csv", "hi!", true);
        java.lang.String str6 = sensor5.getRoomID();
        java.lang.String str7 = sensor5.getType();
        sensor5.setStatus("27");
        Model.User.StaffUser staffUser13 = new Model.User.StaffUser("hi!", "", "hi!");
        boolean boolean14 = staffUser13.isVerified();
        Application.SessionData.setCurrentUser((Model.User.User) staffUser13);
        double double16 = staffUser13.getHourlyRate();
        staffUser13.setEmail("4");
        Model.User.AccountType accountType19 = staffUser13.getAccountType();
        boolean boolean20 = sensor5.equals((java.lang.Object) staffUser13);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 40.0d + "'", double16 == 40.0d);
        org.junit.Assert.assertTrue("'" + accountType19 + "' != '" + Model.User.AccountType.STAFF + "'", accountType19.equals(Model.User.AccountType.STAFF));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test601");
        Service.SubmitServiceRequestService submitServiceRequestService0 = Service.SubmitServiceRequestService.getInstance();
        java.util.ArrayList<Model.ServiceRequest.ServiceRequest> serviceRequestList5 = submitServiceRequestService0.submitServiceRequest((int) (byte) -1, "jsmith@yorku.ca", false, "ENABLED");
        org.junit.Assert.assertNotNull(submitServiceRequestService0);
        org.junit.Assert.assertNotNull(serviceRequestList5);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test602");
        Repository.RoomRepository roomRepository0 = new Repository.RoomRepository();
        java.lang.String str1 = roomRepository0.generateNextId();
        java.lang.String str2 = roomRepository0.generateNextId();
        java.lang.String str3 = roomRepository0.generateNextId();
        Model.Room.Room room5 = roomRepository0.findById("src/main/data/users.csv");
        Model.State.RoomEnabledState roomEnabledState6 = new Model.State.RoomEnabledState();
        boolean boolean7 = roomEnabledState6.isBookable();
        Model.State.RoomReadyForEnableState roomReadyForEnableState8 = new Model.State.RoomReadyForEnableState();
        boolean boolean9 = roomReadyForEnableState8.isBookable();
        Model.Room.Room room14 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        roomReadyForEnableState8.disable(room14);
        roomEnabledState6.maintain(room14);
        roomRepository0.save(room14);
        java.util.List<Model.Room.Room> roomList18 = roomRepository0.findAll();
// flaky "17) test602(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "79" + "'", str1, "79");
// flaky "12) test602(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "79" + "'", str2, "79");
// flaky "11) test602(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "79" + "'", str3, "79");
        org.junit.Assert.assertNull(room5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(roomList18);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test603");
        Model.ServiceRequest.SensorEssentialServiceRequest sensorEssentialServiceRequest5 = new Model.ServiceRequest.SensorEssentialServiceRequest((int) (short) -1, "4", "hi!", (-1), (int) ' ');
        sensorEssentialServiceRequest5.setDescription("src/main/data/scanid_sensor_logs.csv");
        int int8 = sensorEssentialServiceRequest5.getServiceRequestID();
        java.lang.String str9 = sensorEssentialServiceRequest5.getDescription();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "src/main/data/scanid_sensor_logs.csv" + "'", str9, "src/main/data/scanid_sensor_logs.csv");
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test604");
        java.time.LocalDateTime localDateTime4 = null;
        Model.Sensor.ScanIDSensorData scanIDSensorData5 = new Model.Sensor.ScanIDSensorData("512a0e7c-3268-4bb7-bc77-c6d32a14e20d", "25", "28", "jsmith@yorku.ca", localDateTime4);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test605");
        Service.RoomService roomService0 = new Service.RoomService();
        Model.Room.Booking booking2 = roomService0.getBookingDetails("hi!");
        roomService0.maintenanceCompleted("John Smith");
        Model.Room.Booking booking6 = roomService0.getBookingDetails("67");
        org.junit.Assert.assertNull(booking2);
        org.junit.Assert.assertNull(booking6);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test606");
        Model.State.RoomDisabledState roomDisabledState0 = new Model.State.RoomDisabledState();
        boolean boolean1 = roomDisabledState0.isBookable();
        Model.State.RoomReadyForEnableState roomReadyForEnableState2 = new Model.State.RoomReadyForEnableState();
        boolean boolean3 = roomReadyForEnableState2.isBookable();
        Model.Room.Room room8 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        roomReadyForEnableState2.disable(room8);
        roomDisabledState0.enable(room8);
        Model.State.RoomState roomState11 = room8.getState();
        java.lang.String str12 = room8.getLocation();
        room8.performMaintenance();
        java.lang.String str14 = room8.getRoomId();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(roomState11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "COMPLETED" + "'", str14, "COMPLETED");
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test607");
        Model.State.CompletedState completedState0 = new Model.State.CompletedState();
        java.time.LocalDate localDate4 = null;
        java.time.LocalDate localDate5 = null;
        java.time.LocalTime localTime6 = null;
        java.time.LocalTime localTime7 = null;
        Model.Room.Booking booking9 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate4, localDate5, localTime6, localTime7, "");
        completedState0.checkOut(booking9);
        java.lang.String str11 = completedState0.getStatus();
        java.lang.String str12 = completedState0.getStatus();
        Model.State.CheckInState checkInState13 = new Model.State.CheckInState();
        java.lang.String str14 = checkInState13.getStatus();
        java.lang.String str15 = checkInState13.getStatus();
        java.lang.String str16 = checkInState13.getStatus();
        Model.State.CheckInState checkInState17 = new Model.State.CheckInState();
        java.lang.String str18 = checkInState17.getStatus();
        java.lang.String str19 = checkInState17.getStatus();
        Model.State.CompletedState completedState20 = new Model.State.CompletedState();
        java.time.LocalDate localDate24 = null;
        java.time.LocalDate localDate25 = null;
        java.time.LocalTime localTime26 = null;
        java.time.LocalTime localTime27 = null;
        Model.Room.Booking booking29 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate24, localDate25, localTime26, localTime27, "");
        completedState20.checkOut(booking29);
        java.time.LocalDate localDate31 = booking29.getEndDate();
        checkInState17.cancel(booking29);
        Model.State.CompletedState completedState33 = new Model.State.CompletedState();
        java.time.LocalDate localDate37 = null;
        java.time.LocalDate localDate38 = null;
        java.time.LocalTime localTime39 = null;
        java.time.LocalTime localTime40 = null;
        Model.Room.Booking booking42 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate37, localDate38, localTime39, localTime40, "");
        completedState33.checkOut(booking42);
        java.time.LocalDate localDate47 = null;
        java.time.LocalDate localDate48 = null;
        java.time.LocalTime localTime49 = null;
        java.time.LocalTime localTime50 = null;
        Model.Room.Booking booking52 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate47, localDate48, localTime49, localTime50, "");
        completedState33.checkOut(booking52);
        checkInState17.checkOut(booking52);
        checkInState13.checkOut(booking52);
        completedState0.cancel(booking52);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "COMPLETED" + "'", str11, "COMPLETED");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "COMPLETED" + "'", str12, "COMPLETED");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "CHECKED_IN" + "'", str14, "CHECKED_IN");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "CHECKED_IN" + "'", str15, "CHECKED_IN");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "CHECKED_IN" + "'", str16, "CHECKED_IN");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "CHECKED_IN" + "'", str18, "CHECKED_IN");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "CHECKED_IN" + "'", str19, "CHECKED_IN");
        org.junit.Assert.assertNull(localDate31);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test608");
        java.time.LocalDateTime localDateTime2 = null;
        Model.Sensor.OccupancySensorData occupancySensorData3 = new Model.Sensor.OccupancySensorData("", "hi!", localDateTime2);
        java.time.LocalDateTime localDateTime4 = occupancySensorData3.getLocalDateTime();
        java.lang.String str5 = occupancySensorData3.sensorID;
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test609");
        Model.State.RoomDisabledState roomDisabledState0 = new Model.State.RoomDisabledState();
        boolean boolean1 = roomDisabledState0.isBookable();
        boolean boolean2 = roomDisabledState0.isBookable();
        boolean boolean3 = roomDisabledState0.isBookable();
        Model.Room.Room room8 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        boolean boolean9 = room8.isAvailable();
        roomDisabledState0.maintain(room8);
        boolean boolean11 = roomDisabledState0.isBookable();
        Model.State.RoomReadyForEnableState roomReadyForEnableState12 = new Model.State.RoomReadyForEnableState();
        boolean boolean13 = roomReadyForEnableState12.isBookable();
        java.lang.String str14 = roomReadyForEnableState12.getStateName();
        boolean boolean15 = roomReadyForEnableState12.isBookable();
        Model.State.RoomDisabledState roomDisabledState16 = new Model.State.RoomDisabledState();
        boolean boolean17 = roomDisabledState16.isBookable();
        boolean boolean18 = roomDisabledState16.isBookable();
        boolean boolean19 = roomDisabledState16.isBookable();
        Model.Room.Room room24 = new Model.Room.Room("COMPLETED", "hi!", (double) 100.0f, "2");
        roomDisabledState16.maintain(room24);
        Model.Room.Room room30 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        roomDisabledState16.enable(room30);
        roomReadyForEnableState12.enable(room30);
        boolean boolean33 = roomReadyForEnableState12.isBookable();
        Model.Room.Room room34 = null;
        roomReadyForEnableState12.maintain(room34);
        boolean boolean36 = roomReadyForEnableState12.isBookable();
        Model.State.RoomDisabledState roomDisabledState37 = new Model.State.RoomDisabledState();
        boolean boolean38 = roomDisabledState37.isBookable();
        boolean boolean39 = roomDisabledState37.isBookable();
        boolean boolean40 = roomDisabledState37.isBookable();
        Model.State.RoomDisabledState roomDisabledState41 = new Model.State.RoomDisabledState();
        boolean boolean42 = roomDisabledState41.isBookable();
        boolean boolean43 = roomDisabledState41.isBookable();
        Model.State.RoomEnabledState roomEnabledState44 = new Model.State.RoomEnabledState();
        Model.Room.Room room49 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        boolean boolean50 = room49.isAvailable();
        Model.Room.AdminRoomProxy adminRoomProxy51 = new Model.Room.AdminRoomProxy(room49);
        roomEnabledState44.disable(room49);
        roomDisabledState41.enable(room49);
        Model.State.RoomDisabledState roomDisabledState54 = new Model.State.RoomDisabledState();
        boolean boolean55 = roomDisabledState54.isBookable();
        boolean boolean56 = roomDisabledState54.isBookable();
        Model.State.RoomEnabledState roomEnabledState57 = new Model.State.RoomEnabledState();
        Model.Room.Room room62 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        boolean boolean63 = room62.isAvailable();
        Model.Room.AdminRoomProxy adminRoomProxy64 = new Model.Room.AdminRoomProxy(room62);
        roomEnabledState57.disable(room62);
        roomDisabledState54.enable(room62);
        roomDisabledState41.maintain(room62);
        roomDisabledState37.disable(room62);
        roomReadyForEnableState12.disable(room62);
        roomDisabledState0.enable(room62);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "READY_FOR_ENABLE" + "'", str14, "READY_FOR_ENABLE");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test610");
        Repository.ServiceRequestRepository serviceRequestRepository0 = Repository.ServiceRequestRepository.getInstance();
        Model.ServiceRequest.SensorEssentialServiceRequest sensorEssentialServiceRequest6 = new Model.ServiceRequest.SensorEssentialServiceRequest(1, "COMPLETED", "Service.AuthenticationException: ", (int) 'a', (int) (short) -1);
        sensorEssentialServiceRequest6.assignRoomID(100);
        java.lang.String str9 = sensorEssentialServiceRequest6.getStatus();
        serviceRequestRepository0.updateExistingServiceRequest((Model.ServiceRequest.ServiceRequest) sensorEssentialServiceRequest6);
        Model.ServiceRequest.SensorEssentialServiceRequest sensorEssentialServiceRequest16 = new Model.ServiceRequest.SensorEssentialServiceRequest((int) (short) 100, "CHECKED_IN", "EECS3311 Course Project Database - Bookings.csv", 0, (int) (byte) 0);
        serviceRequestRepository0.updateExistingServiceRequest((Model.ServiceRequest.ServiceRequest) sensorEssentialServiceRequest16);
        int int18 = sensorEssentialServiceRequest16.getServiceRequestID();
        int int19 = sensorEssentialServiceRequest16.getSensorID();
        org.junit.Assert.assertNotNull(serviceRequestRepository0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Service.AuthenticationException: " + "'", str9, "Service.AuthenticationException: ");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test611");
        Model.User.User user0 = Application.SessionData.getCurrentUser();
        Model.User.AccountType accountType1 = Model.User.AccountType.STUDENT;
        double double2 = accountType1.getHourlyRate();
        user0.setAccountType(accountType1);
        org.junit.Assert.assertNotNull(user0);
        org.junit.Assert.assertTrue("'" + accountType1 + "' != '" + Model.User.AccountType.STUDENT + "'", accountType1.equals(Model.User.AccountType.STUDENT));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test612");
        Model.State.RoomEnabledState roomEnabledState0 = new Model.State.RoomEnabledState();
        Model.Room.Room room5 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        boolean boolean6 = room5.isAvailable();
        Model.Room.AdminRoomProxy adminRoomProxy7 = new Model.Room.AdminRoomProxy(room5);
        roomEnabledState0.disable(room5);
        boolean boolean9 = roomEnabledState0.isBookable();
        boolean boolean10 = roomEnabledState0.isBookable();
        java.lang.String str11 = roomEnabledState0.getStateName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ENABLED" + "'", str11, "ENABLED");
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test613");
        Model.State.CompletedState completedState0 = new Model.State.CompletedState();
        java.time.LocalDate localDate4 = null;
        java.time.LocalDate localDate5 = null;
        java.time.LocalTime localTime6 = null;
        java.time.LocalTime localTime7 = null;
        Model.Room.Booking booking9 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate4, localDate5, localTime6, localTime7, "");
        completedState0.checkOut(booking9);
        Model.State.CheckInState checkInState11 = new Model.State.CheckInState();
        java.time.LocalDate localDate15 = null;
        java.time.LocalDate localDate16 = null;
        java.time.LocalTime localTime17 = null;
        java.time.LocalTime localTime18 = null;
        Model.Room.Booking booking20 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate15, localDate16, localTime17, localTime18, "");
        java.lang.String str21 = booking20.getBookingId();
        checkInState11.checkIn(booking20);
        booking9.setState((Model.State.BookingState) checkInState11);
        java.lang.String str24 = booking9.getRoomId();
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "src/main/data/users.csv" + "'", str24, "src/main/data/users.csv");
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test614");
        Service.RoomService roomService0 = new Service.RoomService();
        roomService0.update(true, (int) (short) 10);
        Model.Room.Booking booking5 = roomService0.getBookingDetails("src/main/data/users.csv");
        boolean boolean7 = roomService0.cancelBooking("hi!");
        Controller.AddRoomController addRoomController8 = new Controller.AddRoomController(roomService0);
        Controller.AdminSelectActionController adminSelectActionController9 = new Controller.AdminSelectActionController(addRoomController8);
        addRoomController8.handleAddRoomSubmission("John Smith", (int) (byte) -1, (double) 0.0f);
        addRoomController8.handleAddRoomSubmission("1", (int) (short) 10, (double) (short) 0);
        org.junit.Assert.assertNull(booking5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test615");
        Model.State.RoomReadyForEnableState roomReadyForEnableState0 = new Model.State.RoomReadyForEnableState();
        boolean boolean1 = roomReadyForEnableState0.isBookable();
        java.lang.String str2 = roomReadyForEnableState0.getStateName();
        boolean boolean3 = roomReadyForEnableState0.isBookable();
        Model.State.RoomDisabledState roomDisabledState4 = new Model.State.RoomDisabledState();
        boolean boolean5 = roomDisabledState4.isBookable();
        boolean boolean6 = roomDisabledState4.isBookable();
        boolean boolean7 = roomDisabledState4.isBookable();
        Model.Room.Room room12 = new Model.Room.Room("COMPLETED", "hi!", (double) 100.0f, "2");
        roomDisabledState4.maintain(room12);
        Model.Room.Room room18 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        roomDisabledState4.enable(room18);
        roomReadyForEnableState0.enable(room18);
        boolean boolean21 = roomReadyForEnableState0.isBookable();
        Model.Room.Room room22 = null;
        roomReadyForEnableState0.maintain(room22);
        boolean boolean24 = roomReadyForEnableState0.isBookable();
        boolean boolean25 = roomReadyForEnableState0.isBookable();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "READY_FOR_ENABLE" + "'", str2, "READY_FOR_ENABLE");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test616");
        Repository.ServiceRequestRepository serviceRequestRepository0 = Repository.ServiceRequestRepository.getInstance();
        java.lang.Integer int2 = serviceRequestRepository0.generateNextId((int) '4');
        Model.ServiceRequest.SensorEssentialServiceRequest sensorEssentialServiceRequest8 = new Model.ServiceRequest.SensorEssentialServiceRequest(1, "COMPLETED", "Service.AuthenticationException: ", (int) 'a', (int) (short) -1);
        sensorEssentialServiceRequest8.assignRoomID(100);
        java.lang.String str11 = sensorEssentialServiceRequest8.getStatus();
        int int12 = sensorEssentialServiceRequest8.getServiceRequestID();
        serviceRequestRepository0.updateExistingServiceRequest((Model.ServiceRequest.ServiceRequest) sensorEssentialServiceRequest8);
        org.junit.Assert.assertNotNull(serviceRequestRepository0);
// flaky "18) test616(RegressionTest1)":         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Service.AuthenticationException: " + "'", str11, "Service.AuthenticationException: ");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test617");
        Service.AuthenticationException authenticationException1 = new Service.AuthenticationException("Service.AuthenticationException: ");
        java.lang.Throwable[] throwableArray2 = authenticationException1.getSuppressed();
        java.lang.Class<?> wildcardClass3 = throwableArray2.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test618");
        Model.ServiceRequest.SensorEssentialServiceRequest sensorEssentialServiceRequest5 = new Model.ServiceRequest.SensorEssentialServiceRequest(1, "COMPLETED", "Service.AuthenticationException: ", (int) 'a', (int) (short) -1);
        sensorEssentialServiceRequest5.assignRoomID(100);
        java.lang.String str8 = sensorEssentialServiceRequest5.getStatus();
        sensorEssentialServiceRequest5.setRoomID(1);
        java.lang.String str11 = sensorEssentialServiceRequest5.getDescription();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Service.AuthenticationException: " + "'", str8, "Service.AuthenticationException: ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "COMPLETED" + "'", str11, "COMPLETED");
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test619");
        Model.State.CancelledState cancelledState0 = new Model.State.CancelledState();
        Model.State.CompletedState completedState1 = new Model.State.CompletedState();
        java.time.LocalDate localDate5 = null;
        java.time.LocalDate localDate6 = null;
        java.time.LocalTime localTime7 = null;
        java.time.LocalTime localTime8 = null;
        Model.Room.Booking booking10 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate5, localDate6, localTime7, localTime8, "");
        completedState1.checkOut(booking10);
        java.lang.String str12 = completedState1.getStatus();
        Model.State.CompletedState completedState13 = new Model.State.CompletedState();
        java.time.LocalDate localDate17 = null;
        java.time.LocalDate localDate18 = null;
        java.time.LocalTime localTime19 = null;
        java.time.LocalTime localTime20 = null;
        Model.Room.Booking booking22 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate17, localDate18, localTime19, localTime20, "");
        completedState13.checkOut(booking22);
        java.time.LocalDate localDate27 = null;
        java.time.LocalDate localDate28 = null;
        java.time.LocalTime localTime29 = null;
        java.time.LocalTime localTime30 = null;
        Model.Room.Booking booking32 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate27, localDate28, localTime29, localTime30, "");
        completedState13.checkOut(booking32);
        completedState1.checkIn(booking32);
        cancelledState0.checkOut(booking32);
        Model.State.CompletedState completedState36 = new Model.State.CompletedState();
        java.time.LocalDate localDate40 = null;
        java.time.LocalDate localDate41 = null;
        java.time.LocalTime localTime42 = null;
        java.time.LocalTime localTime43 = null;
        Model.Room.Booking booking45 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate40, localDate41, localTime42, localTime43, "");
        completedState36.checkOut(booking45);
        java.time.LocalDate localDate50 = null;
        java.time.LocalDate localDate51 = null;
        java.time.LocalTime localTime52 = null;
        java.time.LocalTime localTime53 = null;
        Model.Room.Booking booking55 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate50, localDate51, localTime52, localTime53, "");
        java.lang.String str56 = booking55.getBookingId();
        Model.State.BookingState bookingState57 = null;
        booking55.setState(bookingState57);
        Model.State.CompletedState completedState59 = new Model.State.CompletedState();
        booking55.setState((Model.State.BookingState) completedState59);
        completedState36.checkOut(booking55);
        booking55.performCancel();
        java.time.LocalDate localDate63 = booking55.getEndDate();
        cancelledState0.checkIn(booking55);
        booking55.performCancel();
        java.time.LocalTime localTime66 = booking55.getEndTime();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "COMPLETED" + "'", str12, "COMPLETED");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNull(localDate63);
        org.junit.Assert.assertNull(localTime66);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test620");
        Model.User.StudentUser studentUser3 = new Model.User.StudentUser("src/main/data/users.csv", "src/main/data/scanid_sensor_logs.csv", "");
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test621");
        Repository.ServiceRequestRepository serviceRequestRepository0 = Repository.ServiceRequestRepository.getInstance();
        Model.ServiceRequest.SensorEssentialServiceRequest sensorEssentialServiceRequest6 = new Model.ServiceRequest.SensorEssentialServiceRequest(1, "COMPLETED", "Service.AuthenticationException: ", (int) 'a', (int) (short) -1);
        sensorEssentialServiceRequest6.assignRoomID(100);
        java.lang.String str9 = sensorEssentialServiceRequest6.getStatus();
        serviceRequestRepository0.updateExistingServiceRequest((Model.ServiceRequest.ServiceRequest) sensorEssentialServiceRequest6);
        Model.ServiceRequest.SensorEssentialServiceRequest sensorEssentialServiceRequest16 = new Model.ServiceRequest.SensorEssentialServiceRequest((int) (short) 100, "CHECKED_IN", "EECS3311 Course Project Database - Bookings.csv", 0, (int) (byte) 0);
        serviceRequestRepository0.updateExistingServiceRequest((Model.ServiceRequest.ServiceRequest) sensorEssentialServiceRequest16);
        java.util.Map<java.lang.Integer, java.util.List<Model.ServiceRequest.ServiceRequest>> intMap20 = serviceRequestRepository0.parseCsvFileToMap("EECS3311 Course Project Database - Bookings.csv", true);
        Model.ServiceRequest.SensorEssentialServiceRequest sensorEssentialServiceRequest26 = new Model.ServiceRequest.SensorEssentialServiceRequest((int) (short) -1, "4", "hi!", (-1), (int) ' ');
        sensorEssentialServiceRequest26.setDescription("src/main/data/scanid_sensor_logs.csv");
        int int29 = sensorEssentialServiceRequest26.getServiceRequestID();
        serviceRequestRepository0.updateExistingServiceRequest((Model.ServiceRequest.ServiceRequest) sensorEssentialServiceRequest26);
        sensorEssentialServiceRequest26.setRoomID((-1));
        org.junit.Assert.assertNotNull(serviceRequestRepository0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Service.AuthenticationException: " + "'", str9, "Service.AuthenticationException: ");
        org.junit.Assert.assertNotNull(intMap20);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test622");
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        java.time.LocalTime localTime5 = null;
        java.time.LocalTime localTime6 = null;
        Model.Room.Booking booking8 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate3, localDate4, localTime5, localTime6, "");
        java.lang.String str9 = booking8.getBookingId();
        Model.State.BookingState bookingState10 = null;
        booking8.setState(bookingState10);
        java.time.LocalTime localTime12 = booking8.getEndTime();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(localTime12);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test623");
        Model.User.FacultyUser facultyUser6 = new Model.User.FacultyUser("41", "43", "src/main/data/sensors.csv", "hi!", false, "23");
        facultyUser6.setPassword("49");
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test624");
        Model.Sensor.ScanIDSensor scanIDSensor4 = new Model.Sensor.ScanIDSensor("Service.AuthenticationException: Service.AuthenticationException: ", "COMPLETED", "2", "");
        Controller.AdminServiceRequestController adminServiceRequestController5 = new Controller.AdminServiceRequestController();
        adminServiceRequestController5.handleAddServiceRequest("4", false, "src/main/data/occupancy_sensor_logs.csv");
        adminServiceRequestController5.handleAddServiceRequest("STAFF", true, "1");
        boolean boolean14 = scanIDSensor4.equals((java.lang.Object) adminServiceRequestController5);
        java.util.ArrayList<Model.ServiceRequest.ServiceRequest> serviceRequestList15 = adminServiceRequestController5.handleServiceRequestListCompilation();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(serviceRequestList15);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test625");
        View.GuestSelectActionView guestSelectActionView0 = null;
        Service.EvaluateRoomMaintenanceRelationshipService evaluateRoomMaintenanceRelationshipService1 = Service.EvaluateRoomMaintenanceRelationshipService.getInstance();
        evaluateRoomMaintenanceRelationshipService1.notifyObservers();
        Service.RoomService roomService3 = new Service.RoomService();
        roomService3.update(true, (int) (short) 10);
        Model.Room.Booking booking8 = roomService3.getBookingDetails("src/main/data/users.csv");
        boolean boolean10 = roomService3.cancelBooking("hi!");
        Controller.AddRoomController addRoomController11 = new Controller.AddRoomController(roomService3);
        evaluateRoomMaintenanceRelationshipService1.removeObserver((Model.Room.Observer) roomService3);
        Service.RoomService roomService13 = new Service.RoomService();
        roomService13.maintenanceCompleted("");
        evaluateRoomMaintenanceRelationshipService1.removeObserver((Model.Room.Observer) roomService13);
        evaluateRoomMaintenanceRelationshipService1.evaluateRoomMaintenanceRelationship((int) (short) 1);
        Service.RoomService roomService19 = new Service.RoomService();
        roomService19.update(true, (int) (short) 10);
        boolean boolean24 = roomService19.performCheckOut("hi!");
        java.lang.String str28 = roomService19.createRoom("", (double) '4', "src/main/data/users.csv");
        Service.RoomService roomService29 = roomService19.getInstance();
        Controller.AddRoomController addRoomController30 = new Controller.AddRoomController(roomService29);
        evaluateRoomMaintenanceRelationshipService1.registerObserver((Model.Room.Observer) roomService29);
        evaluateRoomMaintenanceRelationshipService1.notifyObservers();
        Service.RoomService roomService33 = new Service.RoomService();
        roomService33.update(true, (int) (short) 10);
        Model.Room.Booking booking38 = roomService33.getBookingDetails("src/main/data/users.csv");
        boolean boolean40 = roomService33.cancelBooking("hi!");
        roomService33.disableRoom("hi!");
        Service.RoomService roomService43 = roomService33.getInstance();
        evaluateRoomMaintenanceRelationshipService1.registerObserver((Model.Room.Observer) roomService33);
        // The following exception was thrown during execution in test generation
        try {
            Controller.GuestSelectActionController guestSelectActionController45 = new Controller.GuestSelectActionController(guestSelectActionView0, (java.lang.Object) roomService33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"availableRoomsButton\" because \"view\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evaluateRoomMaintenanceRelationshipService1);
        org.junit.Assert.assertNull(booking8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
// flaky "19) test625(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "81" + "'", str28, "81");
        org.junit.Assert.assertNotNull(roomService29);
        org.junit.Assert.assertNull(booking38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(roomService43);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test626");
        Repository.ServiceRequestRepository serviceRequestRepository0 = Repository.ServiceRequestRepository.getInstance();
        Repository.ServiceRequestRepository serviceRequestRepository1 = Repository.ServiceRequestRepository.getInstance();
        Model.ServiceRequest.SensorEssentialServiceRequest sensorEssentialServiceRequest7 = new Model.ServiceRequest.SensorEssentialServiceRequest(1, "COMPLETED", "Service.AuthenticationException: ", (int) 'a', (int) (short) -1);
        sensorEssentialServiceRequest7.assignRoomID(100);
        java.lang.String str10 = sensorEssentialServiceRequest7.getStatus();
        serviceRequestRepository1.updateExistingServiceRequest((Model.ServiceRequest.ServiceRequest) sensorEssentialServiceRequest7);
        Model.ServiceRequest.SensorEssentialServiceRequest sensorEssentialServiceRequest17 = new Model.ServiceRequest.SensorEssentialServiceRequest((int) (short) 100, "CHECKED_IN", "EECS3311 Course Project Database - Bookings.csv", 0, (int) (byte) 0);
        serviceRequestRepository1.updateExistingServiceRequest((Model.ServiceRequest.ServiceRequest) sensorEssentialServiceRequest17);
        java.util.Map<java.lang.Integer, java.util.List<Model.ServiceRequest.ServiceRequest>> intMap21 = serviceRequestRepository1.parseCsvFileToMap("EECS3311 Course Project Database - Bookings.csv", true);
        boolean boolean23 = serviceRequestRepository0.saveMapToCsv(intMap21, "Service.AuthenticationException: ");
        Model.ServiceRequest.SensorEssentialServiceRequest sensorEssentialServiceRequest29 = new Model.ServiceRequest.SensorEssentialServiceRequest(1, "COMPLETED", "Service.AuthenticationException: ", (int) 'a', (int) (short) -1);
        sensorEssentialServiceRequest29.assignRoomID(100);
        java.lang.String str32 = sensorEssentialServiceRequest29.getStatus();
        sensorEssentialServiceRequest29.assignRoomID((int) (byte) 1);
        sensorEssentialServiceRequest29.setStatus("CHECKED_IN");
        Model.ServiceRequest.ServiceRequest serviceRequest37 = serviceRequestRepository0.addServiceRequest((Model.ServiceRequest.ServiceRequest) sensorEssentialServiceRequest29);
        boolean boolean38 = sensorEssentialServiceRequest29.isEssential();
        int int39 = sensorEssentialServiceRequest29.getServiceRequestID();
        org.junit.Assert.assertNotNull(serviceRequestRepository0);
        org.junit.Assert.assertNotNull(serviceRequestRepository1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Service.AuthenticationException: " + "'", str10, "Service.AuthenticationException: ");
        org.junit.Assert.assertNotNull(intMap21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Service.AuthenticationException: " + "'", str32, "Service.AuthenticationException: ");
        org.junit.Assert.assertNotNull(serviceRequest37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test627");
        Model.Room.Room room4 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        Model.Room.GuestRoomProxy guestRoomProxy5 = new Model.Room.GuestRoomProxy(room4);
        java.lang.String str6 = guestRoomProxy5.getRoomId();
        java.lang.String str7 = guestRoomProxy5.getRoomId();
        java.lang.String str8 = guestRoomProxy5.getRoomId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "COMPLETED" + "'", str6, "COMPLETED");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "COMPLETED" + "'", str7, "COMPLETED");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "COMPLETED" + "'", str8, "COMPLETED");
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test628");
        Model.State.RoomDisabledState roomDisabledState0 = new Model.State.RoomDisabledState();
        boolean boolean1 = roomDisabledState0.isBookable();
        boolean boolean2 = roomDisabledState0.isBookable();
        boolean boolean3 = roomDisabledState0.isBookable();
        Model.Room.Room room8 = new Model.Room.Room("COMPLETED", "hi!", (double) 100.0f, "2");
        roomDisabledState0.maintain(room8);
        room8.requestEnable();
        java.lang.String str11 = room8.getLocation();
        Model.State.RoomState roomState12 = room8.getState();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(roomState12);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test629");
        View.CheckoutView checkoutView0 = null;
        Service.RoomService roomService1 = new Service.RoomService();
        roomService1.maintenanceCompleted("");
        boolean boolean5 = roomService1.performCheckOut("");
        Service.SensorService sensorService6 = new Service.SensorService();
        Model.Sensor.Sensor sensor9 = null; // flaky "20) test629(RegressionTest1)": sensorService6.getSensorByRoomID("src/main/data/users.csv", "EECS3311 Course Project Database - Bookings.csv");
        boolean boolean13 = false; // flaky "13) test629(RegressionTest1)": sensorService6.addScanIDSensorData("EECS3311 Course Project Database - Rooms.csv", "src/main/data/scanid_sensor_logs.csv", "hi!");
        Model.Sensor.Sensor sensor16 = null; // flaky "12) test629(RegressionTest1)": sensorService6.getSensorByRoomID("38", "CHECKED_IN");
        // The following exception was thrown during execution in test generation
        try {
            Controller.CheckoutController checkoutController17 = new Controller.CheckoutController(checkoutView0, roomService1, sensorService6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"backButton\" because \"this.view\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(sensor9);
// flaky "8) test629(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(sensor16);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test630");
        Model.State.CheckInState checkInState0 = new Model.State.CheckInState();
        java.time.LocalDate localDate4 = null;
        java.time.LocalDate localDate5 = null;
        java.time.LocalTime localTime6 = null;
        java.time.LocalTime localTime7 = null;
        Model.Room.Booking booking9 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate4, localDate5, localTime6, localTime7, "");
        java.lang.String str10 = booking9.getBookingId();
        checkInState0.checkIn(booking9);
        Model.State.CancelledState cancelledState12 = new Model.State.CancelledState();
        Model.State.CompletedState completedState13 = new Model.State.CompletedState();
        java.time.LocalDate localDate17 = null;
        java.time.LocalDate localDate18 = null;
        java.time.LocalTime localTime19 = null;
        java.time.LocalTime localTime20 = null;
        Model.Room.Booking booking22 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate17, localDate18, localTime19, localTime20, "");
        completedState13.checkOut(booking22);
        java.lang.String str24 = completedState13.getStatus();
        Model.State.CompletedState completedState25 = new Model.State.CompletedState();
        java.time.LocalDate localDate29 = null;
        java.time.LocalDate localDate30 = null;
        java.time.LocalTime localTime31 = null;
        java.time.LocalTime localTime32 = null;
        Model.Room.Booking booking34 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate29, localDate30, localTime31, localTime32, "");
        completedState25.checkOut(booking34);
        java.time.LocalDate localDate39 = null;
        java.time.LocalDate localDate40 = null;
        java.time.LocalTime localTime41 = null;
        java.time.LocalTime localTime42 = null;
        Model.Room.Booking booking44 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate39, localDate40, localTime41, localTime42, "");
        completedState25.checkOut(booking44);
        completedState13.checkIn(booking44);
        cancelledState12.checkOut(booking44);
        Model.State.CompletedState completedState48 = new Model.State.CompletedState();
        java.time.LocalDate localDate52 = null;
        java.time.LocalDate localDate53 = null;
        java.time.LocalTime localTime54 = null;
        java.time.LocalTime localTime55 = null;
        Model.Room.Booking booking57 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate52, localDate53, localTime54, localTime55, "");
        completedState48.checkOut(booking57);
        java.time.LocalDate localDate62 = null;
        java.time.LocalDate localDate63 = null;
        java.time.LocalTime localTime64 = null;
        java.time.LocalTime localTime65 = null;
        Model.Room.Booking booking67 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate62, localDate63, localTime64, localTime65, "");
        java.lang.String str68 = booking67.getBookingId();
        Model.State.BookingState bookingState69 = null;
        booking67.setState(bookingState69);
        Model.State.CompletedState completedState71 = new Model.State.CompletedState();
        booking67.setState((Model.State.BookingState) completedState71);
        completedState48.checkOut(booking67);
        booking67.performCheckOut();
        java.lang.String str75 = booking67.getBookingId();
        cancelledState12.checkOut(booking67);
        checkInState0.cancel(booking67);
        booking67.setPaymentId("");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "COMPLETED" + "'", str24, "COMPLETED");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test631");
        Model.User.FacultyUser facultyUser3 = new Model.User.FacultyUser("CANCELLED", "49", "src/main/data/scanid_sensor_logs.csv");
        Model.User.StudentUser studentUser10 = new Model.User.StudentUser("9", "src/main/data/MaintenanceRequests.csv", "src/main/data/MaintenanceRequests.csv", "John Smith", false, "3");
        Model.User.AccountType accountType11 = studentUser10.getAccountType();
        facultyUser3.setAccountType(accountType11);
        org.junit.Assert.assertTrue("'" + accountType11 + "' != '" + Model.User.AccountType.STUDENT + "'", accountType11.equals(Model.User.AccountType.STUDENT));
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test632");
        Model.Sensor.OccupancySensor occupancySensor5 = new Model.Sensor.OccupancySensor("", "1", "1", "EECS3311 Course Project Database - Rooms.csv", true);
        java.lang.String str6 = occupancySensor5.getType();
        java.lang.String str7 = occupancySensor5.getType();
        java.lang.String str8 = occupancySensor5.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1" + "'", str6, "1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1" + "'", str7, "1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test633");
        Repository.SensorRepository sensorRepository0 = new Repository.SensorRepository();
        java.util.List<Model.Sensor.OccupancySensorData> occupancySensorDataList1 = sensorRepository0.getOccupancySensorLogsList();
        java.time.LocalDateTime localDateTime4 = null;
        Model.Sensor.OccupancySensorData occupancySensorData5 = new Model.Sensor.OccupancySensorData("", "hi!", localDateTime4);
        java.time.LocalDateTime localDateTime6 = null;
        occupancySensorData5.dateTime = localDateTime6;
        boolean boolean8 = false; // flaky "21) test633(RegressionTest1)": sensorRepository0.writeOccupancySensorLog(occupancySensorData5);
        Service.RoomService roomService9 = new Service.RoomService();
        boolean boolean10 = occupancySensorData5.equals((java.lang.Object) roomService9);
        Model.Room.Booking booking12 = roomService9.getBookingDetails("67");
// flaky "14) test633(RegressionTest1)":         org.junit.Assert.assertNotNull(occupancySensorDataList1);
// flaky "13) test633(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(booking12);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test634");
        Model.State.RoomEnabledState roomEnabledState0 = new Model.State.RoomEnabledState();
        Model.State.RoomReadyForEnableState roomReadyForEnableState1 = new Model.State.RoomReadyForEnableState();
        Model.State.RoomEnabledState roomEnabledState2 = new Model.State.RoomEnabledState();
        boolean boolean3 = roomEnabledState2.isBookable();
        Model.State.RoomReadyForEnableState roomReadyForEnableState4 = new Model.State.RoomReadyForEnableState();
        boolean boolean5 = roomReadyForEnableState4.isBookable();
        Model.Room.Room room10 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        roomReadyForEnableState4.disable(room10);
        roomEnabledState2.maintain(room10);
        roomReadyForEnableState1.maintain(room10);
        roomEnabledState0.disable(room10);
        Model.Room.Room room19 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        boolean boolean20 = room19.isAvailable();
        Model.State.RoomState roomState21 = room19.getState();
        roomEnabledState0.disable(room19);
        java.lang.String str23 = roomEnabledState0.getStateName();
        Model.State.RoomDisabledState roomDisabledState24 = new Model.State.RoomDisabledState();
        boolean boolean25 = roomDisabledState24.isBookable();
        Model.State.RoomReadyForEnableState roomReadyForEnableState26 = new Model.State.RoomReadyForEnableState();
        boolean boolean27 = roomReadyForEnableState26.isBookable();
        Model.Room.Room room32 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        roomReadyForEnableState26.disable(room32);
        roomDisabledState24.enable(room32);
        Model.State.RoomState roomState35 = room32.getState();
        roomEnabledState0.disable(room32);
        java.lang.String str37 = roomEnabledState0.getStateName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(roomState21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "ENABLED" + "'", str23, "ENABLED");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(roomState35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "ENABLED" + "'", str37, "ENABLED");
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test635");
        Service.EvaluateRoomMaintenanceRelationshipService evaluateRoomMaintenanceRelationshipService0 = Service.EvaluateRoomMaintenanceRelationshipService.getInstance();
        evaluateRoomMaintenanceRelationshipService0.notifyObservers();
        Service.RoomService roomService2 = new Service.RoomService();
        roomService2.update(true, (int) (short) 10);
        Model.Room.Booking booking7 = roomService2.getBookingDetails("src/main/data/users.csv");
        boolean boolean9 = roomService2.cancelBooking("hi!");
        Controller.AddRoomController addRoomController10 = new Controller.AddRoomController(roomService2);
        evaluateRoomMaintenanceRelationshipService0.removeObserver((Model.Room.Observer) roomService2);
        Service.RoomService roomService12 = new Service.RoomService();
        roomService12.maintenanceCompleted("");
        evaluateRoomMaintenanceRelationshipService0.removeObserver((Model.Room.Observer) roomService12);
        Service.RoomService roomService16 = roomService12.getInstance();
        boolean boolean18 = roomService16.cancelBooking("57197862-2463-4972-b3b2-977245133f34");
        roomService16.savePayment("72", (double) 1L);
        org.junit.Assert.assertNotNull(evaluateRoomMaintenanceRelationshipService0);
        org.junit.Assert.assertNull(booking7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(roomService16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test636");
        Model.User.StudentUser studentUser6 = new Model.User.StudentUser("hi!", "", "", "src/main/data/users.csv", false, "src/main/data/users.csv");
        java.lang.String str7 = studentUser6.getEmail();
        Application.SessionData.setCurrentUser((Model.User.User) studentUser6);
        studentUser6.setPassword("DISABLED");
        boolean boolean11 = studentUser6.isVerified();
        Model.User.AccountType accountType12 = studentUser6.getAccountType();
        java.lang.String str13 = studentUser6.getRole();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + accountType12 + "' != '" + Model.User.AccountType.STUDENT + "'", accountType12.equals(Model.User.AccountType.STUDENT));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "src/main/data/users.csv" + "'", str13, "src/main/data/users.csv");
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test637");
        Model.State.CompletedState completedState0 = new Model.State.CompletedState();
        java.time.LocalDate localDate4 = null;
        java.time.LocalDate localDate5 = null;
        java.time.LocalTime localTime6 = null;
        java.time.LocalTime localTime7 = null;
        Model.Room.Booking booking9 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate4, localDate5, localTime6, localTime7, "");
        completedState0.checkOut(booking9);
        java.lang.String str11 = completedState0.getStatus();
        Model.State.CompletedState completedState12 = new Model.State.CompletedState();
        java.time.LocalDate localDate16 = null;
        java.time.LocalDate localDate17 = null;
        java.time.LocalTime localTime18 = null;
        java.time.LocalTime localTime19 = null;
        Model.Room.Booking booking21 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate16, localDate17, localTime18, localTime19, "");
        completedState12.checkOut(booking21);
        java.time.LocalDate localDate26 = null;
        java.time.LocalDate localDate27 = null;
        java.time.LocalTime localTime28 = null;
        java.time.LocalTime localTime29 = null;
        Model.Room.Booking booking31 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate26, localDate27, localTime28, localTime29, "");
        completedState12.checkOut(booking31);
        completedState0.checkIn(booking31);
        java.time.LocalDate localDate37 = null;
        java.time.LocalDate localDate38 = null;
        java.time.LocalTime localTime39 = null;
        java.time.LocalTime localTime40 = null;
        Model.Room.Booking booking42 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate37, localDate38, localTime39, localTime40, "");
        completedState0.checkOut(booking42);
        Model.State.CheckInState checkInState44 = new Model.State.CheckInState();
        java.lang.String str45 = checkInState44.getStatus();
        java.lang.String str46 = checkInState44.getStatus();
        java.lang.String str47 = checkInState44.getStatus();
        java.time.LocalDate localDate51 = null;
        java.time.LocalDate localDate52 = null;
        java.time.LocalTime localTime53 = null;
        java.time.LocalTime localTime54 = null;
        Model.Room.Booking booking56 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate51, localDate52, localTime53, localTime54, "");
        java.lang.String str57 = booking56.getBookingId();
        java.time.LocalTime localTime58 = booking56.getStartTime();
        checkInState44.cancel(booking56);
        completedState0.checkIn(booking56);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "COMPLETED" + "'", str11, "COMPLETED");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "CHECKED_IN" + "'", str45, "CHECKED_IN");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "CHECKED_IN" + "'", str46, "CHECKED_IN");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "CHECKED_IN" + "'", str47, "CHECKED_IN");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNull(localTime58);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test638");
        Service.RoomService roomService0 = new Service.RoomService();
        roomService0.update(true, (int) (short) 10);
        Model.Room.Booking booking5 = roomService0.getBookingDetails("src/main/data/users.csv");
        boolean boolean7 = roomService0.cancelBooking("hi!");
        Controller.AddRoomController addRoomController8 = new Controller.AddRoomController(roomService0);
        roomService0.enableRoom("COMPLETED");
        boolean boolean12 = roomService0.cancelBooking("480fe243-ebb3-46f6-a6cc-09d57def1744");
        org.junit.Assert.assertNull(booking5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test639");
        Model.State.RoomEnabledState roomEnabledState0 = new Model.State.RoomEnabledState();
        boolean boolean1 = roomEnabledState0.isBookable();
        Model.State.RoomReadyForEnableState roomReadyForEnableState2 = new Model.State.RoomReadyForEnableState();
        boolean boolean3 = roomReadyForEnableState2.isBookable();
        Model.Room.Room room8 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        roomReadyForEnableState2.disable(room8);
        roomEnabledState0.maintain(room8);
        room8.performMaintenance();
        Model.State.RoomState roomState12 = room8.getState();
        java.lang.String str13 = room8.getRoomId();
        room8.performMaintenance();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(roomState12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "COMPLETED" + "'", str13, "COMPLETED");
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test640");
        Model.State.RoomDisabledState roomDisabledState0 = new Model.State.RoomDisabledState();
        boolean boolean1 = roomDisabledState0.isBookable();
        boolean boolean2 = roomDisabledState0.isBookable();
        boolean boolean3 = roomDisabledState0.isBookable();
        boolean boolean4 = roomDisabledState0.isBookable();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test641");
        Service.RoomService roomService0 = new Service.RoomService();
        roomService0.update(true, (int) (short) 10);
        Model.Room.Booking booking5 = roomService0.getBookingDetails("src/main/data/users.csv");
        boolean boolean7 = roomService0.cancelBooking("hi!");
        roomService0.disableRoom("hi!");
        roomService0.disableRoom("1");
        Service.RoomService roomService12 = roomService0.getInstance();
        Service.RoomService roomService13 = roomService12.getInstance();
        roomService13.maintenanceCompleted("77");
        org.junit.Assert.assertNull(booking5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(roomService12);
        org.junit.Assert.assertNotNull(roomService13);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test642");
        Model.Room.Room room4 = new Model.Room.Room("44", "COMPLETED", (double) 100.0f, "22");
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test643");
        Model.State.RoomReadyForEnableState roomReadyForEnableState0 = new Model.State.RoomReadyForEnableState();
        Model.Room.Room room5 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        roomReadyForEnableState0.disable(room5);
        boolean boolean7 = roomReadyForEnableState0.isBookable();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test644");
        Service.SensorService sensorService0 = new Service.SensorService();
        Model.Sensor.Sensor sensor3 = null; // flaky "22) test644(RegressionTest1)": sensorService0.getSensorByRoomID("src/main/data/users.csv", "EECS3311 Course Project Database - Bookings.csv");
        boolean boolean7 = sensorService0.addSensor("src/main/data/occupancy_sensor_logs.csv", "COMPLETED", "4");
        Model.Sensor.Sensor sensor10 = null; // flaky "15) test644(RegressionTest1)": sensorService0.getSensorByRoomID("23", "24");
        boolean boolean14 = sensorService0.addSensor("2", "43", "");
        org.junit.Assert.assertNull(sensor3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(sensor10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test645");
        Model.State.RoomReadyForEnableState roomReadyForEnableState0 = new Model.State.RoomReadyForEnableState();
        boolean boolean1 = roomReadyForEnableState0.isBookable();
        java.lang.String str2 = roomReadyForEnableState0.getStateName();
        boolean boolean3 = roomReadyForEnableState0.isBookable();
        Model.State.RoomDisabledState roomDisabledState4 = new Model.State.RoomDisabledState();
        boolean boolean5 = roomDisabledState4.isBookable();
        boolean boolean6 = roomDisabledState4.isBookable();
        boolean boolean7 = roomDisabledState4.isBookable();
        Model.Room.Room room12 = new Model.Room.Room("COMPLETED", "hi!", (double) 100.0f, "2");
        roomDisabledState4.maintain(room12);
        Model.Room.Room room18 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        roomDisabledState4.enable(room18);
        roomReadyForEnableState0.enable(room18);
        boolean boolean21 = roomReadyForEnableState0.isBookable();
        java.lang.String str22 = roomReadyForEnableState0.getStateName();
        Model.State.RoomEnabledState roomEnabledState23 = new Model.State.RoomEnabledState();
        Model.Room.Room room28 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        boolean boolean29 = room28.isAvailable();
        Model.Room.AdminRoomProxy adminRoomProxy30 = new Model.Room.AdminRoomProxy(room28);
        roomEnabledState23.disable(room28);
        boolean boolean32 = roomEnabledState23.isBookable();
        Model.State.RoomEnabledState roomEnabledState33 = new Model.State.RoomEnabledState();
        boolean boolean34 = roomEnabledState33.isBookable();
        Model.State.RoomReadyForEnableState roomReadyForEnableState35 = new Model.State.RoomReadyForEnableState();
        boolean boolean36 = roomReadyForEnableState35.isBookable();
        Model.Room.Room room41 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        roomReadyForEnableState35.disable(room41);
        roomEnabledState33.maintain(room41);
        room41.performMaintenance();
        roomEnabledState23.disable(room41);
        java.lang.String str46 = roomEnabledState23.getStateName();
        Model.State.RoomEnabledState roomEnabledState48 = new Model.State.RoomEnabledState();
        Model.Room.Room room53 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        boolean boolean54 = room53.isAvailable();
        Model.Room.AdminRoomProxy adminRoomProxy55 = new Model.Room.AdminRoomProxy(room53);
        roomEnabledState48.disable(room53);
        Model.Room.RoomProxy roomProxy57 = Model.Room.RoomProxyFactory.getProxy("27", room53);
        roomEnabledState23.enable(room53);
        roomReadyForEnableState0.disable(room53);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "READY_FOR_ENABLE" + "'", str2, "READY_FOR_ENABLE");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "READY_FOR_ENABLE" + "'", str22, "READY_FOR_ENABLE");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "ENABLED" + "'", str46, "ENABLED");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(roomProxy57);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test646");
        Repository.RoomRepository roomRepository0 = Repository.RoomRepository.getInstance();
        Model.Room.Room room2 = roomRepository0.findById("2");
        Model.Room.AdminRoomProxy adminRoomProxy3 = new Model.Room.AdminRoomProxy(room2);
        java.lang.String str4 = adminRoomProxy3.getRoomId();
        org.junit.Assert.assertNotNull(roomRepository0);
        org.junit.Assert.assertNotNull(room2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2" + "'", str4, "2");
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test647");
        java.time.LocalDateTime localDateTime4 = null;
        Model.Sensor.ScanIDSensorData scanIDSensorData5 = new Model.Sensor.ScanIDSensorData("hi!", "22", "EECS3311 Course Project Database - Bookings.csv", "23", localDateTime4);
        java.lang.String str6 = scanIDSensorData5.getLogID();
        java.lang.String str7 = scanIDSensorData5.getUserID();
        java.time.LocalDateTime localDateTime8 = scanIDSensorData5.getLocalDateTime();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EECS3311 Course Project Database - Bookings.csv" + "'", str7, "EECS3311 Course Project Database - Bookings.csv");
        org.junit.Assert.assertNull(localDateTime8);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test648");
        Model.State.RoomReadyForEnableState roomReadyForEnableState0 = new Model.State.RoomReadyForEnableState();
        boolean boolean1 = roomReadyForEnableState0.isBookable();
        java.lang.String str2 = roomReadyForEnableState0.getStateName();
        Model.State.RoomDisabledState roomDisabledState3 = new Model.State.RoomDisabledState();
        boolean boolean4 = roomDisabledState3.isBookable();
        boolean boolean5 = roomDisabledState3.isBookable();
        boolean boolean6 = roomDisabledState3.isBookable();
        Model.Room.Room room11 = new Model.Room.Room("COMPLETED", "hi!", (double) 100.0f, "2");
        roomDisabledState3.maintain(room11);
        Model.Room.Room room17 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        roomDisabledState3.enable(room17);
        roomReadyForEnableState0.disable(room17);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "READY_FOR_ENABLE" + "'", str2, "READY_FOR_ENABLE");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test649");
        Repository.SensorRepository sensorRepository0 = new Repository.SensorRepository();
        java.util.List<Model.Sensor.OccupancySensorData> occupancySensorDataList1 = sensorRepository0.getOccupancySensorLogsList();
        Model.Sensor.OccupancySensorData occupancySensorData2 = null;
        boolean boolean3 = sensorRepository0.writeOccupancySensorLog(occupancySensorData2);
        java.time.LocalDateTime localDateTime8 = null;
        Model.Sensor.ScanIDSensorData scanIDSensorData9 = new Model.Sensor.ScanIDSensorData("20", "29", "23", "35", localDateTime8);
        java.lang.String str10 = scanIDSensorData9.getLogID();
        java.lang.String str11 = scanIDSensorData9.getUserID();
        boolean boolean12 = false; // flaky "23) test649(RegressionTest1)": sensorRepository0.writeScanIDSensorLog(scanIDSensorData9);
// flaky "16) test649(RegressionTest1)":         org.junit.Assert.assertNotNull(occupancySensorDataList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "20" + "'", str10, "20");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "23" + "'", str11, "23");
// flaky "14) test649(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test650");
        Service.RoomService roomService0 = new Service.RoomService();
        roomService0.update(true, (int) (short) 10);
        Model.Room.Booking booking5 = roomService0.getBookingDetails("src/main/data/users.csv");
        boolean boolean7 = roomService0.cancelBooking("hi!");
        Controller.AddRoomController addRoomController8 = new Controller.AddRoomController(roomService0);
        roomService0.enableRoom("COMPLETED");
        Service.RoomService roomService11 = roomService0.getInstance();
        org.junit.Assert.assertNull(booking5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(roomService11);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test651");
        java.time.LocalDateTime localDateTime2 = null;
        Model.Sensor.OccupancySensorData occupancySensorData3 = new Model.Sensor.OccupancySensorData("27", "STAFF", localDateTime2);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test652");
        Service.RoomService roomService0 = new Service.RoomService();
        roomService0.update(true, (int) (short) 10);
        Model.Room.Booking booking5 = roomService0.getBookingDetails("src/main/data/users.csv");
        boolean boolean7 = roomService0.cancelBooking("hi!");
        roomService0.disableRoom("hi!");
        roomService0.disableRoom("1");
        Model.Room.Booking booking13 = roomService0.getBookingDetails("hi!");
        roomService0.enableRoom("src/main/data/MaintenanceRequests.csv");
        boolean boolean17 = roomService0.cancelBooking("READY_FOR_ENABLE");
        org.junit.Assert.assertNull(booking5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(booking13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test653");
        Service.AuthenticationService authenticationService0 = new Service.AuthenticationService();
        boolean boolean2 = authenticationService0.isYorkEmail("Service.AuthenticationException: ");
        boolean boolean4 = authenticationService0.properEmail("31");
        boolean boolean6 = authenticationService0.isYorkEmail("44");
        boolean boolean8 = authenticationService0.properEmail("21");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test654");
        Model.State.CheckInState checkInState0 = new Model.State.CheckInState();
        java.lang.String str1 = checkInState0.getStatus();
        java.lang.String str2 = checkInState0.getStatus();
        java.lang.String str3 = checkInState0.getStatus();
        Model.State.CompletedState completedState4 = new Model.State.CompletedState();
        java.time.LocalDate localDate8 = null;
        java.time.LocalDate localDate9 = null;
        java.time.LocalTime localTime10 = null;
        java.time.LocalTime localTime11 = null;
        Model.Room.Booking booking13 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate8, localDate9, localTime10, localTime11, "");
        completedState4.checkOut(booking13);
        java.time.LocalDate localDate18 = null;
        java.time.LocalDate localDate19 = null;
        java.time.LocalTime localTime20 = null;
        java.time.LocalTime localTime21 = null;
        Model.Room.Booking booking23 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate18, localDate19, localTime20, localTime21, "");
        java.lang.String str24 = booking23.getBookingId();
        Model.State.BookingState bookingState25 = null;
        booking23.setState(bookingState25);
        Model.State.CompletedState completedState27 = new Model.State.CompletedState();
        booking23.setState((Model.State.BookingState) completedState27);
        completedState4.checkOut(booking23);
        Model.State.CheckInState checkInState30 = new Model.State.CheckInState();
        java.lang.String str31 = checkInState30.getStatus();
        java.lang.String str32 = checkInState30.getStatus();
        java.lang.String str33 = checkInState30.getStatus();
        Model.State.CompletedState completedState34 = new Model.State.CompletedState();
        java.time.LocalDate localDate38 = null;
        java.time.LocalDate localDate39 = null;
        java.time.LocalTime localTime40 = null;
        java.time.LocalTime localTime41 = null;
        Model.Room.Booking booking43 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate38, localDate39, localTime40, localTime41, "");
        completedState34.checkOut(booking43);
        java.time.LocalDate localDate45 = booking43.getEndDate();
        checkInState30.checkOut(booking43);
        java.time.LocalDate localDate50 = null;
        java.time.LocalDate localDate51 = null;
        java.time.LocalTime localTime52 = null;
        java.time.LocalTime localTime53 = null;
        Model.Room.Booking booking55 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate50, localDate51, localTime52, localTime53, "");
        checkInState30.checkOut(booking55);
        java.time.LocalTime localTime57 = booking55.getStartTime();
        completedState4.checkIn(booking55);
        checkInState0.cancel(booking55);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CHECKED_IN" + "'", str1, "CHECKED_IN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CHECKED_IN" + "'", str2, "CHECKED_IN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CHECKED_IN" + "'", str3, "CHECKED_IN");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "CHECKED_IN" + "'", str31, "CHECKED_IN");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "CHECKED_IN" + "'", str32, "CHECKED_IN");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "CHECKED_IN" + "'", str33, "CHECKED_IN");
        org.junit.Assert.assertNull(localDate45);
        org.junit.Assert.assertNull(localTime57);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test655");
        Model.Sensor.Sensor sensor5 = new Model.Sensor.Sensor("78", "9", "CONFIRMED", "34", false);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test656");
        Model.Room.Room room4 = new Model.Room.Room("CONFIRMED", "", (double) 4, "EECS3311 Course Project Database - Bookings.csv");
        java.lang.String str5 = room4.getLocation();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test657");
        Model.Sensor.ScanIDSensor scanIDSensor4 = new Model.Sensor.ScanIDSensor("4", "1", "EECS3311 Course Project Database - Rooms.csv", "src/main/data/MaintenanceRequests.csv");
        java.lang.String str5 = scanIDSensor4.getRoomID();
        Model.Payment.Payment payment8 = new Model.Payment.Payment("32", (double) 3);
        boolean boolean9 = scanIDSensor4.equals((java.lang.Object) "32");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "src/main/data/MaintenanceRequests.csv" + "'", str5, "src/main/data/MaintenanceRequests.csv");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test658");
        Service.UserService userService0 = new Service.UserService();
        Model.User.AccountType accountType1 = Model.User.AccountType.PARTNER;
        Model.User.User user5 = userService0.createUser(accountType1, "", "DISABLED", "4");
        Model.User.AccountType accountType6 = Model.User.AccountType.STAFF;
        double double7 = accountType6.getHourlyRate();
        Model.User.User user11 = userService0.createUser(accountType6, "76", "43", "23");
        org.junit.Assert.assertTrue("'" + accountType1 + "' != '" + Model.User.AccountType.PARTNER + "'", accountType1.equals(Model.User.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertTrue("'" + accountType6 + "' != '" + Model.User.AccountType.STAFF + "'", accountType6.equals(Model.User.AccountType.STAFF));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertNotNull(user11);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test659");
        Repository.ServiceRequestRepository serviceRequestRepository0 = Repository.ServiceRequestRepository.getInstance();
        Repository.ServiceRequestRepository serviceRequestRepository1 = Repository.ServiceRequestRepository.getInstance();
        Model.ServiceRequest.SensorEssentialServiceRequest sensorEssentialServiceRequest7 = new Model.ServiceRequest.SensorEssentialServiceRequest(1, "COMPLETED", "Service.AuthenticationException: ", (int) 'a', (int) (short) -1);
        sensorEssentialServiceRequest7.assignRoomID(100);
        java.lang.String str10 = sensorEssentialServiceRequest7.getStatus();
        serviceRequestRepository1.updateExistingServiceRequest((Model.ServiceRequest.ServiceRequest) sensorEssentialServiceRequest7);
        Model.ServiceRequest.SensorEssentialServiceRequest sensorEssentialServiceRequest17 = new Model.ServiceRequest.SensorEssentialServiceRequest((int) (short) 100, "CHECKED_IN", "EECS3311 Course Project Database - Bookings.csv", 0, (int) (byte) 0);
        serviceRequestRepository1.updateExistingServiceRequest((Model.ServiceRequest.ServiceRequest) sensorEssentialServiceRequest17);
        java.util.Map<java.lang.Integer, java.util.List<Model.ServiceRequest.ServiceRequest>> intMap21 = serviceRequestRepository1.parseCsvFileToMap("EECS3311 Course Project Database - Bookings.csv", true);
        boolean boolean23 = serviceRequestRepository0.saveMapToCsv(intMap21, "Service.AuthenticationException: ");
        Model.ServiceRequest.SensorEssentialServiceRequest sensorEssentialServiceRequest29 = new Model.ServiceRequest.SensorEssentialServiceRequest(1, "COMPLETED", "Service.AuthenticationException: ", (int) 'a', (int) (short) -1);
        sensorEssentialServiceRequest29.assignRoomID(100);
        java.lang.String str32 = sensorEssentialServiceRequest29.getStatus();
        sensorEssentialServiceRequest29.assignRoomID((int) (byte) 1);
        sensorEssentialServiceRequest29.setStatus("CHECKED_IN");
        Model.ServiceRequest.ServiceRequest serviceRequest37 = serviceRequestRepository0.addServiceRequest((Model.ServiceRequest.ServiceRequest) sensorEssentialServiceRequest29);
        Repository.ServiceRequestRepository serviceRequestRepository38 = Repository.ServiceRequestRepository.getInstance();
        Model.ServiceRequest.SensorEssentialServiceRequest sensorEssentialServiceRequest44 = new Model.ServiceRequest.SensorEssentialServiceRequest(1, "COMPLETED", "Service.AuthenticationException: ", (int) 'a', (int) (short) -1);
        sensorEssentialServiceRequest44.assignRoomID(100);
        java.lang.String str47 = sensorEssentialServiceRequest44.getStatus();
        serviceRequestRepository38.updateExistingServiceRequest((Model.ServiceRequest.ServiceRequest) sensorEssentialServiceRequest44);
        Model.ServiceRequest.SensorEssentialServiceRequest sensorEssentialServiceRequest54 = new Model.ServiceRequest.SensorEssentialServiceRequest((int) (short) 100, "CHECKED_IN", "EECS3311 Course Project Database - Bookings.csv", 0, (int) (byte) 0);
        serviceRequestRepository38.updateExistingServiceRequest((Model.ServiceRequest.ServiceRequest) sensorEssentialServiceRequest54);
        java.util.Map<java.lang.Integer, java.util.List<Model.ServiceRequest.ServiceRequest>> intMap58 = serviceRequestRepository38.parseCsvFileToMap("EECS3311 Course Project Database - Bookings.csv", true);
        Model.ServiceRequest.NonEssentialServiceRequest nonEssentialServiceRequest63 = new Model.ServiceRequest.NonEssentialServiceRequest((int) 'a', "EECS3311 Course Project Database - Rooms.csv", "3", (int) (byte) -1);
        boolean boolean64 = nonEssentialServiceRequest63.isEssential();
        Model.ServiceRequest.ServiceRequest serviceRequest65 = serviceRequestRepository38.addServiceRequest((Model.ServiceRequest.ServiceRequest) nonEssentialServiceRequest63);
        Model.ServiceRequest.ServiceRequest serviceRequest66 = serviceRequestRepository0.addServiceRequest(serviceRequest65);
        java.lang.Integer int68 = serviceRequestRepository0.generateNextId((int) '4');
        Model.ServiceRequest.SensorEssentialServiceRequest sensorEssentialServiceRequest74 = new Model.ServiceRequest.SensorEssentialServiceRequest(1, "COMPLETED", "Service.AuthenticationException: ", (int) 'a', (int) (short) -1);
        sensorEssentialServiceRequest74.assignRoomID(100);
        sensorEssentialServiceRequest74.assignRoomID((int) (short) 10);
        sensorEssentialServiceRequest74.assignRoomID((int) (byte) -1);
        java.lang.String str81 = sensorEssentialServiceRequest74.getDescription();
        Model.ServiceRequest.ServiceRequest serviceRequest82 = serviceRequestRepository0.addServiceRequest((Model.ServiceRequest.ServiceRequest) sensorEssentialServiceRequest74);
        org.junit.Assert.assertNotNull(serviceRequestRepository0);
        org.junit.Assert.assertNotNull(serviceRequestRepository1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Service.AuthenticationException: " + "'", str10, "Service.AuthenticationException: ");
        org.junit.Assert.assertNotNull(intMap21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Service.AuthenticationException: " + "'", str32, "Service.AuthenticationException: ");
        org.junit.Assert.assertNotNull(serviceRequest37);
        org.junit.Assert.assertNotNull(serviceRequestRepository38);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Service.AuthenticationException: " + "'", str47, "Service.AuthenticationException: ");
        org.junit.Assert.assertNotNull(intMap58);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(serviceRequest65);
        org.junit.Assert.assertNotNull(serviceRequest66);
// flaky "24) test659(RegressionTest1)":         org.junit.Assert.assertTrue("'" + int68 + "' != '" + 2 + "'", int68 == 2);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "COMPLETED" + "'", str81, "COMPLETED");
        org.junit.Assert.assertNotNull(serviceRequest82);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test660");
        Model.Payment.Payment payment2 = new Model.Payment.Payment("", (double) (short) 10);
        java.lang.String str3 = payment2.getPaymentId();
        boolean boolean4 = payment2.isPaid();
        boolean boolean5 = payment2.isPaid();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test661");
        Model.User.StaffUser staffUser6 = new Model.User.StaffUser("", "COMPLETED", "COMPLETED", "DISABLED", true, "3");
        Application.SessionData.setCurrentUser((Model.User.User) staffUser6);
        Model.User.StaffUser staffUser11 = new Model.User.StaffUser("hi!", "", "hi!");
        boolean boolean12 = staffUser11.isVerified();
        Application.SessionData.setCurrentUser((Model.User.User) staffUser11);
        double double14 = staffUser11.getHourlyRate();
        staffUser11.setEmail("4");
        Model.User.AccountType accountType17 = staffUser11.getAccountType();
        staffUser6.setAccountType(accountType17);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertTrue("'" + accountType17 + "' != '" + Model.User.AccountType.STAFF + "'", accountType17.equals(Model.User.AccountType.STAFF));
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test662");
        Model.User.PartnerUser partnerUser6 = new Model.User.PartnerUser("9", "Service.AuthenticationException: ", "Service.AuthenticationException: ", "7", true, "1");
        Service.UserService userService7 = new Service.UserService();
        Model.User.AccountType accountType8 = Model.User.AccountType.PARTNER;
        Model.User.User user12 = userService7.createUser(accountType8, "src/main/data/scanid_sensor_logs.csv", "CHECKED_IN", "EECS3311 Course Project Database - Rooms.csv");
        double double13 = accountType8.getHourlyRate();
        partnerUser6.setAccountType(accountType8);
        Model.User.User user18 = Model.User.UserFactory.createUser(accountType8, "26", "57197862-2463-4972-b3b2-977245133f34", "44");
        org.junit.Assert.assertTrue("'" + accountType8 + "' != '" + Model.User.AccountType.PARTNER + "'", accountType8.equals(Model.User.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(user12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
        org.junit.Assert.assertNotNull(user18);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test663");
        Model.ServiceRequest.SensorEssentialServiceRequest sensorEssentialServiceRequest5 = new Model.ServiceRequest.SensorEssentialServiceRequest((int) (short) -1, "4", "hi!", (-1), (int) ' ');
        sensorEssentialServiceRequest5.setDescription("src/main/data/scanid_sensor_logs.csv");
        int int8 = sensorEssentialServiceRequest5.getSensorID();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test664");
        java.time.LocalDateTime localDateTime2 = null;
        Model.Sensor.OccupancySensorData occupancySensorData3 = new Model.Sensor.OccupancySensorData("21", "8903a9bb-0838-41ef-9768-131faa20dcdc", localDateTime2);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test665");
        Model.ServiceRequest.NonEssentialServiceRequest nonEssentialServiceRequest4 = new Model.ServiceRequest.NonEssentialServiceRequest((int) 'a', "EECS3311 Course Project Database - Rooms.csv", "3", (int) (byte) -1);
        boolean boolean5 = nonEssentialServiceRequest4.isEssential();
        boolean boolean6 = nonEssentialServiceRequest4.isEssential();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test666");
        Model.State.CompletedState completedState0 = new Model.State.CompletedState();
        Model.State.CancelledState cancelledState1 = new Model.State.CancelledState();
        Model.State.CompletedState completedState2 = new Model.State.CompletedState();
        java.time.LocalDate localDate6 = null;
        java.time.LocalDate localDate7 = null;
        java.time.LocalTime localTime8 = null;
        java.time.LocalTime localTime9 = null;
        Model.Room.Booking booking11 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate6, localDate7, localTime8, localTime9, "");
        completedState2.checkOut(booking11);
        java.lang.String str13 = completedState2.getStatus();
        Model.State.CompletedState completedState14 = new Model.State.CompletedState();
        java.time.LocalDate localDate18 = null;
        java.time.LocalDate localDate19 = null;
        java.time.LocalTime localTime20 = null;
        java.time.LocalTime localTime21 = null;
        Model.Room.Booking booking23 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate18, localDate19, localTime20, localTime21, "");
        completedState14.checkOut(booking23);
        java.time.LocalDate localDate28 = null;
        java.time.LocalDate localDate29 = null;
        java.time.LocalTime localTime30 = null;
        java.time.LocalTime localTime31 = null;
        Model.Room.Booking booking33 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate28, localDate29, localTime30, localTime31, "");
        completedState14.checkOut(booking33);
        completedState2.checkIn(booking33);
        cancelledState1.checkOut(booking33);
        Model.State.CompletedState completedState37 = new Model.State.CompletedState();
        java.time.LocalDate localDate41 = null;
        java.time.LocalDate localDate42 = null;
        java.time.LocalTime localTime43 = null;
        java.time.LocalTime localTime44 = null;
        Model.Room.Booking booking46 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate41, localDate42, localTime43, localTime44, "");
        completedState37.checkOut(booking46);
        java.time.LocalDate localDate51 = null;
        java.time.LocalDate localDate52 = null;
        java.time.LocalTime localTime53 = null;
        java.time.LocalTime localTime54 = null;
        Model.Room.Booking booking56 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate51, localDate52, localTime53, localTime54, "");
        java.lang.String str57 = booking56.getBookingId();
        Model.State.BookingState bookingState58 = null;
        booking56.setState(bookingState58);
        Model.State.CompletedState completedState60 = new Model.State.CompletedState();
        booking56.setState((Model.State.BookingState) completedState60);
        completedState37.checkOut(booking56);
        booking56.performCheckOut();
        java.lang.String str64 = booking56.getBookingId();
        cancelledState1.checkOut(booking56);
        java.time.LocalDate localDate69 = null;
        java.time.LocalDate localDate70 = null;
        java.time.LocalTime localTime71 = null;
        java.time.LocalTime localTime72 = null;
        Model.Room.Booking booking74 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate69, localDate70, localTime71, localTime72, "");
        java.lang.String str75 = booking74.getBookingId();
        cancelledState1.cancel(booking74);
        booking74.performCheckOut();
        completedState0.checkOut(booking74);
        java.lang.String str79 = booking74.getStatus();
        booking74.performCancel();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "COMPLETED" + "'", str13, "COMPLETED");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "CONFIRMED" + "'", str79, "CONFIRMED");
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test667");
        Model.State.RoomDisabledState roomDisabledState0 = new Model.State.RoomDisabledState();
        boolean boolean1 = roomDisabledState0.isBookable();
        boolean boolean2 = roomDisabledState0.isBookable();
        Model.State.RoomReadyForEnableState roomReadyForEnableState3 = new Model.State.RoomReadyForEnableState();
        boolean boolean4 = roomReadyForEnableState3.isBookable();
        Model.Room.Room room9 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        roomReadyForEnableState3.disable(room9);
        roomDisabledState0.disable(room9);
        room9.performMaintenance();
        java.lang.String str13 = room9.getLocation();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test668");
        Model.ServiceRequest.SensorEssentialServiceRequest sensorEssentialServiceRequest5 = new Model.ServiceRequest.SensorEssentialServiceRequest(1, "COMPLETED", "Service.AuthenticationException: ", (int) 'a', (int) (short) -1);
        sensorEssentialServiceRequest5.assignRoomID(100);
        java.lang.String str8 = sensorEssentialServiceRequest5.getStatus();
        int int9 = sensorEssentialServiceRequest5.getServiceRequestID();
        sensorEssentialServiceRequest5.setRoomID((int) (short) 10);
        boolean boolean12 = sensorEssentialServiceRequest5.isEssential;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Service.AuthenticationException: " + "'", str8, "Service.AuthenticationException: ");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test669");
        Model.Sensor.Sensor sensor5 = new Model.Sensor.Sensor("", "EECS3311 Course Project Database - Bookings.csv", "47", "34", false);
        java.lang.String str6 = sensor5.getRoomID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "34" + "'", str6, "34");
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test670");
        Model.State.RoomEnabledState roomEnabledState0 = new Model.State.RoomEnabledState();
        Model.State.RoomReadyForEnableState roomReadyForEnableState1 = new Model.State.RoomReadyForEnableState();
        Model.State.RoomEnabledState roomEnabledState2 = new Model.State.RoomEnabledState();
        boolean boolean3 = roomEnabledState2.isBookable();
        Model.State.RoomReadyForEnableState roomReadyForEnableState4 = new Model.State.RoomReadyForEnableState();
        boolean boolean5 = roomReadyForEnableState4.isBookable();
        Model.Room.Room room10 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        roomReadyForEnableState4.disable(room10);
        roomEnabledState2.maintain(room10);
        roomReadyForEnableState1.maintain(room10);
        roomEnabledState0.disable(room10);
        Model.State.RoomReadyForEnableState roomReadyForEnableState15 = new Model.State.RoomReadyForEnableState();
        boolean boolean16 = roomReadyForEnableState15.isBookable();
        Model.Room.Room room21 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        roomReadyForEnableState15.disable(room21);
        room21.requestEnable();
        double double24 = room21.getPrice();
        roomEnabledState0.enable(room21);
        boolean boolean26 = roomEnabledState0.isBookable();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 100.0d + "'", double24 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test671");
        Model.Payment.Payment payment2 = new Model.Payment.Payment("28", (double) 10L);
        boolean boolean3 = payment2.isPaid();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test672");
        Model.State.RoomDisabledState roomDisabledState1 = new Model.State.RoomDisabledState();
        boolean boolean2 = roomDisabledState1.isBookable();
        boolean boolean3 = roomDisabledState1.isBookable();
        boolean boolean4 = roomDisabledState1.isBookable();
        Model.Room.Room room9 = new Model.Room.Room("COMPLETED", "hi!", (double) 100.0f, "2");
        roomDisabledState1.maintain(room9);
        room9.performMaintenance();
        Model.Room.AdminRoomProxy adminRoomProxy12 = new Model.Room.AdminRoomProxy(room9);
        double double13 = room9.getPrice();
        Model.Room.RoomProxy roomProxy14 = Model.Room.RoomProxyFactory.getProxy("8903a9bb-0838-41ef-9768-131faa20dcdc", room9);
        java.lang.String str15 = roomProxy14.getRoomId();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertNotNull(roomProxy14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "COMPLETED" + "'", str15, "COMPLETED");
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test673");
        Model.State.CheckInState checkInState0 = new Model.State.CheckInState();
        java.lang.String str1 = checkInState0.getStatus();
        java.lang.String str2 = checkInState0.getStatus();
        java.lang.String str3 = checkInState0.getStatus();
        Model.State.CompletedState completedState4 = new Model.State.CompletedState();
        java.time.LocalDate localDate8 = null;
        java.time.LocalDate localDate9 = null;
        java.time.LocalTime localTime10 = null;
        java.time.LocalTime localTime11 = null;
        Model.Room.Booking booking13 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate8, localDate9, localTime10, localTime11, "");
        completedState4.checkOut(booking13);
        java.time.LocalDate localDate15 = booking13.getEndDate();
        checkInState0.checkOut(booking13);
        java.time.LocalDate localDate17 = booking13.getEndDate();
        Model.State.CheckInState checkInState18 = new Model.State.CheckInState();
        java.lang.String str19 = checkInState18.getStatus();
        java.lang.String str20 = checkInState18.getStatus();
        Model.State.CompletedState completedState21 = new Model.State.CompletedState();
        java.time.LocalDate localDate25 = null;
        java.time.LocalDate localDate26 = null;
        java.time.LocalTime localTime27 = null;
        java.time.LocalTime localTime28 = null;
        Model.Room.Booking booking30 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate25, localDate26, localTime27, localTime28, "");
        completedState21.checkOut(booking30);
        java.time.LocalDate localDate32 = booking30.getEndDate();
        checkInState18.cancel(booking30);
        Model.State.CheckInState checkInState34 = new Model.State.CheckInState();
        java.lang.String str35 = checkInState34.getStatus();
        java.lang.String str36 = checkInState34.getStatus();
        java.lang.String str37 = checkInState34.getStatus();
        java.time.LocalDate localDate41 = null;
        java.time.LocalDate localDate42 = null;
        java.time.LocalTime localTime43 = null;
        java.time.LocalTime localTime44 = null;
        Model.Room.Booking booking46 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate41, localDate42, localTime43, localTime44, "");
        java.lang.String str47 = booking46.getBookingId();
        java.time.LocalTime localTime48 = booking46.getStartTime();
        checkInState34.cancel(booking46);
        java.lang.String str50 = booking46.getUserId();
        checkInState18.cancel(booking46);
        java.time.LocalDate localDate55 = null;
        java.time.LocalDate localDate56 = null;
        java.time.LocalTime localTime57 = null;
        java.time.LocalTime localTime58 = null;
        Model.Room.Booking booking60 = new Model.Room.Booking("hi!", "EECS3311 Course Project Database - Bookings.csv", "src/main/data/MaintenanceRequests.csv", localDate55, localDate56, localTime57, localTime58, "EECS3311 Course Project Database - Rooms.csv");
        checkInState18.cancel(booking60);
        java.lang.String str62 = checkInState18.getStatus();
        booking13.setState((Model.State.BookingState) checkInState18);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CHECKED_IN" + "'", str1, "CHECKED_IN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CHECKED_IN" + "'", str2, "CHECKED_IN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CHECKED_IN" + "'", str3, "CHECKED_IN");
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertNull(localDate17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "CHECKED_IN" + "'", str19, "CHECKED_IN");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "CHECKED_IN" + "'", str20, "CHECKED_IN");
        org.junit.Assert.assertNull(localDate32);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "CHECKED_IN" + "'", str35, "CHECKED_IN");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "CHECKED_IN" + "'", str36, "CHECKED_IN");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "CHECKED_IN" + "'", str37, "CHECKED_IN");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNull(localTime48);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "CHECKED_IN" + "'", str62, "CHECKED_IN");
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test674");
        Model.State.CompletedState completedState0 = new Model.State.CompletedState();
        java.time.LocalDate localDate4 = null;
        java.time.LocalDate localDate5 = null;
        java.time.LocalTime localTime6 = null;
        java.time.LocalTime localTime7 = null;
        Model.Room.Booking booking9 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate4, localDate5, localTime6, localTime7, "");
        completedState0.checkOut(booking9);
        java.time.LocalDate localDate14 = null;
        java.time.LocalDate localDate15 = null;
        java.time.LocalTime localTime16 = null;
        java.time.LocalTime localTime17 = null;
        Model.Room.Booking booking19 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate14, localDate15, localTime16, localTime17, "");
        completedState0.checkOut(booking19);
        booking19.performCancel();
        booking19.setPaymentId("CONFIRMED");
        java.time.LocalDate localDate24 = booking19.getEndDate();
        org.junit.Assert.assertNull(localDate24);
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test675");
        Repository.BookingRepository bookingRepository0 = Repository.BookingRepository.getInstance();
        java.util.List<Model.Room.Booking> bookingList1 = bookingRepository0.findAll();
        Model.State.CompletedState completedState2 = new Model.State.CompletedState();
        java.time.LocalDate localDate6 = null;
        java.time.LocalDate localDate7 = null;
        java.time.LocalTime localTime8 = null;
        java.time.LocalTime localTime9 = null;
        Model.Room.Booking booking11 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate6, localDate7, localTime8, localTime9, "");
        completedState2.checkOut(booking11);
        java.lang.String str13 = completedState2.getStatus();
        Model.State.CompletedState completedState14 = new Model.State.CompletedState();
        java.time.LocalDate localDate18 = null;
        java.time.LocalDate localDate19 = null;
        java.time.LocalTime localTime20 = null;
        java.time.LocalTime localTime21 = null;
        Model.Room.Booking booking23 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate18, localDate19, localTime20, localTime21, "");
        completedState14.checkOut(booking23);
        java.time.LocalDate localDate28 = null;
        java.time.LocalDate localDate29 = null;
        java.time.LocalTime localTime30 = null;
        java.time.LocalTime localTime31 = null;
        Model.Room.Booking booking33 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate28, localDate29, localTime30, localTime31, "");
        completedState14.checkOut(booking33);
        completedState2.checkIn(booking33);
        bookingRepository0.save(booking33);
        Model.Room.Booking booking38 = bookingRepository0.findById("14");
        java.util.List<Model.Room.Booking> bookingList39 = bookingRepository0.findAll();
        Model.State.CheckInState checkInState40 = new Model.State.CheckInState();
        java.lang.String str41 = checkInState40.getStatus();
        java.lang.String str42 = checkInState40.getStatus();
        Model.State.CompletedState completedState43 = new Model.State.CompletedState();
        java.time.LocalDate localDate47 = null;
        java.time.LocalDate localDate48 = null;
        java.time.LocalTime localTime49 = null;
        java.time.LocalTime localTime50 = null;
        Model.Room.Booking booking52 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate47, localDate48, localTime49, localTime50, "");
        completedState43.checkOut(booking52);
        java.time.LocalDate localDate54 = booking52.getEndDate();
        checkInState40.cancel(booking52);
        Model.State.CompletedState completedState56 = new Model.State.CompletedState();
        java.time.LocalDate localDate60 = null;
        java.time.LocalDate localDate61 = null;
        java.time.LocalTime localTime62 = null;
        java.time.LocalTime localTime63 = null;
        Model.Room.Booking booking65 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate60, localDate61, localTime62, localTime63, "");
        completedState56.checkOut(booking65);
        java.time.LocalDate localDate70 = null;
        java.time.LocalDate localDate71 = null;
        java.time.LocalTime localTime72 = null;
        java.time.LocalTime localTime73 = null;
        Model.Room.Booking booking75 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate70, localDate71, localTime72, localTime73, "");
        completedState56.checkOut(booking75);
        checkInState40.checkOut(booking75);
        java.lang.String str78 = booking75.getPaymentId();
        bookingRepository0.save(booking75);
        org.junit.Assert.assertNotNull(bookingRepository0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "COMPLETED" + "'", str13, "COMPLETED");
        org.junit.Assert.assertNull(booking38);
        org.junit.Assert.assertNotNull(bookingList39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "CHECKED_IN" + "'", str41, "CHECKED_IN");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "CHECKED_IN" + "'", str42, "CHECKED_IN");
        org.junit.Assert.assertNull(localDate54);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test676");
        Model.State.RoomEnabledState roomEnabledState0 = new Model.State.RoomEnabledState();
        boolean boolean1 = roomEnabledState0.isBookable();
        Model.State.RoomReadyForEnableState roomReadyForEnableState2 = new Model.State.RoomReadyForEnableState();
        Model.State.RoomEnabledState roomEnabledState3 = new Model.State.RoomEnabledState();
        boolean boolean4 = roomEnabledState3.isBookable();
        Model.State.RoomReadyForEnableState roomReadyForEnableState5 = new Model.State.RoomReadyForEnableState();
        boolean boolean6 = roomReadyForEnableState5.isBookable();
        Model.Room.Room room11 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        roomReadyForEnableState5.disable(room11);
        roomEnabledState3.maintain(room11);
        roomReadyForEnableState2.maintain(room11);
        roomEnabledState0.enable(room11);
        Model.State.RoomReadyForEnableState roomReadyForEnableState16 = new Model.State.RoomReadyForEnableState();
        boolean boolean17 = roomReadyForEnableState16.isBookable();
        Model.Room.Room room22 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        roomReadyForEnableState16.disable(room22);
        roomEnabledState0.maintain(room22);
        java.lang.String str25 = roomEnabledState0.getStateName();
        java.lang.String str26 = roomEnabledState0.getStateName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "ENABLED" + "'", str25, "ENABLED");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "ENABLED" + "'", str26, "ENABLED");
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test677");
        Model.ServiceRequest.SensorEssentialServiceRequest sensorEssentialServiceRequest5 = new Model.ServiceRequest.SensorEssentialServiceRequest(1, "COMPLETED", "Service.AuthenticationException: ", (int) 'a', (int) (short) -1);
        sensorEssentialServiceRequest5.assignRoomID(100);
        java.lang.String str8 = sensorEssentialServiceRequest5.getDescription();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "COMPLETED" + "'", str8, "COMPLETED");
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test678");
        Repository.ServiceRequestRepository serviceRequestRepository0 = Repository.ServiceRequestRepository.getInstance();
        java.lang.Integer int2 = serviceRequestRepository0.generateNextId((int) '4');
        java.util.Map<java.lang.Integer, java.util.List<Model.ServiceRequest.ServiceRequest>> intMap5 = serviceRequestRepository0.parseCsvFileToMap("14", false);
        Model.ServiceRequest.SensorEssentialServiceRequest sensorEssentialServiceRequest11 = new Model.ServiceRequest.SensorEssentialServiceRequest(1, "COMPLETED", "Service.AuthenticationException: ", (int) 'a', (int) (short) -1);
        java.lang.String str12 = sensorEssentialServiceRequest11.getStatus();
        Model.ServiceRequest.ServiceRequest serviceRequest13 = serviceRequestRepository0.addServiceRequest((Model.ServiceRequest.ServiceRequest) sensorEssentialServiceRequest11);
        Model.ServiceRequest.NonEssentialServiceRequest nonEssentialServiceRequest18 = new Model.ServiceRequest.NonEssentialServiceRequest((-1), "STAFF", "14", 0);
        serviceRequestRepository0.updateExistingServiceRequest((Model.ServiceRequest.ServiceRequest) nonEssentialServiceRequest18);
        org.junit.Assert.assertNotNull(serviceRequestRepository0);
// flaky "25) test678(RegressionTest1)":         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertNotNull(intMap5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Service.AuthenticationException: " + "'", str12, "Service.AuthenticationException: ");
        org.junit.Assert.assertNotNull(serviceRequest13);
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test679");
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        java.time.LocalTime localTime5 = null;
        java.time.LocalTime localTime6 = null;
        Model.Room.Booking booking8 = new Model.Room.Booking("ENABLED", "CANCELLED", "12", localDate3, localDate4, localTime5, localTime6, "32");
        java.lang.String str9 = booking8.getRoomId();
        Model.State.CheckInState checkInState10 = new Model.State.CheckInState();
        java.lang.String str11 = checkInState10.getStatus();
        java.lang.String str12 = checkInState10.getStatus();
        Model.State.CompletedState completedState13 = new Model.State.CompletedState();
        java.time.LocalDate localDate17 = null;
        java.time.LocalDate localDate18 = null;
        java.time.LocalTime localTime19 = null;
        java.time.LocalTime localTime20 = null;
        Model.Room.Booking booking22 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate17, localDate18, localTime19, localTime20, "");
        completedState13.checkOut(booking22);
        java.time.LocalDate localDate24 = booking22.getEndDate();
        checkInState10.cancel(booking22);
        Model.State.CheckInState checkInState26 = new Model.State.CheckInState();
        java.lang.String str27 = checkInState26.getStatus();
        java.lang.String str28 = checkInState26.getStatus();
        java.lang.String str29 = checkInState26.getStatus();
        java.time.LocalDate localDate33 = null;
        java.time.LocalDate localDate34 = null;
        java.time.LocalTime localTime35 = null;
        java.time.LocalTime localTime36 = null;
        Model.Room.Booking booking38 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate33, localDate34, localTime35, localTime36, "");
        java.lang.String str39 = booking38.getBookingId();
        java.time.LocalTime localTime40 = booking38.getStartTime();
        checkInState26.cancel(booking38);
        java.lang.String str42 = booking38.getUserId();
        checkInState10.cancel(booking38);
        java.time.LocalDate localDate47 = null;
        java.time.LocalDate localDate48 = null;
        java.time.LocalTime localTime49 = null;
        java.time.LocalTime localTime50 = null;
        Model.Room.Booking booking52 = new Model.Room.Booking("hi!", "EECS3311 Course Project Database - Bookings.csv", "src/main/data/MaintenanceRequests.csv", localDate47, localDate48, localTime49, localTime50, "EECS3311 Course Project Database - Rooms.csv");
        checkInState10.cancel(booking52);
        java.lang.String str54 = checkInState10.getStatus();
        booking8.setState((Model.State.BookingState) checkInState10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CANCELLED" + "'", str9, "CANCELLED");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "CHECKED_IN" + "'", str11, "CHECKED_IN");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "CHECKED_IN" + "'", str12, "CHECKED_IN");
        org.junit.Assert.assertNull(localDate24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "CHECKED_IN" + "'", str27, "CHECKED_IN");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "CHECKED_IN" + "'", str28, "CHECKED_IN");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "CHECKED_IN" + "'", str29, "CHECKED_IN");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNull(localTime40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "CHECKED_IN" + "'", str54, "CHECKED_IN");
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test680");
        Model.State.CancelledState cancelledState0 = new Model.State.CancelledState();
        Model.State.CompletedState completedState1 = new Model.State.CompletedState();
        java.time.LocalDate localDate5 = null;
        java.time.LocalDate localDate6 = null;
        java.time.LocalTime localTime7 = null;
        java.time.LocalTime localTime8 = null;
        Model.Room.Booking booking10 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate5, localDate6, localTime7, localTime8, "");
        completedState1.checkOut(booking10);
        java.lang.String str12 = completedState1.getStatus();
        Model.State.CompletedState completedState13 = new Model.State.CompletedState();
        java.time.LocalDate localDate17 = null;
        java.time.LocalDate localDate18 = null;
        java.time.LocalTime localTime19 = null;
        java.time.LocalTime localTime20 = null;
        Model.Room.Booking booking22 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate17, localDate18, localTime19, localTime20, "");
        completedState13.checkOut(booking22);
        java.time.LocalDate localDate27 = null;
        java.time.LocalDate localDate28 = null;
        java.time.LocalTime localTime29 = null;
        java.time.LocalTime localTime30 = null;
        Model.Room.Booking booking32 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate27, localDate28, localTime29, localTime30, "");
        completedState13.checkOut(booking32);
        completedState1.checkIn(booking32);
        cancelledState0.checkOut(booking32);
        Model.State.CompletedState completedState36 = new Model.State.CompletedState();
        java.time.LocalDate localDate40 = null;
        java.time.LocalDate localDate41 = null;
        java.time.LocalTime localTime42 = null;
        java.time.LocalTime localTime43 = null;
        Model.Room.Booking booking45 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate40, localDate41, localTime42, localTime43, "");
        completedState36.checkOut(booking45);
        java.time.LocalDate localDate50 = null;
        java.time.LocalDate localDate51 = null;
        java.time.LocalTime localTime52 = null;
        java.time.LocalTime localTime53 = null;
        Model.Room.Booking booking55 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate50, localDate51, localTime52, localTime53, "");
        java.lang.String str56 = booking55.getBookingId();
        Model.State.BookingState bookingState57 = null;
        booking55.setState(bookingState57);
        Model.State.CompletedState completedState59 = new Model.State.CompletedState();
        booking55.setState((Model.State.BookingState) completedState59);
        completedState36.checkOut(booking55);
        booking55.performCancel();
        java.time.LocalDate localDate63 = booking55.getEndDate();
        cancelledState0.checkIn(booking55);
        Model.State.CompletedState completedState65 = new Model.State.CompletedState();
        java.time.LocalDate localDate69 = null;
        java.time.LocalDate localDate70 = null;
        java.time.LocalTime localTime71 = null;
        java.time.LocalTime localTime72 = null;
        Model.Room.Booking booking74 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate69, localDate70, localTime71, localTime72, "");
        completedState65.checkOut(booking74);
        java.time.LocalDate localDate76 = booking74.getEndDate();
        cancelledState0.checkIn(booking74);
        booking74.performCheckIn();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "COMPLETED" + "'", str12, "COMPLETED");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNull(localDate63);
        org.junit.Assert.assertNull(localDate76);
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test681");
        Model.State.CancelledState cancelledState0 = new Model.State.CancelledState();
        Model.State.CompletedState completedState1 = new Model.State.CompletedState();
        java.time.LocalDate localDate5 = null;
        java.time.LocalDate localDate6 = null;
        java.time.LocalTime localTime7 = null;
        java.time.LocalTime localTime8 = null;
        Model.Room.Booking booking10 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate5, localDate6, localTime7, localTime8, "");
        completedState1.checkOut(booking10);
        java.lang.String str12 = completedState1.getStatus();
        Model.State.CompletedState completedState13 = new Model.State.CompletedState();
        java.time.LocalDate localDate17 = null;
        java.time.LocalDate localDate18 = null;
        java.time.LocalTime localTime19 = null;
        java.time.LocalTime localTime20 = null;
        Model.Room.Booking booking22 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate17, localDate18, localTime19, localTime20, "");
        completedState13.checkOut(booking22);
        java.time.LocalDate localDate27 = null;
        java.time.LocalDate localDate28 = null;
        java.time.LocalTime localTime29 = null;
        java.time.LocalTime localTime30 = null;
        Model.Room.Booking booking32 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate27, localDate28, localTime29, localTime30, "");
        completedState13.checkOut(booking32);
        completedState1.checkIn(booking32);
        cancelledState0.checkOut(booking32);
        Model.State.CompletedState completedState36 = new Model.State.CompletedState();
        java.time.LocalDate localDate40 = null;
        java.time.LocalDate localDate41 = null;
        java.time.LocalTime localTime42 = null;
        java.time.LocalTime localTime43 = null;
        Model.Room.Booking booking45 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate40, localDate41, localTime42, localTime43, "");
        completedState36.checkOut(booking45);
        java.time.LocalDate localDate50 = null;
        java.time.LocalDate localDate51 = null;
        java.time.LocalTime localTime52 = null;
        java.time.LocalTime localTime53 = null;
        Model.Room.Booking booking55 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate50, localDate51, localTime52, localTime53, "");
        java.lang.String str56 = booking55.getBookingId();
        Model.State.BookingState bookingState57 = null;
        booking55.setState(bookingState57);
        Model.State.CompletedState completedState59 = new Model.State.CompletedState();
        booking55.setState((Model.State.BookingState) completedState59);
        completedState36.checkOut(booking55);
        booking55.performCancel();
        java.time.LocalDate localDate63 = booking55.getEndDate();
        cancelledState0.checkIn(booking55);
        Model.State.CompletedState completedState65 = new Model.State.CompletedState();
        java.time.LocalDate localDate69 = null;
        java.time.LocalDate localDate70 = null;
        java.time.LocalTime localTime71 = null;
        java.time.LocalTime localTime72 = null;
        Model.Room.Booking booking74 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate69, localDate70, localTime71, localTime72, "");
        completedState65.checkOut(booking74);
        java.lang.String str76 = completedState65.getStatus();
        Model.State.CompletedState completedState77 = new Model.State.CompletedState();
        java.time.LocalDate localDate81 = null;
        java.time.LocalDate localDate82 = null;
        java.time.LocalTime localTime83 = null;
        java.time.LocalTime localTime84 = null;
        Model.Room.Booking booking86 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate81, localDate82, localTime83, localTime84, "");
        completedState77.checkOut(booking86);
        java.time.LocalDate localDate91 = null;
        java.time.LocalDate localDate92 = null;
        java.time.LocalTime localTime93 = null;
        java.time.LocalTime localTime94 = null;
        Model.Room.Booking booking96 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate91, localDate92, localTime93, localTime94, "");
        completedState77.checkOut(booking96);
        completedState65.checkIn(booking96);
        cancelledState0.cancel(booking96);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "COMPLETED" + "'", str12, "COMPLETED");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNull(localDate63);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "COMPLETED" + "'", str76, "COMPLETED");
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test682");
        Model.Sensor.ScanIDSensor scanIDSensor4 = new Model.Sensor.ScanIDSensor("4", "1", "EECS3311 Course Project Database - Rooms.csv", "src/main/data/MaintenanceRequests.csv");
        scanIDSensor4.setOccupied(true);
        scanIDSensor4.setRoomID("21");
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test683");
        Repository.ServiceRequestRepository serviceRequestRepository0 = Repository.ServiceRequestRepository.getInstance();
        Model.ServiceRequest.SensorEssentialServiceRequest sensorEssentialServiceRequest6 = new Model.ServiceRequest.SensorEssentialServiceRequest(1, "COMPLETED", "Service.AuthenticationException: ", (int) 'a', (int) (short) -1);
        java.lang.String str7 = sensorEssentialServiceRequest6.getStatus();
        Model.ServiceRequest.ServiceRequest serviceRequest8 = serviceRequestRepository0.addServiceRequest((Model.ServiceRequest.ServiceRequest) sensorEssentialServiceRequest6);
        sensorEssentialServiceRequest6.assignRoomID((int) ' ');
        int int11 = sensorEssentialServiceRequest6.getServiceRequestID();
        org.junit.Assert.assertNotNull(serviceRequestRepository0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Service.AuthenticationException: " + "'", str7, "Service.AuthenticationException: ");
        org.junit.Assert.assertNotNull(serviceRequest8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test684");
        Model.User.StaffUser staffUser6 = new Model.User.StaffUser("hi!", "hi!", "src/main/data/users.csv", "src/main/data/users.csv", false, "hi!");
        Model.User.AccountType accountType7 = null;
        staffUser6.setAccountType(accountType7);
        Model.User.AccountType accountType9 = staffUser6.getAccountType();
        java.lang.String str10 = staffUser6.getPassword();
        staffUser6.setPassword("jsmith@yorku.ca");
        org.junit.Assert.assertNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "src/main/data/users.csv" + "'", str10, "src/main/data/users.csv");
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test685");
        Database.Database database0 = Database.Database.getInstance();
        java.lang.String str1 = database0.getRoomCsvPath();
        java.lang.String str2 = database0.getSensorsCsvPath();
        java.lang.String str3 = database0.getMaintenanceRequestsCsvPath();
        java.lang.String str4 = database0.getRoomCsvPath();
        java.lang.String str5 = database0.getScanIDSensorLogsPath();
        java.lang.String str6 = database0.getMaintenanceRequestsCsvPath();
        java.lang.String str7 = database0.getRoomCsvPath();
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EECS3311 Course Project Database - Rooms.csv" + "'", str1, "EECS3311 Course Project Database - Rooms.csv");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "src/main/data/sensors.csv" + "'", str2, "src/main/data/sensors.csv");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "src/main/data/MaintenanceRequests.csv" + "'", str3, "src/main/data/MaintenanceRequests.csv");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EECS3311 Course Project Database - Rooms.csv" + "'", str4, "EECS3311 Course Project Database - Rooms.csv");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "src/main/data/scanid_sensor_logs.csv" + "'", str5, "src/main/data/scanid_sensor_logs.csv");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "src/main/data/MaintenanceRequests.csv" + "'", str6, "src/main/data/MaintenanceRequests.csv");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EECS3311 Course Project Database - Rooms.csv" + "'", str7, "EECS3311 Course Project Database - Rooms.csv");
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test686");
        Model.User.StudentUser studentUser6 = new Model.User.StudentUser("hi!", "", "", "src/main/data/users.csv", false, "src/main/data/users.csv");
        Application.SessionData.setCurrentUser((Model.User.User) studentUser6);
        Model.User.AccountType accountType8 = studentUser6.getAccountType();
        org.junit.Assert.assertTrue("'" + accountType8 + "' != '" + Model.User.AccountType.STUDENT + "'", accountType8.equals(Model.User.AccountType.STUDENT));
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test687");
        Repository.ServiceRequestRepository serviceRequestRepository0 = Repository.ServiceRequestRepository.getInstance();
        java.lang.Integer int2 = serviceRequestRepository0.generateNextId((int) '4');
        java.util.Map<java.lang.Integer, java.util.List<Model.ServiceRequest.ServiceRequest>> intMap5 = serviceRequestRepository0.parseCsvFileToMap("14", false);
        Model.ServiceRequest.SensorEssentialServiceRequest sensorEssentialServiceRequest11 = new Model.ServiceRequest.SensorEssentialServiceRequest(1, "COMPLETED", "Service.AuthenticationException: ", (int) 'a', (int) (short) -1);
        java.lang.String str12 = sensorEssentialServiceRequest11.getStatus();
        Model.ServiceRequest.ServiceRequest serviceRequest13 = serviceRequestRepository0.addServiceRequest((Model.ServiceRequest.ServiceRequest) sensorEssentialServiceRequest11);
        serviceRequest13.setDescription("READY_FOR_ENABLE");
        org.junit.Assert.assertNotNull(serviceRequestRepository0);
// flaky "26) test687(RegressionTest1)":         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertNotNull(intMap5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Service.AuthenticationException: " + "'", str12, "Service.AuthenticationException: ");
        org.junit.Assert.assertNotNull(serviceRequest13);
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test688");
        Model.User.FacultyUser facultyUser3 = new Model.User.FacultyUser("29", "39", "FACULTY");
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test689");
        Model.State.RoomEnabledState roomEnabledState0 = new Model.State.RoomEnabledState();
        boolean boolean1 = roomEnabledState0.isBookable();
        Model.Room.Room room6 = new Model.Room.Room("STAFF", "1", (double) (byte) 10, "2");
        roomEnabledState0.maintain(room6);
        Model.State.RoomEnabledState roomEnabledState8 = new Model.State.RoomEnabledState();
        Model.State.RoomReadyForEnableState roomReadyForEnableState9 = new Model.State.RoomReadyForEnableState();
        Model.State.RoomEnabledState roomEnabledState10 = new Model.State.RoomEnabledState();
        boolean boolean11 = roomEnabledState10.isBookable();
        Model.State.RoomReadyForEnableState roomReadyForEnableState12 = new Model.State.RoomReadyForEnableState();
        boolean boolean13 = roomReadyForEnableState12.isBookable();
        Model.Room.Room room18 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        roomReadyForEnableState12.disable(room18);
        roomEnabledState10.maintain(room18);
        roomReadyForEnableState9.maintain(room18);
        roomEnabledState8.disable(room18);
        room18.requestEnable();
        roomEnabledState0.enable(room18);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test690");
        Model.Sensor.OccupancySensor occupancySensor5 = new Model.Sensor.OccupancySensor("", "1", "1", "EECS3311 Course Project Database - Rooms.csv", true);
        java.lang.String str6 = occupancySensor5.getType();
        java.lang.String str7 = occupancySensor5.getRoomID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1" + "'", str6, "1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EECS3311 Course Project Database - Rooms.csv" + "'", str7, "EECS3311 Course Project Database - Rooms.csv");
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test691");
        Model.Sensor.ScanIDSensor scanIDSensor4 = new Model.Sensor.ScanIDSensor("3", "src/main/data/MaintenanceRequests.csv", "EECS3311 Course Project Database - Rooms.csv", "");
        java.lang.String str5 = scanIDSensor4.getRoomID();
        scanIDSensor4.setRoomID("DISABLED");
        scanIDSensor4.setOccupied(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test692");
        Model.State.RoomDisabledState roomDisabledState0 = new Model.State.RoomDisabledState();
        Model.State.RoomDisabledState roomDisabledState1 = new Model.State.RoomDisabledState();
        boolean boolean2 = roomDisabledState1.isBookable();
        boolean boolean3 = roomDisabledState1.isBookable();
        boolean boolean4 = roomDisabledState1.isBookable();
        Model.Room.Room room9 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        boolean boolean10 = room9.isAvailable();
        roomDisabledState1.maintain(room9);
        roomDisabledState0.maintain(room9);
        java.lang.String str13 = roomDisabledState0.getStateName();
        Model.State.RoomDisabledState roomDisabledState14 = new Model.State.RoomDisabledState();
        Model.State.RoomDisabledState roomDisabledState15 = new Model.State.RoomDisabledState();
        boolean boolean16 = roomDisabledState15.isBookable();
        boolean boolean17 = roomDisabledState15.isBookable();
        boolean boolean18 = roomDisabledState15.isBookable();
        Model.Room.Room room23 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        boolean boolean24 = room23.isAvailable();
        roomDisabledState15.maintain(room23);
        roomDisabledState14.maintain(room23);
        java.lang.String str27 = roomDisabledState14.getStateName();
        Model.State.RoomEnabledState roomEnabledState28 = new Model.State.RoomEnabledState();
        Model.Room.Room room33 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        boolean boolean34 = room33.isAvailable();
        Model.Room.AdminRoomProxy adminRoomProxy35 = new Model.Room.AdminRoomProxy(room33);
        roomEnabledState28.disable(room33);
        boolean boolean37 = room33.isAvailable();
        roomDisabledState14.maintain(room33);
        roomDisabledState0.maintain(room33);
        boolean boolean40 = roomDisabledState0.isBookable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "DISABLED" + "'", str13, "DISABLED");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "DISABLED" + "'", str27, "DISABLED");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test693");
        Repository.PaymentRepository paymentRepository0 = Repository.PaymentRepository.getInstance();
        Model.Payment.Payment payment3 = new Model.Payment.Payment("", (double) (short) 10);
        paymentRepository0.save(payment3);
        java.lang.String str5 = payment3.getPaymentId();
        java.lang.String str6 = payment3.getStatus();
        org.junit.Assert.assertNotNull(paymentRepository0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PENDING" + "'", str6, "PENDING");
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test694");
        Service.AuthenticationException authenticationException1 = new Service.AuthenticationException("47");
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test695");
        Model.User.PartnerUser partnerUser3 = new Model.User.PartnerUser("7", "!Password123", "src/main/data/sensors.csv");
        Application.SessionData.setCurrentUser((Model.User.User) partnerUser3);
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test696");
        Repository.SensorRepository sensorRepository0 = new Repository.SensorRepository();
        java.util.List<Model.Sensor.OccupancySensorData> occupancySensorDataList1 = sensorRepository0.getOccupancySensorLogsList();
        Model.Sensor.ScanIDSensorData scanIDSensorData2 = null;
        boolean boolean3 = sensorRepository0.writeScanIDSensorLog(scanIDSensorData2);
        Model.Sensor.OccupancySensor occupancySensor9 = new Model.Sensor.OccupancySensor("", "1", "1", "EECS3311 Course Project Database - Rooms.csv", true);
        boolean boolean10 = false; // flaky "27) test696(RegressionTest1)": sensorRepository0.writeSensor((Model.Sensor.Sensor) occupancySensor9);
        java.util.List<Model.Sensor.ScanIDSensorData> scanIDSensorDataList11 = sensorRepository0.getScanIDSensorLogsList();
        Model.Sensor.Sensor sensor13 = null; // flaky "17) test696(RegressionTest1)": sensorRepository0.getSensorByID("EECS3311 Course Project Database - Bookings.csv");
        java.time.LocalDateTime localDateTime16 = null;
        Model.Sensor.OccupancySensorData occupancySensorData17 = new Model.Sensor.OccupancySensorData("", "hi!", localDateTime16);
        java.time.LocalDateTime localDateTime18 = null;
        occupancySensorData17.dateTime = localDateTime18;
        boolean boolean20 = false; // flaky "15) test696(RegressionTest1)": sensorRepository0.writeOccupancySensorLog(occupancySensorData17);
        java.time.LocalDateTime localDateTime21 = occupancySensorData17.dateTime;
        java.time.LocalDateTime localDateTime22 = occupancySensorData17.getLocalDateTime();
        java.lang.String str23 = occupancySensorData17.getSensorID();
// flaky "9) test696(RegressionTest1)":         org.junit.Assert.assertNotNull(occupancySensorDataList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "6) test696(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky "5) test696(RegressionTest1)":         org.junit.Assert.assertNotNull(scanIDSensorDataList11);
        org.junit.Assert.assertNull(sensor13);
// flaky "5) test696(RegressionTest1)":         org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(localDateTime21);
        org.junit.Assert.assertNull(localDateTime22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test697");
        java.time.LocalDateTime localDateTime2 = null;
        Model.Sensor.OccupancySensorData occupancySensorData3 = new Model.Sensor.OccupancySensorData("src/main/data/users.csv", "7", localDateTime2);
        java.time.LocalDateTime localDateTime4 = occupancySensorData3.getLocalDateTime();
        org.junit.Assert.assertNull(localDateTime4);
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test698");
        Model.State.CheckInState checkInState0 = new Model.State.CheckInState();
        java.lang.String str1 = checkInState0.getStatus();
        java.time.LocalDate localDate5 = null;
        java.time.LocalDate localDate6 = null;
        java.time.LocalTime localTime7 = null;
        java.time.LocalTime localTime8 = null;
        Model.Room.Booking booking10 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate5, localDate6, localTime7, localTime8, "");
        java.lang.String str11 = booking10.getBookingId();
        Model.State.BookingState bookingState12 = null;
        booking10.setState(bookingState12);
        Model.State.CompletedState completedState14 = new Model.State.CompletedState();
        booking10.setState((Model.State.BookingState) completedState14);
        java.time.LocalTime localTime16 = booking10.getEndTime();
        checkInState0.cancel(booking10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CHECKED_IN" + "'", str1, "CHECKED_IN");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(localTime16);
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test699");
        Service.RoomService roomService0 = new Service.RoomService();
        roomService0.update(true, (int) (short) 10);
        Model.Room.Booking booking5 = roomService0.getBookingDetails("src/main/data/users.csv");
        boolean boolean7 = roomService0.cancelBooking("hi!");
        Controller.AddRoomController addRoomController8 = new Controller.AddRoomController(roomService0);
        Controller.AdminSelectActionController adminSelectActionController9 = new Controller.AdminSelectActionController(addRoomController8);
        adminSelectActionController9.adminAddRoom("7", (int) (short) -1, (double) 'a');
        adminSelectActionController9.disableRoom("43");
        org.junit.Assert.assertNull(booking5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test700");
        Service.EvaluateRoomMaintenanceRelationshipService evaluateRoomMaintenanceRelationshipService0 = Service.EvaluateRoomMaintenanceRelationshipService.getInstance();
        evaluateRoomMaintenanceRelationshipService0.notifyObservers();
        evaluateRoomMaintenanceRelationshipService0.evaluateRoomMaintenanceRelationship((-1));
        boolean boolean4 = evaluateRoomMaintenanceRelationshipService0.isAnyEssentialMaintenanceRequestPending();
        boolean boolean5 = evaluateRoomMaintenanceRelationshipService0.isAnyEssentialMaintenanceRequestPending();
        evaluateRoomMaintenanceRelationshipService0.notifyObservers();
        Service.GetMaintenanceRequestService getMaintenanceRequestService8 = Service.GetMaintenanceRequestService.getInstance();
        boolean boolean9 = evaluateRoomMaintenanceRelationshipService0.doesRoomHaveEssentialMaintenanceRequests(38, getMaintenanceRequestService8);
        org.junit.Assert.assertNotNull(evaluateRoomMaintenanceRelationshipService0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(getMaintenanceRequestService8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test701");
        Model.User.StudentUser studentUser6 = new Model.User.StudentUser("hi!", "", "", "src/main/data/users.csv", false, "src/main/data/users.csv");
        boolean boolean7 = studentUser6.isVerified();
        studentUser6.setVerified(true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test702");
        Model.State.ConfirmedState confirmedState0 = new Model.State.ConfirmedState();
        Repository.BookingRepository bookingRepository1 = Repository.BookingRepository.getInstance();
        java.time.LocalDate localDate5 = null;
        java.time.LocalDate localDate6 = null;
        java.time.LocalTime localTime7 = null;
        java.time.LocalTime localTime8 = null;
        Model.Room.Booking booking10 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate5, localDate6, localTime7, localTime8, "");
        java.lang.String str11 = booking10.getBookingId();
        Model.State.BookingState bookingState12 = null;
        booking10.setState(bookingState12);
        Model.State.CompletedState completedState14 = new Model.State.CompletedState();
        booking10.setState((Model.State.BookingState) completedState14);
        bookingRepository1.save(booking10);
        java.time.LocalTime localTime17 = booking10.getStartTime();
        booking10.setPaymentId("STAFF");
        confirmedState0.checkOut(booking10);
        java.time.LocalDate localDate24 = null;
        java.time.LocalDate localDate25 = null;
        java.time.LocalTime localTime26 = null;
        java.time.LocalTime localTime27 = null;
        Model.Room.Booking booking29 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate24, localDate25, localTime26, localTime27, "");
        java.lang.String str30 = booking29.getBookingId();
        Model.State.BookingState bookingState31 = null;
        booking29.setState(bookingState31);
        Model.State.CompletedState completedState33 = new Model.State.CompletedState();
        booking29.setState((Model.State.BookingState) completedState33);
        java.lang.String str35 = booking29.getRoomId();
        confirmedState0.checkIn(booking29);
        org.junit.Assert.assertNotNull(bookingRepository1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(localTime17);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "src/main/data/users.csv" + "'", str35, "src/main/data/users.csv");
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test703");
        Service.RoomService roomService0 = new Service.RoomService();
        roomService0.update(true, (int) (short) 10);
        Model.Room.Booking booking5 = roomService0.getBookingDetails("src/main/data/users.csv");
        boolean boolean7 = roomService0.cancelBooking("hi!");
        roomService0.disableRoom("hi!");
        roomService0.disableRoom("1");
        Service.RoomService roomService12 = roomService0.getInstance();
        Service.RoomService roomService13 = roomService12.getInstance();
        roomService12.enableRoom("PENDING");
        boolean boolean17 = roomService12.performCheckOut("39");
        org.junit.Assert.assertNull(booking5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(roomService12);
        org.junit.Assert.assertNotNull(roomService13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test704");
        Model.ServiceRequest.SensorEssentialServiceRequest sensorEssentialServiceRequest5 = new Model.ServiceRequest.SensorEssentialServiceRequest((int) (short) 100, "CHECKED_IN", "EECS3311 Course Project Database - Bookings.csv", 0, (int) (byte) 0);
        boolean boolean6 = sensorEssentialServiceRequest5.isEssential();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test705");
        Model.ServiceRequest.EssentialServiceRequest essentialServiceRequest4 = new Model.ServiceRequest.EssentialServiceRequest(1, "48", "27", 38);
        boolean boolean5 = essentialServiceRequest4.isEssential;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test706");
        Model.User.StaffUser staffUser6 = new Model.User.StaffUser("hi!", "hi!", "src/main/data/users.csv", "src/main/data/users.csv", false, "hi!");
        staffUser6.setName("");
        staffUser6.setPassword("12");
        Model.User.StaffUser staffUser21 = new Model.User.StaffUser("", "hi!", "4", "hi!", false, "2");
        java.lang.String str22 = staffUser21.getRole();
        Model.User.AccountType accountType23 = staffUser21.getAccountType();
        Model.User.AccountType accountType24 = staffUser21.getAccountType();
        Model.User.User user27 = Model.User.UserFactory.createUserFromCsv("EECS3311 Course Project Database - payments.csv", "PENDING", "21", "3", accountType24, false, "hi!");
        staffUser6.setAccountType(accountType24);
        Model.User.User user32 = Model.User.UserFactory.createUser(accountType24, "EECS3311 Course Project Database - Rooms.csv", "38", "480fe243-ebb3-46f6-a6cc-09d57def1744");
        user32.setVerified(true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "2" + "'", str22, "2");
        org.junit.Assert.assertTrue("'" + accountType23 + "' != '" + Model.User.AccountType.STAFF + "'", accountType23.equals(Model.User.AccountType.STAFF));
        org.junit.Assert.assertTrue("'" + accountType24 + "' != '" + Model.User.AccountType.STAFF + "'", accountType24.equals(Model.User.AccountType.STAFF));
        org.junit.Assert.assertNotNull(user27);
        org.junit.Assert.assertNotNull(user32);
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test707");
        Service.RoomService roomService0 = new Service.RoomService();
        roomService0.maintenanceCompleted("");
        boolean boolean4 = roomService0.performCheckOut("");
        roomService0.maintenanceCompleted("1");
        roomService0.disableRoom("3");
        roomService0.disableRoom("");
        roomService0.maintenanceCompleted("src/main/data/MaintenanceRequests.csv");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test708");
        Model.User.FacultyUser facultyUser3 = new Model.User.FacultyUser("COMPLETED", "3", "EECS3311 Course Project Database - Rooms.csv");
        facultyUser3.setRole("CHECKED_IN");
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test709");
        Repository.BookingRepository bookingRepository0 = Repository.BookingRepository.getInstance();
        java.time.LocalDate localDate4 = null;
        java.time.LocalDate localDate5 = null;
        java.time.LocalTime localTime6 = null;
        java.time.LocalTime localTime7 = null;
        Model.Room.Booking booking9 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate4, localDate5, localTime6, localTime7, "");
        java.lang.String str10 = booking9.getBookingId();
        Model.State.BookingState bookingState11 = null;
        booking9.setState(bookingState11);
        Model.State.CompletedState completedState13 = new Model.State.CompletedState();
        booking9.setState((Model.State.BookingState) completedState13);
        bookingRepository0.save(booking9);
        java.time.LocalTime localTime16 = booking9.getEndTime();
        java.lang.String str17 = booking9.getBookingId();
        org.junit.Assert.assertNotNull(bookingRepository0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(localTime16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test710");
        Repository.UserRepository userRepository0 = Repository.UserRepository.getInstance();
        int int1 = userRepository0.getAll();
        Model.User.User user3 = userRepository0.findByEmail("PENDING");
        int int4 = userRepository0.getAll();
        Model.User.StudentUser studentUser11 = new Model.User.StudentUser("hi!", "", "", "src/main/data/users.csv", false, "src/main/data/users.csv");
        java.lang.String str12 = studentUser11.getEmail();
        userRepository0.save((Model.User.User) studentUser11);
        int int14 = userRepository0.getAll();
        org.junit.Assert.assertNotNull(userRepository0);
// flaky "28) test710(RegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 59 + "'", int1 == 59);
        org.junit.Assert.assertNull(user3);
// flaky "18) test710(RegressionTest1)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
// flaky "16) test710(RegressionTest1)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60 + "'", int14 == 60);
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test711");
        Service.AuthenticationException authenticationException1 = new Service.AuthenticationException("7");
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test712");
        Service.UserService userService0 = new Service.UserService();
        Controller.ChiefEventCoordinatorController chiefEventCoordinatorController1 = new Controller.ChiefEventCoordinatorController(userService0);
        Controller.ChiefEventCoordinatorController chiefEventCoordinatorController2 = new Controller.ChiefEventCoordinatorController(userService0);
        Model.User.AccountType accountType11 = Model.User.AccountType.PARTNER;
        Model.User.User user14 = Model.User.UserFactory.createUserFromCsv("hi!", "CHECKED_IN", "hi!", "2", accountType11, false, "Service.AuthenticationException: ");
        Model.User.User user17 = Model.User.UserFactory.createUserFromCsv("EECS3311 Course Project Database - Rooms.csv", "Service.AuthenticationException: ", "14", "", accountType11, false, "4");
        Model.User.User user21 = userService0.createUser(accountType11, "55", "EECS3311 Course Project Database - Rooms.csv", "32");
        Service.UserService userService22 = new Service.UserService();
        Model.User.AccountType accountType23 = Model.User.AccountType.PARTNER;
        Model.User.User user27 = userService22.createUser(accountType23, "", "DISABLED", "4");
        double double28 = accountType23.getHourlyRate();
        Model.User.User user32 = userService0.createUser(accountType23, "31", "72", "78");
        java.lang.String str33 = user32.getId();
        org.junit.Assert.assertTrue("'" + accountType11 + "' != '" + Model.User.AccountType.PARTNER + "'", accountType11.equals(Model.User.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(user14);
        org.junit.Assert.assertNotNull(user17);
        org.junit.Assert.assertNotNull(user21);
        org.junit.Assert.assertTrue("'" + accountType23 + "' != '" + Model.User.AccountType.PARTNER + "'", accountType23.equals(Model.User.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(user27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 50.0d + "'", double28 == 50.0d);
        org.junit.Assert.assertNotNull(user32);
// flaky "29) test712(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "fbbbcaba-993f-4a8c-b2c7-c52622963377" + "'", str33, "fbbbcaba-993f-4a8c-b2c7-c52622963377");
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test713");
        Controller.AdminServiceRequestController adminServiceRequestController0 = new Controller.AdminServiceRequestController();
        adminServiceRequestController0.handleAddServiceRequest("4", false, "src/main/data/occupancy_sensor_logs.csv");
        adminServiceRequestController0.handleAddServiceRequest("14", true, "14");
        adminServiceRequestController0.handleAddServiceRequest("src/main/data/sensors.csv", true, "28");
        java.util.ArrayList<Model.ServiceRequest.ServiceRequest> serviceRequestList13 = adminServiceRequestController0.handleServiceRequestListCompilation();
        org.junit.Assert.assertNotNull(serviceRequestList13);
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test714");
        Service.UserService userService0 = new Service.UserService();
        Model.User.AccountType accountType1 = Model.User.AccountType.PARTNER;
        Model.User.User user5 = userService0.createUser(accountType1, "", "DISABLED", "4");
        Model.User.User user9 = Model.User.UserFactory.createUser(accountType1, "3", "9", "EECS3311 Course Project Database - Bookings.csv");
        Model.User.User user13 = Model.User.UserFactory.createUser(accountType1, "36", "", "30");
        double double14 = accountType1.getHourlyRate();
        org.junit.Assert.assertTrue("'" + accountType1 + "' != '" + Model.User.AccountType.PARTNER + "'", accountType1.equals(Model.User.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNotNull(user9);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.0d + "'", double14 == 50.0d);
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test715");
        Service.RoomService roomService0 = new Service.RoomService();
        roomService0.update(true, (int) (short) 10);
        Model.Room.Booking booking5 = roomService0.getBookingDetails("src/main/data/users.csv");
        boolean boolean7 = roomService0.cancelBooking("hi!");
        Controller.AddRoomController addRoomController8 = new Controller.AddRoomController(roomService0);
        Controller.AdminSelectActionController adminSelectActionController9 = new Controller.AdminSelectActionController(addRoomController8);
        adminSelectActionController9.enableRoom("3");
        adminSelectActionController9.adminAddRoom("EECS3311 Course Project Database - Rooms.csv", 21, (double) 33);
        org.junit.Assert.assertNull(booking5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test716");
        Model.State.RoomDisabledState roomDisabledState0 = new Model.State.RoomDisabledState();
        boolean boolean1 = roomDisabledState0.isBookable();
        Model.State.RoomEnabledState roomEnabledState2 = new Model.State.RoomEnabledState();
        boolean boolean3 = roomEnabledState2.isBookable();
        Model.State.RoomReadyForEnableState roomReadyForEnableState4 = new Model.State.RoomReadyForEnableState();
        boolean boolean5 = roomReadyForEnableState4.isBookable();
        Model.Room.Room room10 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        roomReadyForEnableState4.disable(room10);
        roomEnabledState2.maintain(room10);
        room10.performMaintenance();
        Model.State.RoomState roomState14 = room10.getState();
        roomDisabledState0.disable(room10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(roomState14);
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test717");
        Service.RoomService roomService0 = new Service.RoomService();
        roomService0.update(true, (int) (short) 10);
        Model.Room.Booking booking5 = roomService0.getBookingDetails("src/main/data/users.csv");
        boolean boolean7 = roomService0.cancelBooking("hi!");
        Controller.AddRoomController addRoomController8 = new Controller.AddRoomController(roomService0);
        Controller.AdminSelectActionController adminSelectActionController9 = new Controller.AdminSelectActionController(addRoomController8);
        Controller.AdminSelectActionController adminSelectActionController10 = new Controller.AdminSelectActionController(addRoomController8);
        adminSelectActionController10.disableRoom("8");
        adminSelectActionController10.adminAddRoom("", 0, (double) '4');
        adminSelectActionController10.disableRoom("Service.AuthenticationException: Service.AuthenticationException: ");
        adminSelectActionController10.adminAddRoom("Service.AuthenticationException: Service.AuthenticationException: ", (int) (short) 1, (double) 100.0f);
        adminSelectActionController10.disableRoom("EECS3311 Course Project Database - Bookings.csv");
        org.junit.Assert.assertNull(booking5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test718");
        Model.Room.Room room4 = new Model.Room.Room("COMPLETED", "hi!", (double) 100.0f, "2");
        Model.Room.AdminRoomProxy adminRoomProxy5 = new Model.Room.AdminRoomProxy(room4);
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test719");
        Model.State.RoomDisabledState roomDisabledState0 = new Model.State.RoomDisabledState();
        Model.State.RoomDisabledState roomDisabledState1 = new Model.State.RoomDisabledState();
        boolean boolean2 = roomDisabledState1.isBookable();
        boolean boolean3 = roomDisabledState1.isBookable();
        boolean boolean4 = roomDisabledState1.isBookable();
        Model.Room.Room room9 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        boolean boolean10 = room9.isAvailable();
        roomDisabledState1.maintain(room9);
        roomDisabledState0.maintain(room9);
        Model.State.RoomDisabledState roomDisabledState13 = new Model.State.RoomDisabledState();
        boolean boolean14 = roomDisabledState13.isBookable();
        boolean boolean15 = roomDisabledState13.isBookable();
        boolean boolean16 = roomDisabledState13.isBookable();
        Model.Room.Room room21 = new Model.Room.Room("COMPLETED", "hi!", (double) 100.0f, "2");
        roomDisabledState13.maintain(room21);
        Model.Room.AdminRoomProxy adminRoomProxy23 = new Model.Room.AdminRoomProxy(room21);
        roomDisabledState0.enable(room21);
        java.lang.String str25 = room21.getRoomCapacity();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "2" + "'", str25, "2");
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test720");
        Repository.UserRepository userRepository0 = Repository.UserRepository.getInstance();
        int int1 = userRepository0.getAll();
        Model.User.User user3 = userRepository0.findByEmail("PENDING");
        int int4 = userRepository0.getAll();
        Model.User.StudentUser studentUser11 = new Model.User.StudentUser("hi!", "", "", "src/main/data/users.csv", false, "src/main/data/users.csv");
        java.lang.String str12 = studentUser11.getEmail();
        userRepository0.save((Model.User.User) studentUser11);
        studentUser11.setRole("9");
        org.junit.Assert.assertNotNull(userRepository0);
// flaky "30) test720(RegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(user3);
// flaky "19) test720(RegressionTest1)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test721");
        Repository.ServiceRequestRepository serviceRequestRepository0 = Repository.ServiceRequestRepository.getInstance();
        java.lang.Integer int2 = serviceRequestRepository0.generateNextId((int) '4');
        java.lang.Integer int4 = serviceRequestRepository0.generateNextId((int) (short) 10);
        java.util.Map<java.lang.Integer, java.util.List<Model.ServiceRequest.ServiceRequest>> intMap7 = serviceRequestRepository0.parseCsvFileToMap("7", true);
        Service.EditMaintenanceRequestService editMaintenanceRequestService8 = new Service.EditMaintenanceRequestService(serviceRequestRepository0);
        // The following exception was thrown during execution in test generation
        try {
            editMaintenanceRequestService8.promoteServiceRequest((int) (short) 0, "30", "c5d6147b-72fd-41bc-bac6-dce34fb55c3c", 3, "EECS3311 Course Project Database - Bookings.csv");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"EECS3311 Course Project Database - Bookings.csv\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serviceRequestRepository0);
// flaky "31) test721(RegressionTest1)":         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(intMap7);
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test722");
        Model.ServiceRequest.NonEssentialServiceRequest nonEssentialServiceRequest4 = new Model.ServiceRequest.NonEssentialServiceRequest(59, "9", "8903a9bb-0838-41ef-9768-131faa20dcdc", 64);
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test723");
        Service.RoomService roomService0 = new Service.RoomService();
        roomService0.update(true, (int) (short) 10);
        Model.Room.Booking booking5 = roomService0.getBookingDetails("src/main/data/users.csv");
        boolean boolean7 = roomService0.cancelBooking("hi!");
        Controller.AddRoomController addRoomController8 = new Controller.AddRoomController(roomService0);
        roomService0.maintenanceCompleted("480fe243-ebb3-46f6-a6cc-09d57def1744");
        java.time.LocalDate localDate13 = null;
        java.time.LocalDate localDate14 = null;
        java.time.LocalTime localTime15 = null;
        java.time.LocalTime localTime16 = null;
        java.lang.String str18 = roomService0.createBooking("9", "CONFIRMED", localDate13, localDate14, localTime15, localTime16, "44");
        org.junit.Assert.assertNull(booking5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test724");
        Model.Sensor.ScanIDSensor scanIDSensor4 = new Model.Sensor.ScanIDSensor("John Smith", "COMPLETED", "21", "64");
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test725");
        Model.User.EventCoordinator eventCoordinator0 = Model.User.EventCoordinator.getInstance();
        java.lang.String str1 = eventCoordinator0.getChiefEventCoordinatorName();
        java.lang.String str2 = eventCoordinator0.getChiefEventCoordinatorEmail();
        java.lang.String str3 = eventCoordinator0.getChiefEventCoordinatorEmail();
        java.lang.String str4 = eventCoordinator0.getChiefEventCoordinatorPassword();
        java.lang.String str5 = eventCoordinator0.getChiefEventCoordinatorPassword();
        java.lang.String str6 = eventCoordinator0.getChiefEventCoordinatorEmail();
        org.junit.Assert.assertNotNull(eventCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "John Smith" + "'", str1, "John Smith");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jsmith@yorku.ca" + "'", str2, "jsmith@yorku.ca");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jsmith@yorku.ca" + "'", str3, "jsmith@yorku.ca");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "!Password123" + "'", str4, "!Password123");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "!Password123" + "'", str5, "!Password123");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "jsmith@yorku.ca" + "'", str6, "jsmith@yorku.ca");
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test726");
        Model.State.ConfirmedState confirmedState0 = new Model.State.ConfirmedState();
        java.lang.String str1 = confirmedState0.getStatus();
        java.time.LocalDate localDate5 = null;
        java.time.LocalDate localDate6 = null;
        java.time.LocalTime localTime7 = null;
        java.time.LocalTime localTime8 = null;
        Model.Room.Booking booking10 = new Model.Room.Booking("PENDING", "32", "22", localDate5, localDate6, localTime7, localTime8, "FACULTY");
        confirmedState0.checkOut(booking10);
        Model.State.CompletedState completedState12 = new Model.State.CompletedState();
        java.time.LocalDate localDate16 = null;
        java.time.LocalDate localDate17 = null;
        java.time.LocalTime localTime18 = null;
        java.time.LocalTime localTime19 = null;
        Model.Room.Booking booking21 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate16, localDate17, localTime18, localTime19, "");
        completedState12.checkOut(booking21);
        java.time.LocalDate localDate26 = null;
        java.time.LocalDate localDate27 = null;
        java.time.LocalTime localTime28 = null;
        java.time.LocalTime localTime29 = null;
        Model.Room.Booking booking31 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate26, localDate27, localTime28, localTime29, "");
        java.lang.String str32 = booking31.getBookingId();
        Model.State.BookingState bookingState33 = null;
        booking31.setState(bookingState33);
        Model.State.CompletedState completedState35 = new Model.State.CompletedState();
        booking31.setState((Model.State.BookingState) completedState35);
        completedState12.checkOut(booking31);
        booking31.performCheckOut();
        java.lang.String str39 = booking31.getBookingId();
        java.lang.String str40 = booking31.getUserId();
        java.time.LocalDate localDate41 = booking31.getEndDate();
        confirmedState0.cancel(booking31);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CONFIRMED" + "'", str1, "CONFIRMED");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNull(localDate41);
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test727");
        Model.ServiceRequest.SensorEssentialServiceRequest sensorEssentialServiceRequest5 = new Model.ServiceRequest.SensorEssentialServiceRequest((int) (short) -1, "4", "hi!", (-1), (int) ' ');
        sensorEssentialServiceRequest5.setDescription("src/main/data/scanid_sensor_logs.csv");
        int int8 = sensorEssentialServiceRequest5.getServiceRequestID();
        boolean boolean9 = sensorEssentialServiceRequest5.isEssential;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test728");
        Model.State.RoomEnabledState roomEnabledState0 = new Model.State.RoomEnabledState();
        Model.State.RoomReadyForEnableState roomReadyForEnableState1 = new Model.State.RoomReadyForEnableState();
        Model.State.RoomEnabledState roomEnabledState2 = new Model.State.RoomEnabledState();
        boolean boolean3 = roomEnabledState2.isBookable();
        Model.State.RoomReadyForEnableState roomReadyForEnableState4 = new Model.State.RoomReadyForEnableState();
        boolean boolean5 = roomReadyForEnableState4.isBookable();
        Model.Room.Room room10 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        roomReadyForEnableState4.disable(room10);
        roomEnabledState2.maintain(room10);
        roomReadyForEnableState1.maintain(room10);
        roomEnabledState0.disable(room10);
        Model.Room.Room room19 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        boolean boolean20 = room19.isAvailable();
        Model.State.RoomState roomState21 = room19.getState();
        roomEnabledState0.disable(room19);
        java.lang.String str23 = roomEnabledState0.getStateName();
        Model.State.RoomDisabledState roomDisabledState24 = new Model.State.RoomDisabledState();
        boolean boolean25 = roomDisabledState24.isBookable();
        Model.State.RoomReadyForEnableState roomReadyForEnableState26 = new Model.State.RoomReadyForEnableState();
        boolean boolean27 = roomReadyForEnableState26.isBookable();
        Model.Room.Room room32 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        roomReadyForEnableState26.disable(room32);
        roomDisabledState24.enable(room32);
        Model.State.RoomState roomState35 = room32.getState();
        roomEnabledState0.disable(room32);
        Model.State.RoomEnabledState roomEnabledState37 = new Model.State.RoomEnabledState();
        boolean boolean38 = roomEnabledState37.isBookable();
        Model.State.RoomReadyForEnableState roomReadyForEnableState39 = new Model.State.RoomReadyForEnableState();
        Model.State.RoomEnabledState roomEnabledState40 = new Model.State.RoomEnabledState();
        boolean boolean41 = roomEnabledState40.isBookable();
        Model.State.RoomReadyForEnableState roomReadyForEnableState42 = new Model.State.RoomReadyForEnableState();
        boolean boolean43 = roomReadyForEnableState42.isBookable();
        Model.Room.Room room48 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        roomReadyForEnableState42.disable(room48);
        roomEnabledState40.maintain(room48);
        roomReadyForEnableState39.maintain(room48);
        roomEnabledState37.enable(room48);
        Model.State.RoomReadyForEnableState roomReadyForEnableState53 = new Model.State.RoomReadyForEnableState();
        boolean boolean54 = roomReadyForEnableState53.isBookable();
        Model.Room.Room room59 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        roomReadyForEnableState53.disable(room59);
        roomEnabledState37.maintain(room59);
        double double62 = room59.getPrice();
        roomEnabledState0.enable(room59);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(roomState21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "ENABLED" + "'", str23, "ENABLED");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(roomState35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 100.0d + "'", double62 == 100.0d);
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test729");
        Model.Sensor.ScanIDSensor scanIDSensor4 = new Model.Sensor.ScanIDSensor("", "8", "COMPLETED", "PENDING");
        boolean boolean5 = scanIDSensor4.getOccupied();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test730");
        Database.Database database0 = Database.Database.getInstance();
        java.lang.String str1 = database0.getRoomCsvPath();
        java.lang.String str2 = database0.getOccupancySensorLogsPath();
        java.lang.String str3 = database0.getScanIDSensorLogsPath();
        java.lang.String str4 = database0.getSensorsCsvPath();
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EECS3311 Course Project Database - Rooms.csv" + "'", str1, "EECS3311 Course Project Database - Rooms.csv");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "src/main/data/occupancy_sensor_logs.csv" + "'", str2, "src/main/data/occupancy_sensor_logs.csv");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "src/main/data/scanid_sensor_logs.csv" + "'", str3, "src/main/data/scanid_sensor_logs.csv");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "src/main/data/sensors.csv" + "'", str4, "src/main/data/sensors.csv");
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test731");
        Repository.PaymentRepository paymentRepository0 = Repository.PaymentRepository.getInstance();
        java.util.List<Model.Payment.Payment> paymentList1 = paymentRepository0.findAll();
        Model.Payment.Payment payment4 = new Model.Payment.Payment("", (double) (byte) -1);
        java.lang.String str5 = payment4.getStatus();
        java.lang.String str6 = payment4.getPaymentId();
        payment4.completePayment();
        paymentRepository0.save(payment4);
        java.util.List<Model.Payment.Payment> paymentList9 = paymentRepository0.findAll();
        org.junit.Assert.assertNotNull(paymentRepository0);
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PENDING" + "'", str5, "PENDING");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(paymentList9);
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test732");
        Model.User.EventCoordinator eventCoordinator0 = Model.User.EventCoordinator.getInstance();
        java.lang.String str1 = eventCoordinator0.getChiefEventCoordinatorName();
        java.lang.String str2 = eventCoordinator0.getChiefEventCoordinatorEmail();
        java.lang.String str3 = eventCoordinator0.getChiefEventCoordinatorPassword();
        java.lang.String str4 = eventCoordinator0.getChiefEventCoordinatorPassword();
        java.lang.String str5 = eventCoordinator0.getChiefEventCoordinatorPassword();
        org.junit.Assert.assertNotNull(eventCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "John Smith" + "'", str1, "John Smith");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jsmith@yorku.ca" + "'", str2, "jsmith@yorku.ca");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!Password123" + "'", str3, "!Password123");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "!Password123" + "'", str4, "!Password123");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "!Password123" + "'", str5, "!Password123");
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test733");
        Model.Payment.Payment payment2 = new Model.Payment.Payment("7", 100.0d);
        double double3 = payment2.getAmount();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test734");
        Model.User.PartnerUser partnerUser6 = new Model.User.PartnerUser("PENDING", "56", "75", "55", false, "9");
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test735");
        Service.RoomService roomService0 = new Service.RoomService();
        roomService0.update(true, (int) (short) 10);
        boolean boolean5 = roomService0.performCheckOut("hi!");
        java.lang.String str9 = roomService0.createRoom("", (double) '4', "src/main/data/users.csv");
        Service.RoomService roomService10 = roomService0.getInstance();
        Controller.AddRoomController addRoomController11 = new Controller.AddRoomController(roomService10);
        roomService10.maintenanceCompleted("3b878a93-2f8d-4168-99fd-22b8dbe103f1");
        roomService10.savePayment("14", 40.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "32) test735(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "88" + "'", str9, "88");
        org.junit.Assert.assertNotNull(roomService10);
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test736");
        Service.AuthenticationException authenticationException1 = new Service.AuthenticationException("Service.AuthenticationException: ");
        java.lang.Throwable[] throwableArray2 = authenticationException1.getSuppressed();
        java.lang.Throwable[] throwableArray3 = authenticationException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test737");
        java.time.LocalDateTime localDateTime4 = null;
        Model.Sensor.ScanIDSensorData scanIDSensorData5 = new Model.Sensor.ScanIDSensorData("hi!", "22", "EECS3311 Course Project Database - Bookings.csv", "23", localDateTime4);
        java.lang.String str6 = scanIDSensorData5.getLogID();
        java.lang.String str7 = scanIDSensorData5.getUserID();
        java.lang.String str8 = scanIDSensorData5.getUserID();
        java.lang.String str9 = scanIDSensorData5.getScanOutcome();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EECS3311 Course Project Database - Bookings.csv" + "'", str7, "EECS3311 Course Project Database - Bookings.csv");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EECS3311 Course Project Database - Bookings.csv" + "'", str8, "EECS3311 Course Project Database - Bookings.csv");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "23" + "'", str9, "23");
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test738");
        Service.AuthenticationService authenticationService0 = new Service.AuthenticationService();
        boolean boolean2 = authenticationService0.isYorkEmail("Service.AuthenticationException: ");
        boolean boolean4 = authenticationService0.properEmail("31");
        authenticationService0.logout();
        // The following exception was thrown during execution in test generation
        try {
            Model.User.User user8 = authenticationService0.login("CHECKED_IN", "hi!");
            org.junit.Assert.fail("Expected exception of type Service.AuthenticationException; message: Incorrect password.");
        } catch (Service.AuthenticationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test739");
        java.time.LocalDateTime localDateTime4 = null;
        Model.Sensor.ScanIDSensorData scanIDSensorData5 = new Model.Sensor.ScanIDSensorData("20", "29", "23", "35", localDateTime4);
        java.lang.String str6 = scanIDSensorData5.getLogID();
        java.lang.String str7 = scanIDSensorData5.getUserID();
        java.lang.String str8 = scanIDSensorData5.getSensorID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "20" + "'", str6, "20");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "23" + "'", str7, "23");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "29" + "'", str8, "29");
    }

    @Test
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test740");
        java.time.LocalDateTime localDateTime4 = null;
        Model.Sensor.ScanIDSensorData scanIDSensorData5 = new Model.Sensor.ScanIDSensorData("8", "PENDING", "32", "28", localDateTime4);
        java.lang.String str6 = scanIDSensorData5.getScanOutcome();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "28" + "'", str6, "28");
    }

    @Test
    public void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test741");
        Service.RoomListFacade roomListFacade0 = new Service.RoomListFacade();
        java.util.List<Model.Room.RoomProxy> roomProxyList1 = roomListFacade0.getAllRoomsForAdmin();
        java.util.List<Model.Room.RoomProxy> roomProxyList2 = roomListFacade0.getAllRoomsForAdmin();
        java.util.List<Model.Room.RoomProxy> roomProxyList3 = roomListFacade0.getAllRoomsForAdmin();
        java.util.List<Model.Room.RoomProxy> roomProxyList4 = roomListFacade0.getAllRoomsForAdmin();
        java.util.List<Model.Room.RoomProxy> roomProxyList5 = roomListFacade0.getAvailableRoomsForGuest();
        org.junit.Assert.assertNotNull(roomProxyList1);
        org.junit.Assert.assertNotNull(roomProxyList2);
        org.junit.Assert.assertNotNull(roomProxyList3);
        org.junit.Assert.assertNotNull(roomProxyList4);
        org.junit.Assert.assertNotNull(roomProxyList5);
    }

    @Test
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test742");
        Model.State.CheckInState checkInState0 = new Model.State.CheckInState();
        Model.State.CancelledState cancelledState1 = new Model.State.CancelledState();
        Model.State.CancelledState cancelledState2 = new Model.State.CancelledState();
        Model.State.CompletedState completedState3 = new Model.State.CompletedState();
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        java.time.LocalTime localTime9 = null;
        java.time.LocalTime localTime10 = null;
        Model.Room.Booking booking12 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate7, localDate8, localTime9, localTime10, "");
        completedState3.checkOut(booking12);
        java.lang.String str14 = completedState3.getStatus();
        Model.State.CompletedState completedState15 = new Model.State.CompletedState();
        java.time.LocalDate localDate19 = null;
        java.time.LocalDate localDate20 = null;
        java.time.LocalTime localTime21 = null;
        java.time.LocalTime localTime22 = null;
        Model.Room.Booking booking24 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate19, localDate20, localTime21, localTime22, "");
        completedState15.checkOut(booking24);
        java.time.LocalDate localDate29 = null;
        java.time.LocalDate localDate30 = null;
        java.time.LocalTime localTime31 = null;
        java.time.LocalTime localTime32 = null;
        Model.Room.Booking booking34 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate29, localDate30, localTime31, localTime32, "");
        completedState15.checkOut(booking34);
        completedState3.checkIn(booking34);
        cancelledState2.checkOut(booking34);
        Model.State.CompletedState completedState38 = new Model.State.CompletedState();
        java.time.LocalDate localDate42 = null;
        java.time.LocalDate localDate43 = null;
        java.time.LocalTime localTime44 = null;
        java.time.LocalTime localTime45 = null;
        Model.Room.Booking booking47 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate42, localDate43, localTime44, localTime45, "");
        completedState38.checkOut(booking47);
        java.time.LocalDate localDate52 = null;
        java.time.LocalDate localDate53 = null;
        java.time.LocalTime localTime54 = null;
        java.time.LocalTime localTime55 = null;
        Model.Room.Booking booking57 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate52, localDate53, localTime54, localTime55, "");
        java.lang.String str58 = booking57.getBookingId();
        Model.State.BookingState bookingState59 = null;
        booking57.setState(bookingState59);
        Model.State.CompletedState completedState61 = new Model.State.CompletedState();
        booking57.setState((Model.State.BookingState) completedState61);
        completedState38.checkOut(booking57);
        booking57.performCheckOut();
        java.lang.String str65 = booking57.getBookingId();
        cancelledState2.checkOut(booking57);
        java.time.LocalDate localDate70 = null;
        java.time.LocalDate localDate71 = null;
        java.time.LocalTime localTime72 = null;
        java.time.LocalTime localTime73 = null;
        Model.Room.Booking booking75 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate70, localDate71, localTime72, localTime73, "");
        java.lang.String str76 = booking75.getBookingId();
        cancelledState2.cancel(booking75);
        booking75.performCheckOut();
        cancelledState1.cancel(booking75);
        checkInState0.cancel(booking75);
        java.time.LocalDate localDate81 = booking75.getStartDate();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "COMPLETED" + "'", str14, "COMPLETED");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertNull(localDate81);
    }

    @Test
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test743");
        Model.State.ConfirmedState confirmedState0 = new Model.State.ConfirmedState();
        Model.State.CompletedState completedState1 = new Model.State.CompletedState();
        java.time.LocalDate localDate5 = null;
        java.time.LocalDate localDate6 = null;
        java.time.LocalTime localTime7 = null;
        java.time.LocalTime localTime8 = null;
        Model.Room.Booking booking10 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate5, localDate6, localTime7, localTime8, "");
        completedState1.checkOut(booking10);
        java.lang.String str12 = booking10.getStatus();
        booking10.performCheckIn();
        confirmedState0.cancel(booking10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "CONFIRMED" + "'", str12, "CONFIRMED");
    }

    @Test
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test744");
        Model.User.FacultyUser facultyUser7 = new Model.User.FacultyUser("EECS3311 Course Project Database - Rooms.csv", "", "COMPLETED");
        Service.UserService userService8 = new Service.UserService();
        Model.User.AccountType accountType9 = Model.User.AccountType.PARTNER;
        Model.User.User user13 = userService8.createUser(accountType9, "", "DISABLED", "4");
        facultyUser7.setAccountType(accountType9);
        double double15 = accountType9.getHourlyRate();
        Model.User.User user18 = Model.User.UserFactory.createUserFromCsv("EECS3311 Course Project Database - Bookings.csv", "READY_FOR_ENABLE", "", "src/main/data/occupancy_sensor_logs.csv", accountType9, false, "EECS3311 Course Project Database - Bookings.csv");
        boolean boolean19 = user18.isVerified();
        org.junit.Assert.assertTrue("'" + accountType9 + "' != '" + Model.User.AccountType.PARTNER + "'", accountType9.equals(Model.User.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 50.0d + "'", double15 == 50.0d);
        org.junit.Assert.assertNotNull(user18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test745");
        Repository.BookingRepository bookingRepository0 = Repository.BookingRepository.getInstance();
        java.util.List<Model.Room.Booking> bookingList1 = bookingRepository0.findAll();
        Model.State.CompletedState completedState2 = new Model.State.CompletedState();
        java.time.LocalDate localDate6 = null;
        java.time.LocalDate localDate7 = null;
        java.time.LocalTime localTime8 = null;
        java.time.LocalTime localTime9 = null;
        Model.Room.Booking booking11 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate6, localDate7, localTime8, localTime9, "");
        completedState2.checkOut(booking11);
        java.lang.String str13 = completedState2.getStatus();
        Model.State.CompletedState completedState14 = new Model.State.CompletedState();
        java.time.LocalDate localDate18 = null;
        java.time.LocalDate localDate19 = null;
        java.time.LocalTime localTime20 = null;
        java.time.LocalTime localTime21 = null;
        Model.Room.Booking booking23 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate18, localDate19, localTime20, localTime21, "");
        completedState14.checkOut(booking23);
        java.time.LocalDate localDate28 = null;
        java.time.LocalDate localDate29 = null;
        java.time.LocalTime localTime30 = null;
        java.time.LocalTime localTime31 = null;
        Model.Room.Booking booking33 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate28, localDate29, localTime30, localTime31, "");
        completedState14.checkOut(booking33);
        completedState2.checkIn(booking33);
        bookingRepository0.save(booking33);
        java.lang.String str37 = booking33.getPaymentId();
        org.junit.Assert.assertNotNull(bookingRepository0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "COMPLETED" + "'", str13, "COMPLETED");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test746");
        Repository.ServiceRequestRepository serviceRequestRepository0 = Repository.ServiceRequestRepository.getInstance();
        Repository.ServiceRequestRepository serviceRequestRepository1 = Repository.ServiceRequestRepository.getInstance();
        Model.ServiceRequest.SensorEssentialServiceRequest sensorEssentialServiceRequest7 = new Model.ServiceRequest.SensorEssentialServiceRequest(1, "COMPLETED", "Service.AuthenticationException: ", (int) 'a', (int) (short) -1);
        sensorEssentialServiceRequest7.assignRoomID(100);
        java.lang.String str10 = sensorEssentialServiceRequest7.getStatus();
        serviceRequestRepository1.updateExistingServiceRequest((Model.ServiceRequest.ServiceRequest) sensorEssentialServiceRequest7);
        Model.ServiceRequest.SensorEssentialServiceRequest sensorEssentialServiceRequest17 = new Model.ServiceRequest.SensorEssentialServiceRequest((int) (short) 100, "CHECKED_IN", "EECS3311 Course Project Database - Bookings.csv", 0, (int) (byte) 0);
        serviceRequestRepository1.updateExistingServiceRequest((Model.ServiceRequest.ServiceRequest) sensorEssentialServiceRequest17);
        java.util.Map<java.lang.Integer, java.util.List<Model.ServiceRequest.ServiceRequest>> intMap21 = serviceRequestRepository1.parseCsvFileToMap("EECS3311 Course Project Database - Bookings.csv", true);
        boolean boolean23 = serviceRequestRepository0.saveMapToCsv(intMap21, "Service.AuthenticationException: ");
        Model.ServiceRequest.SensorEssentialServiceRequest sensorEssentialServiceRequest29 = new Model.ServiceRequest.SensorEssentialServiceRequest(1, "COMPLETED", "Service.AuthenticationException: ", (int) 'a', (int) (short) -1);
        sensorEssentialServiceRequest29.assignRoomID(100);
        java.lang.String str32 = sensorEssentialServiceRequest29.getStatus();
        sensorEssentialServiceRequest29.assignRoomID((int) (byte) 1);
        sensorEssentialServiceRequest29.setStatus("CHECKED_IN");
        Model.ServiceRequest.ServiceRequest serviceRequest37 = serviceRequestRepository0.addServiceRequest((Model.ServiceRequest.ServiceRequest) sensorEssentialServiceRequest29);
        sensorEssentialServiceRequest29.assignRoomID((int) ' ');
        org.junit.Assert.assertNotNull(serviceRequestRepository0);
        org.junit.Assert.assertNotNull(serviceRequestRepository1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Service.AuthenticationException: " + "'", str10, "Service.AuthenticationException: ");
        org.junit.Assert.assertNotNull(intMap21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Service.AuthenticationException: " + "'", str32, "Service.AuthenticationException: ");
        org.junit.Assert.assertNotNull(serviceRequest37);
    }

    @Test
    public void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test747");
        Model.User.StaffUser staffUser6 = new Model.User.StaffUser("Service.AuthenticationException: Service.AuthenticationException: ", "39", "src/main/data/sensors.csv", "1bec99b6-9fd5-4eb6-be48-3e7f52439881", false, "22");
        java.lang.String str7 = staffUser6.getName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "39" + "'", str7, "39");
    }

    @Test
    public void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test748");
        Model.State.RoomEnabledState roomEnabledState0 = new Model.State.RoomEnabledState();
        boolean boolean1 = roomEnabledState0.isBookable();
        Model.Room.Room room6 = new Model.Room.Room("STAFF", "1", (double) (byte) 10, "2");
        roomEnabledState0.maintain(room6);
        java.lang.String str8 = room6.getRoomCapacity();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2" + "'", str8, "2");
    }

    @Test
    public void test749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test749");
        Service.AuthenticationService authenticationService0 = new Service.AuthenticationService();
        boolean boolean2 = authenticationService0.properEmail("4");
        boolean boolean4 = authenticationService0.properEmail("EECS3311 Course Project Database - Bookings.csv");
        boolean boolean6 = authenticationService0.isYorkEmail("28");
        authenticationService0.logout();
        authenticationService0.logout();
        authenticationService0.logout();
        boolean boolean11 = authenticationService0.properEmail("fbbbcaba-993f-4a8c-b2c7-c52622963377");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test750");
        java.time.LocalDateTime localDateTime4 = null;
        Model.Sensor.ScanIDSensorData scanIDSensorData5 = new Model.Sensor.ScanIDSensorData("14", "77", "48", "72", localDateTime4);
    }

    @Test
    public void test751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test751");
        Service.EvaluateRoomMaintenanceRelationshipService evaluateRoomMaintenanceRelationshipService0 = Service.EvaluateRoomMaintenanceRelationshipService.getInstance();
        evaluateRoomMaintenanceRelationshipService0.notifyObservers();
        Service.RoomService roomService2 = new Service.RoomService();
        roomService2.maintenanceCompleted("");
        boolean boolean6 = roomService2.performCheckOut("");
        roomService2.maintenanceCompleted("1");
        boolean boolean10 = roomService2.performCheckOut("CHECKED_IN");
        Service.RoomService roomService11 = roomService2.getInstance();
        roomService2.savePayment("DISABLED", (double) (byte) -1);
        evaluateRoomMaintenanceRelationshipService0.registerObserver((Model.Room.Observer) roomService2);
        boolean boolean17 = roomService2.cancelBooking("31");
        java.time.LocalDate localDate20 = null;
        java.time.LocalDate localDate21 = null;
        java.time.LocalTime localTime22 = null;
        java.time.LocalTime localTime23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = roomService2.createBooking("", "78", localDate20, localDate21, localTime22, localTime23, "fbbbcaba-993f-4a8c-b2c7-c52622963377");
// flaky "33) test751(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evaluateRoomMaintenanceRelationshipService0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(roomService11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test752");
        Model.State.RoomEnabledState roomEnabledState0 = new Model.State.RoomEnabledState();
        Model.State.RoomReadyForEnableState roomReadyForEnableState1 = new Model.State.RoomReadyForEnableState();
        Model.State.RoomEnabledState roomEnabledState2 = new Model.State.RoomEnabledState();
        boolean boolean3 = roomEnabledState2.isBookable();
        Model.State.RoomReadyForEnableState roomReadyForEnableState4 = new Model.State.RoomReadyForEnableState();
        boolean boolean5 = roomReadyForEnableState4.isBookable();
        Model.Room.Room room10 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        roomReadyForEnableState4.disable(room10);
        roomEnabledState2.maintain(room10);
        roomReadyForEnableState1.maintain(room10);
        roomEnabledState0.disable(room10);
        Model.State.RoomReadyForEnableState roomReadyForEnableState15 = new Model.State.RoomReadyForEnableState();
        boolean boolean16 = roomReadyForEnableState15.isBookable();
        room10.setState((Model.State.RoomState) roomReadyForEnableState15);
        Model.State.RoomDisabledState roomDisabledState18 = new Model.State.RoomDisabledState();
        Model.State.RoomDisabledState roomDisabledState19 = new Model.State.RoomDisabledState();
        boolean boolean20 = roomDisabledState19.isBookable();
        boolean boolean21 = roomDisabledState19.isBookable();
        boolean boolean22 = roomDisabledState19.isBookable();
        Model.Room.Room room27 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        boolean boolean28 = room27.isAvailable();
        roomDisabledState19.maintain(room27);
        roomDisabledState18.maintain(room27);
        Model.State.RoomDisabledState roomDisabledState31 = new Model.State.RoomDisabledState();
        boolean boolean32 = roomDisabledState31.isBookable();
        boolean boolean33 = roomDisabledState31.isBookable();
        boolean boolean34 = roomDisabledState31.isBookable();
        Model.Room.Room room39 = new Model.Room.Room("COMPLETED", "hi!", (double) 100.0f, "2");
        roomDisabledState31.maintain(room39);
        Model.Room.AdminRoomProxy adminRoomProxy41 = new Model.Room.AdminRoomProxy(room39);
        roomDisabledState18.enable(room39);
        roomReadyForEnableState15.maintain(room39);
        Model.State.RoomEnabledState roomEnabledState44 = new Model.State.RoomEnabledState();
        boolean boolean45 = roomEnabledState44.isBookable();
        Model.State.RoomReadyForEnableState roomReadyForEnableState46 = new Model.State.RoomReadyForEnableState();
        Model.State.RoomEnabledState roomEnabledState47 = new Model.State.RoomEnabledState();
        boolean boolean48 = roomEnabledState47.isBookable();
        Model.State.RoomReadyForEnableState roomReadyForEnableState49 = new Model.State.RoomReadyForEnableState();
        boolean boolean50 = roomReadyForEnableState49.isBookable();
        Model.Room.Room room55 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        roomReadyForEnableState49.disable(room55);
        roomEnabledState47.maintain(room55);
        roomReadyForEnableState46.maintain(room55);
        roomEnabledState44.enable(room55);
        roomReadyForEnableState15.disable(room55);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test753");
        Repository.UserRepository userRepository0 = Repository.UserRepository.getInstance();
        int int1 = userRepository0.getAll();
        Model.User.User user3 = userRepository0.findByEmail("PENDING");
        Model.User.StudentUser studentUser10 = new Model.User.StudentUser("hi!", "", "", "src/main/data/users.csv", false, "src/main/data/users.csv");
        java.lang.String str11 = studentUser10.getEmail();
        Application.SessionData.setCurrentUser((Model.User.User) studentUser10);
        studentUser10.setPassword("DISABLED");
        boolean boolean15 = studentUser10.isVerified();
        Model.User.AccountType accountType16 = studentUser10.getAccountType();
        userRepository0.save((Model.User.User) studentUser10);
        Service.UserService userService18 = new Service.UserService();
        Model.User.AccountType accountType19 = Model.User.AccountType.PARTNER;
        Model.User.User user23 = userService18.createUser(accountType19, "", "DISABLED", "4");
        Model.User.User user27 = Model.User.UserFactory.createUser(accountType19, "3", "9", "EECS3311 Course Project Database - Bookings.csv");
        userRepository0.save(user27);
        org.junit.Assert.assertNotNull(userRepository0);
// flaky "34) test753(RegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 66 + "'", int1 == 66);
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + accountType16 + "' != '" + Model.User.AccountType.STUDENT + "'", accountType16.equals(Model.User.AccountType.STUDENT));
        org.junit.Assert.assertTrue("'" + accountType19 + "' != '" + Model.User.AccountType.PARTNER + "'", accountType19.equals(Model.User.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(user23);
        org.junit.Assert.assertNotNull(user27);
    }

    @Test
    public void test754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test754");
        Service.AuthenticationException authenticationException1 = new Service.AuthenticationException("32");
        Service.AuthenticationException authenticationException3 = new Service.AuthenticationException("");
        Service.AuthenticationException authenticationException5 = new Service.AuthenticationException("32");
        authenticationException3.addSuppressed((java.lang.Throwable) authenticationException5);
        authenticationException1.addSuppressed((java.lang.Throwable) authenticationException3);
    }

    @Test
    public void test755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test755");
        Repository.BookingRepository bookingRepository0 = Repository.BookingRepository.getInstance();
        java.util.List<Model.Room.Booking> bookingList1 = bookingRepository0.findAll();
        Model.State.CompletedState completedState2 = new Model.State.CompletedState();
        java.time.LocalDate localDate6 = null;
        java.time.LocalDate localDate7 = null;
        java.time.LocalTime localTime8 = null;
        java.time.LocalTime localTime9 = null;
        Model.Room.Booking booking11 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate6, localDate7, localTime8, localTime9, "");
        completedState2.checkOut(booking11);
        java.time.LocalDate localDate13 = booking11.getEndDate();
        bookingRepository0.save(booking11);
        Model.Room.Booking booking16 = bookingRepository0.findById("");
        booking16.performCheckOut();
        booking16.setPaymentId("34");
        java.time.LocalDate localDate20 = booking16.getEndDate();
        org.junit.Assert.assertNotNull(bookingRepository0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertNotNull(booking16);
        org.junit.Assert.assertNull(localDate20);
    }

    @Test
    public void test756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test756");
        Model.ServiceRequest.SensorEssentialServiceRequest sensorEssentialServiceRequest5 = new Model.ServiceRequest.SensorEssentialServiceRequest((int) (short) -1, "4", "hi!", (-1), (int) ' ');
        sensorEssentialServiceRequest5.setDescription("src/main/data/scanid_sensor_logs.csv");
        sensorEssentialServiceRequest5.assignRoomID(1);
        int int10 = sensorEssentialServiceRequest5.getSensorID();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
    }

    @Test
    public void test757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test757");
        Model.ServiceRequest.SensorEssentialServiceRequest sensorEssentialServiceRequest5 = new Model.ServiceRequest.SensorEssentialServiceRequest(1, "COMPLETED", "Service.AuthenticationException: ", (int) 'a', (int) (short) -1);
        sensorEssentialServiceRequest5.assignRoomID(100);
        java.lang.String str8 = sensorEssentialServiceRequest5.getStatus();
        sensorEssentialServiceRequest5.assignRoomID((int) (byte) 1);
        java.lang.String str11 = sensorEssentialServiceRequest5.getDescription();
        int int12 = sensorEssentialServiceRequest5.getServiceRequestID();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Service.AuthenticationException: " + "'", str8, "Service.AuthenticationException: ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "COMPLETED" + "'", str11, "COMPLETED");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test758");
        Service.EvaluateRoomMaintenanceRelationshipService evaluateRoomMaintenanceRelationshipService0 = Service.EvaluateRoomMaintenanceRelationshipService.getInstance();
        evaluateRoomMaintenanceRelationshipService0.notifyObservers();
        Service.RoomService roomService2 = new Service.RoomService();
        roomService2.update(true, (int) (short) 10);
        Model.Room.Booking booking7 = roomService2.getBookingDetails("src/main/data/users.csv");
        boolean boolean9 = roomService2.cancelBooking("hi!");
        Controller.AddRoomController addRoomController10 = new Controller.AddRoomController(roomService2);
        evaluateRoomMaintenanceRelationshipService0.removeObserver((Model.Room.Observer) roomService2);
        Service.RoomService roomService12 = new Service.RoomService();
        roomService12.maintenanceCompleted("");
        evaluateRoomMaintenanceRelationshipService0.removeObserver((Model.Room.Observer) roomService12);
        evaluateRoomMaintenanceRelationshipService0.evaluateRoomMaintenanceRelationship((int) (short) 1);
        Service.RoomService roomService18 = new Service.RoomService();
        roomService18.update(true, (int) (short) 10);
        boolean boolean23 = roomService18.performCheckOut("hi!");
        java.lang.String str27 = roomService18.createRoom("", (double) '4', "src/main/data/users.csv");
        Service.RoomService roomService28 = roomService18.getInstance();
        Controller.AddRoomController addRoomController29 = new Controller.AddRoomController(roomService28);
        evaluateRoomMaintenanceRelationshipService0.registerObserver((Model.Room.Observer) roomService28);
        Service.GetMaintenanceRequestService getMaintenanceRequestService32 = Service.GetMaintenanceRequestService.getInstance();
        java.util.ArrayList<Model.ServiceRequest.ServiceRequest> serviceRequestList35 = getMaintenanceRequestService32.getServiceRequests((int) (byte) 0, false);
        boolean boolean36 = evaluateRoomMaintenanceRelationshipService0.doesRoomHaveEssentialMaintenanceRequests(0, getMaintenanceRequestService32);
        org.junit.Assert.assertNotNull(evaluateRoomMaintenanceRelationshipService0);
        org.junit.Assert.assertNull(booking7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
// flaky "35) test758(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "89" + "'", str27, "89");
        org.junit.Assert.assertNotNull(roomService28);
        org.junit.Assert.assertNotNull(getMaintenanceRequestService32);
        org.junit.Assert.assertNotNull(serviceRequestList35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test759");
        Service.RoomService roomService0 = new Service.RoomService();
        roomService0.update(true, (int) (short) 10);
        Model.Room.Booking booking5 = roomService0.getBookingDetails("src/main/data/users.csv");
        boolean boolean7 = roomService0.cancelBooking("hi!");
        roomService0.disableRoom("hi!");
        roomService0.disableRoom("1");
        Service.RoomService roomService12 = roomService0.getInstance();
        Service.RoomService roomService13 = roomService12.getInstance();
        roomService13.disableRoom("READY_FOR_ENABLE");
        roomService13.disableRoom("20");
        Service.RoomService roomService18 = roomService13.getInstance();
        Service.RoomService roomService19 = roomService18.getInstance();
        Controller.AddRoomController addRoomController20 = new Controller.AddRoomController(roomService19);
        org.junit.Assert.assertNull(booking5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(roomService12);
        org.junit.Assert.assertNotNull(roomService13);
        org.junit.Assert.assertNotNull(roomService18);
        org.junit.Assert.assertNotNull(roomService19);
    }

    @Test
    public void test760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test760");
        Service.RoomService roomService0 = new Service.RoomService();
        roomService0.update(true, (int) (short) 10);
        Model.Room.Booking booking5 = roomService0.getBookingDetails("src/main/data/users.csv");
        boolean boolean7 = roomService0.cancelBooking("hi!");
        roomService0.disableRoom("hi!");
        roomService0.disableRoom("1");
        Model.Room.Booking booking13 = roomService0.getBookingDetails("hi!");
        roomService0.enableRoom("src/main/data/MaintenanceRequests.csv");
        boolean boolean17 = roomService0.performCheckOut("8");
        Controller.AddRoomController addRoomController18 = new Controller.AddRoomController(roomService0);
        org.junit.Assert.assertNull(booking5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(booking13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test761");
        Repository.PaymentRepository paymentRepository0 = Repository.PaymentRepository.getInstance();
        Model.Payment.Payment payment3 = new Model.Payment.Payment("", (double) (short) 10);
        paymentRepository0.save(payment3);
        Model.Payment.Payment payment7 = new Model.Payment.Payment("COMPLETED", (double) 0.0f);
        paymentRepository0.save(payment7);
        Repository.PaymentRepository paymentRepository9 = Repository.PaymentRepository.getInstance();
        Model.Payment.Payment payment12 = new Model.Payment.Payment("", (double) (short) 10);
        paymentRepository9.save(payment12);
        Model.Payment.Payment payment16 = new Model.Payment.Payment("COMPLETED", (double) 0.0f);
        paymentRepository9.save(payment16);
        Model.Payment.Payment payment20 = new Model.Payment.Payment("", (double) (byte) -1);
        java.lang.String str21 = payment20.getStatus();
        java.lang.String str22 = payment20.getPaymentId();
        payment20.completePayment();
        paymentRepository9.save(payment20);
        paymentRepository0.save(payment20);
        org.junit.Assert.assertNotNull(paymentRepository0);
        org.junit.Assert.assertNotNull(paymentRepository9);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "PENDING" + "'", str21, "PENDING");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test762");
        Repository.RoomRepository roomRepository0 = new Repository.RoomRepository();
        java.lang.String str1 = roomRepository0.generateNextId();
        java.util.List<Model.Room.Room> roomList2 = roomRepository0.findAll();
        java.lang.String str3 = roomRepository0.generateNextId();
// flaky "36) test762(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "90" + "'", str1, "90");
        org.junit.Assert.assertNotNull(roomList2);
// flaky "20) test762(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "90" + "'", str3, "90");
    }

    @Test
    public void test763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test763");
        Model.User.StudentUser studentUser3 = new Model.User.StudentUser("22", "57197862-2463-4972-b3b2-977245133f34", "21");
    }

    @Test
    public void test764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test764");
        Model.State.RoomEnabledState roomEnabledState0 = new Model.State.RoomEnabledState();
        Model.Room.Room room5 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        boolean boolean6 = room5.isAvailable();
        Model.Room.AdminRoomProxy adminRoomProxy7 = new Model.Room.AdminRoomProxy(room5);
        roomEnabledState0.disable(room5);
        boolean boolean9 = roomEnabledState0.isBookable();
        boolean boolean10 = roomEnabledState0.isBookable();
        Model.State.RoomReadyForEnableState roomReadyForEnableState11 = new Model.State.RoomReadyForEnableState();
        boolean boolean12 = roomReadyForEnableState11.isBookable();
        java.lang.String str13 = roomReadyForEnableState11.getStateName();
        Model.State.RoomEnabledState roomEnabledState14 = new Model.State.RoomEnabledState();
        boolean boolean15 = roomEnabledState14.isBookable();
        Model.State.RoomReadyForEnableState roomReadyForEnableState16 = new Model.State.RoomReadyForEnableState();
        boolean boolean17 = roomReadyForEnableState16.isBookable();
        Model.Room.Room room22 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        roomReadyForEnableState16.disable(room22);
        roomEnabledState14.maintain(room22);
        roomReadyForEnableState11.disable(room22);
        roomEnabledState0.disable(room22);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "READY_FOR_ENABLE" + "'", str13, "READY_FOR_ENABLE");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test765");
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        java.time.LocalTime localTime5 = null;
        java.time.LocalTime localTime6 = null;
        Model.Room.Booking booking8 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate3, localDate4, localTime5, localTime6, "");
        java.lang.String str9 = booking8.getBookingId();
        Model.State.BookingState bookingState10 = null;
        booking8.setState(bookingState10);
        java.time.LocalDate localDate12 = booking8.getStartDate();
        java.lang.String str13 = booking8.getBookingId();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test766");
        Service.RoomService roomService0 = new Service.RoomService();
        Service.RoomService roomService1 = roomService0.getInstance();
        org.junit.Assert.assertNotNull(roomService1);
    }

    @Test
    public void test767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test767");
        Model.State.ConfirmedState confirmedState0 = new Model.State.ConfirmedState();
        java.time.LocalDate localDate4 = null;
        java.time.LocalDate localDate5 = null;
        java.time.LocalTime localTime6 = null;
        java.time.LocalTime localTime7 = null;
        Model.Room.Booking booking9 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate4, localDate5, localTime6, localTime7, "");
        java.lang.String str10 = booking9.getBookingId();
        Model.State.BookingState bookingState11 = null;
        booking9.setState(bookingState11);
        java.time.LocalDate localDate13 = booking9.getStartDate();
        confirmedState0.checkIn(booking9);
        Model.State.CompletedState completedState15 = new Model.State.CompletedState();
        java.time.LocalDate localDate19 = null;
        java.time.LocalDate localDate20 = null;
        java.time.LocalTime localTime21 = null;
        java.time.LocalTime localTime22 = null;
        Model.Room.Booking booking24 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate19, localDate20, localTime21, localTime22, "");
        completedState15.checkOut(booking24);
        java.time.LocalDate localDate29 = null;
        java.time.LocalDate localDate30 = null;
        java.time.LocalTime localTime31 = null;
        java.time.LocalTime localTime32 = null;
        Model.Room.Booking booking34 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate29, localDate30, localTime31, localTime32, "");
        java.lang.String str35 = booking34.getBookingId();
        Model.State.BookingState bookingState36 = null;
        booking34.setState(bookingState36);
        Model.State.CompletedState completedState38 = new Model.State.CompletedState();
        booking34.setState((Model.State.BookingState) completedState38);
        completedState15.checkOut(booking34);
        booking34.performCancel();
        confirmedState0.checkOut(booking34);
        Model.State.CompletedState completedState43 = new Model.State.CompletedState();
        java.time.LocalDate localDate47 = null;
        java.time.LocalDate localDate48 = null;
        java.time.LocalTime localTime49 = null;
        java.time.LocalTime localTime50 = null;
        Model.Room.Booking booking52 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate47, localDate48, localTime49, localTime50, "");
        completedState43.checkOut(booking52);
        java.time.LocalDate localDate57 = null;
        java.time.LocalDate localDate58 = null;
        java.time.LocalTime localTime59 = null;
        java.time.LocalTime localTime60 = null;
        Model.Room.Booking booking62 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate57, localDate58, localTime59, localTime60, "");
        java.lang.String str63 = booking62.getBookingId();
        Model.State.BookingState bookingState64 = null;
        booking62.setState(bookingState64);
        Model.State.CompletedState completedState66 = new Model.State.CompletedState();
        booking62.setState((Model.State.BookingState) completedState66);
        completedState43.checkOut(booking62);
        booking62.performCheckOut();
        java.lang.String str70 = booking62.getBookingId();
        booking62.performCheckIn();
        confirmedState0.checkOut(booking62);
        java.lang.String str73 = confirmedState0.getStatus();
        Model.State.CompletedState completedState74 = new Model.State.CompletedState();
        java.time.LocalDate localDate78 = null;
        java.time.LocalDate localDate79 = null;
        java.time.LocalTime localTime80 = null;
        java.time.LocalTime localTime81 = null;
        Model.Room.Booking booking83 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate78, localDate79, localTime80, localTime81, "");
        completedState74.checkOut(booking83);
        java.lang.String str85 = booking83.getStatus();
        booking83.performCheckIn();
        confirmedState0.checkOut(booking83);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "CONFIRMED" + "'", str73, "CONFIRMED");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "CONFIRMED" + "'", str85, "CONFIRMED");
    }

    @Test
    public void test768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test768");
        Model.State.CheckInState checkInState0 = new Model.State.CheckInState();
        java.lang.String str1 = checkInState0.getStatus();
        java.lang.String str2 = checkInState0.getStatus();
        Model.State.CompletedState completedState3 = new Model.State.CompletedState();
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        java.time.LocalTime localTime9 = null;
        java.time.LocalTime localTime10 = null;
        Model.Room.Booking booking12 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate7, localDate8, localTime9, localTime10, "");
        completedState3.checkOut(booking12);
        java.time.LocalDate localDate17 = null;
        java.time.LocalDate localDate18 = null;
        java.time.LocalTime localTime19 = null;
        java.time.LocalTime localTime20 = null;
        Model.Room.Booking booking22 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate17, localDate18, localTime19, localTime20, "");
        java.lang.String str23 = booking22.getBookingId();
        Model.State.BookingState bookingState24 = null;
        booking22.setState(bookingState24);
        Model.State.CompletedState completedState26 = new Model.State.CompletedState();
        booking22.setState((Model.State.BookingState) completedState26);
        completedState3.checkOut(booking22);
        booking22.performCheckOut();
        java.lang.String str30 = booking22.getBookingId();
        checkInState0.checkIn(booking22);
        java.time.LocalDate localDate32 = booking22.getStartDate();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CHECKED_IN" + "'", str1, "CHECKED_IN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CHECKED_IN" + "'", str2, "CHECKED_IN");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNull(localDate32);
    }

    @Test
    public void test769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test769");
        Model.State.CheckInState checkInState0 = new Model.State.CheckInState();
        java.lang.String str1 = checkInState0.getStatus();
        java.lang.String str2 = checkInState0.getStatus();
        java.lang.String str3 = checkInState0.getStatus();
        Model.State.CompletedState completedState4 = new Model.State.CompletedState();
        java.time.LocalDate localDate8 = null;
        java.time.LocalDate localDate9 = null;
        java.time.LocalTime localTime10 = null;
        java.time.LocalTime localTime11 = null;
        Model.Room.Booking booking13 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate8, localDate9, localTime10, localTime11, "");
        completedState4.checkOut(booking13);
        java.time.LocalDate localDate15 = booking13.getEndDate();
        checkInState0.checkOut(booking13);
        java.time.LocalDate localDate20 = null;
        java.time.LocalDate localDate21 = null;
        java.time.LocalTime localTime22 = null;
        java.time.LocalTime localTime23 = null;
        Model.Room.Booking booking25 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate20, localDate21, localTime22, localTime23, "");
        checkInState0.checkOut(booking25);
        java.lang.String str27 = booking25.getStatus();
        java.time.LocalDate localDate28 = booking25.getStartDate();
        java.time.LocalTime localTime29 = booking25.getEndTime();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CHECKED_IN" + "'", str1, "CHECKED_IN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CHECKED_IN" + "'", str2, "CHECKED_IN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CHECKED_IN" + "'", str3, "CHECKED_IN");
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "COMPLETED" + "'", str27, "COMPLETED");
        org.junit.Assert.assertNull(localDate28);
        org.junit.Assert.assertNull(localTime29);
    }

    @Test
    public void test770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test770");
        Model.ServiceRequest.EssentialServiceRequest essentialServiceRequest4 = new Model.ServiceRequest.EssentialServiceRequest(1, "32", "39", (int) (short) -1);
        boolean boolean5 = essentialServiceRequest4.isEssential();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test771");
        Model.User.EventCoordinator eventCoordinator0 = Model.User.EventCoordinator.getInstance();
        java.lang.String str1 = eventCoordinator0.getChiefEventCoordinatorName();
        java.lang.String str2 = eventCoordinator0.getChiefEventCoordinatorEmail();
        java.lang.String str3 = eventCoordinator0.getChiefEventCoordinatorEmail();
        java.lang.String str4 = eventCoordinator0.getChiefEventCoordinatorEmail();
        java.lang.String str5 = eventCoordinator0.getChiefEventCoordinatorName();
        org.junit.Assert.assertNotNull(eventCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "John Smith" + "'", str1, "John Smith");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jsmith@yorku.ca" + "'", str2, "jsmith@yorku.ca");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jsmith@yorku.ca" + "'", str3, "jsmith@yorku.ca");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jsmith@yorku.ca" + "'", str4, "jsmith@yorku.ca");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "John Smith" + "'", str5, "John Smith");
    }

    @Test
    public void test772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test772");
        Model.State.CheckInState checkInState0 = new Model.State.CheckInState();
        java.lang.String str1 = checkInState0.getStatus();
        java.lang.String str2 = checkInState0.getStatus();
        java.lang.String str3 = checkInState0.getStatus();
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        java.time.LocalTime localTime9 = null;
        java.time.LocalTime localTime10 = null;
        Model.Room.Booking booking12 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate7, localDate8, localTime9, localTime10, "");
        java.lang.String str13 = booking12.getBookingId();
        java.time.LocalTime localTime14 = booking12.getStartTime();
        checkInState0.cancel(booking12);
        java.lang.String str16 = checkInState0.getStatus();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CHECKED_IN" + "'", str1, "CHECKED_IN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CHECKED_IN" + "'", str2, "CHECKED_IN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CHECKED_IN" + "'", str3, "CHECKED_IN");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(localTime14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "CHECKED_IN" + "'", str16, "CHECKED_IN");
    }

    @Test
    public void test773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test773");
        Model.Sensor.Sensor sensor5 = new Model.Sensor.Sensor("14", "PARTNER", "79", "", true);
    }

    @Test
    public void test774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test774");
        java.time.LocalDateTime localDateTime4 = null;
        Model.Sensor.ScanIDSensorData scanIDSensorData5 = new Model.Sensor.ScanIDSensorData("src/main/data/occupancy_sensor_logs.csv", "76", "4", "2", localDateTime4);
    }

    @Test
    public void test775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test775");
        Repository.ServiceRequestRepository serviceRequestRepository0 = Repository.ServiceRequestRepository.getInstance();
        Model.ServiceRequest.SensorEssentialServiceRequest sensorEssentialServiceRequest6 = new Model.ServiceRequest.SensorEssentialServiceRequest(1, "COMPLETED", "Service.AuthenticationException: ", (int) 'a', (int) (short) -1);
        sensorEssentialServiceRequest6.assignRoomID(100);
        java.lang.String str9 = sensorEssentialServiceRequest6.getStatus();
        serviceRequestRepository0.updateExistingServiceRequest((Model.ServiceRequest.ServiceRequest) sensorEssentialServiceRequest6);
        Model.ServiceRequest.SensorEssentialServiceRequest sensorEssentialServiceRequest16 = new Model.ServiceRequest.SensorEssentialServiceRequest((int) (short) 100, "CHECKED_IN", "EECS3311 Course Project Database - Bookings.csv", 0, (int) (byte) 0);
        serviceRequestRepository0.updateExistingServiceRequest((Model.ServiceRequest.ServiceRequest) sensorEssentialServiceRequest16);
        java.util.Map<java.lang.Integer, java.util.List<Model.ServiceRequest.ServiceRequest>> intMap20 = serviceRequestRepository0.parseCsvFileToMap("EECS3311 Course Project Database - Bookings.csv", true);
        Repository.ServiceRequestRepository serviceRequestRepository21 = Repository.ServiceRequestRepository.getInstance();
        Repository.ServiceRequestRepository serviceRequestRepository22 = Repository.ServiceRequestRepository.getInstance();
        Repository.ServiceRequestRepository serviceRequestRepository23 = Repository.ServiceRequestRepository.getInstance();
        Model.ServiceRequest.SensorEssentialServiceRequest sensorEssentialServiceRequest29 = new Model.ServiceRequest.SensorEssentialServiceRequest(1, "COMPLETED", "Service.AuthenticationException: ", (int) 'a', (int) (short) -1);
        sensorEssentialServiceRequest29.assignRoomID(100);
        java.lang.String str32 = sensorEssentialServiceRequest29.getStatus();
        serviceRequestRepository23.updateExistingServiceRequest((Model.ServiceRequest.ServiceRequest) sensorEssentialServiceRequest29);
        Model.ServiceRequest.SensorEssentialServiceRequest sensorEssentialServiceRequest39 = new Model.ServiceRequest.SensorEssentialServiceRequest((int) (short) 100, "CHECKED_IN", "EECS3311 Course Project Database - Bookings.csv", 0, (int) (byte) 0);
        serviceRequestRepository23.updateExistingServiceRequest((Model.ServiceRequest.ServiceRequest) sensorEssentialServiceRequest39);
        java.util.Map<java.lang.Integer, java.util.List<Model.ServiceRequest.ServiceRequest>> intMap43 = serviceRequestRepository23.parseCsvFileToMap("EECS3311 Course Project Database - Bookings.csv", true);
        boolean boolean45 = serviceRequestRepository22.saveMapToCsv(intMap43, "Service.AuthenticationException: ");
        boolean boolean47 = serviceRequestRepository21.saveMapToCsv(intMap43, "2");
        boolean boolean49 = serviceRequestRepository0.saveMapToCsv(intMap43, "CHECKED_IN");
        Model.ServiceRequest.SensorEssentialServiceRequest sensorEssentialServiceRequest55 = new Model.ServiceRequest.SensorEssentialServiceRequest(1, "COMPLETED", "Service.AuthenticationException: ", (int) 'a', (int) (short) -1);
        sensorEssentialServiceRequest55.assignRoomID(100);
        sensorEssentialServiceRequest55.assignRoomID((int) (short) 10);
        sensorEssentialServiceRequest55.assignRoomID((int) (byte) -1);
        java.lang.String str62 = sensorEssentialServiceRequest55.getDescription();
        Model.ServiceRequest.ServiceRequest serviceRequest63 = serviceRequestRepository0.addServiceRequest((Model.ServiceRequest.ServiceRequest) sensorEssentialServiceRequest55);
        serviceRequest63.setStatus("PENDING");
        java.lang.String str66 = serviceRequest63.getDescription();
        boolean boolean67 = serviceRequest63.isEssential;
        org.junit.Assert.assertNotNull(serviceRequestRepository0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Service.AuthenticationException: " + "'", str9, "Service.AuthenticationException: ");
        org.junit.Assert.assertNotNull(intMap20);
        org.junit.Assert.assertNotNull(serviceRequestRepository21);
        org.junit.Assert.assertNotNull(serviceRequestRepository22);
        org.junit.Assert.assertNotNull(serviceRequestRepository23);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Service.AuthenticationException: " + "'", str32, "Service.AuthenticationException: ");
        org.junit.Assert.assertNotNull(intMap43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "COMPLETED" + "'", str62, "COMPLETED");
        org.junit.Assert.assertNotNull(serviceRequest63);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "COMPLETED" + "'", str66, "COMPLETED");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test776");
        Model.State.CancelledState cancelledState0 = new Model.State.CancelledState();
        Model.State.CompletedState completedState1 = new Model.State.CompletedState();
        java.time.LocalDate localDate5 = null;
        java.time.LocalDate localDate6 = null;
        java.time.LocalTime localTime7 = null;
        java.time.LocalTime localTime8 = null;
        Model.Room.Booking booking10 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate5, localDate6, localTime7, localTime8, "");
        completedState1.checkOut(booking10);
        java.lang.String str12 = completedState1.getStatus();
        Model.State.CompletedState completedState13 = new Model.State.CompletedState();
        java.time.LocalDate localDate17 = null;
        java.time.LocalDate localDate18 = null;
        java.time.LocalTime localTime19 = null;
        java.time.LocalTime localTime20 = null;
        Model.Room.Booking booking22 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate17, localDate18, localTime19, localTime20, "");
        completedState13.checkOut(booking22);
        java.time.LocalDate localDate27 = null;
        java.time.LocalDate localDate28 = null;
        java.time.LocalTime localTime29 = null;
        java.time.LocalTime localTime30 = null;
        Model.Room.Booking booking32 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate27, localDate28, localTime29, localTime30, "");
        completedState13.checkOut(booking32);
        completedState1.checkIn(booking32);
        cancelledState0.checkOut(booking32);
        Model.State.CompletedState completedState36 = new Model.State.CompletedState();
        java.time.LocalDate localDate40 = null;
        java.time.LocalDate localDate41 = null;
        java.time.LocalTime localTime42 = null;
        java.time.LocalTime localTime43 = null;
        Model.Room.Booking booking45 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate40, localDate41, localTime42, localTime43, "");
        completedState36.checkOut(booking45);
        java.time.LocalDate localDate50 = null;
        java.time.LocalDate localDate51 = null;
        java.time.LocalTime localTime52 = null;
        java.time.LocalTime localTime53 = null;
        Model.Room.Booking booking55 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate50, localDate51, localTime52, localTime53, "");
        java.lang.String str56 = booking55.getBookingId();
        Model.State.BookingState bookingState57 = null;
        booking55.setState(bookingState57);
        Model.State.CompletedState completedState59 = new Model.State.CompletedState();
        booking55.setState((Model.State.BookingState) completedState59);
        completedState36.checkOut(booking55);
        booking55.performCheckOut();
        java.lang.String str63 = booking55.getBookingId();
        cancelledState0.checkOut(booking55);
        java.time.LocalDate localDate68 = null;
        java.time.LocalDate localDate69 = null;
        java.time.LocalTime localTime70 = null;
        java.time.LocalTime localTime71 = null;
        Model.Room.Booking booking73 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate68, localDate69, localTime70, localTime71, "");
        java.lang.String str74 = booking73.getBookingId();
        cancelledState0.cancel(booking73);
        java.lang.String str76 = cancelledState0.getStatus();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "COMPLETED" + "'", str12, "COMPLETED");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "CANCELLED" + "'", str76, "CANCELLED");
    }

    @Test
    public void test777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test777");
        Model.ServiceRequest.NonEssentialServiceRequest nonEssentialServiceRequest4 = new Model.ServiceRequest.NonEssentialServiceRequest(15, "1", "24", 0);
        int int5 = nonEssentialServiceRequest4.getServiceRequestID();
        boolean boolean6 = nonEssentialServiceRequest4.isEssential();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test778");
        Model.State.CompletedState completedState0 = new Model.State.CompletedState();
        java.time.LocalDate localDate4 = null;
        java.time.LocalDate localDate5 = null;
        java.time.LocalTime localTime6 = null;
        java.time.LocalTime localTime7 = null;
        Model.Room.Booking booking9 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate4, localDate5, localTime6, localTime7, "");
        completedState0.checkOut(booking9);
        java.time.LocalDate localDate14 = null;
        java.time.LocalDate localDate15 = null;
        java.time.LocalTime localTime16 = null;
        java.time.LocalTime localTime17 = null;
        Model.Room.Booking booking19 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate14, localDate15, localTime16, localTime17, "");
        java.lang.String str20 = booking19.getBookingId();
        Model.State.BookingState bookingState21 = null;
        booking19.setState(bookingState21);
        Model.State.CompletedState completedState23 = new Model.State.CompletedState();
        booking19.setState((Model.State.BookingState) completedState23);
        completedState0.checkOut(booking19);
        booking19.performCheckOut();
        java.lang.String str27 = booking19.getBookingId();
        booking19.performCheckIn();
        booking19.performCancel();
        booking19.performCheckOut();
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test779");
        Model.State.RoomEnabledState roomEnabledState0 = new Model.State.RoomEnabledState();
        Model.State.RoomReadyForEnableState roomReadyForEnableState1 = new Model.State.RoomReadyForEnableState();
        Model.State.RoomEnabledState roomEnabledState2 = new Model.State.RoomEnabledState();
        boolean boolean3 = roomEnabledState2.isBookable();
        Model.State.RoomReadyForEnableState roomReadyForEnableState4 = new Model.State.RoomReadyForEnableState();
        boolean boolean5 = roomReadyForEnableState4.isBookable();
        Model.Room.Room room10 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        roomReadyForEnableState4.disable(room10);
        roomEnabledState2.maintain(room10);
        roomReadyForEnableState1.maintain(room10);
        roomEnabledState0.disable(room10);
        Model.Room.Room room19 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        boolean boolean20 = room19.isAvailable();
        Model.State.RoomState roomState21 = room19.getState();
        roomEnabledState0.disable(room19);
        java.lang.String str23 = roomEnabledState0.getStateName();
        Model.State.RoomDisabledState roomDisabledState24 = new Model.State.RoomDisabledState();
        boolean boolean25 = roomDisabledState24.isBookable();
        Model.State.RoomReadyForEnableState roomReadyForEnableState26 = new Model.State.RoomReadyForEnableState();
        boolean boolean27 = roomReadyForEnableState26.isBookable();
        Model.Room.Room room32 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        roomReadyForEnableState26.disable(room32);
        roomDisabledState24.enable(room32);
        Model.State.RoomState roomState35 = room32.getState();
        roomEnabledState0.disable(room32);
        java.lang.String str37 = roomEnabledState0.getStateName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(roomState21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "ENABLED" + "'", str23, "ENABLED");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(roomState35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "ENABLED" + "'", str37, "ENABLED");
    }

    @Test
    public void test780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test780");
        Repository.ServiceRequestRepository serviceRequestRepository0 = Repository.ServiceRequestRepository.getInstance();
        Model.ServiceRequest.SensorEssentialServiceRequest sensorEssentialServiceRequest6 = new Model.ServiceRequest.SensorEssentialServiceRequest((int) (short) -1, "4", "hi!", (-1), (int) ' ');
        serviceRequestRepository0.updateExistingServiceRequest((Model.ServiceRequest.ServiceRequest) sensorEssentialServiceRequest6);
        java.lang.Integer int9 = serviceRequestRepository0.generateNextId(1);
        org.junit.Assert.assertNotNull(serviceRequestRepository0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test781");
        Repository.ServiceRequestRepository serviceRequestRepository0 = Repository.ServiceRequestRepository.getInstance();
        Model.ServiceRequest.SensorEssentialServiceRequest sensorEssentialServiceRequest6 = new Model.ServiceRequest.SensorEssentialServiceRequest(1, "COMPLETED", "Service.AuthenticationException: ", (int) 'a', (int) (short) -1);
        sensorEssentialServiceRequest6.assignRoomID(100);
        java.lang.String str9 = sensorEssentialServiceRequest6.getStatus();
        serviceRequestRepository0.updateExistingServiceRequest((Model.ServiceRequest.ServiceRequest) sensorEssentialServiceRequest6);
        Model.ServiceRequest.SensorEssentialServiceRequest sensorEssentialServiceRequest16 = new Model.ServiceRequest.SensorEssentialServiceRequest((int) (short) 100, "CHECKED_IN", "EECS3311 Course Project Database - Bookings.csv", 0, (int) (byte) 0);
        serviceRequestRepository0.updateExistingServiceRequest((Model.ServiceRequest.ServiceRequest) sensorEssentialServiceRequest16);
        java.util.Map<java.lang.Integer, java.util.List<Model.ServiceRequest.ServiceRequest>> intMap20 = serviceRequestRepository0.parseCsvFileToMap("EECS3311 Course Project Database - Bookings.csv", true);
        Repository.ServiceRequestRepository serviceRequestRepository21 = Repository.ServiceRequestRepository.getInstance();
        Repository.ServiceRequestRepository serviceRequestRepository22 = Repository.ServiceRequestRepository.getInstance();
        Repository.ServiceRequestRepository serviceRequestRepository23 = Repository.ServiceRequestRepository.getInstance();
        Model.ServiceRequest.SensorEssentialServiceRequest sensorEssentialServiceRequest29 = new Model.ServiceRequest.SensorEssentialServiceRequest(1, "COMPLETED", "Service.AuthenticationException: ", (int) 'a', (int) (short) -1);
        sensorEssentialServiceRequest29.assignRoomID(100);
        java.lang.String str32 = sensorEssentialServiceRequest29.getStatus();
        serviceRequestRepository23.updateExistingServiceRequest((Model.ServiceRequest.ServiceRequest) sensorEssentialServiceRequest29);
        Model.ServiceRequest.SensorEssentialServiceRequest sensorEssentialServiceRequest39 = new Model.ServiceRequest.SensorEssentialServiceRequest((int) (short) 100, "CHECKED_IN", "EECS3311 Course Project Database - Bookings.csv", 0, (int) (byte) 0);
        serviceRequestRepository23.updateExistingServiceRequest((Model.ServiceRequest.ServiceRequest) sensorEssentialServiceRequest39);
        java.util.Map<java.lang.Integer, java.util.List<Model.ServiceRequest.ServiceRequest>> intMap43 = serviceRequestRepository23.parseCsvFileToMap("EECS3311 Course Project Database - Bookings.csv", true);
        boolean boolean45 = serviceRequestRepository22.saveMapToCsv(intMap43, "Service.AuthenticationException: ");
        boolean boolean47 = serviceRequestRepository21.saveMapToCsv(intMap43, "2");
        boolean boolean49 = serviceRequestRepository0.saveMapToCsv(intMap43, "CHECKED_IN");
        Model.ServiceRequest.SensorEssentialServiceRequest sensorEssentialServiceRequest55 = new Model.ServiceRequest.SensorEssentialServiceRequest(1, "COMPLETED", "Service.AuthenticationException: ", (int) 'a', (int) (short) -1);
        sensorEssentialServiceRequest55.assignRoomID(100);
        sensorEssentialServiceRequest55.assignRoomID((int) (short) 10);
        sensorEssentialServiceRequest55.assignRoomID((int) (byte) -1);
        java.lang.String str62 = sensorEssentialServiceRequest55.getDescription();
        Model.ServiceRequest.ServiceRequest serviceRequest63 = serviceRequestRepository0.addServiceRequest((Model.ServiceRequest.ServiceRequest) sensorEssentialServiceRequest55);
        int int64 = sensorEssentialServiceRequest55.getSensorID();
        org.junit.Assert.assertNotNull(serviceRequestRepository0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Service.AuthenticationException: " + "'", str9, "Service.AuthenticationException: ");
        org.junit.Assert.assertNotNull(intMap20);
        org.junit.Assert.assertNotNull(serviceRequestRepository21);
        org.junit.Assert.assertNotNull(serviceRequestRepository22);
        org.junit.Assert.assertNotNull(serviceRequestRepository23);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Service.AuthenticationException: " + "'", str32, "Service.AuthenticationException: ");
        org.junit.Assert.assertNotNull(intMap43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "COMPLETED" + "'", str62, "COMPLETED");
        org.junit.Assert.assertNotNull(serviceRequest63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
    }

    @Test
    public void test782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test782");
        Model.Room.Room room4 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        boolean boolean5 = room4.isAvailable();
        Model.Room.AdminRoomProxy adminRoomProxy6 = new Model.Room.AdminRoomProxy(room4);
        room4.performMaintenance();
        room4.requestEnable();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test783");
        Model.User.User user0 = Application.SessionData.getCurrentUser();
        java.lang.String str1 = user0.getPassword();
        double double2 = user0.getHourlyRate();
        java.lang.String str3 = user0.getId();
        org.junit.Assert.assertNotNull(user0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "DISABLED" + "'", str1, "DISABLED");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test784");
        Service.AuthenticationService authenticationService0 = new Service.AuthenticationService();
        boolean boolean2 = authenticationService0.isYorkEmail("Service.AuthenticationException: ");
        boolean boolean4 = authenticationService0.properEmail("1bec99b6-9fd5-4eb6-be48-3e7f52439881");
        Model.User.AccountType accountType8 = Model.User.AccountType.STAFF;
        // The following exception was thrown during execution in test generation
        try {
            Model.User.User user9 = authenticationService0.register("src/main/data/users.csv", "STAFF", "31", accountType8);
            org.junit.Assert.fail("Expected exception of type Service.AuthenticationException; message: Please enter a valid email address.");
        } catch (Service.AuthenticationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + accountType8 + "' != '" + Model.User.AccountType.STAFF + "'", accountType8.equals(Model.User.AccountType.STAFF));
    }

    @Test
    public void test785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test785");
        Model.User.User user0 = Application.SessionData.getCurrentUser();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getId();
        org.junit.Assert.assertNotNull(user0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "DISABLED" + "'", str1, "DISABLED");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test786");
        Model.Sensor.ScanIDSensor scanIDSensor4 = new Model.Sensor.ScanIDSensor("3", "src/main/data/MaintenanceRequests.csv", "EECS3311 Course Project Database - Rooms.csv", "");
        scanIDSensor4.setRoomID("jsmith@yorku.ca");
        java.lang.String str7 = scanIDSensor4.getStatus();
        java.lang.String str8 = scanIDSensor4.getStatus();
        java.lang.String str9 = scanIDSensor4.getID();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EECS3311 Course Project Database - Rooms.csv" + "'", str7, "EECS3311 Course Project Database - Rooms.csv");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EECS3311 Course Project Database - Rooms.csv" + "'", str8, "EECS3311 Course Project Database - Rooms.csv");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3" + "'", str9, "3");
    }

    @Test
    public void test787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test787");
        Repository.BookingRepository bookingRepository0 = Repository.BookingRepository.getInstance();
        java.util.List<Model.Room.Booking> bookingList1 = bookingRepository0.findAll();
        Model.State.CompletedState completedState2 = new Model.State.CompletedState();
        java.time.LocalDate localDate6 = null;
        java.time.LocalDate localDate7 = null;
        java.time.LocalTime localTime8 = null;
        java.time.LocalTime localTime9 = null;
        Model.Room.Booking booking11 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate6, localDate7, localTime8, localTime9, "");
        completedState2.checkOut(booking11);
        java.time.LocalDate localDate13 = booking11.getEndDate();
        bookingRepository0.save(booking11);
        Model.Room.Booking booking16 = bookingRepository0.findById("");
        Model.Room.Booking booking18 = bookingRepository0.findById("49");
        org.junit.Assert.assertNotNull(bookingRepository0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertNotNull(booking16);
        org.junit.Assert.assertNull(booking18);
    }

    @Test
    public void test788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test788");
        Model.Sensor.OccupancySensor occupancySensor5 = new Model.Sensor.OccupancySensor("", "1", "1", "EECS3311 Course Project Database - Rooms.csv", true);
        occupancySensor5.setStatus("Service.AuthenticationException: ");
        occupancySensor5.setOccupied(false);
        Model.State.RoomEnabledState roomEnabledState10 = new Model.State.RoomEnabledState();
        boolean boolean11 = roomEnabledState10.isBookable();
        Repository.RoomRepository roomRepository12 = Repository.RoomRepository.getInstance();
        Model.Room.Room room14 = roomRepository12.findById("2");
        roomEnabledState10.disable(room14);
        boolean boolean16 = occupancySensor5.equals((java.lang.Object) roomEnabledState10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(roomRepository12);
        org.junit.Assert.assertNotNull(room14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test789");
        Model.State.RoomReadyForEnableState roomReadyForEnableState0 = new Model.State.RoomReadyForEnableState();
        boolean boolean1 = roomReadyForEnableState0.isBookable();
        Model.State.RoomEnabledState roomEnabledState2 = new Model.State.RoomEnabledState();
        Model.Room.Room room7 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        boolean boolean8 = room7.isAvailable();
        Model.Room.AdminRoomProxy adminRoomProxy9 = new Model.Room.AdminRoomProxy(room7);
        roomEnabledState2.disable(room7);
        roomReadyForEnableState0.maintain(room7);
        Model.Room.Room room16 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        boolean boolean17 = room16.isAvailable();
        roomReadyForEnableState0.maintain(room16);
        Model.State.RoomReadyForEnableState roomReadyForEnableState19 = new Model.State.RoomReadyForEnableState();
        Model.State.RoomEnabledState roomEnabledState20 = new Model.State.RoomEnabledState();
        boolean boolean21 = roomEnabledState20.isBookable();
        Model.State.RoomReadyForEnableState roomReadyForEnableState22 = new Model.State.RoomReadyForEnableState();
        boolean boolean23 = roomReadyForEnableState22.isBookable();
        Model.Room.Room room28 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        roomReadyForEnableState22.disable(room28);
        roomEnabledState20.maintain(room28);
        roomReadyForEnableState19.maintain(room28);
        roomReadyForEnableState0.maintain(room28);
        boolean boolean33 = roomReadyForEnableState0.isBookable();
        Model.Room.Room room38 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        boolean boolean39 = room38.isAvailable();
        Model.Room.AdminRoomProxy adminRoomProxy40 = new Model.Room.AdminRoomProxy(room38);
        roomReadyForEnableState0.maintain(room38);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test790");
        Service.RoomService roomService0 = new Service.RoomService();
        roomService0.update(true, (int) (short) 10);
        Model.Room.Booking booking5 = roomService0.getBookingDetails("src/main/data/users.csv");
        boolean boolean7 = roomService0.cancelBooking("hi!");
        roomService0.disableRoom("hi!");
        roomService0.disableRoom("1");
        Service.RoomService roomService12 = roomService0.getInstance();
        Service.RoomService roomService13 = roomService12.getInstance();
        roomService13.update(false, (int) (byte) 0);
        roomService13.savePayment("48", (double) 26);
        org.junit.Assert.assertNull(booking5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(roomService12);
        org.junit.Assert.assertNotNull(roomService13);
    }

    @Test
    public void test791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test791");
        Service.RoomService roomService0 = new Service.RoomService();
        roomService0.maintenanceCompleted("");
        boolean boolean4 = roomService0.performCheckOut("");
        roomService0.enableRoom("");
        roomService0.disableRoom("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test792");
        Model.State.RoomReadyForEnableState roomReadyForEnableState0 = new Model.State.RoomReadyForEnableState();
        boolean boolean1 = roomReadyForEnableState0.isBookable();
        Model.State.RoomEnabledState roomEnabledState2 = new Model.State.RoomEnabledState();
        Model.Room.Room room7 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        boolean boolean8 = room7.isAvailable();
        Model.Room.AdminRoomProxy adminRoomProxy9 = new Model.Room.AdminRoomProxy(room7);
        roomEnabledState2.disable(room7);
        roomReadyForEnableState0.maintain(room7);
        Model.Room.Room room16 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        boolean boolean17 = room16.isAvailable();
        roomReadyForEnableState0.maintain(room16);
        boolean boolean19 = roomReadyForEnableState0.isBookable();
        boolean boolean20 = roomReadyForEnableState0.isBookable();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test793");
        Model.State.RoomDisabledState roomDisabledState0 = new Model.State.RoomDisabledState();
        boolean boolean1 = roomDisabledState0.isBookable();
        boolean boolean2 = roomDisabledState0.isBookable();
        boolean boolean3 = roomDisabledState0.isBookable();
        Model.Room.Room room8 = new Model.Room.Room("COMPLETED", "hi!", (double) 100.0f, "2");
        roomDisabledState0.maintain(room8);
        Model.Room.AdminRoomProxy adminRoomProxy10 = new Model.Room.AdminRoomProxy(room8);
        java.lang.String str11 = adminRoomProxy10.getRoomId();
        adminRoomProxy10.showRoomDetails();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "COMPLETED" + "'", str11, "COMPLETED");
    }

    @Test
    public void test794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test794");
        java.time.LocalDateTime localDateTime2 = null;
        Model.Sensor.OccupancySensorData occupancySensorData3 = new Model.Sensor.OccupancySensorData("", "", localDateTime2);
        occupancySensorData3.sensorID = "";
        java.time.LocalDateTime localDateTime6 = null;
        occupancySensorData3.dateTime = localDateTime6;
        java.lang.String str8 = occupancySensorData3.sensorID;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test795");
        Model.ServiceRequest.EssentialServiceRequest essentialServiceRequest4 = new Model.ServiceRequest.EssentialServiceRequest((int) (byte) 0, "src/main/data/users.csv", "src/main/data/users.csv", (int) ' ');
        int int5 = essentialServiceRequest4.getRoomID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test796");
        View.CheckoutView checkoutView0 = null;
        Service.RoomService roomService1 = new Service.RoomService();
        roomService1.maintenanceCompleted("");
        boolean boolean5 = roomService1.performCheckOut("");
        Service.SensorService sensorService6 = new Service.SensorService();
        // The following exception was thrown during execution in test generation
        try {
            Controller.CheckoutController checkoutController7 = new Controller.CheckoutController(checkoutView0, roomService1, sensorService6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"backButton\" because \"this.view\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test797");
        Model.Room.Room room4 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        boolean boolean5 = room4.isAvailable();
        Model.Room.AdminRoomProxy adminRoomProxy6 = new Model.Room.AdminRoomProxy(room4);
        adminRoomProxy6.showRoomDetails();
        adminRoomProxy6.showRoomDetails();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test798");
        Controller.AdminServiceRequestController adminServiceRequestController0 = new Controller.AdminServiceRequestController();
        adminServiceRequestController0.handleAddServiceRequest("Service.AuthenticationException: ", false, "2");
        java.util.ArrayList<Model.ServiceRequest.ServiceRequest> serviceRequestList5 = adminServiceRequestController0.handleServiceRequestListCompilation();
        adminServiceRequestController0.handleAddServiceRequest("src/main/data/MaintenanceRequests.csv", false, "4");
        org.junit.Assert.assertNotNull(serviceRequestList5);
    }

    @Test
    public void test799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test799");
        Controller.AdminServiceRequestController adminServiceRequestController0 = new Controller.AdminServiceRequestController();
        adminServiceRequestController0.promoteServiceRequest((int) (byte) 100, "25", "36");
        adminServiceRequestController0.promoteServiceRequest((int) (byte) 0, "20", "31");
        adminServiceRequestController0.handleAddServiceRequest("!Password123", false, "");
        adminServiceRequestController0.handleAddServiceRequest("21", false, "7");
    }

    @Test
    public void test800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test800");
        Model.State.RoomReadyForEnableState roomReadyForEnableState0 = new Model.State.RoomReadyForEnableState();
        boolean boolean1 = roomReadyForEnableState0.isBookable();
        java.lang.String str2 = roomReadyForEnableState0.getStateName();
        boolean boolean3 = roomReadyForEnableState0.isBookable();
        Model.State.RoomDisabledState roomDisabledState4 = new Model.State.RoomDisabledState();
        boolean boolean5 = roomDisabledState4.isBookable();
        boolean boolean6 = roomDisabledState4.isBookable();
        boolean boolean7 = roomDisabledState4.isBookable();
        Model.Room.Room room12 = new Model.Room.Room("COMPLETED", "hi!", (double) 100.0f, "2");
        roomDisabledState4.maintain(room12);
        Model.Room.Room room18 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        roomDisabledState4.enable(room18);
        roomReadyForEnableState0.enable(room18);
        Model.State.RoomEnabledState roomEnabledState21 = new Model.State.RoomEnabledState();
        Model.Room.Room room26 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        boolean boolean27 = room26.isAvailable();
        Model.Room.AdminRoomProxy adminRoomProxy28 = new Model.Room.AdminRoomProxy(room26);
        roomEnabledState21.disable(room26);
        java.lang.String str30 = roomEnabledState21.getStateName();
        Model.State.RoomEnabledState roomEnabledState31 = new Model.State.RoomEnabledState();
        Model.State.RoomReadyForEnableState roomReadyForEnableState32 = new Model.State.RoomReadyForEnableState();
        Model.State.RoomEnabledState roomEnabledState33 = new Model.State.RoomEnabledState();
        boolean boolean34 = roomEnabledState33.isBookable();
        Model.State.RoomReadyForEnableState roomReadyForEnableState35 = new Model.State.RoomReadyForEnableState();
        boolean boolean36 = roomReadyForEnableState35.isBookable();
        Model.Room.Room room41 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        roomReadyForEnableState35.disable(room41);
        roomEnabledState33.maintain(room41);
        roomReadyForEnableState32.maintain(room41);
        roomEnabledState31.disable(room41);
        room41.requestEnable();
        boolean boolean47 = room41.isAvailable();
        roomEnabledState21.disable(room41);
        roomReadyForEnableState0.disable(room41);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "READY_FOR_ENABLE" + "'", str2, "READY_FOR_ENABLE");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "ENABLED" + "'", str30, "ENABLED");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test801");
        Model.User.StaffUser staffUser6 = new Model.User.StaffUser("", "hi!", "4", "hi!", false, "2");
        java.lang.String str7 = staffUser6.getRole();
        java.lang.String str8 = staffUser6.getName();
        staffUser6.setRole("2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2" + "'", str7, "2");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test802");
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        java.time.LocalTime localTime5 = null;
        java.time.LocalTime localTime6 = null;
        Model.Room.Booking booking8 = new Model.Room.Booking("42", "88", "512a0e7c-3268-4bb7-bc77-c6d32a14e20d", localDate3, localDate4, localTime5, localTime6, "26");
    }

    @Test
    public void test803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test803");
        Service.EvaluateRoomMaintenanceRelationshipService evaluateRoomMaintenanceRelationshipService0 = Service.EvaluateRoomMaintenanceRelationshipService.getInstance();
        evaluateRoomMaintenanceRelationshipService0.notifyObservers();
        Service.RoomService roomService2 = new Service.RoomService();
        roomService2.maintenanceCompleted("");
        boolean boolean6 = roomService2.performCheckOut("");
        roomService2.maintenanceCompleted("1");
        boolean boolean10 = roomService2.performCheckOut("CHECKED_IN");
        Service.RoomService roomService11 = roomService2.getInstance();
        roomService2.savePayment("DISABLED", (double) (byte) -1);
        evaluateRoomMaintenanceRelationshipService0.registerObserver((Model.Room.Observer) roomService2);
        boolean boolean16 = evaluateRoomMaintenanceRelationshipService0.isAnyEssentialMaintenanceRequestPending();
        org.junit.Assert.assertNotNull(evaluateRoomMaintenanceRelationshipService0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(roomService11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test804");
        Model.User.PartnerUser partnerUser3 = new Model.User.PartnerUser("3", "READY_FOR_ENABLE", "7");
        boolean boolean4 = partnerUser3.isVerified();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test805");
        Model.Sensor.ScanIDSensor scanIDSensor4 = new Model.Sensor.ScanIDSensor("DISABLED", "src/main/data/users.csv", "3", "Service.AuthenticationException: ");
        scanIDSensor4.setStatus("3b878a93-2f8d-4168-99fd-22b8dbe103f1");
        java.lang.String str7 = scanIDSensor4.getID();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DISABLED" + "'", str7, "DISABLED");
    }
}
