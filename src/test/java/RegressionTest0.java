import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

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
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        Model.Room.RoomProxyFactory roomProxyFactory0 = new Model.Room.RoomProxyFactory();
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        java.lang.String str0 = Database.Database.getUserCsvPath();
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "src/main/data/users.csv" + "'", str0, "src/main/data/users.csv");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        Application.SessionData sessionData0 = new Application.SessionData();
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        View.CheckoutView checkoutView0 = null;
        Service.RoomService roomService1 = new Service.RoomService();
        Model.Room.Booking booking3 = roomService1.getBookingDetails("hi!");
        Service.SensorService sensorService4 = null;
        // The following exception was thrown during execution in test generation
        try {
            Controller.CheckoutController checkoutController5 = new Controller.CheckoutController(checkoutView0, roomService1, sensorService4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"backButton\" because \"this.view\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(booking3);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        View.PaymentView paymentView0 = null;
        Service.RoomService roomService1 = new Service.RoomService();
        Model.Room.Booking booking3 = roomService1.getBookingDetails("hi!");
        // The following exception was thrown during execution in test generation
        try {
            Controller.PaymentViewController paymentViewController4 = new Controller.PaymentViewController(paymentView0, roomService1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"backButton\" because \"this.view\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(booking3);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        View.GuestSelectActionView guestSelectActionView0 = null;
        Service.GetMaintenanceRequestService getMaintenanceRequestService1 = new Service.GetMaintenanceRequestService();
        // The following exception was thrown during execution in test generation
        try {
            Controller.GuestSelectActionController guestSelectActionController2 = new Controller.GuestSelectActionController(guestSelectActionView0, (java.lang.Object) getMaintenanceRequestService1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"availableRoomsButton\" because \"view\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        View.CheckinView checkinView0 = null;
        Service.RoomService roomService1 = new Service.RoomService();
        Service.SensorService sensorService2 = null;
        // The following exception was thrown during execution in test generation
        try {
            Controller.CheckinController checkinController3 = new Controller.CheckinController(checkinView0, roomService1, sensorService2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"backButton\" because \"this.view\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        View.RoomBookingRequirementsView roomBookingRequirementsView0 = null;
        Service.RoomService roomService1 = new Service.RoomService();
        roomService1.update(true, (int) (short) 10);
        Model.Room.Booking booking6 = roomService1.getBookingDetails("src/main/data/users.csv");
        boolean boolean8 = roomService1.cancelBooking("hi!");
        // The following exception was thrown during execution in test generation
        try {
            Controller.RoomBookingRequirementsController roomBookingRequirementsController9 = new Controller.RoomBookingRequirementsController(roomBookingRequirementsView0, roomService1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"backButton\" because \"this.view\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(booking6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        View.CheckoutView checkoutView0 = null;
        Service.RoomService roomService1 = new Service.RoomService();
        roomService1.update(true, (int) (short) 10);
        boolean boolean6 = roomService1.performCheckOut("hi!");
        Service.SensorService sensorService7 = null;
        // The following exception was thrown during execution in test generation
        try {
            Controller.CheckoutController checkoutController8 = new Controller.CheckoutController(checkoutView0, roomService1, sensorService7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"backButton\" because \"this.view\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        Service.AuthenticationException authenticationException1 = new Service.AuthenticationException("");
        java.lang.String str2 = authenticationException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Service.AuthenticationException: " + "'", str2, "Service.AuthenticationException: ");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        Model.User.AccountType accountType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            Model.User.User user4 = Model.User.UserFactory.createUser(accountType0, "hi!", "Service.AuthenticationException: ", "COMPLETED");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: wrong account type: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
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
        java.lang.String str34 = booking31.getUserId();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "COMPLETED" + "'", str11, "COMPLETED");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        Model.User.StudentUser studentUser6 = new Model.User.StudentUser("1", "", "1", "Service.AuthenticationException: ", true, "EECS3311 Course Project Database - Rooms.csv");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        Model.State.RoomDisabledState roomDisabledState0 = new Model.State.RoomDisabledState();
        java.lang.String str1 = roomDisabledState0.getStateName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "DISABLED" + "'", str1, "DISABLED");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        Model.State.RoomDisabledState roomDisabledState0 = new Model.State.RoomDisabledState();
        Model.Room.Room room1 = null;
        // The following exception was thrown during execution in test generation
        try {
            roomDisabledState0.maintain(room1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Model.Room.Room.setState(Model.State.RoomState)\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        java.time.LocalTime localTime5 = null;
        java.time.LocalTime localTime6 = null;
        Model.Room.Booking booking8 = new Model.Room.Booking("hi!", "", "COMPLETED", localDate3, localDate4, localTime5, localTime6, "DISABLED");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        Model.Room.Room room1 = null;
        Model.Room.RoomProxy roomProxy2 = Model.Room.RoomProxyFactory.getProxy("src/main/data/users.csv", room1);
        org.junit.Assert.assertNotNull(roomProxy2);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        View.PaymentView paymentView0 = null;
        Service.RoomService roomService1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Controller.PaymentViewController paymentViewController2 = new Controller.PaymentViewController(paymentView0, roomService1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"backButton\" because \"this.view\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        Model.Sensor.Sensor sensor5 = new Model.Sensor.Sensor("1", "", "src/main/data/users.csv", "hi!", true);
        java.lang.String str6 = sensor5.getType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        Model.Room.Room room1 = null;
        Model.Room.RoomProxy roomProxy2 = Model.Room.RoomProxyFactory.getProxy("Service.AuthenticationException: ", room1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = roomProxy2.getRoomId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Model.Room.Room.getRoomId()\" because \"this.realRoom\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomProxy2);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        View.RescheduleBookingView rescheduleBookingView0 = null;
        Service.RoomService roomService1 = new Service.RoomService();
        roomService1.maintenanceCompleted("");
        boolean boolean5 = roomService1.performCheckOut("");
        roomService1.enableRoom("");
        // The following exception was thrown during execution in test generation
        try {
            Controller.RescheduleBookingController rescheduleBookingController8 = new Controller.RescheduleBookingController(rescheduleBookingView0, roomService1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"backButton\" because \"this.view\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "1) test021(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        View.RoomBookingRequirementsView roomBookingRequirementsView0 = null;
        Service.RoomService roomService1 = new Service.RoomService();
        roomService1.update(true, (int) (short) 10);
        boolean boolean6 = roomService1.performCheckOut("hi!");
        java.lang.String str10 = roomService1.createRoom("", (double) '4', "src/main/data/users.csv");
        // The following exception was thrown during execution in test generation
        try {
            Controller.RoomBookingRequirementsController roomBookingRequirementsController11 = new Controller.RoomBookingRequirementsController(roomBookingRequirementsView0, roomService1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"backButton\" because \"this.view\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "2) test022(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "5" + "'", str10, "5");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        Service.RoomService roomService0 = new Service.RoomService();
        roomService0.update(true, (int) (short) 10);
        Model.Room.Booking booking5 = roomService0.getBookingDetails("src/main/data/users.csv");
        boolean boolean7 = roomService0.cancelBooking("hi!");
        Controller.AddRoomController addRoomController8 = new Controller.AddRoomController(roomService0);
        addRoomController8.handleAddRoomSubmission("3", (int) (short) 100, (double) (short) 10);
        org.junit.Assert.assertNull(booking5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        Model.User.StaffUser staffUser3 = new Model.User.StaffUser("hi!", "", "hi!");
        boolean boolean4 = staffUser3.isVerified();
        staffUser3.setName("Service.AuthenticationException: ");
        java.lang.String str7 = staffUser3.getEmail();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        Model.State.RoomReadyForEnableState roomReadyForEnableState0 = new Model.State.RoomReadyForEnableState();
        boolean boolean1 = roomReadyForEnableState0.isBookable();
        java.lang.String str2 = roomReadyForEnableState0.getStateName();
        Model.Room.Room room3 = null;
        // The following exception was thrown during execution in test generation
        try {
            roomReadyForEnableState0.disable(room3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Model.Room.Room.setState(Model.State.RoomState)\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "READY_FOR_ENABLE" + "'", str2, "READY_FOR_ENABLE");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        Model.Sensor.OccupancySensor occupancySensor5 = new Model.Sensor.OccupancySensor("READY_FOR_ENABLE", "Service.AuthenticationException: ", "src/main/data/MaintenanceRequests.csv", "4", true);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        Model.User.PartnerUser partnerUser6 = new Model.User.PartnerUser("", "hi!", "", "", true, "hi!");
        boolean boolean7 = partnerUser6.isVerified();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        View.GuestSelectActionView guestSelectActionView0 = null;
        Database.Database database1 = Database.Database.getInstance();
        // The following exception was thrown during execution in test generation
        try {
            Controller.GuestSelectActionController guestSelectActionController2 = new Controller.GuestSelectActionController(guestSelectActionView0, (java.lang.Object) database1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"availableRoomsButton\" because \"view\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(database1);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        Repository.SensorRepository sensorRepository0 = new Repository.SensorRepository();
        Model.Sensor.ScanIDSensorData scanIDSensorData1 = null;
        boolean boolean2 = sensorRepository0.writeScanIDSensorLog(scanIDSensorData1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        Model.User.StaffUser staffUser3 = new Model.User.StaffUser("hi!", "", "hi!");
        boolean boolean4 = staffUser3.isVerified();
        Application.SessionData.setCurrentUser((Model.User.User) staffUser3);
        Application.SessionData.setCurrentUser((Model.User.User) staffUser3);
        java.lang.String str7 = staffUser3.getName();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        View.AddSensorView addSensorView0 = null;
        Service.SensorService sensorService1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Controller.AddSensorController addSensorController2 = new Controller.AddSensorController(addSensorView0, sensorService1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"backButton\" because \"this.view\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        Model.Room.Room room1 = null;
        Model.Room.RoomProxy roomProxy2 = Model.Room.RoomProxyFactory.getProxy("EECS3311 Course Project Database - Rooms.csv", room1);
        // The following exception was thrown during execution in test generation
        try {
            roomProxy2.showRoomDetails();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Model.Room.Room.getLocation()\" because \"this.realRoom\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomProxy2);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        View.MainAppFrame mainAppFrame0 = null;
        Application.AppNavigator appNavigator1 = new Application.AppNavigator(mainAppFrame0);
        // The following exception was thrown during execution in test generation
        try {
            appNavigator1.goToLogin();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"View.MainAppFrame.showCard(String)\" because \"this.frame\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        Model.User.PartnerUser partnerUser3 = new Model.User.PartnerUser("EECS3311 Course Project Database - Rooms.csv", "COMPLETED", "1");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        Model.ServiceRequest.SensorEssentialServiceRequest sensorEssentialServiceRequest5 = new Model.ServiceRequest.SensorEssentialServiceRequest(1, "COMPLETED", "Service.AuthenticationException: ", (int) 'a', (int) (short) -1);
        sensorEssentialServiceRequest5.assignRoomID(100);
        int int8 = sensorEssentialServiceRequest5.getServiceRequestID();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        Service.RoomService roomService0 = new Service.RoomService();
        roomService0.update(true, (int) (short) 10);
        Model.Room.Booking booking5 = roomService0.getBookingDetails("src/main/data/users.csv");
        boolean boolean7 = roomService0.cancelBooking("hi!");
        Controller.AddRoomController addRoomController8 = new Controller.AddRoomController(roomService0);
        addRoomController8.handleAddRoomSubmission("hi!", (int) (short) 1, (double) (byte) 10);
        org.junit.Assert.assertNull(booking5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        Model.Sensor.OccupancySensor occupancySensor5 = new Model.Sensor.OccupancySensor("READY_FOR_ENABLE", "src/main/data/users.csv", "1", "EECS3311 Course Project Database - Rooms.csv", false);
        occupancySensor5.setStatus("EECS3311 Course Project Database - Rooms.csv");
        Service.RoomService roomService8 = new Service.RoomService();
        roomService8.update(true, (int) (short) 10);
        Model.Room.Booking booking13 = roomService8.getBookingDetails("src/main/data/users.csv");
        boolean boolean15 = roomService8.cancelBooking("hi!");
        roomService8.disableRoom("hi!");
        roomService8.disableRoom("1");
        boolean boolean20 = occupancySensor5.equals((java.lang.Object) roomService8);
        org.junit.Assert.assertNull(booking13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        java.time.LocalDateTime localDateTime2 = null;
        Model.Sensor.OccupancySensorData occupancySensorData3 = new Model.Sensor.OccupancySensorData("", "", localDateTime2);
        java.time.LocalDateTime localDateTime4 = occupancySensorData3.dateTime;
        org.junit.Assert.assertNull(localDateTime4);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        Model.User.AccountType accountType4 = Model.User.AccountType.PARTNER;
        Model.User.User user7 = Model.User.UserFactory.createUserFromCsv("hi!", "CHECKED_IN", "hi!", "2", accountType4, false, "Service.AuthenticationException: ");
        java.lang.String str8 = user7.getRole();
        org.junit.Assert.assertTrue("'" + accountType4 + "' != '" + Model.User.AccountType.PARTNER + "'", accountType4.equals(Model.User.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(user7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Service.AuthenticationException: " + "'", str8, "Service.AuthenticationException: ");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        Model.Sensor.Sensor sensor5 = new Model.Sensor.Sensor("1", "", "src/main/data/users.csv", "hi!", true);
        java.lang.String str6 = sensor5.getRoomID();
        sensor5.setOccupied(true);
        java.lang.String str9 = sensor5.getStatus();
        boolean boolean10 = sensor5.getOccupied();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "src/main/data/users.csv" + "'", str9, "src/main/data/users.csv");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
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
        java.time.LocalDate localDate17 = booking9.getEndDate();
        org.junit.Assert.assertNotNull(bookingRepository0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(localTime16);
        org.junit.Assert.assertNull(localDate17);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        Database.Database database0 = Database.Database.getInstance();
        java.lang.String str1 = database0.getRoomCsvPath();
        java.lang.String str2 = database0.getMaintenanceRequestsCsvPath();
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EECS3311 Course Project Database - Rooms.csv" + "'", str1, "EECS3311 Course Project Database - Rooms.csv");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "src/main/data/MaintenanceRequests.csv" + "'", str2, "src/main/data/MaintenanceRequests.csv");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        Model.User.StaffUser staffUser6 = new Model.User.StaffUser("", "COMPLETED", "COMPLETED", "DISABLED", true, "3");
        staffUser6.setVerified(false);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        View.MainAppFrame mainAppFrame0 = null;
        Application.AppNavigator appNavigator1 = new Application.AppNavigator(mainAppFrame0);
        // The following exception was thrown during execution in test generation
        try {
            appNavigator1.goToWelcome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"View.MainAppFrame.showCard(String)\" because \"this.frame\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        Model.User.StaffUser staffUser3 = new Model.User.StaffUser("hi!", "", "hi!");
        boolean boolean4 = staffUser3.isVerified();
        Application.SessionData.setCurrentUser((Model.User.User) staffUser3);
        double double6 = staffUser3.getHourlyRate();
        staffUser3.setPassword("2");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        Controller.AdminServiceRequestController adminServiceRequestController0 = new Controller.AdminServiceRequestController();
        adminServiceRequestController0.setRoomID((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            adminServiceRequestController0.promoteServiceRequest((int) (short) 100, "", "src/main/data/occupancy_sensor_logs.csv");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"src/main/data/occupancy_sensor_logs.csv\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        Service.SensorService sensorService0 = new Service.SensorService();
        boolean boolean4 = sensorService0.addSensor("COMPLETED", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        Model.Sensor.ScanIDSensor scanIDSensor4 = new Model.Sensor.ScanIDSensor("4", "1", "EECS3311 Course Project Database - Rooms.csv", "src/main/data/MaintenanceRequests.csv");
        scanIDSensor4.setRoomID("Service.AuthenticationException: ");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        View.PaymentView paymentView0 = null;
        Service.RoomService roomService1 = new Service.RoomService();
        roomService1.update(true, (int) (short) 10);
        Model.Room.Booking booking6 = roomService1.getBookingDetails("src/main/data/users.csv");
        boolean boolean8 = roomService1.cancelBooking("hi!");
        roomService1.disableRoom("hi!");
        roomService1.disableRoom("1");
        Service.RoomService roomService13 = roomService1.getInstance();
        // The following exception was thrown during execution in test generation
        try {
            Controller.PaymentViewController paymentViewController14 = new Controller.PaymentViewController(paymentView0, roomService1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"backButton\" because \"this.view\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(booking6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(roomService13);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        Repository.RoomRepository roomRepository0 = new Repository.RoomRepository();
        java.util.List<Model.Room.Room> roomList1 = roomRepository0.findAll();
        org.junit.Assert.assertNotNull(roomList1);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        View.MainAppFrame mainAppFrame0 = null;
        Application.AppNavigator appNavigator1 = new Application.AppNavigator(mainAppFrame0);
        // The following exception was thrown during execution in test generation
        try {
            appNavigator1.goToSignup();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"View.MainAppFrame.showCard(String)\" because \"this.frame\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        Model.State.RoomDisabledState roomDisabledState0 = new Model.State.RoomDisabledState();
        boolean boolean1 = roomDisabledState0.isBookable();
        boolean boolean2 = roomDisabledState0.isBookable();
        boolean boolean3 = roomDisabledState0.isBookable();
        Model.Room.Room room8 = new Model.Room.Room("COMPLETED", "hi!", (double) 100.0f, "2");
        roomDisabledState0.maintain(room8);
        Model.Room.Room room14 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        roomDisabledState0.enable(room14);
        room14.requestDisable();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        Model.User.AccountType accountType0 = Model.User.AccountType.STAFF;
        java.lang.Class<?> wildcardClass1 = accountType0.getClass();
        org.junit.Assert.assertTrue("'" + accountType0 + "' != '" + Model.User.AccountType.STAFF + "'", accountType0.equals(Model.User.AccountType.STAFF));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        Model.User.UserFactory userFactory0 = new Model.User.UserFactory();
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        Service.GetMaintenanceRequestService getMaintenanceRequestService0 = Service.GetMaintenanceRequestService.getInstance();
        java.util.ArrayList<Model.ServiceRequest.ServiceRequest> serviceRequestList3 = getMaintenanceRequestService0.getServiceRequests((int) (byte) 0, false);
        java.util.ArrayList<Model.ServiceRequest.ServiceRequest> serviceRequestList6 = getMaintenanceRequestService0.getServiceRequests((int) (short) 0, false);
        org.junit.Assert.assertNotNull(getMaintenanceRequestService0);
        org.junit.Assert.assertNotNull(serviceRequestList3);
        org.junit.Assert.assertNotNull(serviceRequestList6);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        java.time.LocalTime localTime5 = null;
        java.time.LocalTime localTime6 = null;
        Model.Room.Booking booking8 = new Model.Room.Booking("John Smith", "3", "3b878a93-2f8d-4168-99fd-22b8dbe103f1", localDate3, localDate4, localTime5, localTime6, "src/main/data/users.csv");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        Service.RoomService roomService0 = new Service.RoomService();
        roomService0.update(true, (int) (short) 10);
        Model.Room.Booking booking5 = roomService0.getBookingDetails("src/main/data/users.csv");
        boolean boolean7 = roomService0.cancelBooking("hi!");
        roomService0.disableRoom("hi!");
        boolean boolean11 = roomService0.performCheckOut("3");
        org.junit.Assert.assertNull(booking5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        Controller.AdminServiceRequestController adminServiceRequestController0 = new Controller.AdminServiceRequestController();
        adminServiceRequestController0.setRoomID((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            adminServiceRequestController0.handleAddServiceRequest("Service.AuthenticationException: ", true, "EECS3311 Course Project Database - Rooms.csv");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"EECS3311 Course Project Database - Rooms.csv\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        Controller.AdminServiceRequestController adminServiceRequestController0 = new Controller.AdminServiceRequestController();
        // The following exception was thrown during execution in test generation
        try {
            adminServiceRequestController0.promoteServiceRequest((int) (byte) 10, "3", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        Repository.SensorRepository sensorRepository0 = new Repository.SensorRepository();
        java.util.List<Model.Sensor.OccupancySensorData> occupancySensorDataList1 = sensorRepository0.getOccupancySensorLogsList();
        Model.Sensor.ScanIDSensorData scanIDSensorData2 = null;
        boolean boolean3 = sensorRepository0.writeScanIDSensorLog(scanIDSensorData2);
        Model.Sensor.OccupancySensor occupancySensor9 = new Model.Sensor.OccupancySensor("", "1", "1", "EECS3311 Course Project Database - Rooms.csv", true);
        boolean boolean10 = false; // flaky "3) test060(RegressionTest0)": sensorRepository0.writeSensor((Model.Sensor.Sensor) occupancySensor9);
        java.util.List<Model.Sensor.ScanIDSensorData> scanIDSensorDataList11 = sensorRepository0.getScanIDSensorLogsList();
        java.util.List<Model.Sensor.OccupancySensorData> occupancySensorDataList12 = sensorRepository0.getOccupancySensorLogsList();
// flaky "1) test060(RegressionTest0)":         org.junit.Assert.assertNotNull(occupancySensorDataList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "1) test060(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky "1) test060(RegressionTest0)":         org.junit.Assert.assertNotNull(scanIDSensorDataList11);
// flaky "1) test060(RegressionTest0)":         org.junit.Assert.assertNotNull(occupancySensorDataList12);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        Model.Payment.Payment payment2 = new Model.Payment.Payment("", (double) (byte) -1);
        boolean boolean3 = payment2.isPaid();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        View.RescheduleBookingView rescheduleBookingView0 = null;
        Service.RoomService roomService1 = new Service.RoomService();
        roomService1.update(true, (int) (short) 10);
        Model.Room.Booking booking6 = roomService1.getBookingDetails("src/main/data/users.csv");
        boolean boolean8 = roomService1.cancelBooking("hi!");
        roomService1.disableRoom("hi!");
        boolean boolean12 = roomService1.cancelBooking("DISABLED");
        // The following exception was thrown during execution in test generation
        try {
            Controller.RescheduleBookingController rescheduleBookingController13 = new Controller.RescheduleBookingController(rescheduleBookingView0, roomService1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"backButton\" because \"this.view\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(booking6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        Service.EvaluateRoomMaintenanceRelationshipService evaluateRoomMaintenanceRelationshipService0 = Service.EvaluateRoomMaintenanceRelationshipService.getInstance();
        boolean boolean1 = evaluateRoomMaintenanceRelationshipService0.isAnyEssentialMaintenanceRequestPending();
        evaluateRoomMaintenanceRelationshipService0.notifyObservers();
        org.junit.Assert.assertNotNull(evaluateRoomMaintenanceRelationshipService0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        View.RoomBookingRequirementsView roomBookingRequirementsView0 = null;
        Service.RoomService roomService1 = new Service.RoomService();
        roomService1.update(true, (int) (short) 10);
        Model.Room.Booking booking6 = roomService1.getBookingDetails("src/main/data/users.csv");
        boolean boolean8 = roomService1.cancelBooking("hi!");
        roomService1.disableRoom("hi!");
        roomService1.disableRoom("1");
        Model.Room.Booking booking14 = roomService1.getBookingDetails("hi!");
        // The following exception was thrown during execution in test generation
        try {
            Controller.RoomBookingRequirementsController roomBookingRequirementsController15 = new Controller.RoomBookingRequirementsController(roomBookingRequirementsView0, roomService1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"backButton\" because \"this.view\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(booking6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(booking14);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        Model.User.StaffUser staffUser6 = new Model.User.StaffUser("DISABLED", "2", "4", "src/main/data/sensors.csv", false, "");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        View.PaymentView paymentView0 = null;
        Service.RoomService roomService1 = new Service.RoomService();
        roomService1.update(true, (int) (short) 10);
        Model.Room.Booking booking6 = roomService1.getBookingDetails("src/main/data/users.csv");
        boolean boolean8 = roomService1.cancelBooking("hi!");
        roomService1.disableRoom("hi!");
        roomService1.disableRoom("1");
        Service.RoomService roomService13 = roomService1.getInstance();
        Service.RoomService roomService14 = roomService13.getInstance();
        // The following exception was thrown during execution in test generation
        try {
            Controller.PaymentViewController paymentViewController15 = new Controller.PaymentViewController(paymentView0, roomService14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"backButton\" because \"this.view\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(booking6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(roomService13);
        org.junit.Assert.assertNotNull(roomService14);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        Model.User.PartnerUser partnerUser6 = new Model.User.PartnerUser("9", "COMPLETED", "EECS3311 Course Project Database - Bookings.csv", "PENDING", true, "");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        java.time.LocalTime localTime5 = null;
        java.time.LocalTime localTime6 = null;
        Model.Room.Booking booking8 = new Model.Room.Booking("DISABLED", "src/main/data/MaintenanceRequests.csv", "src/main/data/users.csv", localDate3, localDate4, localTime5, localTime6, "src/main/data/users.csv");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        View.AddSensorView addSensorView0 = null;
        Service.SensorService sensorService1 = new Service.SensorService();
        Model.Sensor.Sensor sensor4 = null; // flaky "4) test069(RegressionTest0)": sensorService1.getSensorByRoomID("src/main/data/users.csv", "EECS3311 Course Project Database - Bookings.csv");
        // The following exception was thrown during execution in test generation
        try {
            Controller.AddSensorController addSensorController5 = new Controller.AddSensorController(addSensorView0, sensorService1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"backButton\" because \"this.view\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sensor4);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        java.time.LocalTime localTime5 = null;
        java.time.LocalTime localTime6 = null;
        Model.Room.Booking booking8 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate3, localDate4, localTime5, localTime6, "");
        java.time.LocalTime localTime9 = booking8.getStartTime();
        java.time.LocalTime localTime10 = booking8.getEndTime();
        org.junit.Assert.assertNull(localTime9);
        org.junit.Assert.assertNull(localTime10);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        Service.AuthenticationService authenticationService0 = new Service.AuthenticationService();
        Model.User.FacultyUser facultyUser7 = new Model.User.FacultyUser("EECS3311 Course Project Database - Rooms.csv", "", "COMPLETED");
        Service.UserService userService8 = new Service.UserService();
        Model.User.AccountType accountType9 = Model.User.AccountType.PARTNER;
        Model.User.User user13 = userService8.createUser(accountType9, "", "DISABLED", "4");
        facultyUser7.setAccountType(accountType9);
        // The following exception was thrown during execution in test generation
        try {
            Model.User.User user15 = authenticationService0.register("jsmith@yorku.ca", "", "7", accountType9);
            org.junit.Assert.fail("Expected exception of type Service.AuthenticationException; message: Missing  field.");
        } catch (Service.AuthenticationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + accountType9 + "' != '" + Model.User.AccountType.PARTNER + "'", accountType9.equals(Model.User.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(user13);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        Model.State.RoomReadyForEnableState roomReadyForEnableState0 = new Model.State.RoomReadyForEnableState();
        java.lang.String str1 = roomReadyForEnableState0.getStateName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "READY_FOR_ENABLE" + "'", str1, "READY_FOR_ENABLE");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        Repository.SensorRepository sensorRepository0 = new Repository.SensorRepository();
        java.util.List<Model.Sensor.OccupancySensorData> occupancySensorDataList1 = sensorRepository0.getOccupancySensorLogsList();
        Model.Sensor.ScanIDSensorData scanIDSensorData2 = null;
        boolean boolean3 = sensorRepository0.writeScanIDSensorLog(scanIDSensorData2);
        Model.Sensor.OccupancySensor occupancySensor9 = new Model.Sensor.OccupancySensor("", "1", "1", "EECS3311 Course Project Database - Rooms.csv", true);
        boolean boolean10 = false; // flaky "5) test073(RegressionTest0)": sensorRepository0.writeSensor((Model.Sensor.Sensor) occupancySensor9);
        java.util.List<Model.Sensor.ScanIDSensorData> scanIDSensorDataList11 = sensorRepository0.getScanIDSensorLogsList();
        Model.Sensor.Sensor sensor13 = null; // flaky "2) test073(RegressionTest0)": sensorRepository0.getSensorByID("EECS3311 Course Project Database - Bookings.csv");
        Model.Sensor.ScanIDSensorData scanIDSensorData14 = null;
        boolean boolean15 = sensorRepository0.writeScanIDSensorLog(scanIDSensorData14);
// flaky "2) test073(RegressionTest0)":         org.junit.Assert.assertNotNull(occupancySensorDataList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "2) test073(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky "2) test073(RegressionTest0)":         org.junit.Assert.assertNotNull(scanIDSensorDataList11);
        org.junit.Assert.assertNull(sensor13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        Model.User.StudentUser studentUser3 = new Model.User.StudentUser("DISABLED", "9", "src/main/data/scanid_sensor_logs.csv");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        View.GuestSelectActionView guestSelectActionView0 = null;
        Service.EvaluateRoomMaintenanceRelationshipService evaluateRoomMaintenanceRelationshipService1 = Service.EvaluateRoomMaintenanceRelationshipService.getInstance();
        boolean boolean2 = evaluateRoomMaintenanceRelationshipService1.isAnyEssentialMaintenanceRequestPending();
        // The following exception was thrown during execution in test generation
        try {
            Controller.GuestSelectActionController guestSelectActionController3 = new Controller.GuestSelectActionController(guestSelectActionView0, (java.lang.Object) evaluateRoomMaintenanceRelationshipService1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"availableRoomsButton\" because \"view\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evaluateRoomMaintenanceRelationshipService1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        Model.State.CheckInState checkInState0 = new Model.State.CheckInState();
        java.lang.String str1 = checkInState0.getStatus();
        java.lang.Class<?> wildcardClass2 = checkInState0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CHECKED_IN" + "'", str1, "CHECKED_IN");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        Service.SubmitServiceRequestService submitServiceRequestService0 = Service.SubmitServiceRequestService.getInstance();
        java.util.ArrayList<Model.ServiceRequest.ServiceRequest> serviceRequestList5 = submitServiceRequestService0.submitServiceRequest((int) (byte) 1, "src/main/data/sensors.csv", false, "CHECKED_IN");
        org.junit.Assert.assertNotNull(submitServiceRequestService0);
        org.junit.Assert.assertNotNull(serviceRequestList5);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        Controller.AdminServiceRequestController adminServiceRequestController0 = new Controller.AdminServiceRequestController();
        java.util.ArrayList<Model.ServiceRequest.ServiceRequest> serviceRequestList1 = adminServiceRequestController0.handleServiceRequestListCompilation();
        java.util.ArrayList<Model.ServiceRequest.ServiceRequest> serviceRequestList2 = adminServiceRequestController0.handleServiceRequestListCompilation();
        org.junit.Assert.assertNotNull(serviceRequestList1);
        org.junit.Assert.assertNotNull(serviceRequestList2);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
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
        boolean boolean16 = roomService12.performCheckOut("");
        evaluateRoomMaintenanceRelationshipService0.registerObserver((Model.Room.Observer) roomService12);
        org.junit.Assert.assertNotNull(evaluateRoomMaintenanceRelationshipService0);
        org.junit.Assert.assertNull(booking7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        Model.User.StudentUser studentUser6 = new Model.User.StudentUser("src/main/data/sensors.csv", "8", "src/main/data/MaintenanceRequests.csv", "1", true, "9");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        Model.State.RoomReadyForEnableState roomReadyForEnableState0 = new Model.State.RoomReadyForEnableState();
        Model.State.RoomEnabledState roomEnabledState1 = new Model.State.RoomEnabledState();
        boolean boolean2 = roomEnabledState1.isBookable();
        Model.State.RoomReadyForEnableState roomReadyForEnableState3 = new Model.State.RoomReadyForEnableState();
        boolean boolean4 = roomReadyForEnableState3.isBookable();
        Model.Room.Room room9 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        roomReadyForEnableState3.disable(room9);
        roomEnabledState1.maintain(room9);
        roomReadyForEnableState0.maintain(room9);
        java.lang.String str13 = room9.getLocation();
        java.lang.String str14 = room9.getRoomId();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "COMPLETED" + "'", str14, "COMPLETED");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        Service.RoomService roomService0 = new Service.RoomService();
        roomService0.update(true, (int) (short) 10);
        Model.Room.Booking booking5 = roomService0.getBookingDetails("src/main/data/users.csv");
        boolean boolean7 = roomService0.cancelBooking("hi!");
        roomService0.disableRoom("hi!");
        roomService0.disableRoom("1");
        Model.Room.Booking booking13 = roomService0.getBookingDetails("4");
        org.junit.Assert.assertNull(booking5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(booking13);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        Database.Database database0 = Database.Database.getInstance();
        java.lang.String str1 = database0.getSensorsCsvPath();
        java.lang.String str2 = database0.getMaintenanceRequestsCsvPath();
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "src/main/data/sensors.csv" + "'", str1, "src/main/data/sensors.csv");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "src/main/data/MaintenanceRequests.csv" + "'", str2, "src/main/data/MaintenanceRequests.csv");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        View.AddSensorView addSensorView0 = null;
        Service.SensorService sensorService1 = new Service.SensorService();
        boolean boolean3 = false; // flaky "6) test084(RegressionTest0)": sensorService1.addOccupancySensorData("CHECKED_IN");
        // The following exception was thrown during execution in test generation
        try {
            Controller.AddSensorController addSensorController4 = new Controller.AddSensorController(addSensorView0, sensorService1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"backButton\" because \"this.view\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "3) test084(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
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
        booking34.performCancel();
        completedState12.cancel(booking34);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "COMPLETED" + "'", str14, "COMPLETED");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        Service.AuthenticationException authenticationException1 = new Service.AuthenticationException("Service.AuthenticationException: ");
        java.lang.Throwable[] throwableArray2 = authenticationException1.getSuppressed();
        java.lang.String str3 = authenticationException1.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Service.AuthenticationException: Service.AuthenticationException: " + "'", str3, "Service.AuthenticationException: Service.AuthenticationException: ");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        java.time.LocalDateTime localDateTime2 = null;
        Model.Sensor.OccupancySensorData occupancySensorData3 = new Model.Sensor.OccupancySensorData("", "", localDateTime2);
        java.lang.String str4 = occupancySensorData3.sensorID;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        Model.User.PartnerUser partnerUser3 = new Model.User.PartnerUser("12", "8", "Service.AuthenticationException: Service.AuthenticationException: ");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        Model.ServiceRequest.SensorEssentialServiceRequest sensorEssentialServiceRequest5 = new Model.ServiceRequest.SensorEssentialServiceRequest(1, "COMPLETED", "Service.AuthenticationException: ", (int) 'a', (int) (short) -1);
        boolean boolean6 = sensorEssentialServiceRequest5.isEssential;
        sensorEssentialServiceRequest5.assignRoomID((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        Service.RoomService roomService0 = new Service.RoomService();
        roomService0.update(true, (int) (short) 10);
        Model.Room.Booking booking5 = roomService0.getBookingDetails("src/main/data/users.csv");
        boolean boolean7 = roomService0.cancelBooking("hi!");
        Controller.AddRoomController addRoomController8 = new Controller.AddRoomController(roomService0);
        Controller.AdminSelectActionController adminSelectActionController9 = new Controller.AdminSelectActionController(addRoomController8);
        adminSelectActionController9.adminAddRoom("Service.AuthenticationException: ", (int) ' ', (double) 100L);
        org.junit.Assert.assertNull(booking5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        Model.User.FacultyUser facultyUser3 = new Model.User.FacultyUser("EECS3311 Course Project Database - Rooms.csv", "", "COMPLETED");
        java.lang.String str4 = facultyUser3.getId();
        java.lang.String str5 = facultyUser3.getName();
// flaky "7) test091(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "512a0e7c-3268-4bb7-bc77-c6d32a14e20d" + "'", str4, "512a0e7c-3268-4bb7-bc77-c6d32a14e20d");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EECS3311 Course Project Database - Rooms.csv" + "'", str5, "EECS3311 Course Project Database - Rooms.csv");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        Model.User.StaffUser staffUser3 = new Model.User.StaffUser("12", "Service.AuthenticationException: Service.AuthenticationException: ", "EECS3311 Course Project Database - Bookings.csv");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        Repository.RoomRepository roomRepository0 = new Repository.RoomRepository();
        java.lang.String str1 = roomRepository0.generateNextId();
        java.lang.String str2 = roomRepository0.generateNextId();
        Model.Room.Room room7 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        boolean boolean8 = room7.isAvailable();
        Model.Room.AdminRoomProxy adminRoomProxy9 = new Model.Room.AdminRoomProxy(room7);
        room7.performMaintenance();
        roomRepository0.save(room7);
// flaky "8) test093(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "14" + "'", str1, "14");
// flaky "4) test093(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "14" + "'", str2, "14");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        Model.User.StudentUser studentUser6 = new Model.User.StudentUser("hi!", "", "", "src/main/data/users.csv", false, "src/main/data/users.csv");
        java.lang.String str7 = studentUser6.getEmail();
        Application.SessionData.setCurrentUser((Model.User.User) studentUser6);
        studentUser6.setPassword("DISABLED");
        java.lang.String str11 = studentUser6.getPassword();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DISABLED" + "'", str11, "DISABLED");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        View.GuestSelectActionView guestSelectActionView0 = null;
        Model.User.AccountType accountType1 = Model.User.AccountType.STUDENT;
        double double2 = accountType1.getHourlyRate();
        // The following exception was thrown during execution in test generation
        try {
            Controller.GuestSelectActionController guestSelectActionController3 = new Controller.GuestSelectActionController(guestSelectActionView0, (java.lang.Object) double2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"availableRoomsButton\" because \"view\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + accountType1 + "' != '" + Model.User.AccountType.STUDENT + "'", accountType1.equals(Model.User.AccountType.STUDENT));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        Database.Database database0 = Database.Database.getInstance();
        java.lang.String str1 = database0.getRoomCsvPath();
        java.lang.String str2 = database0.getOccupancySensorLogsPath();
        java.lang.String str3 = database0.getScanIDSensorLogsPath();
        java.lang.String str4 = database0.getScanIDSensorLogsPath();
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EECS3311 Course Project Database - Rooms.csv" + "'", str1, "EECS3311 Course Project Database - Rooms.csv");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "src/main/data/occupancy_sensor_logs.csv" + "'", str2, "src/main/data/occupancy_sensor_logs.csv");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "src/main/data/scanid_sensor_logs.csv" + "'", str3, "src/main/data/scanid_sensor_logs.csv");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "src/main/data/scanid_sensor_logs.csv" + "'", str4, "src/main/data/scanid_sensor_logs.csv");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
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
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "COMPLETED" + "'", str76, "COMPLETED");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        Model.State.CompletedState completedState0 = new Model.State.CompletedState();
        java.time.LocalDate localDate4 = null;
        java.time.LocalDate localDate5 = null;
        java.time.LocalTime localTime6 = null;
        java.time.LocalTime localTime7 = null;
        Model.Room.Booking booking9 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate4, localDate5, localTime6, localTime7, "");
        completedState0.checkOut(booking9);
        java.lang.String str11 = completedState0.getStatus();
        java.lang.String str12 = completedState0.getStatus();
        java.time.LocalDate localDate16 = null;
        java.time.LocalDate localDate17 = null;
        java.time.LocalTime localTime18 = null;
        java.time.LocalTime localTime19 = null;
        Model.Room.Booking booking21 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate16, localDate17, localTime18, localTime19, "");
        java.lang.String str22 = booking21.getBookingId();
        Model.State.BookingState bookingState23 = null;
        booking21.setState(bookingState23);
        completedState0.cancel(booking21);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "COMPLETED" + "'", str11, "COMPLETED");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "COMPLETED" + "'", str12, "COMPLETED");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        View.CheckinView checkinView0 = null;
        Service.RoomService roomService1 = new Service.RoomService();
        roomService1.maintenanceCompleted("");
        boolean boolean5 = roomService1.performCheckOut("");
        roomService1.maintenanceCompleted("1");
        boolean boolean9 = roomService1.performCheckOut("CHECKED_IN");
        Service.RoomService roomService10 = roomService1.getInstance();
        java.lang.String str14 = roomService10.createRoom("EECS3311 Course Project Database - Bookings.csv", (double) 100L, "hi!");
        Service.SensorService sensorService15 = new Service.SensorService();
        boolean boolean17 = false; // flaky "9) test099(RegressionTest0)": sensorService15.addOccupancySensorData("CHECKED_IN");
        boolean boolean21 = false; // flaky "5) test099(RegressionTest0)": sensorService15.addScanIDSensorData("", "src/main/data/sensors.csv", "7");
        // The following exception was thrown during execution in test generation
        try {
            Controller.CheckinController checkinController22 = new Controller.CheckinController(checkinView0, roomService10, sensorService15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"backButton\" because \"this.view\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(roomService10);
// flaky "3) test099(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "15" + "'", str14, "15");
// flaky "3) test099(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
// flaky "3) test099(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
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
        java.time.LocalTime localTime22 = booking19.getStartTime();
        org.junit.Assert.assertNull(localTime22);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        Model.State.RoomDisabledState roomDisabledState0 = new Model.State.RoomDisabledState();
        boolean boolean1 = roomDisabledState0.isBookable();
        boolean boolean2 = roomDisabledState0.isBookable();
        boolean boolean3 = roomDisabledState0.isBookable();
        Model.Room.Room room8 = new Model.Room.Room("COMPLETED", "hi!", (double) 100.0f, "2");
        roomDisabledState0.maintain(room8);
        Model.Room.AdminRoomProxy adminRoomProxy10 = new Model.Room.AdminRoomProxy(room8);
        double double11 = room8.getPrice();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        Repository.RoomRepository roomRepository0 = Repository.RoomRepository.getInstance();
        Model.Room.Room room2 = roomRepository0.findById("2");
        double double3 = room2.getPrice();
        org.junit.Assert.assertNotNull(roomRepository0);
        org.junit.Assert.assertNotNull(room2);
// flaky "10) test102(RegressionTest0)":         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        View.PaymentView paymentView0 = null;
        Service.RoomService roomService1 = new Service.RoomService();
        roomService1.update(true, (int) (short) 10);
        Model.Room.Booking booking6 = roomService1.getBookingDetails("src/main/data/users.csv");
        boolean boolean8 = roomService1.cancelBooking("hi!");
        roomService1.disableRoom("hi!");
        roomService1.disableRoom("1");
        // The following exception was thrown during execution in test generation
        try {
            Controller.PaymentViewController paymentViewController13 = new Controller.PaymentViewController(paymentView0, roomService1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"backButton\" because \"this.view\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(booking6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        View.RoomBookingRequirementsView roomBookingRequirementsView0 = null;
        Service.RoomService roomService1 = new Service.RoomService();
        roomService1.maintenanceCompleted("");
        boolean boolean5 = roomService1.performCheckOut("");
        roomService1.maintenanceCompleted("1");
        boolean boolean9 = roomService1.performCheckOut("CHECKED_IN");
        // The following exception was thrown during execution in test generation
        try {
            Controller.RoomBookingRequirementsController roomBookingRequirementsController10 = new Controller.RoomBookingRequirementsController(roomBookingRequirementsView0, roomService1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"backButton\" because \"this.view\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        View.GuestSelectActionView guestSelectActionView0 = null;
        // The following exception was thrown during execution in test generation
        try {
            Controller.GuestSelectActionController guestSelectActionController2 = new Controller.GuestSelectActionController(guestSelectActionView0, (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"availableRoomsButton\" because \"view\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        Service.RoomService roomService0 = new Service.RoomService();
        roomService0.update(true, (int) (short) 10);
        Model.Room.Booking booking5 = roomService0.getBookingDetails("src/main/data/users.csv");
        boolean boolean7 = roomService0.cancelBooking("hi!");
        Controller.AddRoomController addRoomController8 = new Controller.AddRoomController(roomService0);
        Controller.AdminSelectActionController adminSelectActionController9 = new Controller.AdminSelectActionController(addRoomController8);
        adminSelectActionController9.adminAddRoom("Service.AuthenticationException: ", 10, (double) 100L);
        org.junit.Assert.assertNull(booking5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        Service.GetMaintenanceRequestService getMaintenanceRequestService0 = Service.GetMaintenanceRequestService.getInstance();
        java.util.ArrayList<Model.ServiceRequest.ServiceRequest> serviceRequestList3 = getMaintenanceRequestService0.getServiceRequests(100, true);
        java.util.ArrayList<Model.ServiceRequest.ServiceRequest> serviceRequestList6 = getMaintenanceRequestService0.getServiceRequests((int) (byte) 0, false);
        org.junit.Assert.assertNotNull(getMaintenanceRequestService0);
        org.junit.Assert.assertNotNull(serviceRequestList3);
        org.junit.Assert.assertNotNull(serviceRequestList6);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
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
        Model.ServiceRequest.NonEssentialServiceRequest nonEssentialServiceRequest32 = new Model.ServiceRequest.NonEssentialServiceRequest((int) 'a', "EECS3311 Course Project Database - Rooms.csv", "3", (int) (byte) -1);
        boolean boolean33 = nonEssentialServiceRequest32.isEssential;
        Model.ServiceRequest.ServiceRequest serviceRequest34 = serviceRequestRepository0.addServiceRequest((Model.ServiceRequest.ServiceRequest) nonEssentialServiceRequest32);
        org.junit.Assert.assertNotNull(serviceRequestRepository0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Service.AuthenticationException: " + "'", str9, "Service.AuthenticationException: ");
        org.junit.Assert.assertNotNull(intMap20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(serviceRequest27);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(serviceRequest34);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        Repository.SensorRepository sensorRepository0 = new Repository.SensorRepository();
        java.util.List<Model.Sensor.OccupancySensorData> occupancySensorDataList1 = sensorRepository0.getOccupancySensorLogsList();
        Model.Sensor.ScanIDSensorData scanIDSensorData2 = null;
        boolean boolean3 = sensorRepository0.writeScanIDSensorLog(scanIDSensorData2);
        Model.Sensor.OccupancySensor occupancySensor9 = new Model.Sensor.OccupancySensor("", "1", "1", "EECS3311 Course Project Database - Rooms.csv", true);
        boolean boolean10 = false; // flaky "11) test109(RegressionTest0)": sensorRepository0.writeSensor((Model.Sensor.Sensor) occupancySensor9);
        java.util.List<Model.Sensor.Sensor> sensorList11 = sensorRepository0.getSensorsList();
// flaky "6) test109(RegressionTest0)":         org.junit.Assert.assertNotNull(occupancySensorDataList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "4) test109(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky "4) test109(RegressionTest0)":         org.junit.Assert.assertNotNull(sensorList11);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        Controller.AdminServiceRequestController adminServiceRequestController0 = new Controller.AdminServiceRequestController();
        adminServiceRequestController0.setRoomID((int) (short) 0);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        Model.User.StudentUser studentUser6 = new Model.User.StudentUser("9", "src/main/data/MaintenanceRequests.csv", "src/main/data/MaintenanceRequests.csv", "John Smith", false, "3");
        java.lang.String str7 = studentUser6.getEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "src/main/data/MaintenanceRequests.csv" + "'", str7, "src/main/data/MaintenanceRequests.csv");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        Service.UserService userService0 = new Service.UserService();
        Model.User.AccountType accountType1 = Model.User.AccountType.PARTNER;
        Model.User.User user5 = userService0.createUser(accountType1, "src/main/data/scanid_sensor_logs.csv", "CHECKED_IN", "EECS3311 Course Project Database - Rooms.csv");
        Controller.ChiefEventCoordinatorController chiefEventCoordinatorController6 = new Controller.ChiefEventCoordinatorController(userService0);
        org.junit.Assert.assertTrue("'" + accountType1 + "' != '" + Model.User.AccountType.PARTNER + "'", accountType1.equals(Model.User.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(user5);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        Model.State.RoomDisabledState roomDisabledState0 = new Model.State.RoomDisabledState();
        Model.State.RoomDisabledState roomDisabledState1 = new Model.State.RoomDisabledState();
        boolean boolean2 = roomDisabledState1.isBookable();
        boolean boolean3 = roomDisabledState1.isBookable();
        boolean boolean4 = roomDisabledState1.isBookable();
        Model.Room.Room room9 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        boolean boolean10 = room9.isAvailable();
        roomDisabledState1.maintain(room9);
        roomDisabledState0.maintain(room9);
        boolean boolean13 = roomDisabledState0.isBookable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        Service.UserService userService0 = new Service.UserService();
        Controller.ChiefEventCoordinatorController chiefEventCoordinatorController1 = new Controller.ChiefEventCoordinatorController(userService0);
        Model.User.AccountType accountType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            Model.User.User user6 = userService0.createUser(accountType2, "12", "STAFF", "DISABLED");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: wrong account type: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        Repository.UserRepository userRepository0 = Repository.UserRepository.getInstance();
        int int1 = userRepository0.getAll();
        Model.User.User user3 = userRepository0.findByEmail("PENDING");
        // The following exception was thrown during execution in test generation
        try {
            Model.User.AccountType accountType5 = userRepository0.mapCsvTypeToAccountType("PENDING");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown account type in users.csv: PENDING");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userRepository0);
// flaky "12) test115(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11 + "'", int1 == 11);
        org.junit.Assert.assertNull(user3);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        Service.AuthenticationException authenticationException1 = new Service.AuthenticationException("");
        java.lang.Throwable[] throwableArray2 = authenticationException1.getSuppressed();
        java.lang.String str3 = authenticationException1.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Service.AuthenticationException: " + "'", str3, "Service.AuthenticationException: ");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        Model.Payment.Payment payment2 = new Model.Payment.Payment("", (double) (short) 10);
        double double3 = payment2.getAmount();
        java.lang.String str4 = payment2.getStatus();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PENDING" + "'", str4, "PENDING");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        Model.Sensor.ScanIDSensor scanIDSensor4 = new Model.Sensor.ScanIDSensor("3", "src/main/data/MaintenanceRequests.csv", "EECS3311 Course Project Database - Rooms.csv", "");
        scanIDSensor4.setRoomID("jsmith@yorku.ca");
        java.lang.String str7 = scanIDSensor4.getStatus();
        java.lang.String str8 = scanIDSensor4.getStatus();
        scanIDSensor4.setOccupied(false);
        java.lang.String str11 = scanIDSensor4.getType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EECS3311 Course Project Database - Rooms.csv" + "'", str7, "EECS3311 Course Project Database - Rooms.csv");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EECS3311 Course Project Database - Rooms.csv" + "'", str8, "EECS3311 Course Project Database - Rooms.csv");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "src/main/data/MaintenanceRequests.csv" + "'", str11, "src/main/data/MaintenanceRequests.csv");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        Controller.AdminServiceRequestController adminServiceRequestController0 = Controller.AdminServiceRequestController.getInstance();
        org.junit.Assert.assertNotNull(adminServiceRequestController0);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        Model.State.RoomDisabledState roomDisabledState0 = new Model.State.RoomDisabledState();
        boolean boolean1 = roomDisabledState0.isBookable();
        boolean boolean2 = roomDisabledState0.isBookable();
        boolean boolean3 = roomDisabledState0.isBookable();
        Model.Room.Room room8 = new Model.Room.Room("COMPLETED", "hi!", (double) 100.0f, "2");
        roomDisabledState0.maintain(room8);
        double double10 = room8.getPrice();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        Service.UserService userService0 = new Service.UserService();
        Model.User.AccountType accountType1 = Model.User.AccountType.PARTNER;
        Model.User.User user5 = userService0.createUser(accountType1, "src/main/data/scanid_sensor_logs.csv", "CHECKED_IN", "EECS3311 Course Project Database - Rooms.csv");
        Model.User.AccountType accountType6 = Model.User.AccountType.PARTNER;
        Model.User.User user10 = userService0.createUser(accountType6, "src/main/data/scanid_sensor_logs.csv", "ENABLED", "ENABLED");
        org.junit.Assert.assertTrue("'" + accountType1 + "' != '" + Model.User.AccountType.PARTNER + "'", accountType1.equals(Model.User.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertTrue("'" + accountType6 + "' != '" + Model.User.AccountType.PARTNER + "'", accountType6.equals(Model.User.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(user10);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        Model.ServiceRequest.SensorEssentialServiceRequest sensorEssentialServiceRequest5 = new Model.ServiceRequest.SensorEssentialServiceRequest(1, "COMPLETED", "Service.AuthenticationException: ", (int) 'a', (int) (short) -1);
        sensorEssentialServiceRequest5.assignRoomID(100);
        java.lang.String str8 = sensorEssentialServiceRequest5.getStatus();
        sensorEssentialServiceRequest5.assignRoomID((int) (byte) 1);
        boolean boolean11 = sensorEssentialServiceRequest5.isEssential;
        java.lang.String str12 = sensorEssentialServiceRequest5.getDescription();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Service.AuthenticationException: " + "'", str8, "Service.AuthenticationException: ");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "COMPLETED" + "'", str12, "COMPLETED");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
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
        java.lang.String str17 = booking13.getBookingId();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CHECKED_IN" + "'", str1, "CHECKED_IN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CHECKED_IN" + "'", str2, "CHECKED_IN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CHECKED_IN" + "'", str3, "CHECKED_IN");
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        Service.UserService userService0 = new Service.UserService();
        Model.User.AccountType accountType1 = Model.User.AccountType.PARTNER;
        Model.User.User user5 = userService0.createUser(accountType1, "", "DISABLED", "4");
        Model.User.User user9 = Model.User.UserFactory.createUser(accountType1, "COMPLETED", "", "COMPLETED");
        boolean boolean11 = user9.checkPassword("17");
        org.junit.Assert.assertTrue("'" + accountType1 + "' != '" + Model.User.AccountType.PARTNER + "'", accountType1.equals(Model.User.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNotNull(user9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        Repository.SensorRepository sensorRepository0 = new Repository.SensorRepository();
        java.util.List<Model.Sensor.ScanIDSensorData> scanIDSensorDataList1 = sensorRepository0.getScanIDSensorLogsList();
        Model.Sensor.ScanIDSensorData scanIDSensorData2 = null;
        boolean boolean3 = sensorRepository0.writeScanIDSensorLog(scanIDSensorData2);
// flaky "13) test125(RegressionTest0)":         org.junit.Assert.assertNotNull(scanIDSensorDataList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        Model.Room.Room room4 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        boolean boolean5 = room4.isAvailable();
        Model.Room.AdminRoomProxy adminRoomProxy6 = new Model.Room.AdminRoomProxy(room4);
        adminRoomProxy6.showRoomDetails();
        adminRoomProxy6.showRoomDetails();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        Service.RoomService roomService0 = new Service.RoomService();
        roomService0.update(true, (int) (short) 10);
        Model.Room.Booking booking5 = roomService0.getBookingDetails("src/main/data/users.csv");
        boolean boolean7 = roomService0.cancelBooking("hi!");
        Controller.AddRoomController addRoomController8 = new Controller.AddRoomController(roomService0);
        Controller.AdminSelectActionController adminSelectActionController9 = new Controller.AdminSelectActionController(addRoomController8);
        Controller.AdminSelectActionController adminSelectActionController10 = new Controller.AdminSelectActionController(addRoomController8);
        addRoomController8.handleAddRoomSubmission("CHECKED_IN", (int) (byte) -1, (double) 3);
        org.junit.Assert.assertNull(booking5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        Model.User.EventCoordinator eventCoordinator0 = Model.User.EventCoordinator.getInstance();
        java.lang.String str1 = eventCoordinator0.getChiefEventCoordinatorName();
        java.lang.String str2 = eventCoordinator0.getChiefEventCoordinatorEmail();
        java.lang.String str3 = eventCoordinator0.getChiefEventCoordinatorEmail();
        java.lang.String str4 = eventCoordinator0.getChiefEventCoordinatorEmail();
        java.lang.String str5 = eventCoordinator0.getChiefEventCoordinatorPassword();
        org.junit.Assert.assertNotNull(eventCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "John Smith" + "'", str1, "John Smith");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jsmith@yorku.ca" + "'", str2, "jsmith@yorku.ca");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jsmith@yorku.ca" + "'", str3, "jsmith@yorku.ca");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jsmith@yorku.ca" + "'", str4, "jsmith@yorku.ca");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "!Password123" + "'", str5, "!Password123");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        View.AddSensorView addSensorView0 = null;
        Service.SensorService sensorService1 = new Service.SensorService();
        boolean boolean3 = false; // flaky "14) test129(RegressionTest0)": sensorService1.addOccupancySensorData("CHECKED_IN");
        boolean boolean7 = false; // flaky "7) test129(RegressionTest0)": sensorService1.addScanIDSensorData("", "src/main/data/sensors.csv", "7");
        java.util.List<java.util.List<java.lang.String>> strListList8 = null; // flaky "5) test129(RegressionTest0)": sensorService1.getSensorsFormatted();
        // The following exception was thrown during execution in test generation
        try {
            Controller.AddSensorController addSensorController9 = new Controller.AddSensorController(addSensorView0, sensorService1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"backButton\" because \"this.view\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "5) test129(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "4) test129(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
// flaky "1) test129(RegressionTest0)":         org.junit.Assert.assertNotNull(strListList8);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        Model.User.FacultyUser facultyUser3 = new Model.User.FacultyUser("COMPLETED", "3", "EECS3311 Course Project Database - Rooms.csv");
        boolean boolean5 = facultyUser3.checkPassword("9");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        Model.User.StaffUser staffUser6 = new Model.User.StaffUser("", "hi!", "4", "hi!", false, "2");
        java.lang.String str7 = staffUser6.getEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4" + "'", str7, "4");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        Service.RoomService roomService0 = new Service.RoomService();
        roomService0.update(true, (int) (short) 10);
        Model.Room.Booking booking5 = roomService0.getBookingDetails("src/main/data/users.csv");
        boolean boolean7 = roomService0.cancelBooking("hi!");
        roomService0.disableRoom("hi!");
        roomService0.disableRoom("1");
        Service.RoomService roomService12 = roomService0.getInstance();
        Controller.AddRoomController addRoomController13 = new Controller.AddRoomController(roomService12);
        Controller.AdminSelectActionController adminSelectActionController14 = new Controller.AdminSelectActionController(addRoomController13);
        org.junit.Assert.assertNull(booking5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(roomService12);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        Repository.RoomRepository roomRepository0 = Repository.RoomRepository.getInstance();
        Model.Room.Room room1 = null;
        // The following exception was thrown during execution in test generation
        try {
            roomRepository0.save(room1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Model.Room.Room.getRoomId()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(roomRepository0);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        Repository.ServiceRequestRepository serviceRequestRepository0 = Repository.ServiceRequestRepository.getInstance();
        java.lang.Integer int2 = serviceRequestRepository0.generateNextId((int) (byte) 100);
        Service.EditMaintenanceRequestService editMaintenanceRequestService3 = new Service.EditMaintenanceRequestService(serviceRequestRepository0);
        editMaintenanceRequestService3.update((-1), "512a0e7c-3268-4bb7-bc77-c6d32a14e20d", "EECS3311 Course Project Database - payments.csv", false, (int) (byte) 10);
        org.junit.Assert.assertNotNull(serviceRequestRepository0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        Service.UserService userService0 = new Service.UserService();
        Model.User.AccountType accountType1 = Model.User.AccountType.PARTNER;
        Model.User.User user5 = userService0.createUser(accountType1, "", "DISABLED", "4");
        Model.User.User user9 = Model.User.UserFactory.createUser(accountType1, "COMPLETED", "", "COMPLETED");
        user9.setVerified(true);
        java.lang.String str12 = user9.getId();
        org.junit.Assert.assertTrue("'" + accountType1 + "' != '" + Model.User.AccountType.PARTNER + "'", accountType1.equals(Model.User.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNotNull(user9);
// flaky "15) test135(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1bec99b6-9fd5-4eb6-be48-3e7f52439881" + "'", str12, "1bec99b6-9fd5-4eb6-be48-3e7f52439881");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        Service.AuthenticationException authenticationException1 = new Service.AuthenticationException("src/main/data/MaintenanceRequests.csv");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        Repository.SensorRepository sensorRepository0 = new Repository.SensorRepository();
        java.util.List<Model.Sensor.OccupancySensorData> occupancySensorDataList1 = sensorRepository0.getOccupancySensorLogsList();
        java.time.LocalDateTime localDateTime4 = null;
        Model.Sensor.OccupancySensorData occupancySensorData5 = new Model.Sensor.OccupancySensorData("", "hi!", localDateTime4);
        java.time.LocalDateTime localDateTime6 = null;
        occupancySensorData5.dateTime = localDateTime6;
        boolean boolean8 = false; // flaky "16) test137(RegressionTest0)": sensorRepository0.writeOccupancySensorLog(occupancySensorData5);
        java.util.List<Model.Sensor.Sensor> sensorList9 = sensorRepository0.getSensorsList();
// flaky "8) test137(RegressionTest0)":         org.junit.Assert.assertNotNull(occupancySensorDataList1);
// flaky "6) test137(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "6) test137(RegressionTest0)":         org.junit.Assert.assertNotNull(sensorList9);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        Model.State.CompletedState completedState0 = new Model.State.CompletedState();
        java.time.LocalDate localDate4 = null;
        java.time.LocalDate localDate5 = null;
        java.time.LocalTime localTime6 = null;
        java.time.LocalTime localTime7 = null;
        Model.Room.Booking booking9 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate4, localDate5, localTime6, localTime7, "");
        completedState0.checkOut(booking9);
        java.time.LocalDate localDate11 = booking9.getEndDate();
        java.lang.String str12 = booking9.getPaymentId();
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        Service.RoomService roomService0 = new Service.RoomService();
        roomService0.update(true, (int) (short) 10);
        boolean boolean5 = roomService0.performCheckOut("hi!");
        java.lang.String str9 = roomService0.createRoom("", (double) '4', "src/main/data/users.csv");
        Service.RoomService roomService10 = roomService0.getInstance();
        Controller.AddRoomController addRoomController11 = new Controller.AddRoomController(roomService10);
        roomService10.disableRoom("Service.AuthenticationException: ");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "17) test139(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "20" + "'", str9, "20");
        org.junit.Assert.assertNotNull(roomService10);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        Service.AuthenticationException authenticationException1 = new Service.AuthenticationException("ENABLED");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        Model.User.StaffUser staffUser6 = new Model.User.StaffUser("hi!", "hi!", "src/main/data/users.csv", "src/main/data/users.csv", false, "hi!");
        Model.User.AccountType accountType7 = null;
        staffUser6.setAccountType(accountType7);
        Model.User.AccountType accountType9 = staffUser6.getAccountType();
        staffUser6.setPassword("");
        boolean boolean12 = staffUser6.isVerified();
        java.lang.String str13 = staffUser6.getName();
        org.junit.Assert.assertNull(accountType9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        Model.State.RoomDisabledState roomDisabledState0 = new Model.State.RoomDisabledState();
        boolean boolean1 = roomDisabledState0.isBookable();
        boolean boolean2 = roomDisabledState0.isBookable();
        Model.State.RoomReadyForEnableState roomReadyForEnableState3 = new Model.State.RoomReadyForEnableState();
        boolean boolean4 = roomReadyForEnableState3.isBookable();
        Model.Room.Room room9 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        roomReadyForEnableState3.disable(room9);
        roomDisabledState0.disable(room9);
        room9.requestDisable();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        Service.AuthenticationService authenticationService0 = new Service.AuthenticationService();
        boolean boolean2 = authenticationService0.isYorkEmail("Service.AuthenticationException: ");
        Model.User.AccountType accountType6 = Model.User.AccountType.STAFF;
        // The following exception was thrown during execution in test generation
        try {
            Model.User.User user7 = authenticationService0.register("src/main/data/sensors.csv", "", "1", accountType6);
            org.junit.Assert.fail("Expected exception of type Service.AuthenticationException; message: Missing  field.");
        } catch (Service.AuthenticationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + accountType6 + "' != '" + Model.User.AccountType.STAFF + "'", accountType6.equals(Model.User.AccountType.STAFF));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        Repository.SensorRepository sensorRepository0 = new Repository.SensorRepository();
        java.util.List<Model.Sensor.OccupancySensorData> occupancySensorDataList1 = sensorRepository0.getOccupancySensorLogsList();
        Model.Sensor.ScanIDSensorData scanIDSensorData2 = null;
        boolean boolean3 = sensorRepository0.writeScanIDSensorLog(scanIDSensorData2);
        Model.Sensor.OccupancySensor occupancySensor9 = new Model.Sensor.OccupancySensor("", "1", "1", "EECS3311 Course Project Database - Rooms.csv", true);
        boolean boolean10 = false; // flaky "18) test144(RegressionTest0)": sensorRepository0.writeSensor((Model.Sensor.Sensor) occupancySensor9);
        java.util.List<Model.Sensor.ScanIDSensorData> scanIDSensorDataList11 = sensorRepository0.getScanIDSensorLogsList();
        Model.Sensor.Sensor sensor13 = null; // flaky "9) test144(RegressionTest0)": sensorRepository0.getSensorByID("EECS3311 Course Project Database - Bookings.csv");
        java.util.List<Model.Sensor.ScanIDSensorData> scanIDSensorDataList14 = sensorRepository0.getScanIDSensorLogsList();
// flaky "7) test144(RegressionTest0)":         org.junit.Assert.assertNotNull(occupancySensorDataList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "7) test144(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky "5) test144(RegressionTest0)":         org.junit.Assert.assertNotNull(scanIDSensorDataList11);
        org.junit.Assert.assertNull(sensor13);
// flaky "2) test144(RegressionTest0)":         org.junit.Assert.assertNotNull(scanIDSensorDataList14);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
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
        Service.RoomService roomService16 = new Service.RoomService();
        roomService16.update(true, (int) (short) 10);
        boolean boolean21 = roomService16.performCheckOut("hi!");
        java.lang.String str25 = roomService16.createRoom("", (double) '4', "src/main/data/users.csv");
        Service.RoomService roomService26 = roomService16.getInstance();
        evaluateRoomMaintenanceRelationshipService0.registerObserver((Model.Room.Observer) roomService16);
        org.junit.Assert.assertNotNull(evaluateRoomMaintenanceRelationshipService0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(roomService11);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
// flaky "19) test145(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "21" + "'", str25, "21");
        org.junit.Assert.assertNotNull(roomService26);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        Model.User.StaffUser staffUser6 = new Model.User.StaffUser("", "hi!", "4", "hi!", false, "2");
        java.lang.String str7 = staffUser6.getRole();
        Model.User.AccountType accountType8 = staffUser6.getAccountType();
        staffUser6.setRole("21");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2" + "'", str7, "2");
        org.junit.Assert.assertTrue("'" + accountType8 + "' != '" + Model.User.AccountType.STAFF + "'", accountType8.equals(Model.User.AccountType.STAFF));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        Service.AuthenticationService authenticationService0 = new Service.AuthenticationService();
        // The following exception was thrown during execution in test generation
        try {
            Model.User.User user3 = authenticationService0.login("src/main/data/scanid_sensor_logs.csv", "CHECKED_IN");
            org.junit.Assert.fail("Expected exception of type Service.AuthenticationException; message: No user found for this email.");
        } catch (Service.AuthenticationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        java.time.LocalTime localTime5 = null;
        java.time.LocalTime localTime6 = null;
        Model.Room.Booking booking8 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate3, localDate4, localTime5, localTime6, "");
        java.lang.String str9 = booking8.getBookingId();
        java.time.LocalTime localTime10 = booking8.getStartTime();
        java.lang.String str11 = booking8.getBookingId();
        booking8.performCheckOut();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        Repository.ServiceRequestRepository serviceRequestRepository0 = Repository.ServiceRequestRepository.getInstance();
        Model.ServiceRequest.SensorEssentialServiceRequest sensorEssentialServiceRequest6 = new Model.ServiceRequest.SensorEssentialServiceRequest((int) (short) -1, "4", "hi!", (-1), (int) ' ');
        serviceRequestRepository0.updateExistingServiceRequest((Model.ServiceRequest.ServiceRequest) sensorEssentialServiceRequest6);
        int int8 = sensorEssentialServiceRequest6.getServiceRequestID();
        org.junit.Assert.assertNotNull(serviceRequestRepository0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        Model.State.RoomReadyForEnableState roomReadyForEnableState0 = new Model.State.RoomReadyForEnableState();
        boolean boolean1 = roomReadyForEnableState0.isBookable();
        Model.Room.Room room6 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        roomReadyForEnableState0.disable(room6);
        java.lang.String str8 = roomReadyForEnableState0.getStateName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "READY_FOR_ENABLE" + "'", str8, "READY_FOR_ENABLE");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        Model.Sensor.ScanIDSensor scanIDSensor4 = new Model.Sensor.ScanIDSensor("3", "src/main/data/MaintenanceRequests.csv", "EECS3311 Course Project Database - Rooms.csv", "");
        scanIDSensor4.setRoomID("jsmith@yorku.ca");
        java.lang.String str7 = scanIDSensor4.getStatus();
        java.lang.String str8 = scanIDSensor4.getStatus();
        scanIDSensor4.setOccupied(false);
        java.lang.String str11 = scanIDSensor4.getStatus();
        java.lang.String str12 = scanIDSensor4.getStatus();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EECS3311 Course Project Database - Rooms.csv" + "'", str7, "EECS3311 Course Project Database - Rooms.csv");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EECS3311 Course Project Database - Rooms.csv" + "'", str8, "EECS3311 Course Project Database - Rooms.csv");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "EECS3311 Course Project Database - Rooms.csv" + "'", str11, "EECS3311 Course Project Database - Rooms.csv");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EECS3311 Course Project Database - Rooms.csv" + "'", str12, "EECS3311 Course Project Database - Rooms.csv");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
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
        boolean boolean18 = roomService16.cancelBooking("3b878a93-2f8d-4168-99fd-22b8dbe103f1");
        roomService16.disableRoom("17");
        org.junit.Assert.assertNotNull(evaluateRoomMaintenanceRelationshipService0);
        org.junit.Assert.assertNull(booking7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(roomService16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
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
        boolean boolean35 = evaluateRoomMaintenanceRelationshipService0.isAnyEssentialMaintenanceRequestPending();
        org.junit.Assert.assertNotNull(evaluateRoomMaintenanceRelationshipService0);
        org.junit.Assert.assertNull(booking7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(evaluateRoomMaintenanceRelationshipService16);
        org.junit.Assert.assertNull(booking23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(roomService32);
        org.junit.Assert.assertNotNull(roomService33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        Model.Sensor.OccupancySensor occupancySensor5 = new Model.Sensor.OccupancySensor("src/main/data/scanid_sensor_logs.csv", "jsmith@yorku.ca", "Service.AuthenticationException: Service.AuthenticationException: ", "DISABLED", false);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
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
        java.lang.String str16 = roomEnabledState0.getStateName();
        Model.Room.Room room17 = null;
        roomEnabledState0.enable(room17);
        java.lang.String str19 = roomEnabledState0.getStateName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ENABLED" + "'", str16, "ENABLED");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ENABLED" + "'", str19, "ENABLED");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        Service.RoomService roomService0 = new Service.RoomService();
        roomService0.update(true, (int) ' ');
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        Model.ServiceRequest.NonEssentialServiceRequest nonEssentialServiceRequest4 = new Model.ServiceRequest.NonEssentialServiceRequest((-1), "STAFF", "14", 0);
        nonEssentialServiceRequest4.setDescription("EECS3311 Course Project Database - Bookings.csv");
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        Service.EvaluateRoomMaintenanceRelationshipService evaluateRoomMaintenanceRelationshipService0 = Service.EvaluateRoomMaintenanceRelationshipService.getInstance();
        evaluateRoomMaintenanceRelationshipService0.notifyObservers();
        evaluateRoomMaintenanceRelationshipService0.evaluateRoomMaintenanceRelationship((-1));
        Service.EvaluateRoomMaintenanceRelationshipService evaluateRoomMaintenanceRelationshipService4 = Service.EvaluateRoomMaintenanceRelationshipService.getInstance();
        evaluateRoomMaintenanceRelationshipService4.notifyObservers();
        Service.RoomService roomService6 = new Service.RoomService();
        roomService6.update(true, (int) (short) 10);
        Model.Room.Booking booking11 = roomService6.getBookingDetails("src/main/data/users.csv");
        boolean boolean13 = roomService6.cancelBooking("hi!");
        Controller.AddRoomController addRoomController14 = new Controller.AddRoomController(roomService6);
        evaluateRoomMaintenanceRelationshipService4.removeObserver((Model.Room.Observer) roomService6);
        Service.RoomService roomService16 = new Service.RoomService();
        roomService16.maintenanceCompleted("");
        evaluateRoomMaintenanceRelationshipService4.removeObserver((Model.Room.Observer) roomService16);
        evaluateRoomMaintenanceRelationshipService0.registerObserver((Model.Room.Observer) roomService16);
        boolean boolean22 = roomService16.performCheckOut("src/main/data/scanid_sensor_logs.csv");
        org.junit.Assert.assertNotNull(evaluateRoomMaintenanceRelationshipService0);
        org.junit.Assert.assertNotNull(evaluateRoomMaintenanceRelationshipService4);
        org.junit.Assert.assertNull(booking11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        Model.User.StudentUser studentUser6 = new Model.User.StudentUser("hi!", "", "", "src/main/data/users.csv", false, "src/main/data/users.csv");
        java.lang.String str7 = studentUser6.getEmail();
        java.lang.String str8 = studentUser6.getId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        Model.State.RoomDisabledState roomDisabledState0 = new Model.State.RoomDisabledState();
        boolean boolean1 = roomDisabledState0.isBookable();
        boolean boolean2 = roomDisabledState0.isBookable();
        boolean boolean3 = roomDisabledState0.isBookable();
        Model.Room.Room room8 = new Model.Room.Room("COMPLETED", "hi!", (double) 100.0f, "2");
        roomDisabledState0.maintain(room8);
        Model.Room.AdminRoomProxy adminRoomProxy10 = new Model.Room.AdminRoomProxy(room8);
        adminRoomProxy10.showRoomDetails();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
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
        java.time.LocalTime localTime34 = booking28.getStartTime();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CHECKED_IN" + "'", str1, "CHECKED_IN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CHECKED_IN" + "'", str2, "CHECKED_IN");
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "CHECKED_IN" + "'", str17, "CHECKED_IN");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "CHECKED_IN" + "'", str18, "CHECKED_IN");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "CHECKED_IN" + "'", str19, "CHECKED_IN");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNull(localTime30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNull(localTime34);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        Model.User.PartnerUser partnerUser6 = new Model.User.PartnerUser("ENABLED", "EECS3311 Course Project Database - Rooms.csv", "20", "14", true, "src/main/data/sensors.csv");
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        Repository.ServiceRequestRepository serviceRequestRepository0 = Repository.ServiceRequestRepository.getInstance();
        Model.ServiceRequest.SensorEssentialServiceRequest sensorEssentialServiceRequest6 = new Model.ServiceRequest.SensorEssentialServiceRequest(1, "COMPLETED", "Service.AuthenticationException: ", (int) 'a', (int) (short) -1);
        sensorEssentialServiceRequest6.assignRoomID(100);
        java.lang.String str9 = sensorEssentialServiceRequest6.getStatus();
        serviceRequestRepository0.updateExistingServiceRequest((Model.ServiceRequest.ServiceRequest) sensorEssentialServiceRequest6);
        Model.ServiceRequest.SensorEssentialServiceRequest sensorEssentialServiceRequest16 = new Model.ServiceRequest.SensorEssentialServiceRequest((int) (short) 100, "CHECKED_IN", "EECS3311 Course Project Database - Bookings.csv", 0, (int) (byte) 0);
        serviceRequestRepository0.updateExistingServiceRequest((Model.ServiceRequest.ServiceRequest) sensorEssentialServiceRequest16);
        java.util.Map<java.lang.Integer, java.util.List<Model.ServiceRequest.ServiceRequest>> intMap20 = serviceRequestRepository0.parseCsvFileToMap("EECS3311 Course Project Database - Bookings.csv", true);
        java.util.Map<java.lang.Integer, java.util.List<Model.ServiceRequest.ServiceRequest>> intMap23 = serviceRequestRepository0.parseCsvFileToMap("8903a9bb-0838-41ef-9768-131faa20dcdc", true);
        org.junit.Assert.assertNotNull(serviceRequestRepository0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Service.AuthenticationException: " + "'", str9, "Service.AuthenticationException: ");
        org.junit.Assert.assertNotNull(intMap20);
        org.junit.Assert.assertNotNull(intMap23);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        Model.Sensor.Sensor sensor5 = new Model.Sensor.Sensor("1", "", "src/main/data/users.csv", "hi!", true);
        java.lang.String str6 = sensor5.getRoomID();
        Model.State.RoomReadyForEnableState roomReadyForEnableState7 = new Model.State.RoomReadyForEnableState();
        boolean boolean8 = sensor5.equals((java.lang.Object) roomReadyForEnableState7);
        java.lang.String str9 = sensor5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "src/main/data/users.csv" + "'", str9, "src/main/data/users.csv");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        Repository.ServiceRequestRepository serviceRequestRepository0 = Repository.ServiceRequestRepository.getInstance();
        Model.ServiceRequest.SensorEssentialServiceRequest sensorEssentialServiceRequest6 = new Model.ServiceRequest.SensorEssentialServiceRequest((int) (short) -1, "4", "hi!", (-1), (int) ' ');
        serviceRequestRepository0.updateExistingServiceRequest((Model.ServiceRequest.ServiceRequest) sensorEssentialServiceRequest6);
        boolean boolean8 = sensorEssentialServiceRequest6.isEssential();
        org.junit.Assert.assertNotNull(serviceRequestRepository0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
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
        java.lang.String str17 = booking9.getPaymentId();
        booking9.performCheckIn();
        org.junit.Assert.assertNotNull(bookingRepository0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(localTime16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        Model.User.PartnerUser partnerUser6 = new Model.User.PartnerUser("EECS3311 Course Project Database - Rooms.csv", "EECS3311 Course Project Database - payments.csv", "17", "John Smith", false, "COMPLETED");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
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
        java.lang.String str65 = cancelledState0.getStatus();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "COMPLETED" + "'", str12, "COMPLETED");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "CANCELLED" + "'", str65, "CANCELLED");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        Model.Payment.Payment payment2 = new Model.Payment.Payment("7", 100.0d);
        java.lang.String str3 = payment2.getStatus();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PENDING" + "'", str3, "PENDING");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        Model.User.StaffUser staffUser6 = new Model.User.StaffUser("", "hi!", "4", "hi!", false, "2");
        java.lang.String str7 = staffUser6.getRole();
        Model.User.AccountType accountType8 = staffUser6.getAccountType();
        double double9 = accountType8.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2" + "'", str7, "2");
        org.junit.Assert.assertTrue("'" + accountType8 + "' != '" + Model.User.AccountType.STAFF + "'", accountType8.equals(Model.User.AccountType.STAFF));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        Model.User.PartnerUser partnerUser3 = new Model.User.PartnerUser("EECS3311 Course Project Database - payments.csv", "CHECKED_IN", "3");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
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
        java.lang.String str14 = booking8.getRoomId();
        java.lang.String str15 = booking8.getUserId();
        booking8.setPaymentId("22");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "src/main/data/users.csv" + "'", str14, "src/main/data/users.csv");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
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
        java.lang.Integer int51 = serviceRequestRepository0.generateNextId((int) (short) 0);
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
// flaky "20) test173(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int51 + "' != '" + 108 + "'", int51 == 108);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        Model.Payment.Payment payment2 = new Model.Payment.Payment("", (double) (byte) -1);
        java.lang.String str3 = payment2.getPaymentId();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        Model.User.StaffUser staffUser3 = new Model.User.StaffUser("12", "EECS3311 Course Project Database - Rooms.csv", "Service.AuthenticationException: Service.AuthenticationException: ");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        View.RoomBookingRequirementsView roomBookingRequirementsView0 = null;
        Service.RoomService roomService1 = new Service.RoomService();
        roomService1.update(true, (int) (short) 10);
        Model.Room.Booking booking6 = roomService1.getBookingDetails("src/main/data/users.csv");
        boolean boolean8 = roomService1.cancelBooking("hi!");
        roomService1.disableRoom("hi!");
        boolean boolean12 = roomService1.cancelBooking("DISABLED");
        // The following exception was thrown during execution in test generation
        try {
            Controller.RoomBookingRequirementsController roomBookingRequirementsController13 = new Controller.RoomBookingRequirementsController(roomBookingRequirementsView0, roomService1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"backButton\" because \"this.view\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(booking6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        Model.User.FacultyUser facultyUser6 = new Model.User.FacultyUser("4", "CHECKED_IN", "PENDING", "CANCELLED", true, "CONFIRMED");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        Model.User.StudentUser studentUser6 = new Model.User.StudentUser("3b878a93-2f8d-4168-99fd-22b8dbe103f1", "READY_FOR_ENABLE", "STAFF", "14", true, "23");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        Model.State.RoomEnabledState roomEnabledState0 = new Model.State.RoomEnabledState();
        boolean boolean1 = roomEnabledState0.isBookable();
        boolean boolean2 = roomEnabledState0.isBookable();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        Model.Sensor.Sensor sensor5 = new Model.Sensor.Sensor("1", "", "src/main/data/users.csv", "hi!", true);
        java.lang.String str6 = sensor5.getRoomID();
        sensor5.setOccupied(true);
        java.lang.String str9 = sensor5.getStatus();
        java.lang.String str10 = sensor5.getType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "src/main/data/users.csv" + "'", str9, "src/main/data/users.csv");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        View.GuestSelectActionView guestSelectActionView0 = null;
        Repository.BookingRepository bookingRepository1 = Repository.BookingRepository.getInstance();
        java.util.List<Model.Room.Booking> bookingList2 = bookingRepository1.findAll();
        Model.State.CompletedState completedState3 = new Model.State.CompletedState();
        java.time.LocalDate localDate7 = null;
        java.time.LocalDate localDate8 = null;
        java.time.LocalTime localTime9 = null;
        java.time.LocalTime localTime10 = null;
        Model.Room.Booking booking12 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate7, localDate8, localTime9, localTime10, "");
        completedState3.checkOut(booking12);
        java.time.LocalDate localDate14 = booking12.getEndDate();
        bookingRepository1.save(booking12);
        java.util.List<Model.Room.Booking> bookingList16 = bookingRepository1.findAll();
        java.util.List<Model.Room.Booking> bookingList17 = bookingRepository1.findAll();
        java.util.List<Model.Room.Booking> bookingList18 = bookingRepository1.findAll();
        // The following exception was thrown during execution in test generation
        try {
            Controller.GuestSelectActionController guestSelectActionController19 = new Controller.GuestSelectActionController(guestSelectActionView0, (java.lang.Object) bookingRepository1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"availableRoomsButton\" because \"view\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingRepository1);
        org.junit.Assert.assertNotNull(bookingList2);
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertNotNull(bookingList16);
        org.junit.Assert.assertNotNull(bookingList17);
        org.junit.Assert.assertNotNull(bookingList18);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        Model.Sensor.Sensor sensor5 = new Model.Sensor.Sensor("src/main/data/MaintenanceRequests.csv", "8", "READY_FOR_ENABLE", "EECS3311 Course Project Database - Rooms.csv", false);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
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
        Service.EditMaintenanceRequestService editMaintenanceRequestService50 = new Service.EditMaintenanceRequestService(serviceRequestRepository0);
        // The following exception was thrown during execution in test generation
        try {
            editMaintenanceRequestService50.promoteServiceRequest((int) 'a', "src/main/data/occupancy_sensor_logs.csv", "CANCELLED", (int) ' ', "57197862-2463-4972-b3b2-977245133f34");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"57197862-2463-4972-b3b2-977245133f34\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
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
        boolean boolean23 = roomEnabledState0.isBookable();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(roomState21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        Repository.SensorRepository sensorRepository0 = new Repository.SensorRepository();
        java.util.List<Model.Sensor.OccupancySensorData> occupancySensorDataList1 = sensorRepository0.getOccupancySensorLogsList();
        Model.Sensor.ScanIDSensorData scanIDSensorData2 = null;
        boolean boolean3 = sensorRepository0.writeScanIDSensorLog(scanIDSensorData2);
        Model.Sensor.OccupancySensor occupancySensor9 = new Model.Sensor.OccupancySensor("", "1", "1", "EECS3311 Course Project Database - Rooms.csv", true);
        boolean boolean10 = false; // flaky "21) test185(RegressionTest0)": sensorRepository0.writeSensor((Model.Sensor.Sensor) occupancySensor9);
        java.util.List<Model.Sensor.ScanIDSensorData> scanIDSensorDataList11 = sensorRepository0.getScanIDSensorLogsList();
        Model.Sensor.Sensor sensor13 = null; // flaky "10) test185(RegressionTest0)": sensorRepository0.getSensorByID("EECS3311 Course Project Database - Bookings.csv");
        java.time.LocalDateTime localDateTime16 = null;
        Model.Sensor.OccupancySensorData occupancySensorData17 = new Model.Sensor.OccupancySensorData("", "hi!", localDateTime16);
        java.time.LocalDateTime localDateTime18 = null;
        occupancySensorData17.dateTime = localDateTime18;
        boolean boolean20 = false; // flaky "8) test185(RegressionTest0)": sensorRepository0.writeOccupancySensorLog(occupancySensorData17);
        java.util.List<Model.Sensor.ScanIDSensorData> scanIDSensorDataList21 = sensorRepository0.getScanIDSensorLogsList();
// flaky "8) test185(RegressionTest0)":         org.junit.Assert.assertNotNull(occupancySensorDataList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "6) test185(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky "3) test185(RegressionTest0)":         org.junit.Assert.assertNotNull(scanIDSensorDataList11);
        org.junit.Assert.assertNull(sensor13);
// flaky "1) test185(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
// flaky "1) test185(RegressionTest0)":         org.junit.Assert.assertNotNull(scanIDSensorDataList21);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        Model.Payment.Payment payment2 = new Model.Payment.Payment("8903a9bb-0838-41ef-9768-131faa20dcdc", (-1.0d));
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        Repository.ServiceRequestRepository serviceRequestRepository0 = Repository.ServiceRequestRepository.getInstance();
        Model.ServiceRequest.SensorEssentialServiceRequest sensorEssentialServiceRequest6 = new Model.ServiceRequest.SensorEssentialServiceRequest(1, "COMPLETED", "Service.AuthenticationException: ", (int) 'a', (int) (short) -1);
        java.lang.String str7 = sensorEssentialServiceRequest6.getStatus();
        Model.ServiceRequest.ServiceRequest serviceRequest8 = serviceRequestRepository0.addServiceRequest((Model.ServiceRequest.ServiceRequest) sensorEssentialServiceRequest6);
        java.util.Map<java.lang.Integer, java.util.List<Model.ServiceRequest.ServiceRequest>> intMap9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = serviceRequestRepository0.saveMapToCsv(intMap9, "7");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Map.values()\" because \"map\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serviceRequestRepository0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Service.AuthenticationException: " + "'", str7, "Service.AuthenticationException: ");
        org.junit.Assert.assertNotNull(serviceRequest8);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        Database.Database database0 = Database.Database.getInstance();
        java.lang.String str1 = database0.getMaintenanceRequestsCsvPath();
        java.lang.String str2 = database0.getMaintenanceRequestsCsvPath();
        java.lang.String str3 = database0.getSensorsCsvPath();
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "src/main/data/MaintenanceRequests.csv" + "'", str1, "src/main/data/MaintenanceRequests.csv");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "src/main/data/MaintenanceRequests.csv" + "'", str2, "src/main/data/MaintenanceRequests.csv");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "src/main/data/sensors.csv" + "'", str3, "src/main/data/sensors.csv");
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        Service.RoomService roomService0 = new Service.RoomService();
        roomService0.maintenanceCompleted("");
        boolean boolean4 = roomService0.performCheckOut("");
        roomService0.maintenanceCompleted("1");
        Model.Room.Booking booking8 = roomService0.getBookingDetails("EECS3311 Course Project Database - Rooms.csv");
        roomService0.update(true, (int) (byte) 1);
        boolean boolean13 = roomService0.cancelBooking("9");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(booking8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        Model.State.RoomReadyForEnableState roomReadyForEnableState0 = new Model.State.RoomReadyForEnableState();
        boolean boolean1 = roomReadyForEnableState0.isBookable();
        Model.Room.Room room6 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        roomReadyForEnableState0.disable(room6);
        double double8 = room6.getPrice();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        Model.State.RoomReadyForEnableState roomReadyForEnableState0 = new Model.State.RoomReadyForEnableState();
        boolean boolean1 = roomReadyForEnableState0.isBookable();
        java.lang.String str2 = roomReadyForEnableState0.getStateName();
        java.lang.String str3 = roomReadyForEnableState0.getStateName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "READY_FOR_ENABLE" + "'", str2, "READY_FOR_ENABLE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "READY_FOR_ENABLE" + "'", str3, "READY_FOR_ENABLE");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
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
        java.lang.String str22 = booking19.getPaymentId();
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        Model.Sensor.ScanIDSensor scanIDSensor4 = new Model.Sensor.ScanIDSensor("3", "src/main/data/MaintenanceRequests.csv", "EECS3311 Course Project Database - Rooms.csv", "");
        java.lang.String str5 = scanIDSensor4.getRoomID();
        scanIDSensor4.setOccupied(true);
        java.lang.String str8 = scanIDSensor4.getStatus();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EECS3311 Course Project Database - Rooms.csv" + "'", str8, "EECS3311 Course Project Database - Rooms.csv");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        Service.AuthenticationException authenticationException1 = new Service.AuthenticationException("!Password123");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        java.time.LocalDateTime localDateTime2 = null;
        Model.Sensor.OccupancySensorData occupancySensorData3 = new Model.Sensor.OccupancySensorData("", "", localDateTime2);
        occupancySensorData3.sensorID = "";
        java.lang.String str6 = occupancySensorData3.sensorID;
        java.lang.String str7 = occupancySensorData3.getLogID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
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
        java.lang.String str34 = booking28.getPaymentId();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CHECKED_IN" + "'", str1, "CHECKED_IN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CHECKED_IN" + "'", str2, "CHECKED_IN");
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "CHECKED_IN" + "'", str17, "CHECKED_IN");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "CHECKED_IN" + "'", str18, "CHECKED_IN");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "CHECKED_IN" + "'", str19, "CHECKED_IN");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNull(localTime30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        Model.State.ConfirmedState confirmedState0 = new Model.State.ConfirmedState();
        java.lang.String str1 = confirmedState0.getStatus();
        Model.State.CheckInState checkInState2 = new Model.State.CheckInState();
        java.lang.String str3 = checkInState2.getStatus();
        java.lang.String str4 = checkInState2.getStatus();
        java.lang.String str5 = checkInState2.getStatus();
        java.time.LocalDate localDate9 = null;
        java.time.LocalDate localDate10 = null;
        java.time.LocalTime localTime11 = null;
        java.time.LocalTime localTime12 = null;
        Model.Room.Booking booking14 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate9, localDate10, localTime11, localTime12, "");
        java.lang.String str15 = booking14.getBookingId();
        java.time.LocalTime localTime16 = booking14.getStartTime();
        checkInState2.cancel(booking14);
        java.lang.String str18 = booking14.getUserId();
        confirmedState0.checkOut(booking14);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CONFIRMED" + "'", str1, "CONFIRMED");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CHECKED_IN" + "'", str3, "CHECKED_IN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CHECKED_IN" + "'", str4, "CHECKED_IN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CHECKED_IN" + "'", str5, "CHECKED_IN");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(localTime16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        Model.User.AccountType accountType4 = Model.User.AccountType.PARTNER;
        Model.User.User user7 = Model.User.UserFactory.createUserFromCsv("hi!", "CHECKED_IN", "hi!", "2", accountType4, false, "Service.AuthenticationException: ");
        user7.setName("EECS3311 Course Project Database - Bookings.csv");
        java.lang.String str10 = user7.getName();
        org.junit.Assert.assertTrue("'" + accountType4 + "' != '" + Model.User.AccountType.PARTNER + "'", accountType4.equals(Model.User.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(user7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "EECS3311 Course Project Database - Bookings.csv" + "'", str10, "EECS3311 Course Project Database - Bookings.csv");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
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
        java.util.Map<java.lang.Integer, java.util.List<Model.ServiceRequest.ServiceRequest>> intMap26 = serviceRequestRepository0.parseCsvFileToMap("14", false);
        Model.ServiceRequest.SensorEssentialServiceRequest sensorEssentialServiceRequest32 = new Model.ServiceRequest.SensorEssentialServiceRequest((int) (short) -1, "4", "hi!", (-1), (int) ' ');
        sensorEssentialServiceRequest32.setDescription("src/main/data/scanid_sensor_logs.csv");
        int int35 = sensorEssentialServiceRequest32.getServiceRequestID();
        serviceRequestRepository0.updateExistingServiceRequest((Model.ServiceRequest.ServiceRequest) sensorEssentialServiceRequest32);
        sensorEssentialServiceRequest32.assignRoomID((int) (short) 10);
        org.junit.Assert.assertNotNull(serviceRequestRepository0);
        org.junit.Assert.assertNotNull(serviceRequestRepository1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Service.AuthenticationException: " + "'", str10, "Service.AuthenticationException: ");
        org.junit.Assert.assertNotNull(intMap21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(intMap26);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        java.time.LocalTime localTime5 = null;
        java.time.LocalTime localTime6 = null;
        Model.Room.Booking booking8 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate3, localDate4, localTime5, localTime6, "");
        booking8.performCheckOut();
        booking8.performCheckIn();
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        Model.User.FacultyUser facultyUser3 = new Model.User.FacultyUser("COMPLETED", "3", "EECS3311 Course Project Database - Rooms.csv");
        java.lang.String str4 = facultyUser3.getPassword();
        facultyUser3.setVerified(true);
        boolean boolean8 = facultyUser3.checkPassword("9");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EECS3311 Course Project Database - Rooms.csv" + "'", str4, "EECS3311 Course Project Database - Rooms.csv");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        View.CheckinView checkinView0 = null;
        Service.RoomService roomService1 = new Service.RoomService();
        roomService1.update(true, (int) (short) 10);
        Model.Room.Booking booking6 = roomService1.getBookingDetails("src/main/data/users.csv");
        boolean boolean8 = roomService1.cancelBooking("hi!");
        roomService1.disableRoom("hi!");
        roomService1.disableRoom("1");
        Service.RoomService roomService13 = roomService1.getInstance();
        Service.RoomService roomService14 = roomService13.getInstance();
        Service.SensorService sensorService15 = new Service.SensorService();
        boolean boolean17 = false; // flaky "22) test202(RegressionTest0)": sensorService15.addOccupancySensorData("CHECKED_IN");
        // The following exception was thrown during execution in test generation
        try {
            Controller.CheckinController checkinController18 = new Controller.CheckinController(checkinView0, roomService13, sensorService15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"backButton\" because \"this.view\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(booking6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(roomService13);
        org.junit.Assert.assertNotNull(roomService14);
// flaky "11) test202(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
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
        booking31.performCancel();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "COMPLETED" + "'", str11, "COMPLETED");
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        Service.RoomService roomService0 = new Service.RoomService();
        roomService0.update(true, (int) (short) 10);
        java.lang.String str7 = roomService0.createRoom("EECS3311 Course Project Database - Rooms.csv", (double) 0.0f, "");
        Controller.AddRoomController addRoomController8 = new Controller.AddRoomController(roomService0);
// flaky "23) test204(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "26" + "'", str7, "26");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        Model.User.StaffUser staffUser6 = new Model.User.StaffUser("", "hi!", "4", "hi!", false, "2");
        java.lang.String str7 = staffUser6.getRole();
        Model.User.AccountType accountType8 = staffUser6.getAccountType();
        Model.User.AccountType accountType9 = Model.User.AccountType.STUDENT;
        double double10 = accountType9.getHourlyRate();
        staffUser6.setAccountType(accountType9);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2" + "'", str7, "2");
        org.junit.Assert.assertTrue("'" + accountType8 + "' != '" + Model.User.AccountType.STAFF + "'", accountType8.equals(Model.User.AccountType.STAFF));
        org.junit.Assert.assertTrue("'" + accountType9 + "' != '" + Model.User.AccountType.STUDENT + "'", accountType9.equals(Model.User.AccountType.STUDENT));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        Service.EditMaintenanceRequestService editMaintenanceRequestService0 = Service.EditMaintenanceRequestService.getInstance();
        editMaintenanceRequestService0.update((int) (byte) 1, "COMPLETED", "", true, 10);
        org.junit.Assert.assertNotNull(editMaintenanceRequestService0);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        Model.State.RoomDisabledState roomDisabledState0 = new Model.State.RoomDisabledState();
        boolean boolean1 = roomDisabledState0.isBookable();
        boolean boolean2 = roomDisabledState0.isBookable();
        boolean boolean3 = roomDisabledState0.isBookable();
        Model.State.RoomDisabledState roomDisabledState4 = new Model.State.RoomDisabledState();
        boolean boolean5 = roomDisabledState4.isBookable();
        boolean boolean6 = roomDisabledState4.isBookable();
        Model.State.RoomEnabledState roomEnabledState7 = new Model.State.RoomEnabledState();
        Model.Room.Room room12 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        boolean boolean13 = room12.isAvailable();
        Model.Room.AdminRoomProxy adminRoomProxy14 = new Model.Room.AdminRoomProxy(room12);
        roomEnabledState7.disable(room12);
        roomDisabledState4.enable(room12);
        Model.State.RoomDisabledState roomDisabledState17 = new Model.State.RoomDisabledState();
        boolean boolean18 = roomDisabledState17.isBookable();
        boolean boolean19 = roomDisabledState17.isBookable();
        Model.State.RoomEnabledState roomEnabledState20 = new Model.State.RoomEnabledState();
        Model.Room.Room room25 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        boolean boolean26 = room25.isAvailable();
        Model.Room.AdminRoomProxy adminRoomProxy27 = new Model.Room.AdminRoomProxy(room25);
        roomEnabledState20.disable(room25);
        roomDisabledState17.enable(room25);
        roomDisabledState4.maintain(room25);
        roomDisabledState0.disable(room25);
        Model.State.RoomEnabledState roomEnabledState32 = new Model.State.RoomEnabledState();
        boolean boolean33 = roomEnabledState32.isBookable();
        Model.Room.Room room38 = new Model.Room.Room("STAFF", "1", (double) (byte) 10, "2");
        roomEnabledState32.maintain(room38);
        roomDisabledState0.disable(room38);
        java.lang.String str41 = roomDisabledState0.getStateName();
        boolean boolean42 = roomDisabledState0.isBookable();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "DISABLED" + "'", str41, "DISABLED");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        Service.SubmitServiceRequestService submitServiceRequestService0 = new Service.SubmitServiceRequestService();
        java.util.ArrayList<Model.ServiceRequest.ServiceRequest> serviceRequestList5 = submitServiceRequestService0.submitServiceRequest(3, "hi!", false, "jsmith@yorku.ca");
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<Model.ServiceRequest.ServiceRequest> serviceRequestList10 = submitServiceRequestService0.submitServiceRequest((int) (short) 0, "PENDING", true, "8903a9bb-0838-41ef-9768-131faa20dcdc");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"8903a9bb-0838-41ef-9768-131faa20dcdc\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serviceRequestList5);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        Model.User.FacultyUser facultyUser3 = new Model.User.FacultyUser("COMPLETED", "3", "EECS3311 Course Project Database - Rooms.csv");
        facultyUser3.setEmail("");
        facultyUser3.setEmail("57197862-2463-4972-b3b2-977245133f34");
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        Database.Database database0 = Database.Database.getInstance();
        java.lang.String str1 = database0.getRoomCsvPath();
        java.lang.String str2 = database0.getOccupancySensorLogsPath();
        java.lang.String str3 = database0.getBookingCsvPath();
        java.lang.String str4 = database0.getMaintenanceRequestsCsvPath();
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EECS3311 Course Project Database - Rooms.csv" + "'", str1, "EECS3311 Course Project Database - Rooms.csv");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "src/main/data/occupancy_sensor_logs.csv" + "'", str2, "src/main/data/occupancy_sensor_logs.csv");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EECS3311 Course Project Database - Bookings.csv" + "'", str3, "EECS3311 Course Project Database - Bookings.csv");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "src/main/data/MaintenanceRequests.csv" + "'", str4, "src/main/data/MaintenanceRequests.csv");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        Repository.SensorRepository sensorRepository0 = new Repository.SensorRepository();
        java.util.List<Model.Sensor.OccupancySensorData> occupancySensorDataList1 = sensorRepository0.getOccupancySensorLogsList();
        Model.Sensor.ScanIDSensorData scanIDSensorData2 = null;
        boolean boolean3 = sensorRepository0.writeScanIDSensorLog(scanIDSensorData2);
        java.lang.Class<?> wildcardClass4 = sensorRepository0.getClass();
// flaky "24) test211(RegressionTest0)":         org.junit.Assert.assertNotNull(occupancySensorDataList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        Repository.ServiceRequestRepository serviceRequestRepository0 = Repository.ServiceRequestRepository.getInstance();
        Model.ServiceRequest.SensorEssentialServiceRequest sensorEssentialServiceRequest6 = new Model.ServiceRequest.SensorEssentialServiceRequest(1, "COMPLETED", "Service.AuthenticationException: ", (int) 'a', (int) (short) -1);
        sensorEssentialServiceRequest6.assignRoomID(100);
        java.lang.String str9 = sensorEssentialServiceRequest6.getStatus();
        serviceRequestRepository0.updateExistingServiceRequest((Model.ServiceRequest.ServiceRequest) sensorEssentialServiceRequest6);
        Model.ServiceRequest.SensorEssentialServiceRequest sensorEssentialServiceRequest16 = new Model.ServiceRequest.SensorEssentialServiceRequest((int) (short) 100, "CHECKED_IN", "EECS3311 Course Project Database - Bookings.csv", 0, (int) (byte) 0);
        serviceRequestRepository0.updateExistingServiceRequest((Model.ServiceRequest.ServiceRequest) sensorEssentialServiceRequest16);
        int int18 = sensorEssentialServiceRequest16.getServiceRequestID();
        boolean boolean19 = sensorEssentialServiceRequest16.isEssential;
        org.junit.Assert.assertNotNull(serviceRequestRepository0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Service.AuthenticationException: " + "'", str9, "Service.AuthenticationException: ");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        Repository.ServiceRequestRepository serviceRequestRepository0 = Repository.ServiceRequestRepository.getInstance();
        java.lang.Integer int2 = serviceRequestRepository0.generateNextId((int) '4');
        java.lang.Integer int4 = serviceRequestRepository0.generateNextId((int) (short) 10);
        java.util.Map<java.lang.Integer, java.util.List<Model.ServiceRequest.ServiceRequest>> intMap7 = serviceRequestRepository0.parseCsvFileToMap("7", true);
        Service.EditMaintenanceRequestService editMaintenanceRequestService8 = new Service.EditMaintenanceRequestService(serviceRequestRepository0);
        java.lang.Integer int10 = serviceRequestRepository0.generateNextId((int) (short) 0);
        org.junit.Assert.assertNotNull(serviceRequestRepository0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(intMap7);
// flaky "25) test213(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 108 + "'", int10 == 108);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
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
        java.util.Map<java.lang.Integer, java.util.List<Model.ServiceRequest.ServiceRequest>> intMap26 = serviceRequestRepository0.parseCsvFileToMap("14", false);
        java.util.Map<java.lang.Integer, java.util.List<Model.ServiceRequest.ServiceRequest>> intMap29 = serviceRequestRepository0.parseCsvFileToMap("", false);
        org.junit.Assert.assertNotNull(serviceRequestRepository0);
        org.junit.Assert.assertNotNull(serviceRequestRepository1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Service.AuthenticationException: " + "'", str10, "Service.AuthenticationException: ");
        org.junit.Assert.assertNotNull(intMap21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(intMap26);
        org.junit.Assert.assertNotNull(intMap29);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        Model.User.StudentUser studentUser6 = new Model.User.StudentUser("jsmith@yorku.ca", "26", "STAFF", "21", false, "");
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        Model.ServiceRequest.SensorEssentialServiceRequest sensorEssentialServiceRequest5 = new Model.ServiceRequest.SensorEssentialServiceRequest(1, "COMPLETED", "Service.AuthenticationException: ", (int) 'a', (int) (short) -1);
        sensorEssentialServiceRequest5.assignRoomID(100);
        java.lang.String str8 = sensorEssentialServiceRequest5.getStatus();
        sensorEssentialServiceRequest5.assignRoomID((int) (byte) 1);
        sensorEssentialServiceRequest5.assignRoomID((int) (short) -1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Service.AuthenticationException: " + "'", str8, "Service.AuthenticationException: ");
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        java.time.LocalTime localTime5 = null;
        java.time.LocalTime localTime6 = null;
        Model.Room.Booking booking8 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate3, localDate4, localTime5, localTime6, "");
        java.lang.String str9 = booking8.getBookingId();
        booking8.setPaymentId("");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        Model.Sensor.Sensor sensor5 = new Model.Sensor.Sensor("1", "", "src/main/data/users.csv", "hi!", true);
        java.lang.String str6 = sensor5.getRoomID();
        sensor5.setOccupied(true);
        java.lang.String str9 = sensor5.getStatus();
        Service.AuthenticationException authenticationException11 = new Service.AuthenticationException("");
        java.lang.Throwable[] throwableArray12 = authenticationException11.getSuppressed();
        boolean boolean13 = sensor5.equals((java.lang.Object) throwableArray12);
        java.lang.String str14 = sensor5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "src/main/data/users.csv" + "'", str9, "src/main/data/users.csv");
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertArrayEquals(throwableArray12, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "src/main/data/users.csv" + "'", str14, "src/main/data/users.csv");
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        Service.RoomService roomService0 = new Service.RoomService();
        roomService0.update(true, (int) (short) 10);
        Model.Room.Booking booking5 = roomService0.getBookingDetails("src/main/data/users.csv");
        boolean boolean7 = roomService0.cancelBooking("hi!");
        boolean boolean9 = roomService0.cancelBooking("9");
        org.junit.Assert.assertNull(booking5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
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
        roomService31.savePayment("STAFF", (double) (byte) 10);
        org.junit.Assert.assertNotNull(evaluateRoomMaintenanceRelationshipService0);
        org.junit.Assert.assertNull(booking7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
// flaky "26) test220(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "28" + "'", str27, "28");
        org.junit.Assert.assertNotNull(roomService28);
// flaky "12) test220(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "29" + "'", str35, "29");
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        Repository.ServiceRequestRepository serviceRequestRepository0 = Repository.ServiceRequestRepository.getInstance();
        Repository.ServiceRequestRepository serviceRequestRepository1 = Repository.ServiceRequestRepository.getInstance();
        Model.ServiceRequest.SensorEssentialServiceRequest sensorEssentialServiceRequest7 = new Model.ServiceRequest.SensorEssentialServiceRequest(1, "COMPLETED", "Service.AuthenticationException: ", (int) 'a', (int) (short) -1);
        sensorEssentialServiceRequest7.assignRoomID(100);
        java.lang.String str10 = sensorEssentialServiceRequest7.getStatus();
        serviceRequestRepository1.updateExistingServiceRequest((Model.ServiceRequest.ServiceRequest) sensorEssentialServiceRequest7);
        Model.ServiceRequest.SensorEssentialServiceRequest sensorEssentialServiceRequest17 = new Model.ServiceRequest.SensorEssentialServiceRequest((int) (short) 100, "CHECKED_IN", "EECS3311 Course Project Database - Bookings.csv", 0, (int) (byte) 0);
        serviceRequestRepository1.updateExistingServiceRequest((Model.ServiceRequest.ServiceRequest) sensorEssentialServiceRequest17);
        Model.ServiceRequest.ServiceRequest serviceRequest19 = serviceRequestRepository0.addServiceRequest((Model.ServiceRequest.ServiceRequest) sensorEssentialServiceRequest17);
        serviceRequest19.setDescription("2");
        serviceRequest19.isEssential = true;
        boolean boolean24 = serviceRequest19.isEssential();
        org.junit.Assert.assertNotNull(serviceRequestRepository0);
        org.junit.Assert.assertNotNull(serviceRequestRepository1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Service.AuthenticationException: " + "'", str10, "Service.AuthenticationException: ");
        org.junit.Assert.assertNotNull(serviceRequest19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
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
        Model.State.CheckInState checkInState65 = new Model.State.CheckInState();
        java.lang.String str66 = checkInState65.getStatus();
        java.lang.String str67 = checkInState65.getStatus();
        java.lang.String str68 = checkInState65.getStatus();
        java.time.LocalDate localDate72 = null;
        java.time.LocalDate localDate73 = null;
        java.time.LocalTime localTime74 = null;
        java.time.LocalTime localTime75 = null;
        Model.Room.Booking booking77 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate72, localDate73, localTime74, localTime75, "");
        java.lang.String str78 = booking77.getBookingId();
        java.time.LocalTime localTime79 = booking77.getStartTime();
        checkInState65.cancel(booking77);
        java.lang.String str81 = booking77.getUserId();
        cancelledState0.checkOut(booking77);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "COMPLETED" + "'", str12, "COMPLETED");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNull(localDate63);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "CHECKED_IN" + "'", str66, "CHECKED_IN");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "CHECKED_IN" + "'", str67, "CHECKED_IN");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "CHECKED_IN" + "'", str68, "CHECKED_IN");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertNull(localTime79);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        Repository.PaymentRepository paymentRepository0 = Repository.PaymentRepository.getInstance();
        Model.Payment.Payment payment3 = new Model.Payment.Payment("", (double) (short) 10);
        paymentRepository0.save(payment3);
        Model.Payment.Payment payment7 = new Model.Payment.Payment("COMPLETED", (double) 0.0f);
        paymentRepository0.save(payment7);
        payment7.completePayment();
        org.junit.Assert.assertNotNull(paymentRepository0);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        Model.User.StaffUser staffUser6 = new Model.User.StaffUser("EECS3311 Course Project Database - Bookings.csv", "4", "EECS3311 Course Project Database - Rooms.csv", "1", false, "3b878a93-2f8d-4168-99fd-22b8dbe103f1");
        staffUser6.setVerified(true);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
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
        serviceRequest66.setRoomID((-1));
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
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        java.time.LocalDateTime localDateTime2 = null;
        Model.Sensor.OccupancySensorData occupancySensorData3 = new Model.Sensor.OccupancySensorData("", "hi!", localDateTime2);
        java.lang.String str4 = occupancySensorData3.sensorID;
        java.time.LocalDateTime localDateTime5 = occupancySensorData3.getLocalDateTime();
        java.time.LocalDateTime localDateTime6 = occupancySensorData3.dateTime;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertNull(localDateTime6);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        Model.ServiceRequest.SensorEssentialServiceRequest sensorEssentialServiceRequest5 = new Model.ServiceRequest.SensorEssentialServiceRequest(0, "EECS3311 Course Project Database - payments.csv", "src/main/data/sensors.csv", (-1), 3);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        Service.SubmitServiceRequestService submitServiceRequestService0 = new Service.SubmitServiceRequestService();
        java.util.ArrayList<Model.ServiceRequest.ServiceRequest> serviceRequestList5 = submitServiceRequestService0.submitServiceRequest(108, "1bec99b6-9fd5-4eb6-be48-3e7f52439881", false, "COMPLETED");
        java.util.ArrayList<Model.ServiceRequest.ServiceRequest> serviceRequestList10 = submitServiceRequestService0.submitServiceRequest(3, "CHECKED_IN", false, "20");
        org.junit.Assert.assertNotNull(serviceRequestList5);
        org.junit.Assert.assertNotNull(serviceRequestList10);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        Model.State.RoomReadyForEnableState roomReadyForEnableState0 = new Model.State.RoomReadyForEnableState();
        boolean boolean1 = roomReadyForEnableState0.isBookable();
        Model.Room.Room room6 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        roomReadyForEnableState0.disable(room6);
        Model.State.RoomReadyForEnableState roomReadyForEnableState8 = new Model.State.RoomReadyForEnableState();
        boolean boolean9 = roomReadyForEnableState8.isBookable();
        java.lang.String str10 = roomReadyForEnableState8.getStateName();
        boolean boolean11 = roomReadyForEnableState8.isBookable();
        Model.State.RoomDisabledState roomDisabledState12 = new Model.State.RoomDisabledState();
        boolean boolean13 = roomDisabledState12.isBookable();
        boolean boolean14 = roomDisabledState12.isBookable();
        boolean boolean15 = roomDisabledState12.isBookable();
        Model.Room.Room room20 = new Model.Room.Room("COMPLETED", "hi!", (double) 100.0f, "2");
        roomDisabledState12.maintain(room20);
        Model.Room.Room room26 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        roomDisabledState12.enable(room26);
        roomReadyForEnableState8.enable(room26);
        boolean boolean29 = roomReadyForEnableState8.isBookable();
        Model.State.RoomEnabledState roomEnabledState30 = new Model.State.RoomEnabledState();
        Model.State.RoomReadyForEnableState roomReadyForEnableState31 = new Model.State.RoomReadyForEnableState();
        Model.State.RoomEnabledState roomEnabledState32 = new Model.State.RoomEnabledState();
        boolean boolean33 = roomEnabledState32.isBookable();
        Model.State.RoomReadyForEnableState roomReadyForEnableState34 = new Model.State.RoomReadyForEnableState();
        boolean boolean35 = roomReadyForEnableState34.isBookable();
        Model.Room.Room room40 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        roomReadyForEnableState34.disable(room40);
        roomEnabledState32.maintain(room40);
        roomReadyForEnableState31.maintain(room40);
        roomEnabledState30.disable(room40);
        room40.requestEnable();
        roomReadyForEnableState8.disable(room40);
        roomReadyForEnableState0.enable(room40);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "READY_FOR_ENABLE" + "'", str10, "READY_FOR_ENABLE");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        Repository.SensorRepository sensorRepository0 = new Repository.SensorRepository();
        java.util.List<Model.Sensor.OccupancySensorData> occupancySensorDataList1 = sensorRepository0.getOccupancySensorLogsList();
        java.time.LocalDateTime localDateTime4 = null;
        Model.Sensor.OccupancySensorData occupancySensorData5 = new Model.Sensor.OccupancySensorData("", "hi!", localDateTime4);
        java.time.LocalDateTime localDateTime6 = null;
        occupancySensorData5.dateTime = localDateTime6;
        boolean boolean8 = false; // flaky "27) test230(RegressionTest0)": sensorRepository0.writeOccupancySensorLog(occupancySensorData5);
        java.util.List<Model.Sensor.OccupancySensorData> occupancySensorDataList9 = sensorRepository0.getOccupancySensorLogsList();
// flaky "13) test230(RegressionTest0)":         org.junit.Assert.assertNotNull(occupancySensorDataList1);
// flaky "9) test230(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "9) test230(RegressionTest0)":         org.junit.Assert.assertNotNull(occupancySensorDataList9);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        Model.State.RoomDisabledState roomDisabledState0 = new Model.State.RoomDisabledState();
        boolean boolean1 = roomDisabledState0.isBookable();
        boolean boolean2 = roomDisabledState0.isBookable();
        boolean boolean3 = roomDisabledState0.isBookable();
        Model.Room.Room room8 = new Model.Room.Room("COMPLETED", "hi!", (double) 100.0f, "2");
        roomDisabledState0.maintain(room8);
        Model.Room.AdminRoomProxy adminRoomProxy10 = new Model.Room.AdminRoomProxy(room8);
        java.lang.String str11 = adminRoomProxy10.getRoomId();
        java.lang.String str12 = adminRoomProxy10.getRoomId();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "COMPLETED" + "'", str11, "COMPLETED");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "COMPLETED" + "'", str12, "COMPLETED");
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        Model.User.FacultyUser facultyUser3 = new Model.User.FacultyUser("COMPLETED", "3", "EECS3311 Course Project Database - Rooms.csv");
        java.lang.String str4 = facultyUser3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "FACULTY" + "'", str4, "FACULTY");
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        View.CheckoutView checkoutView0 = null;
        Service.RoomService roomService1 = new Service.RoomService();
        roomService1.update(true, (int) (short) 10);
        boolean boolean6 = roomService1.performCheckOut("hi!");
        java.lang.String str10 = roomService1.createRoom("", (double) '4', "src/main/data/users.csv");
        Service.RoomService roomService11 = roomService1.getInstance();
        boolean boolean13 = roomService11.cancelBooking("EECS3311 Course Project Database - payments.csv");
        Service.SensorService sensorService14 = new Service.SensorService();
        Model.Sensor.Sensor sensor17 = null; // flaky "28) test233(RegressionTest0)": sensorService14.getSensorByRoomID("CHECKED_IN", "");
        // The following exception was thrown during execution in test generation
        try {
            Controller.CheckoutController checkoutController18 = new Controller.CheckoutController(checkoutView0, roomService11, sensorService14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"backButton\" because \"this.view\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "14) test233(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "32" + "'", str10, "32");
        org.junit.Assert.assertNotNull(roomService11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(sensor17);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        Model.User.PartnerUser partnerUser6 = new Model.User.PartnerUser("READY_FOR_ENABLE", "12", "", "3b878a93-2f8d-4168-99fd-22b8dbe103f1", true, "Service.AuthenticationException: Service.AuthenticationException: ");
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        View.CheckinView checkinView0 = null;
        Service.RoomService roomService1 = new Service.RoomService();
        roomService1.update(true, (int) (short) 10);
        Model.Room.Booking booking6 = roomService1.getBookingDetails("src/main/data/users.csv");
        boolean boolean8 = roomService1.cancelBooking("hi!");
        roomService1.disableRoom("hi!");
        boolean boolean12 = roomService1.cancelBooking("DISABLED");
        Service.SensorService sensorService13 = new Service.SensorService();
        boolean boolean15 = false; // flaky "29) test235(RegressionTest0)": sensorService13.addOccupancySensorData("CHECKED_IN");
        // The following exception was thrown during execution in test generation
        try {
            Controller.CheckinController checkinController16 = new Controller.CheckinController(checkinView0, roomService1, sensorService13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"backButton\" because \"this.view\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(booking6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// flaky "15) test235(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        java.time.LocalDateTime localDateTime2 = null;
        Model.Sensor.OccupancySensorData occupancySensorData3 = new Model.Sensor.OccupancySensorData("", "3b878a93-2f8d-4168-99fd-22b8dbe103f1", localDateTime2);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        Service.SensorService sensorService0 = new Service.SensorService();
        Model.Sensor.Sensor sensor3 = null; // flaky "30) test237(RegressionTest0)": sensorService0.getSensorByRoomID("CHECKED_IN", "");
        java.util.List<java.util.List<java.lang.String>> strListList4 = null; // flaky "16) test237(RegressionTest0)": sensorService0.getSensorsFormatted();
        boolean boolean6 = false; // flaky "10) test237(RegressionTest0)": sensorService0.addOccupancySensorData("22");
        org.junit.Assert.assertNull(sensor3);
// flaky "10) test237(RegressionTest0)":         org.junit.Assert.assertNotNull(strListList4);
// flaky "7) test237(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        Model.Sensor.ScanIDSensor scanIDSensor4 = new Model.Sensor.ScanIDSensor("Service.AuthenticationException: Service.AuthenticationException: ", "COMPLETED", "2", "");
        Controller.AdminServiceRequestController adminServiceRequestController5 = new Controller.AdminServiceRequestController();
        adminServiceRequestController5.handleAddServiceRequest("4", false, "src/main/data/occupancy_sensor_logs.csv");
        adminServiceRequestController5.handleAddServiceRequest("STAFF", true, "1");
        boolean boolean14 = scanIDSensor4.equals((java.lang.Object) adminServiceRequestController5);
        adminServiceRequestController5.promoteServiceRequest((int) (byte) 0, "25", "22");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
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
        booking19.performCancel();
        java.time.LocalDate localDate27 = booking19.getEndDate();
        java.lang.String str28 = booking19.getUserId();
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(localDate27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        Model.Room.Room room4 = new Model.Room.Room("17", "src/main/data/occupancy_sensor_logs.csv", (double) (byte) -1, "17");
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        View.CheckoutView checkoutView0 = null;
        Service.RoomService roomService1 = new Service.RoomService();
        roomService1.update(true, (int) (short) 10);
        boolean boolean6 = roomService1.performCheckOut("hi!");
        java.lang.String str10 = roomService1.createRoom("", (double) '4', "src/main/data/users.csv");
        Service.RoomService roomService11 = roomService1.getInstance();
        Service.SensorService sensorService12 = new Service.SensorService();
        boolean boolean16 = sensorService12.addSensor("src/main/data/sensors.csv", "7", "12");
        // The following exception was thrown during execution in test generation
        try {
            Controller.CheckoutController checkoutController17 = new Controller.CheckoutController(checkoutView0, roomService1, sensorService12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"backButton\" because \"this.view\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "31) test241(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "37" + "'", str10, "37");
        org.junit.Assert.assertNotNull(roomService11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        Model.User.PartnerUser partnerUser3 = new Model.User.PartnerUser("17", "src/main/data/sensors.csv", "CANCELLED");
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        Model.User.FacultyUser facultyUser3 = new Model.User.FacultyUser("EECS3311 Course Project Database - Rooms.csv", "", "COMPLETED");
        Service.UserService userService4 = new Service.UserService();
        Model.User.AccountType accountType5 = Model.User.AccountType.PARTNER;
        Model.User.User user9 = userService4.createUser(accountType5, "", "DISABLED", "4");
        facultyUser3.setAccountType(accountType5);
        facultyUser3.setVerified(false);
        org.junit.Assert.assertTrue("'" + accountType5 + "' != '" + Model.User.AccountType.PARTNER + "'", accountType5.equals(Model.User.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(user9);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        Service.RoomService roomService0 = new Service.RoomService();
        roomService0.update(true, (int) (short) 10);
        Model.Room.Booking booking5 = roomService0.getBookingDetails("src/main/data/users.csv");
        boolean boolean7 = roomService0.cancelBooking("hi!");
        roomService0.disableRoom("hi!");
        roomService0.disableRoom("1");
        Service.RoomService roomService12 = roomService0.getInstance();
        roomService12.update(false, (int) (short) -1);
        org.junit.Assert.assertNull(booking5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(roomService12);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
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
        Model.ServiceRequest.SensorEssentialServiceRequest sensorEssentialServiceRequest29 = new Model.ServiceRequest.SensorEssentialServiceRequest(1, "COMPLETED", "Service.AuthenticationException: ", (int) 'a', (int) (short) -1);
        sensorEssentialServiceRequest29.assignRoomID(100);
        java.lang.String str32 = sensorEssentialServiceRequest29.getStatus();
        sensorEssentialServiceRequest29.isEssential = true;
        int int35 = sensorEssentialServiceRequest29.getServiceRequestID();
        boolean boolean36 = sensorEssentialServiceRequest29.isEssential();
        Model.ServiceRequest.ServiceRequest serviceRequest37 = serviceRequestRepository0.addServiceRequest((Model.ServiceRequest.ServiceRequest) sensorEssentialServiceRequest29);
        serviceRequest37.isEssential = false;
        org.junit.Assert.assertNotNull(serviceRequestRepository0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Service.AuthenticationException: " + "'", str9, "Service.AuthenticationException: ");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Service.AuthenticationException: " + "'", str19, "Service.AuthenticationException: ");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "COMPLETED" + "'", str22, "COMPLETED");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Service.AuthenticationException: " + "'", str32, "Service.AuthenticationException: ");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(serviceRequest37);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        Model.User.User user0 = Application.SessionData.getCurrentUser();
        java.lang.String str1 = user0.getPassword();
        user0.setPassword("CONFIRMED");
        org.junit.Assert.assertNotNull(user0);
// flaky "32) test246(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "src/main/data/users.csv" + "'", str1, "src/main/data/users.csv");
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        Service.EvaluateRoomMaintenanceRelationshipService evaluateRoomMaintenanceRelationshipService0 = Service.EvaluateRoomMaintenanceRelationshipService.getInstance();
        evaluateRoomMaintenanceRelationshipService0.notifyObservers();
        evaluateRoomMaintenanceRelationshipService0.evaluateRoomMaintenanceRelationship((-1));
        Service.EvaluateRoomMaintenanceRelationshipService evaluateRoomMaintenanceRelationshipService4 = Service.EvaluateRoomMaintenanceRelationshipService.getInstance();
        evaluateRoomMaintenanceRelationshipService4.notifyObservers();
        Service.RoomService roomService6 = new Service.RoomService();
        roomService6.update(true, (int) (short) 10);
        Model.Room.Booking booking11 = roomService6.getBookingDetails("src/main/data/users.csv");
        boolean boolean13 = roomService6.cancelBooking("hi!");
        Controller.AddRoomController addRoomController14 = new Controller.AddRoomController(roomService6);
        evaluateRoomMaintenanceRelationshipService4.removeObserver((Model.Room.Observer) roomService6);
        Service.RoomService roomService16 = new Service.RoomService();
        roomService16.maintenanceCompleted("");
        evaluateRoomMaintenanceRelationshipService4.removeObserver((Model.Room.Observer) roomService16);
        evaluateRoomMaintenanceRelationshipService0.registerObserver((Model.Room.Observer) roomService16);
        Service.RoomService roomService21 = new Service.RoomService();
        roomService21.update(true, (int) (short) 10);
        java.lang.String str28 = roomService21.createRoom("EECS3311 Course Project Database - Rooms.csv", (double) 0.0f, "");
        java.lang.String str32 = roomService21.createRoom("src/main/data/occupancy_sensor_logs.csv", (double) 0.0f, "21");
        evaluateRoomMaintenanceRelationshipService0.registerObserver((Model.Room.Observer) roomService21);
        boolean boolean34 = evaluateRoomMaintenanceRelationshipService0.isAnyEssentialMaintenanceRequestPending();
        org.junit.Assert.assertNotNull(evaluateRoomMaintenanceRelationshipService0);
        org.junit.Assert.assertNotNull(evaluateRoomMaintenanceRelationshipService4);
        org.junit.Assert.assertNull(booking11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
// flaky "33) test247(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "38" + "'", str28, "38");
// flaky "17) test247(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "39" + "'", str32, "39");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        Database.Database database0 = Database.Database.getInstance();
        java.lang.String str1 = database0.getRoomCsvPath();
        java.lang.String str2 = database0.getOccupancySensorLogsPath();
        java.lang.String str3 = database0.getBookingCsvPath();
        java.lang.String str4 = database0.getBookingCsvPath();
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EECS3311 Course Project Database - Rooms.csv" + "'", str1, "EECS3311 Course Project Database - Rooms.csv");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "src/main/data/occupancy_sensor_logs.csv" + "'", str2, "src/main/data/occupancy_sensor_logs.csv");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EECS3311 Course Project Database - Bookings.csv" + "'", str3, "EECS3311 Course Project Database - Bookings.csv");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EECS3311 Course Project Database - Bookings.csv" + "'", str4, "EECS3311 Course Project Database - Bookings.csv");
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        Model.User.FacultyUser facultyUser3 = new Model.User.FacultyUser("COMPLETED", "3", "EECS3311 Course Project Database - Rooms.csv");
        facultyUser3.setEmail("");
        Model.User.AccountType accountType6 = facultyUser3.getAccountType();
        org.junit.Assert.assertTrue("'" + accountType6 + "' != '" + Model.User.AccountType.FACULTY + "'", accountType6.equals(Model.User.AccountType.FACULTY));
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        java.time.LocalTime localTime5 = null;
        java.time.LocalTime localTime6 = null;
        Model.Room.Booking booking8 = new Model.Room.Booking("38", "8", "2", localDate3, localDate4, localTime5, localTime6, "3");
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        Service.EvaluateRoomMaintenanceRelationshipService evaluateRoomMaintenanceRelationshipService0 = Service.EvaluateRoomMaintenanceRelationshipService.getInstance();
        evaluateRoomMaintenanceRelationshipService0.notifyObservers();
        evaluateRoomMaintenanceRelationshipService0.evaluateRoomMaintenanceRelationship((-1));
        Service.EvaluateRoomMaintenanceRelationshipService evaluateRoomMaintenanceRelationshipService4 = Service.EvaluateRoomMaintenanceRelationshipService.getInstance();
        evaluateRoomMaintenanceRelationshipService4.notifyObservers();
        Service.RoomService roomService6 = new Service.RoomService();
        roomService6.update(true, (int) (short) 10);
        Model.Room.Booking booking11 = roomService6.getBookingDetails("src/main/data/users.csv");
        boolean boolean13 = roomService6.cancelBooking("hi!");
        Controller.AddRoomController addRoomController14 = new Controller.AddRoomController(roomService6);
        evaluateRoomMaintenanceRelationshipService4.removeObserver((Model.Room.Observer) roomService6);
        Service.RoomService roomService16 = new Service.RoomService();
        roomService16.maintenanceCompleted("");
        evaluateRoomMaintenanceRelationshipService4.removeObserver((Model.Room.Observer) roomService16);
        evaluateRoomMaintenanceRelationshipService0.registerObserver((Model.Room.Observer) roomService16);
        evaluateRoomMaintenanceRelationshipService0.evaluateRoomMaintenanceRelationship((int) ' ');
        org.junit.Assert.assertNotNull(evaluateRoomMaintenanceRelationshipService0);
        org.junit.Assert.assertNotNull(evaluateRoomMaintenanceRelationshipService4);
        org.junit.Assert.assertNull(booking11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        java.time.LocalDateTime localDateTime4 = null;
        Model.Sensor.ScanIDSensorData scanIDSensorData5 = new Model.Sensor.ScanIDSensorData("3b878a93-2f8d-4168-99fd-22b8dbe103f1", "EECS3311 Course Project Database - Rooms.csv", "8", "1", localDateTime4);
        java.time.LocalDateTime localDateTime6 = null;
        scanIDSensorData5.dateTime = localDateTime6;
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        Model.User.StaffUser staffUser3 = new Model.User.StaffUser("hi!", "", "hi!");
        boolean boolean4 = staffUser3.isVerified();
        Application.SessionData.setCurrentUser((Model.User.User) staffUser3);
        staffUser3.setVerified(false);
        java.lang.String str8 = staffUser3.getPassword();
        java.lang.String str9 = staffUser3.getName();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        Service.RoomService roomService0 = new Service.RoomService();
        roomService0.update(true, (int) (short) 10);
        Model.Room.Booking booking5 = roomService0.getBookingDetails("src/main/data/users.csv");
        boolean boolean7 = roomService0.cancelBooking("hi!");
        roomService0.disableRoom("hi!");
        roomService0.disableRoom("1");
        Service.RoomService roomService12 = roomService0.getInstance();
        Service.RoomService roomService13 = roomService12.getInstance();
        Controller.AddRoomController addRoomController14 = new Controller.AddRoomController(roomService13);
        Model.Room.Booking booking16 = roomService13.getBookingDetails("COMPLETED");
        org.junit.Assert.assertNull(booking5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(roomService12);
        org.junit.Assert.assertNotNull(roomService13);
        org.junit.Assert.assertNull(booking16);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
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
        Service.EditMaintenanceRequestService editMaintenanceRequestService50 = new Service.EditMaintenanceRequestService(serviceRequestRepository0);
        // The following exception was thrown during execution in test generation
        try {
            editMaintenanceRequestService50.promoteServiceRequest((int) '4', "STAFF", "17", (int) (short) 1, "src/main/data/users.csv");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"src/main/data/users.csv\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        Service.RoomService roomService0 = new Service.RoomService();
        roomService0.update(true, (int) (short) 10);
        Model.Room.Booking booking5 = roomService0.getBookingDetails("src/main/data/users.csv");
        boolean boolean7 = roomService0.cancelBooking("hi!");
        Controller.AddRoomController addRoomController8 = new Controller.AddRoomController(roomService0);
        Controller.AdminSelectActionController adminSelectActionController9 = new Controller.AdminSelectActionController(addRoomController8);
        Controller.AdminSelectActionController adminSelectActionController10 = new Controller.AdminSelectActionController(addRoomController8);
        adminSelectActionController10.adminAddRoom("DISABLED", (int) (short) 0, (double) 15);
        org.junit.Assert.assertNull(booking5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        Repository.RoomRepository roomRepository0 = new Repository.RoomRepository();
        java.lang.String str1 = roomRepository0.generateNextId();
        java.lang.String str2 = roomRepository0.generateNextId();
        java.lang.String str3 = roomRepository0.generateNextId();
        Model.Room.Room room5 = roomRepository0.findById("src/main/data/users.csv");
        Model.Room.Room room10 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        boolean boolean11 = room10.isAvailable();
        Model.State.RoomState roomState12 = room10.getState();
        roomRepository0.save(room10);
// flaky "34) test257(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "41" + "'", str1, "41");
// flaky "18) test257(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "41" + "'", str2, "41");
// flaky "11) test257(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "41" + "'", str3, "41");
        org.junit.Assert.assertNull(room5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(roomState12);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        Repository.ServiceRequestRepository serviceRequestRepository0 = Repository.ServiceRequestRepository.getInstance();
        Model.ServiceRequest.SensorEssentialServiceRequest sensorEssentialServiceRequest6 = new Model.ServiceRequest.SensorEssentialServiceRequest((int) (short) -1, "4", "hi!", (-1), (int) ' ');
        serviceRequestRepository0.updateExistingServiceRequest((Model.ServiceRequest.ServiceRequest) sensorEssentialServiceRequest6);
        java.lang.Integer int9 = serviceRequestRepository0.generateNextId((int) (short) 100);
        org.junit.Assert.assertNotNull(serviceRequestRepository0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        Service.RoomListFacade roomListFacade0 = new Service.RoomListFacade();
        java.util.List<Model.Room.RoomProxy> roomProxyList1 = roomListFacade0.getAllRoomsForAdmin();
        java.util.List<Model.Room.RoomProxy> roomProxyList2 = roomListFacade0.getAllRoomsForAdmin();
        java.util.List<Model.Room.RoomProxy> roomProxyList3 = roomListFacade0.getAvailableRoomsForGuest();
        java.util.List<Model.Room.RoomProxy> roomProxyList4 = roomListFacade0.getAllRoomsForAdmin();
        java.util.List<Model.Room.RoomProxy> roomProxyList5 = roomListFacade0.getAllRoomsForAdmin();
        org.junit.Assert.assertNotNull(roomProxyList1);
        org.junit.Assert.assertNotNull(roomProxyList2);
        org.junit.Assert.assertNotNull(roomProxyList3);
        org.junit.Assert.assertNotNull(roomProxyList4);
        org.junit.Assert.assertNotNull(roomProxyList5);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        Repository.ServiceRequestRepository serviceRequestRepository0 = Repository.ServiceRequestRepository.getInstance();
        java.lang.Integer int2 = serviceRequestRepository0.generateNextId((int) (byte) 100);
        Service.EditMaintenanceRequestService editMaintenanceRequestService3 = new Service.EditMaintenanceRequestService(serviceRequestRepository0);
        editMaintenanceRequestService3.update((int) (short) 0, "EECS3311 Course Project Database - Rooms.csv", "DISABLED", false, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            editMaintenanceRequestService3.promoteServiceRequest((int) (short) 100, "", "31", (int) '4', "PENDING");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"PENDING\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serviceRequestRepository0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        java.time.LocalDateTime localDateTime2 = null;
        Model.Sensor.OccupancySensorData occupancySensorData3 = new Model.Sensor.OccupancySensorData("", "hi!", localDateTime2);
        java.lang.String str4 = occupancySensorData3.sensorID;
        java.time.LocalDateTime localDateTime5 = occupancySensorData3.getLocalDateTime();
        java.lang.String str6 = occupancySensorData3.getSensorID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        Model.User.StaffUser staffUser6 = new Model.User.StaffUser("hi!", "hi!", "src/main/data/users.csv", "src/main/data/users.csv", false, "hi!");
        staffUser6.setName("");
        staffUser6.setPassword("12");
        staffUser6.setVerified(false);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        Repository.BookingRepository bookingRepository0 = Repository.BookingRepository.getInstance();
        java.util.List<Model.Room.Booking> bookingList1 = bookingRepository0.findAll();
        Model.Room.Booking booking3 = bookingRepository0.findById("9");
        java.util.List<Model.Room.Booking> bookingList4 = bookingRepository0.findAll();
        org.junit.Assert.assertNotNull(bookingRepository0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertNull(booking3);
        org.junit.Assert.assertNotNull(bookingList4);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
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
        roomService31.update(false, 108);
        org.junit.Assert.assertNotNull(evaluateRoomMaintenanceRelationshipService0);
        org.junit.Assert.assertNull(booking7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
// flaky "35) test264(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "41" + "'", str27, "41");
        org.junit.Assert.assertNotNull(roomService28);
// flaky "19) test264(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "42" + "'", str35, "42");
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        Model.User.StudentUser studentUser6 = new Model.User.StudentUser("32", "2", "PENDING", "2", true, "3b878a93-2f8d-4168-99fd-22b8dbe103f1");
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        Model.Sensor.OccupancySensor occupancySensor5 = new Model.Sensor.OccupancySensor("COMPLETED", "8", "21", "12", true);
        occupancySensor5.setOccupied(false);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        Repository.RoomRepository roomRepository0 = new Repository.RoomRepository();
        java.lang.String str1 = roomRepository0.generateNextId();
        java.lang.String str2 = roomRepository0.generateNextId();
        java.lang.String str3 = roomRepository0.generateNextId();
        java.util.List<Model.Room.Room> roomList4 = roomRepository0.findAll();
        java.lang.String str5 = roomRepository0.generateNextId();
// flaky "36) test267(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "43" + "'", str1, "43");
// flaky "20) test267(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "43" + "'", str2, "43");
// flaky "12) test267(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "43" + "'", str3, "43");
        org.junit.Assert.assertNotNull(roomList4);
// flaky "11) test267(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "43" + "'", str5, "43");
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        Service.RoomService roomService0 = new Service.RoomService();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        java.time.LocalTime localTime5 = null;
        java.time.LocalTime localTime6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = roomService0.createBooking("28", "2", localDate3, localDate4, localTime5, localTime6, "43");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        java.time.LocalDateTime localDateTime2 = null;
        Model.Sensor.OccupancySensorData occupancySensorData3 = new Model.Sensor.OccupancySensorData("", "hi!", localDateTime2);
        java.lang.String str4 = occupancySensorData3.sensorID;
        java.time.LocalDateTime localDateTime5 = occupancySensorData3.getLocalDateTime();
        java.time.LocalDateTime localDateTime6 = null;
        occupancySensorData3.dateTime = localDateTime6;
        java.lang.String str8 = occupancySensorData3.getLogID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        java.time.LocalDateTime localDateTime2 = null;
        Model.Sensor.OccupancySensorData occupancySensorData3 = new Model.Sensor.OccupancySensorData("", "hi!", localDateTime2);
        java.time.LocalDateTime localDateTime4 = occupancySensorData3.getLocalDateTime();
        java.lang.String str5 = occupancySensorData3.getLogID();
        java.lang.String str6 = occupancySensorData3.getSensorID();
        occupancySensorData3.sensorID = "COMPLETED";
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        Model.State.RoomDisabledState roomDisabledState0 = new Model.State.RoomDisabledState();
        boolean boolean1 = roomDisabledState0.isBookable();
        boolean boolean2 = roomDisabledState0.isBookable();
        boolean boolean3 = roomDisabledState0.isBookable();
        Model.Room.Room room8 = new Model.Room.Room("COMPLETED", "hi!", (double) 100.0f, "2");
        roomDisabledState0.maintain(room8);
        Model.State.RoomEnabledState roomEnabledState10 = new Model.State.RoomEnabledState();
        Model.Room.Room room15 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        boolean boolean16 = room15.isAvailable();
        Model.Room.AdminRoomProxy adminRoomProxy17 = new Model.Room.AdminRoomProxy(room15);
        roomEnabledState10.disable(room15);
        room8.setState((Model.State.RoomState) roomEnabledState10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        Model.Payment.Payment payment2 = new Model.Payment.Payment("", (double) (short) 10);
        java.lang.String str3 = payment2.getStatus();
        payment2.completePayment();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PENDING" + "'", str3, "PENDING");
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        java.time.LocalDateTime localDateTime2 = null;
        Model.Sensor.OccupancySensorData occupancySensorData3 = new Model.Sensor.OccupancySensorData("hi!", "EECS3311 Course Project Database - Rooms.csv", localDateTime2);
        java.time.LocalDateTime localDateTime4 = null;
        occupancySensorData3.dateTime = localDateTime4;
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        Database.Database database0 = Database.Database.getInstance();
        java.lang.String str1 = database0.getRoomCsvPath();
        java.lang.String str2 = database0.getOccupancySensorLogsPath();
        java.lang.String str3 = database0.getOccupancySensorLogsPath();
        java.lang.String str4 = database0.getScanIDSensorLogsPath();
        java.lang.String str5 = database0.getRoomCsvPath();
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EECS3311 Course Project Database - Rooms.csv" + "'", str1, "EECS3311 Course Project Database - Rooms.csv");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "src/main/data/occupancy_sensor_logs.csv" + "'", str2, "src/main/data/occupancy_sensor_logs.csv");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "src/main/data/occupancy_sensor_logs.csv" + "'", str3, "src/main/data/occupancy_sensor_logs.csv");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "src/main/data/scanid_sensor_logs.csv" + "'", str4, "src/main/data/scanid_sensor_logs.csv");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EECS3311 Course Project Database - Rooms.csv" + "'", str5, "EECS3311 Course Project Database - Rooms.csv");
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        View.CheckinView checkinView0 = null;
        Service.RoomService roomService1 = new Service.RoomService();
        roomService1.update(true, (int) (short) 10);
        boolean boolean6 = roomService1.performCheckOut("hi!");
        java.lang.String str10 = roomService1.createRoom("", (double) '4', "src/main/data/users.csv");
        Service.RoomService roomService11 = roomService1.getInstance();
        boolean boolean13 = roomService11.cancelBooking("EECS3311 Course Project Database - payments.csv");
        Service.SensorService sensorService14 = new Service.SensorService();
        Model.Sensor.Sensor sensor17 = null; // flaky "37) test275(RegressionTest0)": sensorService14.getSensorByRoomID("src/main/data/users.csv", "EECS3311 Course Project Database - Bookings.csv");
        boolean boolean21 = sensorService14.addSensor("src/main/data/occupancy_sensor_logs.csv", "COMPLETED", "4");
        Model.Sensor.Sensor sensor24 = null; // flaky "21) test275(RegressionTest0)": sensorService14.getSensorByRoomID("23", "24");
        // The following exception was thrown during execution in test generation
        try {
            Controller.CheckinController checkinController25 = new Controller.CheckinController(checkinView0, roomService11, sensorService14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"backButton\" because \"this.view\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "13) test275(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "43" + "'", str10, "43");
        org.junit.Assert.assertNotNull(roomService11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(sensor17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(sensor24);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        Repository.RoomRepository roomRepository0 = Repository.RoomRepository.getInstance();
        java.util.List<Model.Room.Room> roomList1 = roomRepository0.findAll();
        Model.Room.Room room3 = roomRepository0.findById("src/main/data/scanid_sensor_logs.csv");
        org.junit.Assert.assertNotNull(roomRepository0);
        org.junit.Assert.assertNotNull(roomList1);
        org.junit.Assert.assertNull(room3);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        Model.Sensor.ScanIDSensor scanIDSensor4 = new Model.Sensor.ScanIDSensor("Service.AuthenticationException: Service.AuthenticationException: ", "COMPLETED", "2", "");
        java.lang.String str5 = scanIDSensor4.getStatus();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2" + "'", str5, "2");
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
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
        roomService31.enableRoom("25");
        org.junit.Assert.assertNotNull(evaluateRoomMaintenanceRelationshipService0);
        org.junit.Assert.assertNull(booking7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
// flaky "38) test278(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "44" + "'", str27, "44");
        org.junit.Assert.assertNotNull(roomService28);
// flaky "22) test278(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "45" + "'", str35, "45");
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        Repository.PaymentRepository paymentRepository0 = Repository.PaymentRepository.getInstance();
        Model.Payment.Payment payment3 = new Model.Payment.Payment("", (double) (short) 10);
        paymentRepository0.save(payment3);
        java.util.List<Model.Payment.Payment> paymentList5 = paymentRepository0.findAll();
        org.junit.Assert.assertNotNull(paymentRepository0);
        org.junit.Assert.assertNotNull(paymentList5);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
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
        boolean boolean15 = roomEnabledState0.isBookable();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        Model.State.RoomEnabledState roomEnabledState0 = new Model.State.RoomEnabledState();
        boolean boolean1 = roomEnabledState0.isBookable();
        java.lang.String str2 = roomEnabledState0.getStateName();
        Model.State.RoomEnabledState roomEnabledState3 = new Model.State.RoomEnabledState();
        boolean boolean4 = roomEnabledState3.isBookable();
        Model.State.RoomReadyForEnableState roomReadyForEnableState5 = new Model.State.RoomReadyForEnableState();
        Model.State.RoomEnabledState roomEnabledState6 = new Model.State.RoomEnabledState();
        boolean boolean7 = roomEnabledState6.isBookable();
        Model.State.RoomReadyForEnableState roomReadyForEnableState8 = new Model.State.RoomReadyForEnableState();
        boolean boolean9 = roomReadyForEnableState8.isBookable();
        Model.Room.Room room14 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        roomReadyForEnableState8.disable(room14);
        roomEnabledState6.maintain(room14);
        roomReadyForEnableState5.maintain(room14);
        roomEnabledState3.enable(room14);
        roomEnabledState0.maintain(room14);
        java.lang.String str20 = roomEnabledState0.getStateName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ENABLED" + "'", str2, "ENABLED");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ENABLED" + "'", str20, "ENABLED");
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        Model.Room.Room room4 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        Model.Room.GuestRoomProxy guestRoomProxy5 = new Model.Room.GuestRoomProxy(room4);
        guestRoomProxy5.showRoomDetails();
        java.lang.String str7 = guestRoomProxy5.getRoomId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "COMPLETED" + "'", str7, "COMPLETED");
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
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
        Service.EditMaintenanceRequestService editMaintenanceRequestService67 = new Service.EditMaintenanceRequestService(serviceRequestRepository0);
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
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        Model.User.StaffUser staffUser3 = new Model.User.StaffUser("32", "12", "25");
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        Model.User.EventCoordinator eventCoordinator0 = Model.User.EventCoordinator.getInstance();
        java.lang.String str1 = eventCoordinator0.getChiefEventCoordinatorName();
        java.lang.String str2 = eventCoordinator0.getChiefEventCoordinatorEmail();
        java.lang.String str3 = eventCoordinator0.getChiefEventCoordinatorEmail();
        java.lang.String str4 = eventCoordinator0.getChiefEventCoordinatorEmail();
        java.lang.String str5 = eventCoordinator0.getChiefEventCoordinatorEmail();
        java.lang.String str6 = eventCoordinator0.getChiefEventCoordinatorEmail();
        java.lang.String str7 = eventCoordinator0.getChiefEventCoordinatorPassword();
        java.lang.String str8 = eventCoordinator0.getChiefEventCoordinatorPassword();
        org.junit.Assert.assertNotNull(eventCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "John Smith" + "'", str1, "John Smith");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jsmith@yorku.ca" + "'", str2, "jsmith@yorku.ca");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jsmith@yorku.ca" + "'", str3, "jsmith@yorku.ca");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jsmith@yorku.ca" + "'", str4, "jsmith@yorku.ca");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "jsmith@yorku.ca" + "'", str5, "jsmith@yorku.ca");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "jsmith@yorku.ca" + "'", str6, "jsmith@yorku.ca");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "!Password123" + "'", str7, "!Password123");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "!Password123" + "'", str8, "!Password123");
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        Repository.ServiceRequestRepository serviceRequestRepository0 = Repository.ServiceRequestRepository.getInstance();
        Repository.ServiceRequestRepository serviceRequestRepository1 = Repository.ServiceRequestRepository.getInstance();
        Model.ServiceRequest.SensorEssentialServiceRequest sensorEssentialServiceRequest7 = new Model.ServiceRequest.SensorEssentialServiceRequest(1, "COMPLETED", "Service.AuthenticationException: ", (int) 'a', (int) (short) -1);
        sensorEssentialServiceRequest7.assignRoomID(100);
        java.lang.String str10 = sensorEssentialServiceRequest7.getStatus();
        serviceRequestRepository1.updateExistingServiceRequest((Model.ServiceRequest.ServiceRequest) sensorEssentialServiceRequest7);
        Model.ServiceRequest.SensorEssentialServiceRequest sensorEssentialServiceRequest17 = new Model.ServiceRequest.SensorEssentialServiceRequest((int) (short) 100, "CHECKED_IN", "EECS3311 Course Project Database - Bookings.csv", 0, (int) (byte) 0);
        serviceRequestRepository1.updateExistingServiceRequest((Model.ServiceRequest.ServiceRequest) sensorEssentialServiceRequest17);
        Model.ServiceRequest.ServiceRequest serviceRequest19 = serviceRequestRepository0.addServiceRequest((Model.ServiceRequest.ServiceRequest) sensorEssentialServiceRequest17);
        serviceRequest19.setStatus("3");
        boolean boolean22 = serviceRequest19.isEssential;
        org.junit.Assert.assertNotNull(serviceRequestRepository0);
        org.junit.Assert.assertNotNull(serviceRequestRepository1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Service.AuthenticationException: " + "'", str10, "Service.AuthenticationException: ");
        org.junit.Assert.assertNotNull(serviceRequest19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        Model.State.RoomDisabledState roomDisabledState0 = new Model.State.RoomDisabledState();
        boolean boolean1 = roomDisabledState0.isBookable();
        boolean boolean2 = roomDisabledState0.isBookable();
        Model.State.RoomEnabledState roomEnabledState3 = new Model.State.RoomEnabledState();
        Model.Room.Room room8 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        boolean boolean9 = room8.isAvailable();
        Model.Room.AdminRoomProxy adminRoomProxy10 = new Model.Room.AdminRoomProxy(room8);
        roomEnabledState3.disable(room8);
        roomDisabledState0.enable(room8);
        Model.State.RoomDisabledState roomDisabledState13 = new Model.State.RoomDisabledState();
        boolean boolean14 = roomDisabledState13.isBookable();
        boolean boolean15 = roomDisabledState13.isBookable();
        Model.State.RoomEnabledState roomEnabledState16 = new Model.State.RoomEnabledState();
        Model.Room.Room room21 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        boolean boolean22 = room21.isAvailable();
        Model.Room.AdminRoomProxy adminRoomProxy23 = new Model.Room.AdminRoomProxy(room21);
        roomEnabledState16.disable(room21);
        roomDisabledState13.enable(room21);
        roomDisabledState0.maintain(room21);
        Model.State.RoomDisabledState roomDisabledState27 = new Model.State.RoomDisabledState();
        boolean boolean28 = roomDisabledState27.isBookable();
        boolean boolean29 = roomDisabledState27.isBookable();
        boolean boolean30 = roomDisabledState27.isBookable();
        Model.Room.Room room35 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        boolean boolean36 = room35.isAvailable();
        roomDisabledState27.maintain(room35);
        Model.Room.GuestRoomProxy guestRoomProxy38 = new Model.Room.GuestRoomProxy(room35);
        roomDisabledState0.maintain(room35);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        Model.User.EventCoordinator eventCoordinator0 = Model.User.EventCoordinator.getInstance();
        java.lang.String str1 = eventCoordinator0.getChiefEventCoordinatorName();
        java.lang.String str2 = eventCoordinator0.getChiefEventCoordinatorEmail();
        java.lang.String str3 = eventCoordinator0.getChiefEventCoordinatorEmail();
        java.lang.String str4 = eventCoordinator0.getChiefEventCoordinatorEmail();
        java.lang.String str5 = eventCoordinator0.getChiefEventCoordinatorEmail();
        java.lang.String str6 = eventCoordinator0.getChiefEventCoordinatorEmail();
        java.lang.String str7 = eventCoordinator0.getChiefEventCoordinatorPassword();
        java.lang.String str8 = eventCoordinator0.getChiefEventCoordinatorName();
        org.junit.Assert.assertNotNull(eventCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "John Smith" + "'", str1, "John Smith");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jsmith@yorku.ca" + "'", str2, "jsmith@yorku.ca");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jsmith@yorku.ca" + "'", str3, "jsmith@yorku.ca");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jsmith@yorku.ca" + "'", str4, "jsmith@yorku.ca");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "jsmith@yorku.ca" + "'", str5, "jsmith@yorku.ca");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "jsmith@yorku.ca" + "'", str6, "jsmith@yorku.ca");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "!Password123" + "'", str7, "!Password123");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "John Smith" + "'", str8, "John Smith");
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
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
        java.util.Map<java.lang.Integer, java.util.List<Model.ServiceRequest.ServiceRequest>> intMap26 = serviceRequestRepository0.parseCsvFileToMap("14", false);
        Model.ServiceRequest.ServiceRequest serviceRequest27 = null;
        // The following exception was thrown during execution in test generation
        try {
            Model.ServiceRequest.ServiceRequest serviceRequest28 = serviceRequestRepository0.addServiceRequest(serviceRequest27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Model.ServiceRequest.ServiceRequest.getRoomID()\" because \"serviceRequest\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serviceRequestRepository0);
        org.junit.Assert.assertNotNull(serviceRequestRepository1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Service.AuthenticationException: " + "'", str10, "Service.AuthenticationException: ");
        org.junit.Assert.assertNotNull(intMap21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(intMap26);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        Service.AuthenticationException authenticationException1 = new Service.AuthenticationException("Service.AuthenticationException: ");
        java.lang.String str2 = authenticationException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Service.AuthenticationException: Service.AuthenticationException: " + "'", str2, "Service.AuthenticationException: Service.AuthenticationException: ");
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
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
        Model.State.CompletedState completedState21 = new Model.State.CompletedState();
        java.time.LocalDate localDate25 = null;
        java.time.LocalDate localDate26 = null;
        java.time.LocalTime localTime27 = null;
        java.time.LocalTime localTime28 = null;
        Model.Room.Booking booking30 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate25, localDate26, localTime27, localTime28, "");
        completedState21.checkOut(booking30);
        confirmedState0.checkIn(booking30);
        org.junit.Assert.assertNotNull(bookingRepository1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(localTime17);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        Service.SensorService sensorService0 = new Service.SensorService();
        java.util.List<java.util.List<java.lang.String>> strListList1 = null; // flaky "39) test292(RegressionTest0)": sensorService0.getSensorsFormatted();
// flaky "23) test292(RegressionTest0)":         org.junit.Assert.assertNotNull(strListList1);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        Repository.UserRepository userRepository0 = Repository.UserRepository.getInstance();
        int int1 = userRepository0.getAll();
        Model.User.User user3 = userRepository0.findByEmail("PENDING");
        int int4 = userRepository0.getAll();
        // The following exception was thrown during execution in test generation
        try {
            Model.User.AccountType accountType6 = userRepository0.mapCsvTypeToAccountType("30");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown account type in users.csv: 30");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userRepository0);
// flaky "40) test293(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 25 + "'", int1 == 25);
        org.junit.Assert.assertNull(user3);
// flaky "24) test293(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 25 + "'", int4 == 25);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
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
        Model.State.CheckInState checkInState78 = new Model.State.CheckInState();
        java.time.LocalDate localDate82 = null;
        java.time.LocalDate localDate83 = null;
        java.time.LocalTime localTime84 = null;
        java.time.LocalTime localTime85 = null;
        Model.Room.Booking booking87 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate82, localDate83, localTime84, localTime85, "");
        java.lang.String str88 = booking87.getBookingId();
        checkInState78.checkIn(booking87);
        java.lang.String str90 = booking87.getUserId();
        cancelledState0.cancel(booking87);
        java.time.LocalDate localDate92 = booking87.getEndDate();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "COMPLETED" + "'", str12, "COMPLETED");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNull(localDate63);
        org.junit.Assert.assertNull(localDate76);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "" + "'", str90, "");
        org.junit.Assert.assertNull(localDate92);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        Model.User.StaffUser staffUser6 = new Model.User.StaffUser("", "hi!", "4", "hi!", false, "2");
        java.lang.String str7 = staffUser6.getRole();
        Model.User.AccountType accountType8 = staffUser6.getAccountType();
        Model.User.AccountType accountType9 = staffUser6.getAccountType();
        staffUser6.setEmail("44");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2" + "'", str7, "2");
        org.junit.Assert.assertTrue("'" + accountType8 + "' != '" + Model.User.AccountType.STAFF + "'", accountType8.equals(Model.User.AccountType.STAFF));
        org.junit.Assert.assertTrue("'" + accountType9 + "' != '" + Model.User.AccountType.STAFF + "'", accountType9.equals(Model.User.AccountType.STAFF));
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        Service.SensorService sensorService0 = new Service.SensorService();
        boolean boolean4 = sensorService0.addSensor("src/main/data/sensors.csv", "7", "12");
        java.util.List<java.util.List<java.lang.String>> strListList5 = null; // flaky "41) test296(RegressionTest0)": sensorService0.getSensorsFormatted();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "25) test296(RegressionTest0)":         org.junit.Assert.assertNotNull(strListList5);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        Service.RoomService roomService0 = new Service.RoomService();
        roomService0.update(true, (int) (short) 10);
        roomService0.savePayment("14", (-1.0d));
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        View.RoomBookingRequirementsView roomBookingRequirementsView0 = null;
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
        Service.RoomService roomService17 = roomService13.getInstance();
        // The following exception was thrown during execution in test generation
        try {
            Controller.RoomBookingRequirementsController roomBookingRequirementsController18 = new Controller.RoomBookingRequirementsController(roomBookingRequirementsView0, roomService13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"backButton\" because \"this.view\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evaluateRoomMaintenanceRelationshipService1);
        org.junit.Assert.assertNull(booking8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(roomService17);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        Model.ServiceRequest.SensorEssentialServiceRequest sensorEssentialServiceRequest5 = new Model.ServiceRequest.SensorEssentialServiceRequest(1, "COMPLETED", "Service.AuthenticationException: ", (int) 'a', (int) (short) -1);
        sensorEssentialServiceRequest5.assignRoomID(100);
        java.lang.String str8 = sensorEssentialServiceRequest5.getStatus();
        sensorEssentialServiceRequest5.isEssential = true;
        int int11 = sensorEssentialServiceRequest5.getServiceRequestID();
        int int12 = sensorEssentialServiceRequest5.getServiceRequestID();
        sensorEssentialServiceRequest5.setRoomID(32);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Service.AuthenticationException: " + "'", str8, "Service.AuthenticationException: ");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        Model.Payment.Payment payment2 = new Model.Payment.Payment("7", 100.0d);
        boolean boolean3 = payment2.isPaid();
        boolean boolean4 = payment2.isPaid();
        java.lang.String str5 = payment2.getStatus();
        double double6 = payment2.getAmount();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PENDING" + "'", str5, "PENDING");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        Service.RoomService roomService0 = new Service.RoomService();
        roomService0.update(true, (int) (short) 10);
        Model.Room.Booking booking5 = roomService0.getBookingDetails("src/main/data/users.csv");
        boolean boolean7 = roomService0.cancelBooking("hi!");
        Controller.AddRoomController addRoomController8 = new Controller.AddRoomController(roomService0);
        Controller.AdminSelectActionController adminSelectActionController9 = new Controller.AdminSelectActionController(addRoomController8);
        adminSelectActionController9.disableRoom("Service.AuthenticationException: Service.AuthenticationException: ");
        adminSelectActionController9.adminAddRoom("CANCELLED", (int) (byte) 1, 10.0d);
        org.junit.Assert.assertNull(booking5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        View.GuestSelectActionView guestSelectActionView0 = null;
        Repository.BookingRepository bookingRepository1 = Repository.BookingRepository.getInstance();
        java.util.List<Model.Room.Booking> bookingList2 = bookingRepository1.findAll();
        java.util.List<Model.Room.Booking> bookingList3 = bookingRepository1.findAll();
        // The following exception was thrown during execution in test generation
        try {
            Controller.GuestSelectActionController guestSelectActionController4 = new Controller.GuestSelectActionController(guestSelectActionView0, (java.lang.Object) bookingRepository1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"availableRoomsButton\" because \"view\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingRepository1);
        org.junit.Assert.assertNotNull(bookingList2);
        org.junit.Assert.assertNotNull(bookingList3);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        Service.AuthenticationService authenticationService0 = new Service.AuthenticationService();
        boolean boolean2 = authenticationService0.isYorkEmail("Service.AuthenticationException: ");
        // The following exception was thrown during execution in test generation
        try {
            Model.User.User user5 = authenticationService0.login("jsmith@yorku.ca", "PENDING");
            org.junit.Assert.fail("Expected exception of type Service.AuthenticationException; message: No user found for this email.");
        } catch (Service.AuthenticationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
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
        boolean boolean16 = evaluateRoomMaintenanceRelationshipService0.isAnyEssentialMaintenanceRequestPending();
        boolean boolean17 = evaluateRoomMaintenanceRelationshipService0.isAnyEssentialMaintenanceRequestPending();
        org.junit.Assert.assertNotNull(evaluateRoomMaintenanceRelationshipService0);
        org.junit.Assert.assertNull(booking7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky "42) test304(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
// flaky "26) test304(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        View.GuestSelectActionView guestSelectActionView0 = null;
        Model.ServiceRequest.NonEssentialServiceRequest nonEssentialServiceRequest5 = new Model.ServiceRequest.NonEssentialServiceRequest(4, "src/main/data/users.csv", "12", (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            Controller.GuestSelectActionController guestSelectActionController6 = new Controller.GuestSelectActionController(guestSelectActionView0, (java.lang.Object) "12");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"availableRoomsButton\" because \"view\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        Repository.BookingRepository bookingRepository0 = Repository.BookingRepository.getInstance();
        java.util.List<Model.Room.Booking> bookingList1 = bookingRepository0.findAll();
        java.util.List<Model.Room.Booking> bookingList2 = bookingRepository0.findAll();
        Model.State.CancelledState cancelledState3 = new Model.State.CancelledState();
        Model.State.CompletedState completedState4 = new Model.State.CompletedState();
        java.time.LocalDate localDate8 = null;
        java.time.LocalDate localDate9 = null;
        java.time.LocalTime localTime10 = null;
        java.time.LocalTime localTime11 = null;
        Model.Room.Booking booking13 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate8, localDate9, localTime10, localTime11, "");
        completedState4.checkOut(booking13);
        java.lang.String str15 = completedState4.getStatus();
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
        completedState4.checkIn(booking35);
        cancelledState3.checkOut(booking35);
        Model.State.CompletedState completedState39 = new Model.State.CompletedState();
        java.time.LocalDate localDate43 = null;
        java.time.LocalDate localDate44 = null;
        java.time.LocalTime localTime45 = null;
        java.time.LocalTime localTime46 = null;
        Model.Room.Booking booking48 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate43, localDate44, localTime45, localTime46, "");
        completedState39.checkOut(booking48);
        cancelledState3.cancel(booking48);
        java.lang.String str51 = booking48.getStatus();
        bookingRepository0.save(booking48);
        Model.State.CompletedState completedState53 = new Model.State.CompletedState();
        java.time.LocalDate localDate57 = null;
        java.time.LocalDate localDate58 = null;
        java.time.LocalTime localTime59 = null;
        java.time.LocalTime localTime60 = null;
        Model.Room.Booking booking62 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate57, localDate58, localTime59, localTime60, "");
        completedState53.checkOut(booking62);
        bookingRepository0.save(booking62);
        org.junit.Assert.assertNotNull(bookingRepository0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertNotNull(bookingList2);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "COMPLETED" + "'", str15, "COMPLETED");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "CONFIRMED" + "'", str51, "CONFIRMED");
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        Repository.ServiceRequestRepository serviceRequestRepository0 = Repository.ServiceRequestRepository.getInstance();
        java.lang.Integer int2 = serviceRequestRepository0.generateNextId((int) (byte) 100);
        Service.EditMaintenanceRequestService editMaintenanceRequestService3 = new Service.EditMaintenanceRequestService(serviceRequestRepository0);
        editMaintenanceRequestService3.promoteServiceRequest((int) (byte) 1, "24", "45", 0, "34");
        org.junit.Assert.assertNotNull(serviceRequestRepository0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        Repository.UserRepository userRepository0 = Repository.UserRepository.getInstance();
        int int1 = userRepository0.getAll();
        Model.User.User user3 = userRepository0.findByEmail("PENDING");
        int int4 = userRepository0.getAll();
        int int5 = userRepository0.getAll();
        Model.User.StaffUser staffUser9 = new Model.User.StaffUser("hi!", "", "hi!");
        boolean boolean10 = staffUser9.isVerified();
        Application.SessionData.setCurrentUser((Model.User.User) staffUser9);
        userRepository0.save((Model.User.User) staffUser9);
        org.junit.Assert.assertNotNull(userRepository0);
// flaky "43) test308(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 25 + "'", int1 == 25);
        org.junit.Assert.assertNull(user3);
// flaky "27) test308(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 25 + "'", int4 == 25);
// flaky "14) test308(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 25 + "'", int5 == 25);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        Repository.SensorRepository sensorRepository0 = new Repository.SensorRepository();
        java.util.List<Model.Sensor.OccupancySensorData> occupancySensorDataList1 = sensorRepository0.getOccupancySensorLogsList();
        Model.Sensor.ScanIDSensorData scanIDSensorData2 = null;
        boolean boolean3 = sensorRepository0.writeScanIDSensorLog(scanIDSensorData2);
        Model.Sensor.OccupancySensor occupancySensor9 = new Model.Sensor.OccupancySensor("", "1", "1", "EECS3311 Course Project Database - Rooms.csv", true);
        boolean boolean10 = false; // flaky "44) test309(RegressionTest0)": sensorRepository0.writeSensor((Model.Sensor.Sensor) occupancySensor9);
        java.lang.Object obj11 = null;
        boolean boolean12 = occupancySensor9.equals(obj11);
        java.lang.String str13 = occupancySensor9.getType();
// flaky "28) test309(RegressionTest0)":         org.junit.Assert.assertNotNull(occupancySensorDataList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "15) test309(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1" + "'", str13, "1");
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        Service.EvaluateRoomMaintenanceRelationshipService evaluateRoomMaintenanceRelationshipService0 = Service.EvaluateRoomMaintenanceRelationshipService.getInstance();
        evaluateRoomMaintenanceRelationshipService0.notifyObservers();
        evaluateRoomMaintenanceRelationshipService0.evaluateRoomMaintenanceRelationship(15);
        boolean boolean4 = evaluateRoomMaintenanceRelationshipService0.isAnyEssentialMaintenanceRequestPending();
        org.junit.Assert.assertNotNull(evaluateRoomMaintenanceRelationshipService0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        Model.User.PartnerUser partnerUser6 = new Model.User.PartnerUser("9", "Service.AuthenticationException: ", "Service.AuthenticationException: ", "7", true, "1");
        java.lang.String str7 = partnerUser6.getId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "9" + "'", str7, "9");
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        Model.State.RoomEnabledState roomEnabledState0 = new Model.State.RoomEnabledState();
        boolean boolean1 = roomEnabledState0.isBookable();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        Database.Database database0 = Database.Database.getInstance();
        java.lang.String str1 = database0.getRoomCsvPath();
        java.lang.String str2 = database0.getOccupancySensorLogsPath();
        java.lang.String str3 = database0.getScanIDSensorLogsPath();
        java.lang.String str4 = database0.getBookingCsvPath();
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EECS3311 Course Project Database - Rooms.csv" + "'", str1, "EECS3311 Course Project Database - Rooms.csv");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "src/main/data/occupancy_sensor_logs.csv" + "'", str2, "src/main/data/occupancy_sensor_logs.csv");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "src/main/data/scanid_sensor_logs.csv" + "'", str3, "src/main/data/scanid_sensor_logs.csv");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EECS3311 Course Project Database - Bookings.csv" + "'", str4, "EECS3311 Course Project Database - Bookings.csv");
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        Model.User.StaffUser staffUser3 = new Model.User.StaffUser("src/main/data/occupancy_sensor_logs.csv", "3", "READY_FOR_ENABLE");
        java.lang.String str4 = staffUser3.getPassword();
        boolean boolean6 = staffUser3.checkPassword("42");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "READY_FOR_ENABLE" + "'", str4, "READY_FOR_ENABLE");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
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
        Model.State.RoomDisabledState roomDisabledState25 = new Model.State.RoomDisabledState();
        boolean boolean26 = roomDisabledState25.isBookable();
        boolean boolean27 = roomDisabledState25.isBookable();
        boolean boolean28 = roomDisabledState25.isBookable();
        Model.State.RoomDisabledState roomDisabledState29 = new Model.State.RoomDisabledState();
        boolean boolean30 = roomDisabledState29.isBookable();
        boolean boolean31 = roomDisabledState29.isBookable();
        Model.State.RoomEnabledState roomEnabledState32 = new Model.State.RoomEnabledState();
        Model.Room.Room room37 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        boolean boolean38 = room37.isAvailable();
        Model.Room.AdminRoomProxy adminRoomProxy39 = new Model.Room.AdminRoomProxy(room37);
        roomEnabledState32.disable(room37);
        roomDisabledState29.enable(room37);
        Model.State.RoomDisabledState roomDisabledState42 = new Model.State.RoomDisabledState();
        boolean boolean43 = roomDisabledState42.isBookable();
        boolean boolean44 = roomDisabledState42.isBookable();
        Model.State.RoomEnabledState roomEnabledState45 = new Model.State.RoomEnabledState();
        Model.Room.Room room50 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        boolean boolean51 = room50.isAvailable();
        Model.Room.AdminRoomProxy adminRoomProxy52 = new Model.Room.AdminRoomProxy(room50);
        roomEnabledState45.disable(room50);
        roomDisabledState42.enable(room50);
        roomDisabledState29.maintain(room50);
        roomDisabledState25.disable(room50);
        roomReadyForEnableState0.disable(room50);
        boolean boolean58 = room50.isAvailable();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "READY_FOR_ENABLE" + "'", str2, "READY_FOR_ENABLE");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        Model.Sensor.ScanIDSensor scanIDSensor4 = new Model.Sensor.ScanIDSensor("3", "src/main/data/MaintenanceRequests.csv", "EECS3311 Course Project Database - Rooms.csv", "");
        scanIDSensor4.setRoomID("jsmith@yorku.ca");
        java.lang.String str7 = scanIDSensor4.getStatus();
        scanIDSensor4.setOccupied(false);
        java.lang.String str10 = scanIDSensor4.getStatus();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EECS3311 Course Project Database - Rooms.csv" + "'", str7, "EECS3311 Course Project Database - Rooms.csv");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "EECS3311 Course Project Database - Rooms.csv" + "'", str10, "EECS3311 Course Project Database - Rooms.csv");
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        Service.RoomService roomService0 = new Service.RoomService();
        roomService0.maintenanceCompleted("");
        boolean boolean4 = roomService0.performCheckOut("");
        roomService0.maintenanceCompleted("1");
        roomService0.disableRoom("3");
        roomService0.maintenanceCompleted("jsmith@yorku.ca");
        boolean boolean12 = roomService0.cancelBooking("src/main/data/scanid_sensor_logs.csv");
        Model.Room.Booking booking14 = roomService0.getBookingDetails("1bec99b6-9fd5-4eb6-be48-3e7f52439881");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(booking14);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
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
        java.lang.String str16 = roomEnabledState0.getStateName();
        Model.Room.Room room17 = null;
        roomEnabledState0.enable(room17);
        boolean boolean19 = roomEnabledState0.isBookable();
        Model.State.RoomReadyForEnableState roomReadyForEnableState20 = new Model.State.RoomReadyForEnableState();
        boolean boolean21 = roomReadyForEnableState20.isBookable();
        Model.State.RoomEnabledState roomEnabledState22 = new Model.State.RoomEnabledState();
        Model.Room.Room room27 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        boolean boolean28 = room27.isAvailable();
        Model.Room.AdminRoomProxy adminRoomProxy29 = new Model.Room.AdminRoomProxy(room27);
        roomEnabledState22.disable(room27);
        roomReadyForEnableState20.maintain(room27);
        roomEnabledState0.disable(room27);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ENABLED" + "'", str16, "ENABLED");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        View.GuestSelectActionView guestSelectActionView0 = null;
        // The following exception was thrown during execution in test generation
        try {
            Controller.GuestSelectActionController guestSelectActionController2 = new Controller.GuestSelectActionController(guestSelectActionView0, (java.lang.Object) "41");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"availableRoomsButton\" because \"view\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        Repository.SensorRepository sensorRepository0 = new Repository.SensorRepository();
        java.util.List<Model.Sensor.OccupancySensorData> occupancySensorDataList1 = sensorRepository0.getOccupancySensorLogsList();
        Model.Sensor.ScanIDSensorData scanIDSensorData2 = null;
        boolean boolean3 = sensorRepository0.writeScanIDSensorLog(scanIDSensorData2);
        Model.Sensor.OccupancySensor occupancySensor9 = new Model.Sensor.OccupancySensor("", "1", "1", "EECS3311 Course Project Database - Rooms.csv", true);
        boolean boolean10 = false; // flaky "45) test320(RegressionTest0)": sensorRepository0.writeSensor((Model.Sensor.Sensor) occupancySensor9);
        java.util.List<Model.Sensor.ScanIDSensorData> scanIDSensorDataList11 = sensorRepository0.getScanIDSensorLogsList();
        Model.Sensor.Sensor sensor13 = null; // flaky "29) test320(RegressionTest0)": sensorRepository0.getSensorByID("EECS3311 Course Project Database - Bookings.csv");
        java.time.LocalDateTime localDateTime16 = null;
        Model.Sensor.OccupancySensorData occupancySensorData17 = new Model.Sensor.OccupancySensorData("", "hi!", localDateTime16);
        java.time.LocalDateTime localDateTime18 = null;
        occupancySensorData17.dateTime = localDateTime18;
        boolean boolean20 = false; // flaky "16) test320(RegressionTest0)": sensorRepository0.writeOccupancySensorLog(occupancySensorData17);
        Model.Sensor.Sensor sensor22 = null; // flaky "12) test320(RegressionTest0)": sensorRepository0.getSensorByID("24");
        java.util.List<Model.Sensor.OccupancySensorData> occupancySensorDataList23 = sensorRepository0.getOccupancySensorLogsList();
// flaky "8) test320(RegressionTest0)":         org.junit.Assert.assertNotNull(occupancySensorDataList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "4) test320(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky "2) test320(RegressionTest0)":         org.junit.Assert.assertNotNull(scanIDSensorDataList11);
        org.junit.Assert.assertNull(sensor13);
// flaky "2) test320(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(sensor22);
// flaky "1) test320(RegressionTest0)":         org.junit.Assert.assertNotNull(occupancySensorDataList23);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        Model.User.PartnerUser partnerUser6 = new Model.User.PartnerUser("", "hi!", "", "", true, "hi!");
        partnerUser6.setName("4");
        partnerUser6.setVerified(true);
        java.lang.String str11 = partnerUser6.getPassword();
        double double12 = partnerUser6.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        Service.AuthenticationException authenticationException1 = new Service.AuthenticationException("Service.AuthenticationException: Service.AuthenticationException: ");
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
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
        java.lang.String str74 = completedState0.getStatus();
        java.time.LocalDate localDate78 = null;
        java.time.LocalDate localDate79 = null;
        java.time.LocalTime localTime80 = null;
        java.time.LocalTime localTime81 = null;
        Model.Room.Booking booking83 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate78, localDate79, localTime80, localTime81, "");
        java.lang.String str84 = booking83.getBookingId();
        Model.State.BookingState bookingState85 = null;
        booking83.setState(bookingState85);
        Model.State.CompletedState completedState87 = new Model.State.CompletedState();
        booking83.setState((Model.State.BookingState) completedState87);
        completedState0.cancel(booking83);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "COMPLETED" + "'", str11, "COMPLETED");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "COMPLETED" + "'", str34, "COMPLETED");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "CHECKED_IN" + "'", str36, "CHECKED_IN");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "CHECKED_IN" + "'", str37, "CHECKED_IN");
        org.junit.Assert.assertNull(localDate49);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "COMPLETED" + "'", str74, "COMPLETED");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        java.time.LocalDateTime localDateTime2 = null;
        Model.Sensor.OccupancySensorData occupancySensorData3 = new Model.Sensor.OccupancySensorData("23", "45", localDateTime2);
        java.time.LocalDateTime localDateTime4 = occupancySensorData3.dateTime;
        org.junit.Assert.assertNull(localDateTime4);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        java.time.LocalDateTime localDateTime2 = null;
        Model.Sensor.OccupancySensorData occupancySensorData3 = new Model.Sensor.OccupancySensorData("src/main/data/sensors.csv", "ENABLED", localDateTime2);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        View.GuestSelectActionView guestSelectActionView0 = null;
        Repository.SensorRepository sensorRepository1 = new Repository.SensorRepository();
        java.util.List<Model.Sensor.ScanIDSensorData> scanIDSensorDataList2 = sensorRepository1.getScanIDSensorLogsList();
        java.util.List<Model.Sensor.Sensor> sensorList3 = sensorRepository1.getSensorsList();
        // The following exception was thrown during execution in test generation
        try {
            Controller.GuestSelectActionController guestSelectActionController4 = new Controller.GuestSelectActionController(guestSelectActionView0, (java.lang.Object) sensorList3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"availableRoomsButton\" because \"view\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "46) test326(RegressionTest0)":         org.junit.Assert.assertNotNull(scanIDSensorDataList2);
// flaky "30) test326(RegressionTest0)":         org.junit.Assert.assertNotNull(sensorList3);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        Model.User.FacultyUser facultyUser6 = new Model.User.FacultyUser("45", "PENDING", "35", "CANCELLED", true, "21");
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        java.time.LocalDateTime localDateTime2 = null;
        Model.Sensor.OccupancySensorData occupancySensorData3 = new Model.Sensor.OccupancySensorData("", "hi!", localDateTime2);
        java.time.LocalDateTime localDateTime4 = null;
        occupancySensorData3.dateTime = localDateTime4;
        java.lang.String str6 = occupancySensorData3.sensorID;
        java.time.LocalDateTime localDateTime7 = occupancySensorData3.dateTime;
        occupancySensorData3.sensorID = "8";
        java.lang.String str10 = occupancySensorData3.sensorID;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "8" + "'", str10, "8");
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        Service.AuthenticationException authenticationException1 = new Service.AuthenticationException("32");
        java.lang.Throwable[] throwableArray2 = authenticationException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        Repository.BookingRepository bookingRepository0 = Repository.BookingRepository.getInstance();
        java.util.List<Model.Room.Booking> bookingList1 = bookingRepository0.findAll();
        Model.Room.Booking booking3 = bookingRepository0.findById("9");
        Model.Room.Booking booking5 = bookingRepository0.findById("EECS3311 Course Project Database - Bookings.csv");
        Model.State.CompletedState completedState6 = new Model.State.CompletedState();
        java.time.LocalDate localDate10 = null;
        java.time.LocalDate localDate11 = null;
        java.time.LocalTime localTime12 = null;
        java.time.LocalTime localTime13 = null;
        Model.Room.Booking booking15 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate10, localDate11, localTime12, localTime13, "");
        completedState6.checkOut(booking15);
        java.time.LocalDate localDate20 = null;
        java.time.LocalDate localDate21 = null;
        java.time.LocalTime localTime22 = null;
        java.time.LocalTime localTime23 = null;
        Model.Room.Booking booking25 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate20, localDate21, localTime22, localTime23, "");
        java.lang.String str26 = booking25.getBookingId();
        Model.State.BookingState bookingState27 = null;
        booking25.setState(bookingState27);
        Model.State.CompletedState completedState29 = new Model.State.CompletedState();
        booking25.setState((Model.State.BookingState) completedState29);
        completedState6.checkOut(booking25);
        bookingRepository0.save(booking25);
        org.junit.Assert.assertNotNull(bookingRepository0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertNull(booking3);
        org.junit.Assert.assertNull(booking5);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        Model.Room.Room room4 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        boolean boolean5 = room4.isAvailable();
        Model.Room.AdminRoomProxy adminRoomProxy6 = new Model.Room.AdminRoomProxy(room4);
        java.lang.String str7 = adminRoomProxy6.getRoomId();
        adminRoomProxy6.showRoomDetails();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "COMPLETED" + "'", str7, "COMPLETED");
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        Repository.BookingRepository bookingRepository0 = Repository.BookingRepository.getInstance();
        java.util.List<Model.Room.Booking> bookingList1 = bookingRepository0.findAll();
        java.lang.Class<?> wildcardClass2 = bookingList1.getClass();
        org.junit.Assert.assertNotNull(bookingRepository0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        Repository.RoomRepository roomRepository0 = new Repository.RoomRepository();
        java.lang.String str1 = roomRepository0.generateNextId();
        java.lang.String str2 = roomRepository0.generateNextId();
        java.lang.String str3 = roomRepository0.generateNextId();
        java.util.List<Model.Room.Room> roomList4 = roomRepository0.findAll();
        Model.State.RoomDisabledState roomDisabledState5 = new Model.State.RoomDisabledState();
        boolean boolean6 = roomDisabledState5.isBookable();
        Model.Room.Room room7 = null;
        roomDisabledState5.disable(room7);
        Model.State.RoomDisabledState roomDisabledState9 = new Model.State.RoomDisabledState();
        boolean boolean10 = roomDisabledState9.isBookable();
        boolean boolean11 = roomDisabledState9.isBookable();
        boolean boolean12 = roomDisabledState9.isBookable();
        Model.Room.Room room17 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        boolean boolean18 = room17.isAvailable();
        roomDisabledState9.maintain(room17);
        roomDisabledState5.maintain(room17);
        roomRepository0.save(room17);
        java.lang.String str22 = roomRepository0.generateNextId();
// flaky "47) test333(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "47" + "'", str1, "47");
// flaky "31) test333(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "47" + "'", str2, "47");
// flaky "17) test333(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "47" + "'", str3, "47");
        org.junit.Assert.assertNotNull(roomList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
// flaky "13) test333(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "47" + "'", str22, "47");
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        Model.User.StaffUser staffUser3 = new Model.User.StaffUser("src/main/data/occupancy_sensor_logs.csv", "3", "READY_FOR_ENABLE");
        boolean boolean5 = staffUser3.checkPassword("24");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        Service.RoomService roomService0 = new Service.RoomService();
        roomService0.update(true, (int) (short) 10);
        Model.Room.Booking booking5 = roomService0.getBookingDetails("src/main/data/users.csv");
        boolean boolean7 = roomService0.cancelBooking("hi!");
        roomService0.disableRoom("hi!");
        roomService0.disableRoom("1");
        Model.Room.Booking booking13 = roomService0.getBookingDetails("hi!");
        boolean boolean15 = roomService0.performCheckIn("47");
        java.lang.String str19 = roomService0.createRoom("41", 10.0d, "8903a9bb-0838-41ef-9768-131faa20dcdc");
        org.junit.Assert.assertNull(booking5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(booking13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
// flaky "48) test335(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "47" + "'", str19, "47");
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
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
        cancelledState0.cancel(booking45);
        java.lang.String str48 = booking45.getStatus();
        java.lang.String str49 = booking45.getBookingId();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "COMPLETED" + "'", str12, "COMPLETED");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "CONFIRMED" + "'", str48, "CONFIRMED");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        Model.User.StaffUser staffUser3 = new Model.User.StaffUser("hi!", "", "hi!");
        boolean boolean4 = staffUser3.isVerified();
        Application.SessionData.setCurrentUser((Model.User.User) staffUser3);
        staffUser3.setVerified(false);
        java.lang.String str8 = staffUser3.getPassword();
        double double9 = staffUser3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        Service.AuthenticationService authenticationService0 = new Service.AuthenticationService();
        boolean boolean2 = authenticationService0.isYorkEmail("Service.AuthenticationException: ");
        Model.User.FacultyUser facultyUser9 = new Model.User.FacultyUser("EECS3311 Course Project Database - Rooms.csv", "", "COMPLETED");
        Service.UserService userService10 = new Service.UserService();
        Model.User.AccountType accountType11 = Model.User.AccountType.PARTNER;
        Model.User.User user15 = userService10.createUser(accountType11, "", "DISABLED", "4");
        facultyUser9.setAccountType(accountType11);
        double double17 = accountType11.getHourlyRate();
        // The following exception was thrown during execution in test generation
        try {
            Model.User.User user18 = authenticationService0.register("43", "Service.AuthenticationException: Service.AuthenticationException: ", "34", accountType11);
            org.junit.Assert.fail("Expected exception of type Service.AuthenticationException; message: Please enter a valid email address.");
        } catch (Service.AuthenticationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + accountType11 + "' != '" + Model.User.AccountType.PARTNER + "'", accountType11.equals(Model.User.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(user15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 50.0d + "'", double17 == 50.0d);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        Model.ServiceRequest.NonEssentialServiceRequest nonEssentialServiceRequest4 = new Model.ServiceRequest.NonEssentialServiceRequest(26, "4", "57197862-2463-4972-b3b2-977245133f34", 4);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        Model.State.RoomDisabledState roomDisabledState0 = new Model.State.RoomDisabledState();
        boolean boolean1 = roomDisabledState0.isBookable();
        boolean boolean2 = roomDisabledState0.isBookable();
        boolean boolean3 = roomDisabledState0.isBookable();
        Model.Room.Room room8 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        boolean boolean9 = room8.isAvailable();
        roomDisabledState0.maintain(room8);
        Model.Room.GuestRoomProxy guestRoomProxy11 = new Model.Room.GuestRoomProxy(room8);
        room8.requestDisable();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        Model.Sensor.OccupancySensor occupancySensor5 = new Model.Sensor.OccupancySensor("READY_FOR_ENABLE", "src/main/data/users.csv", "1", "EECS3311 Course Project Database - Rooms.csv", false);
        occupancySensor5.setStatus("EECS3311 Course Project Database - Rooms.csv");
        occupancySensor5.setRoomID("57197862-2463-4972-b3b2-977245133f34");
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        Repository.RoomRepository roomRepository0 = new Repository.RoomRepository();
        java.lang.String str1 = roomRepository0.generateNextId();
        java.lang.String str2 = roomRepository0.generateNextId();
        java.lang.String str3 = roomRepository0.generateNextId();
        java.util.List<Model.Room.Room> roomList4 = roomRepository0.findAll();
        Model.State.RoomDisabledState roomDisabledState5 = new Model.State.RoomDisabledState();
        boolean boolean6 = roomDisabledState5.isBookable();
        Model.Room.Room room7 = null;
        roomDisabledState5.disable(room7);
        Model.State.RoomDisabledState roomDisabledState9 = new Model.State.RoomDisabledState();
        boolean boolean10 = roomDisabledState9.isBookable();
        boolean boolean11 = roomDisabledState9.isBookable();
        boolean boolean12 = roomDisabledState9.isBookable();
        Model.Room.Room room17 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        boolean boolean18 = room17.isAvailable();
        roomDisabledState9.maintain(room17);
        roomDisabledState5.maintain(room17);
        roomRepository0.save(room17);
        Model.Room.Room room23 = roomRepository0.findById("512a0e7c-3268-4bb7-bc77-c6d32a14e20d");
// flaky "49) test342(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "48" + "'", str1, "48");
// flaky "32) test342(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "48" + "'", str2, "48");
// flaky "18) test342(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "48" + "'", str3, "48");
        org.junit.Assert.assertNotNull(roomList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(room23);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        Model.ServiceRequest.NonEssentialServiceRequest nonEssentialServiceRequest4 = new Model.ServiceRequest.NonEssentialServiceRequest((-1), "22", "FACULTY", (int) (byte) 100);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        Repository.ServiceRequestRepository serviceRequestRepository0 = Repository.ServiceRequestRepository.getInstance();
        Model.ServiceRequest.SensorEssentialServiceRequest sensorEssentialServiceRequest6 = new Model.ServiceRequest.SensorEssentialServiceRequest(1, "COMPLETED", "Service.AuthenticationException: ", (int) 'a', (int) (short) -1);
        sensorEssentialServiceRequest6.assignRoomID(100);
        java.lang.String str9 = sensorEssentialServiceRequest6.getStatus();
        serviceRequestRepository0.updateExistingServiceRequest((Model.ServiceRequest.ServiceRequest) sensorEssentialServiceRequest6);
        java.lang.String str11 = sensorEssentialServiceRequest6.getDescription();
        sensorEssentialServiceRequest6.setDescription("hi!");
        org.junit.Assert.assertNotNull(serviceRequestRepository0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Service.AuthenticationException: " + "'", str9, "Service.AuthenticationException: ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "COMPLETED" + "'", str11, "COMPLETED");
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        Service.AuthenticationService authenticationService0 = new Service.AuthenticationService();
        boolean boolean2 = authenticationService0.properEmail("hi!");
        boolean boolean4 = authenticationService0.isYorkEmail("38");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        Model.State.RoomDisabledState roomDisabledState1 = new Model.State.RoomDisabledState();
        boolean boolean2 = roomDisabledState1.isBookable();
        boolean boolean3 = roomDisabledState1.isBookable();
        Model.State.RoomEnabledState roomEnabledState4 = new Model.State.RoomEnabledState();
        Model.Room.Room room9 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        boolean boolean10 = room9.isAvailable();
        Model.Room.AdminRoomProxy adminRoomProxy11 = new Model.Room.AdminRoomProxy(room9);
        roomEnabledState4.disable(room9);
        roomDisabledState1.enable(room9);
        Model.Room.RoomProxy roomProxy14 = Model.Room.RoomProxyFactory.getProxy("jsmith@yorku.ca", room9);
        java.lang.String str15 = roomProxy14.getRoomId();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(roomProxy14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "COMPLETED" + "'", str15, "COMPLETED");
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        Model.State.RoomReadyForEnableState roomReadyForEnableState0 = new Model.State.RoomReadyForEnableState();
        Model.State.RoomEnabledState roomEnabledState1 = new Model.State.RoomEnabledState();
        boolean boolean2 = roomEnabledState1.isBookable();
        Model.State.RoomReadyForEnableState roomReadyForEnableState3 = new Model.State.RoomReadyForEnableState();
        boolean boolean4 = roomReadyForEnableState3.isBookable();
        Model.Room.Room room9 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        roomReadyForEnableState3.disable(room9);
        roomEnabledState1.maintain(room9);
        roomReadyForEnableState0.maintain(room9);
        room9.requestDisable();
        Model.State.RoomState roomState14 = room9.getState();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(roomState14);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        Model.User.StaffUser staffUser3 = new Model.User.StaffUser("hi!", "", "hi!");
        staffUser3.setPassword("45");
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        Model.User.EventCoordinator eventCoordinator0 = Model.User.EventCoordinator.getInstance();
        java.lang.String str1 = eventCoordinator0.getChiefEventCoordinatorName();
        java.lang.String str2 = eventCoordinator0.getChiefEventCoordinatorEmail();
        java.lang.String str3 = eventCoordinator0.getChiefEventCoordinatorEmail();
        java.lang.String str4 = eventCoordinator0.getChiefEventCoordinatorEmail();
        java.lang.String str5 = eventCoordinator0.getChiefEventCoordinatorEmail();
        java.lang.String str6 = eventCoordinator0.getChiefEventCoordinatorEmail();
        java.lang.String str7 = eventCoordinator0.getChiefEventCoordinatorName();
        org.junit.Assert.assertNotNull(eventCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "John Smith" + "'", str1, "John Smith");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jsmith@yorku.ca" + "'", str2, "jsmith@yorku.ca");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jsmith@yorku.ca" + "'", str3, "jsmith@yorku.ca");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jsmith@yorku.ca" + "'", str4, "jsmith@yorku.ca");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "jsmith@yorku.ca" + "'", str5, "jsmith@yorku.ca");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "jsmith@yorku.ca" + "'", str6, "jsmith@yorku.ca");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "John Smith" + "'", str7, "John Smith");
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        Model.User.FacultyUser facultyUser6 = new Model.User.FacultyUser("ENABLED", "32", "EECS3311 Course Project Database - Rooms.csv", "ENABLED", true, "42");
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
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
        Model.State.CompletedState completedState65 = new Model.State.CompletedState();
        java.time.LocalDate localDate69 = null;
        java.time.LocalDate localDate70 = null;
        java.time.LocalTime localTime71 = null;
        java.time.LocalTime localTime72 = null;
        Model.Room.Booking booking74 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate69, localDate70, localTime71, localTime72, "");
        completedState65.checkOut(booking74);
        java.time.LocalDate localDate79 = null;
        java.time.LocalDate localDate80 = null;
        java.time.LocalTime localTime81 = null;
        java.time.LocalTime localTime82 = null;
        Model.Room.Booking booking84 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate79, localDate80, localTime81, localTime82, "");
        java.lang.String str85 = booking84.getBookingId();
        Model.State.BookingState bookingState86 = null;
        booking84.setState(bookingState86);
        Model.State.CompletedState completedState88 = new Model.State.CompletedState();
        booking84.setState((Model.State.BookingState) completedState88);
        completedState65.checkOut(booking84);
        booking84.performCheckOut();
        java.lang.String str92 = booking84.getBookingId();
        booking84.performCheckIn();
        booking84.performCancel();
        cancelledState0.checkOut(booking84);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "COMPLETED" + "'", str12, "COMPLETED");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "" + "'", str92, "");
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        java.time.LocalDateTime localDateTime2 = null;
        Model.Sensor.OccupancySensorData occupancySensorData3 = new Model.Sensor.OccupancySensorData("", "hi!", localDateTime2);
        java.lang.String str4 = occupancySensorData3.sensorID;
        java.time.LocalDateTime localDateTime5 = occupancySensorData3.getLocalDateTime();
        java.time.LocalDateTime localDateTime6 = occupancySensorData3.getLocalDateTime();
        java.time.LocalDateTime localDateTime7 = occupancySensorData3.dateTime;
        Model.User.StudentUser studentUser14 = new Model.User.StudentUser("hi!", "", "", "src/main/data/users.csv", false, "src/main/data/users.csv");
        Application.SessionData.setCurrentUser((Model.User.User) studentUser14);
        java.lang.String str16 = studentUser14.getId();
        boolean boolean17 = occupancySensorData3.equals((java.lang.Object) studentUser14);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        Model.ServiceRequest.NonEssentialServiceRequest nonEssentialServiceRequest4 = new Model.ServiceRequest.NonEssentialServiceRequest(25, "21", "EECS3311 Course Project Database - Bookings.csv", (int) (short) 0);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
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
        java.time.LocalTime localTime44 = booking42.getEndTime();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CHECKED_IN" + "'", str1, "CHECKED_IN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CHECKED_IN" + "'", str2, "CHECKED_IN");
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "CHECKED_IN" + "'", str17, "CHECKED_IN");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "CHECKED_IN" + "'", str18, "CHECKED_IN");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "CHECKED_IN" + "'", str19, "CHECKED_IN");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNull(localTime30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNull(localTime44);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        Model.User.PartnerUser partnerUser3 = new Model.User.PartnerUser("!Password123", "src/main/data/occupancy_sensor_logs.csv", "29");
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        Repository.RoomRepository roomRepository0 = new Repository.RoomRepository();
        java.lang.String str1 = roomRepository0.generateNextId();
        java.lang.String str2 = roomRepository0.generateNextId();
        Model.Room.Room room4 = roomRepository0.findById("src/main/data/scanid_sensor_logs.csv");
        java.util.List<Model.Room.Room> roomList5 = roomRepository0.findAll();
        java.lang.String str6 = roomRepository0.generateNextId();
        java.util.List<Model.Room.Room> roomList7 = roomRepository0.findAll();
        java.lang.String str8 = roomRepository0.generateNextId();
// flaky "50) test356(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "48" + "'", str1, "48");
// flaky "33) test356(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "48" + "'", str2, "48");
        org.junit.Assert.assertNull(room4);
        org.junit.Assert.assertNotNull(roomList5);
// flaky "19) test356(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "48" + "'", str6, "48");
        org.junit.Assert.assertNotNull(roomList7);
// flaky "14) test356(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "48" + "'", str8, "48");
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
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
        room14.requestEnable();
// flaky "51) test357(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "48" + "'", str1, "48");
// flaky "34) test357(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "48" + "'", str2, "48");
// flaky "20) test357(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "48" + "'", str3, "48");
        org.junit.Assert.assertNull(room5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        Service.SensorService sensorService0 = new Service.SensorService();
        Model.Sensor.Sensor sensor3 = null; // flaky "52) test358(RegressionTest0)": sensorService0.getSensorByRoomID("src/main/data/users.csv", "EECS3311 Course Project Database - Bookings.csv");
        boolean boolean7 = false; // flaky "35) test358(RegressionTest0)": sensorService0.addScanIDSensorData("CANCELLED", "30", "CONFIRMED");
        Model.Sensor.Sensor sensor10 = null; // flaky "21) test358(RegressionTest0)": sensorService0.getSensorByRoomID("jsmith@yorku.ca", "27");
        org.junit.Assert.assertNull(sensor3);
// flaky "15) test358(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(sensor10);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        Model.ServiceRequest.SensorEssentialServiceRequest sensorEssentialServiceRequest5 = new Model.ServiceRequest.SensorEssentialServiceRequest(1, "COMPLETED", "Service.AuthenticationException: ", (int) 'a', (int) (short) -1);
        sensorEssentialServiceRequest5.assignRoomID(100);
        java.lang.String str8 = sensorEssentialServiceRequest5.getStatus();
        sensorEssentialServiceRequest5.isEssential = true;
        int int11 = sensorEssentialServiceRequest5.getServiceRequestID();
        boolean boolean12 = sensorEssentialServiceRequest5.isEssential();
        sensorEssentialServiceRequest5.setDescription("27");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Service.AuthenticationException: " + "'", str8, "Service.AuthenticationException: ");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        java.time.LocalTime localTime5 = null;
        java.time.LocalTime localTime6 = null;
        Model.Room.Booking booking8 = new Model.Room.Booking("EECS3311 Course Project Database - Bookings.csv", "38", "EECS3311 Course Project Database - Rooms.csv", localDate3, localDate4, localTime5, localTime6, "");
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        Repository.BookingRepository bookingRepository0 = Repository.BookingRepository.getInstance();
        java.util.List<Model.Room.Booking> bookingList1 = bookingRepository0.findAll();
        java.util.List<Model.Room.Booking> bookingList2 = bookingRepository0.findAll();
        Model.Room.Booking booking4 = bookingRepository0.findById("");
        java.time.LocalDate localDate5 = booking4.getEndDate();
        org.junit.Assert.assertNotNull(bookingRepository0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertNotNull(bookingList2);
        org.junit.Assert.assertNotNull(booking4);
        org.junit.Assert.assertNull(localDate5);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        Service.AuthenticationService authenticationService0 = new Service.AuthenticationService();
        boolean boolean2 = authenticationService0.properEmail("4");
        boolean boolean4 = authenticationService0.properEmail("EECS3311 Course Project Database - Bookings.csv");
        boolean boolean6 = authenticationService0.isYorkEmail("1");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        Database.Database database0 = Database.Database.getInstance();
        java.lang.String str1 = database0.getRoomCsvPath();
        java.lang.String str2 = database0.getOccupancySensorLogsPath();
        java.lang.String str3 = database0.getBookingCsvPath();
        java.lang.String str4 = database0.getSensorsCsvPath();
        java.lang.String str5 = database0.getSensorsCsvPath();
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EECS3311 Course Project Database - Rooms.csv" + "'", str1, "EECS3311 Course Project Database - Rooms.csv");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "src/main/data/occupancy_sensor_logs.csv" + "'", str2, "src/main/data/occupancy_sensor_logs.csv");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EECS3311 Course Project Database - Bookings.csv" + "'", str3, "EECS3311 Course Project Database - Bookings.csv");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "src/main/data/sensors.csv" + "'", str4, "src/main/data/sensors.csv");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "src/main/data/sensors.csv" + "'", str5, "src/main/data/sensors.csv");
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
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
        Model.ServiceRequest.SensorEssentialServiceRequest sensorEssentialServiceRequest43 = new Model.ServiceRequest.SensorEssentialServiceRequest(1, "COMPLETED", "Service.AuthenticationException: ", (int) 'a', (int) (short) -1);
        sensorEssentialServiceRequest43.assignRoomID(100);
        java.lang.String str46 = sensorEssentialServiceRequest43.getStatus();
        sensorEssentialServiceRequest43.assignRoomID((int) (byte) 1);
        sensorEssentialServiceRequest43.setStatus("CHECKED_IN");
        serviceRequestRepository0.updateExistingServiceRequest((Model.ServiceRequest.ServiceRequest) sensorEssentialServiceRequest43);
        sensorEssentialServiceRequest43.setDescription("24");
        org.junit.Assert.assertNotNull(serviceRequestRepository0);
        org.junit.Assert.assertNotNull(serviceRequestRepository1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Service.AuthenticationException: " + "'", str10, "Service.AuthenticationException: ");
        org.junit.Assert.assertNotNull(intMap21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Service.AuthenticationException: " + "'", str32, "Service.AuthenticationException: ");
        org.junit.Assert.assertNotNull(serviceRequest37);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Service.AuthenticationException: " + "'", str46, "Service.AuthenticationException: ");
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
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
        roomService16.disableRoom("32");
        org.junit.Assert.assertNotNull(evaluateRoomMaintenanceRelationshipService0);
        org.junit.Assert.assertNull(booking7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(roomService16);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        Model.State.RoomDisabledState roomDisabledState0 = new Model.State.RoomDisabledState();
        boolean boolean1 = roomDisabledState0.isBookable();
        Model.State.RoomReadyForEnableState roomReadyForEnableState2 = new Model.State.RoomReadyForEnableState();
        boolean boolean3 = roomReadyForEnableState2.isBookable();
        Model.Room.Room room8 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        roomReadyForEnableState2.disable(room8);
        roomDisabledState0.enable(room8);
        Model.State.RoomDisabledState roomDisabledState11 = new Model.State.RoomDisabledState();
        Model.State.RoomDisabledState roomDisabledState12 = new Model.State.RoomDisabledState();
        boolean boolean13 = roomDisabledState12.isBookable();
        boolean boolean14 = roomDisabledState12.isBookable();
        boolean boolean15 = roomDisabledState12.isBookable();
        Model.Room.Room room20 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        boolean boolean21 = room20.isAvailable();
        roomDisabledState12.maintain(room20);
        roomDisabledState11.maintain(room20);
        Model.State.RoomDisabledState roomDisabledState24 = new Model.State.RoomDisabledState();
        boolean boolean25 = roomDisabledState24.isBookable();
        boolean boolean26 = roomDisabledState24.isBookable();
        boolean boolean27 = roomDisabledState24.isBookable();
        Model.Room.Room room32 = new Model.Room.Room("COMPLETED", "hi!", (double) 100.0f, "2");
        roomDisabledState24.maintain(room32);
        Model.Room.AdminRoomProxy adminRoomProxy34 = new Model.Room.AdminRoomProxy(room32);
        roomDisabledState11.enable(room32);
        roomDisabledState0.disable(room32);
        Model.State.RoomEnabledState roomEnabledState37 = new Model.State.RoomEnabledState();
        boolean boolean38 = roomEnabledState37.isBookable();
        Model.State.RoomReadyForEnableState roomReadyForEnableState39 = new Model.State.RoomReadyForEnableState();
        boolean boolean40 = roomReadyForEnableState39.isBookable();
        Model.Room.Room room45 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        roomReadyForEnableState39.disable(room45);
        roomEnabledState37.maintain(room45);
        room45.requestDisable();
        roomDisabledState0.disable(room45);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        Repository.BookingRepository bookingRepository0 = Repository.BookingRepository.getInstance();
        java.util.List<Model.Room.Booking> bookingList1 = bookingRepository0.findAll();
        Model.State.CheckInState checkInState2 = new Model.State.CheckInState();
        java.lang.String str3 = checkInState2.getStatus();
        java.lang.String str4 = checkInState2.getStatus();
        Model.State.CompletedState completedState5 = new Model.State.CompletedState();
        java.time.LocalDate localDate9 = null;
        java.time.LocalDate localDate10 = null;
        java.time.LocalTime localTime11 = null;
        java.time.LocalTime localTime12 = null;
        Model.Room.Booking booking14 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate9, localDate10, localTime11, localTime12, "");
        completedState5.checkOut(booking14);
        java.time.LocalDate localDate16 = booking14.getEndDate();
        checkInState2.cancel(booking14);
        Model.State.CheckInState checkInState18 = new Model.State.CheckInState();
        java.lang.String str19 = checkInState18.getStatus();
        java.lang.String str20 = checkInState18.getStatus();
        java.lang.String str21 = checkInState18.getStatus();
        java.time.LocalDate localDate25 = null;
        java.time.LocalDate localDate26 = null;
        java.time.LocalTime localTime27 = null;
        java.time.LocalTime localTime28 = null;
        Model.Room.Booking booking30 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate25, localDate26, localTime27, localTime28, "");
        java.lang.String str31 = booking30.getBookingId();
        java.time.LocalTime localTime32 = booking30.getStartTime();
        checkInState18.cancel(booking30);
        java.lang.String str34 = booking30.getUserId();
        checkInState2.cancel(booking30);
        bookingRepository0.save(booking30);
        org.junit.Assert.assertNotNull(bookingRepository0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CHECKED_IN" + "'", str3, "CHECKED_IN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CHECKED_IN" + "'", str4, "CHECKED_IN");
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "CHECKED_IN" + "'", str19, "CHECKED_IN");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "CHECKED_IN" + "'", str20, "CHECKED_IN");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "CHECKED_IN" + "'", str21, "CHECKED_IN");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNull(localTime32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
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
        Model.ServiceRequest.SensorEssentialServiceRequest sensorEssentialServiceRequest29 = new Model.ServiceRequest.SensorEssentialServiceRequest(1, "COMPLETED", "Service.AuthenticationException: ", (int) 'a', (int) (short) -1);
        sensorEssentialServiceRequest29.assignRoomID(100);
        java.lang.String str32 = sensorEssentialServiceRequest29.getStatus();
        sensorEssentialServiceRequest29.isEssential = true;
        int int35 = sensorEssentialServiceRequest29.getServiceRequestID();
        boolean boolean36 = sensorEssentialServiceRequest29.isEssential();
        Model.ServiceRequest.ServiceRequest serviceRequest37 = serviceRequestRepository0.addServiceRequest((Model.ServiceRequest.ServiceRequest) sensorEssentialServiceRequest29);
        java.util.ArrayList<Model.ServiceRequest.ServiceRequest> serviceRequestList39 = serviceRequestRepository0.loadAllServiceRequestsForRoom(108);
        org.junit.Assert.assertNotNull(serviceRequestRepository0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Service.AuthenticationException: " + "'", str9, "Service.AuthenticationException: ");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Service.AuthenticationException: " + "'", str19, "Service.AuthenticationException: ");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "COMPLETED" + "'", str22, "COMPLETED");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Service.AuthenticationException: " + "'", str32, "Service.AuthenticationException: ");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(serviceRequest37);
        org.junit.Assert.assertNotNull(serviceRequestList39);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        Repository.SensorRepository sensorRepository0 = new Repository.SensorRepository();
        java.util.List<Model.Sensor.OccupancySensorData> occupancySensorDataList1 = sensorRepository0.getOccupancySensorLogsList();
        java.time.LocalDateTime localDateTime4 = null;
        Model.Sensor.OccupancySensorData occupancySensorData5 = new Model.Sensor.OccupancySensorData("", "hi!", localDateTime4);
        java.time.LocalDateTime localDateTime6 = null;
        occupancySensorData5.dateTime = localDateTime6;
        boolean boolean8 = false; // flaky "53) test369(RegressionTest0)": sensorRepository0.writeOccupancySensorLog(occupancySensorData5);
        java.time.LocalDateTime localDateTime9 = occupancySensorData5.dateTime;
        java.time.LocalDateTime localDateTime10 = null;
        occupancySensorData5.dateTime = localDateTime10;
        java.time.LocalDateTime localDateTime12 = null;
        occupancySensorData5.dateTime = localDateTime12;
// flaky "36) test369(RegressionTest0)":         org.junit.Assert.assertNotNull(occupancySensorDataList1);
// flaky "22) test369(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(localDateTime9);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        Model.User.PartnerUser partnerUser6 = new Model.User.PartnerUser("48", "14", "25", "jsmith@yorku.ca", false, "src/main/data/users.csv");
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        Database.Database database0 = Database.Database.getInstance();
        java.lang.String str1 = database0.getRoomCsvPath();
        java.lang.String str2 = database0.getOccupancySensorLogsPath();
        java.lang.String str3 = database0.getBookingCsvPath();
        java.lang.String str4 = database0.getRoomCsvPath();
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EECS3311 Course Project Database - Rooms.csv" + "'", str1, "EECS3311 Course Project Database - Rooms.csv");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "src/main/data/occupancy_sensor_logs.csv" + "'", str2, "src/main/data/occupancy_sensor_logs.csv");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EECS3311 Course Project Database - Bookings.csv" + "'", str3, "EECS3311 Course Project Database - Bookings.csv");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EECS3311 Course Project Database - Rooms.csv" + "'", str4, "EECS3311 Course Project Database - Rooms.csv");
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
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
        nonEssentialServiceRequest25.setStatus("CANCELLED");
        java.lang.String str30 = nonEssentialServiceRequest25.getDescription();
        org.junit.Assert.assertNotNull(serviceRequestRepository0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Service.AuthenticationException: " + "'", str9, "Service.AuthenticationException: ");
        org.junit.Assert.assertNotNull(intMap20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(serviceRequest27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "EECS3311 Course Project Database - Rooms.csv" + "'", str30, "EECS3311 Course Project Database - Rooms.csv");
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        Service.RoomService roomService0 = new Service.RoomService();
        roomService0.update(true, (int) (short) 10);
        Model.Room.Booking booking5 = roomService0.getBookingDetails("src/main/data/users.csv");
        boolean boolean7 = roomService0.cancelBooking("hi!");
        Controller.AddRoomController addRoomController8 = new Controller.AddRoomController(roomService0);
        roomService0.enableRoom("COMPLETED");
        java.lang.String str14 = roomService0.createRoom("", 0.0d, "9");
        boolean boolean16 = roomService0.performCheckIn("23");
        org.junit.Assert.assertNull(booking5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky "54) test373(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "50" + "'", str14, "50");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        Service.AuthenticationService authenticationService0 = new Service.AuthenticationService();
        Service.UserService userService4 = new Service.UserService();
        Model.User.AccountType accountType5 = Model.User.AccountType.PARTNER;
        Model.User.User user9 = userService4.createUser(accountType5, "src/main/data/scanid_sensor_logs.csv", "CHECKED_IN", "EECS3311 Course Project Database - Rooms.csv");
        double double10 = accountType5.getHourlyRate();
        // The following exception was thrown during execution in test generation
        try {
            Model.User.User user11 = authenticationService0.register("28", "17", "25", accountType5);
            org.junit.Assert.fail("Expected exception of type Service.AuthenticationException; message: Please enter a valid email address.");
        } catch (Service.AuthenticationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + accountType5 + "' != '" + Model.User.AccountType.PARTNER + "'", accountType5.equals(Model.User.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(user9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        Model.Payment.Payment payment2 = new Model.Payment.Payment("CONFIRMED", 20.0d);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        Service.SensorService sensorService0 = new Service.SensorService();
        Model.Sensor.Sensor sensor3 = null; // flaky "55) test376(RegressionTest0)": sensorService0.getSensorByRoomID("src/main/data/users.csv", "EECS3311 Course Project Database - Bookings.csv");
        boolean boolean7 = false; // flaky "37) test376(RegressionTest0)": sensorService0.addScanIDSensorData("EECS3311 Course Project Database - Rooms.csv", "src/main/data/scanid_sensor_logs.csv", "hi!");
        boolean boolean11 = sensorService0.addSensor("25", "30", "27");
        org.junit.Assert.assertNull(sensor3);
// flaky "23) test376(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        View.CheckinView checkinView0 = null;
        Service.RoomService roomService1 = new Service.RoomService();
        roomService1.maintenanceCompleted("");
        boolean boolean5 = roomService1.performCheckOut("");
        roomService1.maintenanceCompleted("1");
        boolean boolean9 = roomService1.performCheckOut("CHECKED_IN");
        Service.RoomService roomService10 = roomService1.getInstance();
        java.lang.String str14 = roomService10.createRoom("EECS3311 Course Project Database - Bookings.csv", (double) 100L, "hi!");
        Service.SensorService sensorService15 = new Service.SensorService();
        Model.Sensor.Sensor sensor18 = null; // flaky "56) test377(RegressionTest0)": sensorService15.getSensorByRoomID("src/main/data/users.csv", "EECS3311 Course Project Database - Bookings.csv");
        boolean boolean22 = false; // flaky "38) test377(RegressionTest0)": sensorService15.addScanIDSensorData("CANCELLED", "30", "CONFIRMED");
        // The following exception was thrown during execution in test generation
        try {
            Controller.CheckinController checkinController23 = new Controller.CheckinController(checkinView0, roomService10, sensorService15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"backButton\" because \"this.view\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(roomService10);
// flaky "24) test377(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "51" + "'", str14, "51");
        org.junit.Assert.assertNull(sensor18);
// flaky "16) test377(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        Model.User.PartnerUser partnerUser6 = new Model.User.PartnerUser("9", "Service.AuthenticationException: ", "Service.AuthenticationException: ", "7", true, "1");
        java.lang.String str7 = partnerUser6.getPassword();
        java.lang.String str8 = partnerUser6.getPassword();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "7" + "'", str7, "7");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "7" + "'", str8, "7");
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        Repository.RoomRepository roomRepository0 = new Repository.RoomRepository();
        java.lang.String str1 = roomRepository0.generateNextId();
        java.lang.String str2 = roomRepository0.generateNextId();
        Model.Room.Room room4 = roomRepository0.findById("src/main/data/scanid_sensor_logs.csv");
        Model.State.RoomReadyForEnableState roomReadyForEnableState5 = new Model.State.RoomReadyForEnableState();
        Model.State.RoomEnabledState roomEnabledState6 = new Model.State.RoomEnabledState();
        boolean boolean7 = roomEnabledState6.isBookable();
        Model.State.RoomReadyForEnableState roomReadyForEnableState8 = new Model.State.RoomReadyForEnableState();
        boolean boolean9 = roomReadyForEnableState8.isBookable();
        Model.Room.Room room14 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        roomReadyForEnableState8.disable(room14);
        roomEnabledState6.maintain(room14);
        roomReadyForEnableState5.maintain(room14);
        room14.requestDisable();
        roomRepository0.save(room14);
// flaky "57) test379(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "54" + "'", str1, "54");
// flaky "39) test379(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "54" + "'", str2, "54");
        org.junit.Assert.assertNull(room4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        Model.User.StaffUser staffUser3 = new Model.User.StaffUser("hi!", "", "hi!");
        boolean boolean4 = staffUser3.isVerified();
        Application.SessionData.setCurrentUser((Model.User.User) staffUser3);
        double double6 = staffUser3.getHourlyRate();
        staffUser3.setEmail("4");
        staffUser3.setPassword("14");
        java.lang.String str11 = staffUser3.getId();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
// flaky "58) test380(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "c5d6147b-72fd-41bc-bac6-dce34fb55c3c" + "'", str11, "c5d6147b-72fd-41bc-bac6-dce34fb55c3c");
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
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
        Model.State.CompletedState completedState17 = new Model.State.CompletedState();
        java.time.LocalDate localDate21 = null;
        java.time.LocalDate localDate22 = null;
        java.time.LocalTime localTime23 = null;
        java.time.LocalTime localTime24 = null;
        Model.Room.Booking booking26 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate21, localDate22, localTime23, localTime24, "");
        completedState17.checkOut(booking26);
        java.time.LocalDate localDate31 = null;
        java.time.LocalDate localDate32 = null;
        java.time.LocalTime localTime33 = null;
        java.time.LocalTime localTime34 = null;
        Model.Room.Booking booking36 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate31, localDate32, localTime33, localTime34, "");
        completedState17.checkOut(booking36);
        booking16.setState((Model.State.BookingState) completedState17);
        java.time.LocalTime localTime39 = booking16.getStartTime();
        org.junit.Assert.assertNotNull(bookingRepository0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertNotNull(booking16);
        org.junit.Assert.assertNull(localTime39);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        Model.User.PartnerUser partnerUser6 = new Model.User.PartnerUser("", "hi!", "", "", true, "hi!");
        partnerUser6.setName("4");
        partnerUser6.setName("54");
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        Application.SessionData.clear();
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
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
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        Model.Sensor.ScanIDSensor scanIDSensor4 = new Model.Sensor.ScanIDSensor("", "8", "COMPLETED", "PENDING");
        scanIDSensor4.setOccupied(true);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        Model.User.PartnerUser partnerUser6 = new Model.User.PartnerUser("42", "14", "30", "38", false, "8903a9bb-0838-41ef-9768-131faa20dcdc");
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        Model.User.StaffUser staffUser3 = new Model.User.StaffUser("hi!", "", "hi!");
        staffUser3.setEmail("COMPLETED");
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        Repository.ServiceRequestRepository serviceRequestRepository0 = Repository.ServiceRequestRepository.getInstance();
        Model.ServiceRequest.SensorEssentialServiceRequest sensorEssentialServiceRequest6 = new Model.ServiceRequest.SensorEssentialServiceRequest(1, "COMPLETED", "Service.AuthenticationException: ", (int) 'a', (int) (short) -1);
        java.lang.String str7 = sensorEssentialServiceRequest6.getStatus();
        Model.ServiceRequest.ServiceRequest serviceRequest8 = serviceRequestRepository0.addServiceRequest((Model.ServiceRequest.ServiceRequest) sensorEssentialServiceRequest6);
        sensorEssentialServiceRequest6.assignRoomID((int) ' ');
        int int11 = sensorEssentialServiceRequest6.getRoomID();
        org.junit.Assert.assertNotNull(serviceRequestRepository0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Service.AuthenticationException: " + "'", str7, "Service.AuthenticationException: ");
        org.junit.Assert.assertNotNull(serviceRequest8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
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
        roomEnabledState0.enable(room21);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        Model.Sensor.ScanIDSensor scanIDSensor4 = new Model.Sensor.ScanIDSensor("3", "src/main/data/MaintenanceRequests.csv", "EECS3311 Course Project Database - Rooms.csv", "");
        scanIDSensor4.setRoomID("jsmith@yorku.ca");
        java.lang.String str7 = scanIDSensor4.getStatus();
        java.lang.String str8 = scanIDSensor4.getStatus();
        scanIDSensor4.setOccupied(false);
        java.lang.String str11 = scanIDSensor4.getStatus();
        scanIDSensor4.setOccupied(false);
        scanIDSensor4.setOccupied(false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EECS3311 Course Project Database - Rooms.csv" + "'", str7, "EECS3311 Course Project Database - Rooms.csv");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EECS3311 Course Project Database - Rooms.csv" + "'", str8, "EECS3311 Course Project Database - Rooms.csv");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "EECS3311 Course Project Database - Rooms.csv" + "'", str11, "EECS3311 Course Project Database - Rooms.csv");
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        Repository.ServiceRequestRepository serviceRequestRepository0 = null;
        Service.EditMaintenanceRequestService editMaintenanceRequestService1 = new Service.EditMaintenanceRequestService(serviceRequestRepository0);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        Model.State.RoomDisabledState roomDisabledState0 = new Model.State.RoomDisabledState();
        boolean boolean1 = roomDisabledState0.isBookable();
        boolean boolean2 = roomDisabledState0.isBookable();
        Repository.RoomRepository roomRepository3 = new Repository.RoomRepository();
        java.lang.String str4 = roomRepository3.generateNextId();
        java.lang.String str5 = roomRepository3.generateNextId();
        java.lang.String str6 = roomRepository3.generateNextId();
        java.util.List<Model.Room.Room> roomList7 = roomRepository3.findAll();
        Model.State.RoomDisabledState roomDisabledState8 = new Model.State.RoomDisabledState();
        boolean boolean9 = roomDisabledState8.isBookable();
        Model.Room.Room room10 = null;
        roomDisabledState8.disable(room10);
        Model.State.RoomDisabledState roomDisabledState12 = new Model.State.RoomDisabledState();
        boolean boolean13 = roomDisabledState12.isBookable();
        boolean boolean14 = roomDisabledState12.isBookable();
        boolean boolean15 = roomDisabledState12.isBookable();
        Model.Room.Room room20 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        boolean boolean21 = room20.isAvailable();
        roomDisabledState12.maintain(room20);
        roomDisabledState8.maintain(room20);
        roomRepository3.save(room20);
        roomDisabledState0.maintain(room20);
        Model.State.RoomReadyForEnableState roomReadyForEnableState26 = new Model.State.RoomReadyForEnableState();
        boolean boolean27 = roomReadyForEnableState26.isBookable();
        Model.Room.Room room32 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        roomReadyForEnableState26.disable(room32);
        roomDisabledState0.disable(room32);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "59) test392(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "54" + "'", str4, "54");
// flaky "40) test392(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "54" + "'", str5, "54");
// flaky "25) test392(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "54" + "'", str6, "54");
        org.junit.Assert.assertNotNull(roomList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        Service.SubmitServiceRequestService submitServiceRequestService0 = Service.SubmitServiceRequestService.getInstance();
        java.util.ArrayList<Model.ServiceRequest.ServiceRequest> serviceRequestList5 = submitServiceRequestService0.submitServiceRequest(100, "", false, "4");
        org.junit.Assert.assertNotNull(submitServiceRequestService0);
        org.junit.Assert.assertNotNull(serviceRequestList5);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        View.PaymentView paymentView0 = null;
        Service.RoomService roomService1 = new Service.RoomService();
        roomService1.update(true, (int) (short) 10);
        Model.Room.Booking booking6 = roomService1.getBookingDetails("src/main/data/users.csv");
        boolean boolean8 = roomService1.cancelBooking("hi!");
        roomService1.disableRoom("hi!");
        roomService1.disableRoom("1");
        Model.Room.Booking booking14 = roomService1.getBookingDetails("hi!");
        roomService1.enableRoom("src/main/data/MaintenanceRequests.csv");
        // The following exception was thrown during execution in test generation
        try {
            Controller.PaymentViewController paymentViewController17 = new Controller.PaymentViewController(paymentView0, roomService1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"backButton\" because \"this.view\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(booking6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(booking14);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
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
        java.time.LocalDate localDate14 = booking8.getStartDate();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(localDate14);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        Service.AuthenticationService authenticationService0 = new Service.AuthenticationService();
        boolean boolean2 = authenticationService0.properEmail("4");
        boolean boolean4 = authenticationService0.properEmail("EECS3311 Course Project Database - Bookings.csv");
        authenticationService0.logout();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        Model.User.PartnerUser partnerUser3 = new Model.User.PartnerUser("12", "512a0e7c-3268-4bb7-bc77-c6d32a14e20d", "28");
        java.lang.String str4 = partnerUser3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PARTNER" + "'", str4, "PARTNER");
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        Repository.PaymentRepository paymentRepository0 = Repository.PaymentRepository.getInstance();
        java.util.List<Model.Payment.Payment> paymentList1 = paymentRepository0.findAll();
        Model.Payment.Payment payment4 = new Model.Payment.Payment("EECS3311 Course Project Database - Rooms.csv", (double) (-1));
        paymentRepository0.save(payment4);
        org.junit.Assert.assertNotNull(paymentRepository0);
        org.junit.Assert.assertNotNull(paymentList1);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        Service.SubmitServiceRequestService submitServiceRequestService0 = new Service.SubmitServiceRequestService();
        java.util.ArrayList<Model.ServiceRequest.ServiceRequest> serviceRequestList5 = submitServiceRequestService0.submitServiceRequest((int) '4', "COMPLETED", true, "1");
        org.junit.Assert.assertNotNull(serviceRequestList5);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        Model.User.StaffUser staffUser6 = new Model.User.StaffUser("25", "", "EECS3311 Course Project Database - Rooms.csv", "", true, "43");
        double double7 = staffUser6.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        Model.State.RoomDisabledState roomDisabledState0 = new Model.State.RoomDisabledState();
        boolean boolean1 = roomDisabledState0.isBookable();
        boolean boolean2 = roomDisabledState0.isBookable();
        boolean boolean3 = roomDisabledState0.isBookable();
        Model.Room.Room room8 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        boolean boolean9 = room8.isAvailable();
        roomDisabledState0.maintain(room8);
        boolean boolean11 = roomDisabledState0.isBookable();
        Model.State.RoomDisabledState roomDisabledState12 = new Model.State.RoomDisabledState();
        boolean boolean13 = roomDisabledState12.isBookable();
        boolean boolean14 = roomDisabledState12.isBookable();
        Model.State.RoomEnabledState roomEnabledState15 = new Model.State.RoomEnabledState();
        Model.Room.Room room20 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        boolean boolean21 = room20.isAvailable();
        Model.Room.AdminRoomProxy adminRoomProxy22 = new Model.Room.AdminRoomProxy(room20);
        roomEnabledState15.disable(room20);
        roomDisabledState12.enable(room20);
        Model.State.RoomDisabledState roomDisabledState25 = new Model.State.RoomDisabledState();
        boolean boolean26 = roomDisabledState25.isBookable();
        boolean boolean27 = roomDisabledState25.isBookable();
        Model.State.RoomEnabledState roomEnabledState28 = new Model.State.RoomEnabledState();
        Model.Room.Room room33 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        boolean boolean34 = room33.isAvailable();
        Model.Room.AdminRoomProxy adminRoomProxy35 = new Model.Room.AdminRoomProxy(room33);
        roomEnabledState28.disable(room33);
        roomDisabledState25.enable(room33);
        roomDisabledState12.maintain(room33);
        roomDisabledState0.enable(room33);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
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
        Model.ServiceRequest.SensorEssentialServiceRequest sensorEssentialServiceRequest29 = new Model.ServiceRequest.SensorEssentialServiceRequest(1, "COMPLETED", "Service.AuthenticationException: ", (int) 'a', (int) (short) -1);
        sensorEssentialServiceRequest29.assignRoomID(100);
        java.lang.String str32 = sensorEssentialServiceRequest29.getStatus();
        sensorEssentialServiceRequest29.isEssential = true;
        int int35 = sensorEssentialServiceRequest29.getServiceRequestID();
        boolean boolean36 = sensorEssentialServiceRequest29.isEssential();
        Model.ServiceRequest.ServiceRequest serviceRequest37 = serviceRequestRepository0.addServiceRequest((Model.ServiceRequest.ServiceRequest) sensorEssentialServiceRequest29);
        Repository.ServiceRequestRepository serviceRequestRepository38 = Repository.ServiceRequestRepository.getInstance();
        Repository.ServiceRequestRepository serviceRequestRepository39 = Repository.ServiceRequestRepository.getInstance();
        Repository.ServiceRequestRepository serviceRequestRepository40 = Repository.ServiceRequestRepository.getInstance();
        Model.ServiceRequest.SensorEssentialServiceRequest sensorEssentialServiceRequest46 = new Model.ServiceRequest.SensorEssentialServiceRequest(1, "COMPLETED", "Service.AuthenticationException: ", (int) 'a', (int) (short) -1);
        sensorEssentialServiceRequest46.assignRoomID(100);
        java.lang.String str49 = sensorEssentialServiceRequest46.getStatus();
        serviceRequestRepository40.updateExistingServiceRequest((Model.ServiceRequest.ServiceRequest) sensorEssentialServiceRequest46);
        Model.ServiceRequest.SensorEssentialServiceRequest sensorEssentialServiceRequest56 = new Model.ServiceRequest.SensorEssentialServiceRequest((int) (short) 100, "CHECKED_IN", "EECS3311 Course Project Database - Bookings.csv", 0, (int) (byte) 0);
        serviceRequestRepository40.updateExistingServiceRequest((Model.ServiceRequest.ServiceRequest) sensorEssentialServiceRequest56);
        java.util.Map<java.lang.Integer, java.util.List<Model.ServiceRequest.ServiceRequest>> intMap60 = serviceRequestRepository40.parseCsvFileToMap("EECS3311 Course Project Database - Bookings.csv", true);
        boolean boolean62 = serviceRequestRepository39.saveMapToCsv(intMap60, "Service.AuthenticationException: ");
        boolean boolean64 = serviceRequestRepository38.saveMapToCsv(intMap60, "2");
        boolean boolean66 = serviceRequestRepository0.saveMapToCsv(intMap60, "17");
        org.junit.Assert.assertNotNull(serviceRequestRepository0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Service.AuthenticationException: " + "'", str9, "Service.AuthenticationException: ");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Service.AuthenticationException: " + "'", str19, "Service.AuthenticationException: ");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "COMPLETED" + "'", str22, "COMPLETED");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Service.AuthenticationException: " + "'", str32, "Service.AuthenticationException: ");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(serviceRequest37);
        org.junit.Assert.assertNotNull(serviceRequestRepository38);
        org.junit.Assert.assertNotNull(serviceRequestRepository39);
        org.junit.Assert.assertNotNull(serviceRequestRepository40);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Service.AuthenticationException: " + "'", str49, "Service.AuthenticationException: ");
        org.junit.Assert.assertNotNull(intMap60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        Model.User.PartnerUser partnerUser6 = new Model.User.PartnerUser("jsmith@yorku.ca", "READY_FOR_ENABLE", "src/main/data/occupancy_sensor_logs.csv", "3", true, "1");
        java.lang.String str7 = partnerUser6.getPassword();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "3" + "'", str7, "3");
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
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
        Service.RoomService roomService16 = new Service.RoomService();
        roomService16.maintenanceCompleted("");
        boolean boolean20 = roomService16.performCheckOut("");
        roomService16.maintenanceCompleted("1");
        boolean boolean24 = roomService16.performCheckOut("CHECKED_IN");
        Service.RoomService roomService25 = roomService16.getInstance();
        evaluateRoomMaintenanceRelationshipService0.removeObserver((Model.Room.Observer) roomService16);
        evaluateRoomMaintenanceRelationshipService0.evaluateRoomMaintenanceRelationship((int) (short) 0);
        evaluateRoomMaintenanceRelationshipService0.notifyObservers();
        org.junit.Assert.assertNotNull(evaluateRoomMaintenanceRelationshipService0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(roomService11);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(roomService25);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        Service.AuthenticationException authenticationException1 = new Service.AuthenticationException("");
        java.lang.Throwable[] throwableArray2 = authenticationException1.getSuppressed();
        Service.AuthenticationException authenticationException4 = new Service.AuthenticationException("Service.AuthenticationException: ");
        authenticationException1.addSuppressed((java.lang.Throwable) authenticationException4);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        Service.RoomService roomService0 = new Service.RoomService();
        roomService0.update(true, (int) (short) 10);
        boolean boolean5 = roomService0.performCheckOut("hi!");
        Model.Room.Booking booking7 = roomService0.getBookingDetails("20");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(booking7);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        Model.User.StaffUser staffUser6 = new Model.User.StaffUser("John Smith", "17", "EECS3311 Course Project Database - payments.csv", "8", true, "src/main/data/users.csv");
        boolean boolean8 = staffUser6.checkPassword("");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
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
        Model.Room.Booking booking41 = bookingRepository0.findById("EECS3311 Course Project Database - Rooms.csv");
        org.junit.Assert.assertNotNull(bookingRepository0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "COMPLETED" + "'", str13, "COMPLETED");
        org.junit.Assert.assertNull(booking38);
        org.junit.Assert.assertNotNull(bookingList39);
        org.junit.Assert.assertNull(booking41);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        java.time.LocalDateTime localDateTime2 = null;
        Model.Sensor.OccupancySensorData occupancySensorData3 = new Model.Sensor.OccupancySensorData("", "hi!", localDateTime2);
        java.lang.String str4 = occupancySensorData3.sensorID;
        java.time.LocalDateTime localDateTime5 = occupancySensorData3.getLocalDateTime();
        java.time.LocalDateTime localDateTime6 = occupancySensorData3.getLocalDateTime();
        java.time.LocalDateTime localDateTime7 = null;
        occupancySensorData3.dateTime = localDateTime7;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertNull(localDateTime6);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        View.AddSensorView addSensorView0 = null;
        Service.SensorService sensorService1 = new Service.SensorService();
        Model.Sensor.Sensor sensor4 = null; // flaky "60) test410(RegressionTest0)": sensorService1.getSensorByRoomID("src/main/data/users.csv", "EECS3311 Course Project Database - Bookings.csv");
        boolean boolean8 = false; // flaky "41) test410(RegressionTest0)": sensorService1.addScanIDSensorData("EECS3311 Course Project Database - Rooms.csv", "src/main/data/scanid_sensor_logs.csv", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            Controller.AddSensorController addSensorController9 = new Controller.AddSensorController(addSensorView0, sensorService1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"backButton\" because \"this.view\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sensor4);
// flaky "26) test410(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        Model.State.RoomReadyForEnableState roomReadyForEnableState0 = new Model.State.RoomReadyForEnableState();
        Model.State.RoomEnabledState roomEnabledState1 = new Model.State.RoomEnabledState();
        boolean boolean2 = roomEnabledState1.isBookable();
        Model.State.RoomReadyForEnableState roomReadyForEnableState3 = new Model.State.RoomReadyForEnableState();
        boolean boolean4 = roomReadyForEnableState3.isBookable();
        Model.Room.Room room9 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        roomReadyForEnableState3.disable(room9);
        roomEnabledState1.maintain(room9);
        roomReadyForEnableState0.maintain(room9);
        boolean boolean13 = room9.isAvailable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        Model.User.StudentUser studentUser6 = new Model.User.StudentUser("hi!", "", "", "src/main/data/users.csv", false, "src/main/data/users.csv");
        java.lang.String str7 = studentUser6.getEmail();
        Application.SessionData.setCurrentUser((Model.User.User) studentUser6);
        java.lang.String str9 = studentUser6.getRole();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "src/main/data/users.csv" + "'", str9, "src/main/data/users.csv");
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        Model.User.StudentUser studentUser3 = new Model.User.StudentUser("34", "512a0e7c-3268-4bb7-bc77-c6d32a14e20d", "50");
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
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
        evaluateRoomMaintenanceRelationshipService16.evaluateRoomMaintenanceRelationship((-1));
        Service.EvaluateRoomMaintenanceRelationshipService evaluateRoomMaintenanceRelationshipService20 = Service.EvaluateRoomMaintenanceRelationshipService.getInstance();
        evaluateRoomMaintenanceRelationshipService20.notifyObservers();
        Service.RoomService roomService22 = new Service.RoomService();
        roomService22.update(true, (int) (short) 10);
        Model.Room.Booking booking27 = roomService22.getBookingDetails("src/main/data/users.csv");
        boolean boolean29 = roomService22.cancelBooking("hi!");
        Controller.AddRoomController addRoomController30 = new Controller.AddRoomController(roomService22);
        evaluateRoomMaintenanceRelationshipService20.removeObserver((Model.Room.Observer) roomService22);
        Service.RoomService roomService32 = new Service.RoomService();
        roomService32.maintenanceCompleted("");
        evaluateRoomMaintenanceRelationshipService20.removeObserver((Model.Room.Observer) roomService32);
        evaluateRoomMaintenanceRelationshipService16.registerObserver((Model.Room.Observer) roomService32);
        evaluateRoomMaintenanceRelationshipService0.registerObserver((Model.Room.Observer) roomService32);
        boolean boolean38 = evaluateRoomMaintenanceRelationshipService0.isAnyEssentialMaintenanceRequestPending();
        org.junit.Assert.assertNotNull(evaluateRoomMaintenanceRelationshipService0);
        org.junit.Assert.assertNull(booking7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(evaluateRoomMaintenanceRelationshipService16);
        org.junit.Assert.assertNotNull(evaluateRoomMaintenanceRelationshipService20);
        org.junit.Assert.assertNull(booking27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        Model.Sensor.ScanIDSensor scanIDSensor4 = new Model.Sensor.ScanIDSensor("4", "1", "EECS3311 Course Project Database - Rooms.csv", "src/main/data/MaintenanceRequests.csv");
        scanIDSensor4.setOccupied(false);
        java.lang.String str7 = scanIDSensor4.getType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1" + "'", str7, "1");
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        Service.EvaluateRoomMaintenanceRelationshipService evaluateRoomMaintenanceRelationshipService0 = Service.EvaluateRoomMaintenanceRelationshipService.getInstance();
        evaluateRoomMaintenanceRelationshipService0.notifyObservers();
        evaluateRoomMaintenanceRelationshipService0.evaluateRoomMaintenanceRelationship((-1));
        Service.EvaluateRoomMaintenanceRelationshipService evaluateRoomMaintenanceRelationshipService4 = Service.EvaluateRoomMaintenanceRelationshipService.getInstance();
        evaluateRoomMaintenanceRelationshipService4.notifyObservers();
        Service.RoomService roomService6 = new Service.RoomService();
        roomService6.update(true, (int) (short) 10);
        Model.Room.Booking booking11 = roomService6.getBookingDetails("src/main/data/users.csv");
        boolean boolean13 = roomService6.cancelBooking("hi!");
        Controller.AddRoomController addRoomController14 = new Controller.AddRoomController(roomService6);
        evaluateRoomMaintenanceRelationshipService4.removeObserver((Model.Room.Observer) roomService6);
        Service.RoomService roomService16 = new Service.RoomService();
        roomService16.maintenanceCompleted("");
        evaluateRoomMaintenanceRelationshipService4.removeObserver((Model.Room.Observer) roomService16);
        evaluateRoomMaintenanceRelationshipService0.registerObserver((Model.Room.Observer) roomService16);
        Service.RoomService roomService21 = new Service.RoomService();
        roomService21.update(true, (int) (short) 10);
        java.lang.String str28 = roomService21.createRoom("EECS3311 Course Project Database - Rooms.csv", (double) 0.0f, "");
        java.lang.String str32 = roomService21.createRoom("src/main/data/occupancy_sensor_logs.csv", (double) 0.0f, "21");
        evaluateRoomMaintenanceRelationshipService0.registerObserver((Model.Room.Observer) roomService21);
        boolean boolean35 = roomService21.cancelBooking("512a0e7c-3268-4bb7-bc77-c6d32a14e20d");
        org.junit.Assert.assertNotNull(evaluateRoomMaintenanceRelationshipService0);
        org.junit.Assert.assertNotNull(evaluateRoomMaintenanceRelationshipService4);
        org.junit.Assert.assertNull(booking11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
// flaky "61) test416(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "54" + "'", str28, "54");
// flaky "42) test416(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "55" + "'", str32, "55");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
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
        Repository.BookingRepository bookingRepository21 = Repository.BookingRepository.getInstance();
        java.util.List<Model.Room.Booking> bookingList22 = bookingRepository21.findAll();
        Model.State.CompletedState completedState23 = new Model.State.CompletedState();
        java.time.LocalDate localDate27 = null;
        java.time.LocalDate localDate28 = null;
        java.time.LocalTime localTime29 = null;
        java.time.LocalTime localTime30 = null;
        Model.Room.Booking booking32 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate27, localDate28, localTime29, localTime30, "");
        completedState23.checkOut(booking32);
        java.time.LocalDate localDate34 = booking32.getEndDate();
        bookingRepository21.save(booking32);
        Model.Room.Booking booking37 = bookingRepository21.findById("");
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
        completedState38.checkOut(booking57);
        booking37.setState((Model.State.BookingState) completedState38);
        confirmedState0.checkOut(booking37);
        org.junit.Assert.assertNotNull(bookingRepository1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(localTime17);
        org.junit.Assert.assertNotNull(bookingRepository21);
        org.junit.Assert.assertNotNull(bookingList22);
        org.junit.Assert.assertNull(localDate34);
        org.junit.Assert.assertNotNull(booking37);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        Model.ServiceRequest.SensorEssentialServiceRequest sensorEssentialServiceRequest5 = new Model.ServiceRequest.SensorEssentialServiceRequest(1, "COMPLETED", "Service.AuthenticationException: ", (int) 'a', (int) (short) -1);
        sensorEssentialServiceRequest5.assignRoomID(100);
        java.lang.String str8 = sensorEssentialServiceRequest5.getStatus();
        sensorEssentialServiceRequest5.assignRoomID((int) (byte) 1);
        boolean boolean11 = sensorEssentialServiceRequest5.isEssential;
        sensorEssentialServiceRequest5.isEssential = true;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Service.AuthenticationException: " + "'", str8, "Service.AuthenticationException: ");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        Model.State.RoomReadyForEnableState roomReadyForEnableState0 = new Model.State.RoomReadyForEnableState();
        Model.State.RoomEnabledState roomEnabledState1 = new Model.State.RoomEnabledState();
        boolean boolean2 = roomEnabledState1.isBookable();
        Model.State.RoomReadyForEnableState roomReadyForEnableState3 = new Model.State.RoomReadyForEnableState();
        boolean boolean4 = roomReadyForEnableState3.isBookable();
        Model.Room.Room room9 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        roomReadyForEnableState3.disable(room9);
        roomEnabledState1.maintain(room9);
        roomReadyForEnableState0.maintain(room9);
        java.lang.String str13 = roomReadyForEnableState0.getStateName();
        Model.State.RoomDisabledState roomDisabledState14 = new Model.State.RoomDisabledState();
        boolean boolean15 = roomDisabledState14.isBookable();
        boolean boolean16 = roomDisabledState14.isBookable();
        boolean boolean17 = roomDisabledState14.isBookable();
        Model.State.RoomDisabledState roomDisabledState18 = new Model.State.RoomDisabledState();
        boolean boolean19 = roomDisabledState18.isBookable();
        boolean boolean20 = roomDisabledState18.isBookable();
        Model.State.RoomEnabledState roomEnabledState21 = new Model.State.RoomEnabledState();
        Model.Room.Room room26 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        boolean boolean27 = room26.isAvailable();
        Model.Room.AdminRoomProxy adminRoomProxy28 = new Model.Room.AdminRoomProxy(room26);
        roomEnabledState21.disable(room26);
        roomDisabledState18.enable(room26);
        Model.State.RoomDisabledState roomDisabledState31 = new Model.State.RoomDisabledState();
        boolean boolean32 = roomDisabledState31.isBookable();
        boolean boolean33 = roomDisabledState31.isBookable();
        Model.State.RoomEnabledState roomEnabledState34 = new Model.State.RoomEnabledState();
        Model.Room.Room room39 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        boolean boolean40 = room39.isAvailable();
        Model.Room.AdminRoomProxy adminRoomProxy41 = new Model.Room.AdminRoomProxy(room39);
        roomEnabledState34.disable(room39);
        roomDisabledState31.enable(room39);
        roomDisabledState18.maintain(room39);
        roomDisabledState14.disable(room39);
        Model.State.RoomEnabledState roomEnabledState46 = new Model.State.RoomEnabledState();
        boolean boolean47 = roomEnabledState46.isBookable();
        Model.Room.Room room52 = new Model.Room.Room("STAFF", "1", (double) (byte) 10, "2");
        roomEnabledState46.maintain(room52);
        roomDisabledState14.disable(room52);
        roomReadyForEnableState0.disable(room52);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "READY_FOR_ENABLE" + "'", str13, "READY_FOR_ENABLE");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
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
        java.lang.String str27 = booking19.getUserId();
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        Model.User.StaffUser staffUser3 = new Model.User.StaffUser("1bec99b6-9fd5-4eb6-be48-3e7f52439881", "8", "src/main/data/sensors.csv");
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        Model.State.RoomEnabledState roomEnabledState0 = new Model.State.RoomEnabledState();
        boolean boolean1 = roomEnabledState0.isBookable();
        Model.State.RoomReadyForEnableState roomReadyForEnableState2 = new Model.State.RoomReadyForEnableState();
        boolean boolean3 = roomReadyForEnableState2.isBookable();
        Model.Room.Room room8 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        roomReadyForEnableState2.disable(room8);
        roomEnabledState0.maintain(room8);
        room8.performMaintenance();
        Model.State.RoomState roomState12 = room8.getState();
        room8.requestDisable();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(roomState12);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        Model.State.RoomReadyForEnableState roomReadyForEnableState0 = new Model.State.RoomReadyForEnableState();
        boolean boolean1 = roomReadyForEnableState0.isBookable();
        Model.State.RoomEnabledState roomEnabledState2 = new Model.State.RoomEnabledState();
        Model.Room.Room room7 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        boolean boolean8 = room7.isAvailable();
        Model.Room.AdminRoomProxy adminRoomProxy9 = new Model.Room.AdminRoomProxy(room7);
        roomEnabledState2.disable(room7);
        roomReadyForEnableState0.maintain(room7);
        Repository.RoomRepository roomRepository12 = new Repository.RoomRepository();
        java.lang.String str13 = roomRepository12.generateNextId();
        java.lang.String str14 = roomRepository12.generateNextId();
        java.lang.String str15 = roomRepository12.generateNextId();
        java.util.List<Model.Room.Room> roomList16 = roomRepository12.findAll();
        Model.State.RoomDisabledState roomDisabledState17 = new Model.State.RoomDisabledState();
        boolean boolean18 = roomDisabledState17.isBookable();
        Model.Room.Room room19 = null;
        roomDisabledState17.disable(room19);
        Model.State.RoomDisabledState roomDisabledState21 = new Model.State.RoomDisabledState();
        boolean boolean22 = roomDisabledState21.isBookable();
        boolean boolean23 = roomDisabledState21.isBookable();
        boolean boolean24 = roomDisabledState21.isBookable();
        Model.Room.Room room29 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        boolean boolean30 = room29.isAvailable();
        roomDisabledState21.maintain(room29);
        roomDisabledState17.maintain(room29);
        roomRepository12.save(room29);
        room29.requestDisable();
        room29.performMaintenance();
        roomReadyForEnableState0.maintain(room29);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "62) test423(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "56" + "'", str13, "56");
// flaky "43) test423(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "56" + "'", str14, "56");
// flaky "27) test423(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "56" + "'", str15, "56");
        org.junit.Assert.assertNotNull(roomList16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        Database.Database database0 = Database.Database.getInstance();
        java.lang.String str1 = database0.getRoomCsvPath();
        java.lang.String str2 = database0.getOccupancySensorLogsPath();
        java.lang.String str3 = database0.getBookingCsvPath();
        java.lang.String str4 = database0.getSensorsCsvPath();
        java.lang.String str5 = database0.getRoomCsvPath();
        org.junit.Assert.assertNotNull(database0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EECS3311 Course Project Database - Rooms.csv" + "'", str1, "EECS3311 Course Project Database - Rooms.csv");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "src/main/data/occupancy_sensor_logs.csv" + "'", str2, "src/main/data/occupancy_sensor_logs.csv");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EECS3311 Course Project Database - Bookings.csv" + "'", str3, "EECS3311 Course Project Database - Bookings.csv");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "src/main/data/sensors.csv" + "'", str4, "src/main/data/sensors.csv");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EECS3311 Course Project Database - Rooms.csv" + "'", str5, "EECS3311 Course Project Database - Rooms.csv");
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        Service.UserService userService0 = new Service.UserService();
        Controller.ChiefEventCoordinatorController chiefEventCoordinatorController1 = new Controller.ChiefEventCoordinatorController(userService0);
        Model.User.FacultyUser facultyUser9 = new Model.User.FacultyUser("EECS3311 Course Project Database - Rooms.csv", "", "COMPLETED");
        Service.UserService userService10 = new Service.UserService();
        Model.User.AccountType accountType11 = Model.User.AccountType.PARTNER;
        Model.User.User user15 = userService10.createUser(accountType11, "", "DISABLED", "4");
        facultyUser9.setAccountType(accountType11);
        Model.User.User user19 = Model.User.UserFactory.createUserFromCsv("Service.AuthenticationException: ", "2", "jsmith@yorku.ca", "COMPLETED", accountType11, false, "1");
        Model.User.User user23 = userService0.createUser(accountType11, "EECS3311 Course Project Database - payments.csv", "EECS3311 Course Project Database - payments.csv", "READY_FOR_ENABLE");
        org.junit.Assert.assertTrue("'" + accountType11 + "' != '" + Model.User.AccountType.PARTNER + "'", accountType11.equals(Model.User.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(user15);
        org.junit.Assert.assertNotNull(user19);
        org.junit.Assert.assertNotNull(user23);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        Service.UserService userService0 = new Service.UserService();
        Model.User.AccountType accountType1 = Model.User.AccountType.PARTNER;
        Model.User.User user5 = userService0.createUser(accountType1, "", "DISABLED", "4");
        Model.User.User user9 = Model.User.UserFactory.createUser(accountType1, "COMPLETED", "", "COMPLETED");
        java.lang.String str10 = user9.getId();
        boolean boolean11 = user9.isVerified();
        double double12 = user9.getHourlyRate();
        org.junit.Assert.assertTrue("'" + accountType1 + "' != '" + Model.User.AccountType.PARTNER + "'", accountType1.equals(Model.User.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNotNull(user9);
// flaky "63) test426(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "480fe243-ebb3-46f6-a6cc-09d57def1744" + "'", str10, "480fe243-ebb3-46f6-a6cc-09d57def1744");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        Model.User.StaffUser staffUser6 = new Model.User.StaffUser("John Smith", "1", "src/main/data/sensors.csv", "EECS3311 Course Project Database - Rooms.csv", true, "35");
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
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
        boolean boolean16 = evaluateRoomMaintenanceRelationshipService0.isAnyEssentialMaintenanceRequestPending();
        evaluateRoomMaintenanceRelationshipService0.notifyObservers();
        org.junit.Assert.assertNotNull(evaluateRoomMaintenanceRelationshipService0);
        org.junit.Assert.assertNull(booking7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        java.time.LocalTime localTime5 = null;
        java.time.LocalTime localTime6 = null;
        Model.Room.Booking booking8 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate3, localDate4, localTime5, localTime6, "");
        java.time.LocalTime localTime9 = booking8.getStartTime();
        java.time.LocalDate localDate13 = null;
        java.time.LocalDate localDate14 = null;
        java.time.LocalTime localTime15 = null;
        java.time.LocalTime localTime16 = null;
        Model.Room.Booking booking18 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate13, localDate14, localTime15, localTime16, "");
        java.lang.String str19 = booking18.getBookingId();
        Model.State.BookingState bookingState20 = null;
        booking18.setState(bookingState20);
        Model.State.CompletedState completedState22 = new Model.State.CompletedState();
        booking18.setState((Model.State.BookingState) completedState22);
        booking8.setState((Model.State.BookingState) completedState22);
        java.lang.String str25 = completedState22.getStatus();
        org.junit.Assert.assertNull(localTime9);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "COMPLETED" + "'", str25, "COMPLETED");
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        Model.User.StaffUser staffUser3 = new Model.User.StaffUser("hi!", "", "hi!");
        boolean boolean4 = staffUser3.isVerified();
        Application.SessionData.setCurrentUser((Model.User.User) staffUser3);
        double double6 = staffUser3.getHourlyRate();
        staffUser3.setPassword("COMPLETED");
        double double9 = staffUser3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        java.time.LocalDateTime localDateTime2 = null;
        Model.Sensor.OccupancySensorData occupancySensorData3 = new Model.Sensor.OccupancySensorData("", "hi!", localDateTime2);
        java.time.LocalDateTime localDateTime4 = null;
        occupancySensorData3.dateTime = localDateTime4;
        java.lang.String str6 = occupancySensorData3.sensorID;
        java.time.LocalDateTime localDateTime7 = occupancySensorData3.dateTime;
        java.time.LocalDateTime localDateTime8 = occupancySensorData3.getLocalDateTime();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(localDateTime8);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        Service.EvaluateRoomMaintenanceRelationshipService evaluateRoomMaintenanceRelationshipService0 = Service.EvaluateRoomMaintenanceRelationshipService.getInstance();
        evaluateRoomMaintenanceRelationshipService0.notifyObservers();
        Service.RoomService roomService2 = new Service.RoomService();
        roomService2.update(true, (int) (short) 10);
        Model.Room.Booking booking7 = roomService2.getBookingDetails("src/main/data/users.csv");
        boolean boolean9 = roomService2.cancelBooking("hi!");
        Controller.AddRoomController addRoomController10 = new Controller.AddRoomController(roomService2);
        evaluateRoomMaintenanceRelationshipService0.removeObserver((Model.Room.Observer) roomService2);
        Controller.AddRoomController addRoomController12 = new Controller.AddRoomController(roomService2);
        addRoomController12.handleAddRoomSubmission("8", (-1), 10.0d);
        addRoomController12.handleAddRoomSubmission("1", (int) (byte) 100, (-1.0d));
        org.junit.Assert.assertNotNull(evaluateRoomMaintenanceRelationshipService0);
        org.junit.Assert.assertNull(booking7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        Model.User.FacultyUser facultyUser3 = new Model.User.FacultyUser("24", "2", "3");
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        Model.User.PartnerUser partnerUser6 = new Model.User.PartnerUser("9", "22", "", "", false, "jsmith@yorku.ca");
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        Model.ServiceRequest.EssentialServiceRequest essentialServiceRequest4 = new Model.ServiceRequest.EssentialServiceRequest(100, "EECS3311 Course Project Database - Rooms.csv", "DISABLED", 0);
        int int5 = essentialServiceRequest4.getServiceRequestID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        Model.Payment.Payment payment2 = new Model.Payment.Payment("7", 100.0d);
        boolean boolean3 = payment2.isPaid();
        java.lang.String str4 = payment2.getStatus();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PENDING" + "'", str4, "PENDING");
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        Repository.UserRepository userRepository0 = Repository.UserRepository.getInstance();
        int int1 = userRepository0.getAll();
        Model.User.User user3 = userRepository0.findByEmail("PENDING");
        Model.User.StaffUser staffUser7 = new Model.User.StaffUser("hi!", "", "hi!");
        boolean boolean8 = staffUser7.isVerified();
        Application.SessionData.setCurrentUser((Model.User.User) staffUser7);
        java.lang.String str10 = staffUser7.getRole();
        userRepository0.save((Model.User.User) staffUser7);
        org.junit.Assert.assertNotNull(userRepository0);
// flaky "64) test437(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 33 + "'", int1 == 33);
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "STAFF" + "'", str10, "STAFF");
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        Service.RoomService roomService0 = new Service.RoomService();
        roomService0.update(true, (int) (short) 10);
        Model.Room.Booking booking5 = roomService0.getBookingDetails("src/main/data/users.csv");
        boolean boolean7 = roomService0.cancelBooking("hi!");
        Controller.AddRoomController addRoomController8 = new Controller.AddRoomController(roomService0);
        Service.RoomService roomService9 = roomService0.getInstance();
        Model.Room.Booking booking11 = roomService0.getBookingDetails("25");
        org.junit.Assert.assertNull(booking5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(roomService9);
        org.junit.Assert.assertNull(booking11);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        Service.AuthenticationService authenticationService0 = new Service.AuthenticationService();
        boolean boolean2 = authenticationService0.isYorkEmail("Service.AuthenticationException: ");
        boolean boolean4 = authenticationService0.properEmail("jsmith@yorku.ca");
        authenticationService0.logout();
        Model.User.StudentUser studentUser15 = new Model.User.StudentUser("hi!", "", "", "src/main/data/users.csv", false, "src/main/data/users.csv");
        java.lang.String str16 = studentUser15.getEmail();
        Application.SessionData.setCurrentUser((Model.User.User) studentUser15);
        studentUser15.setPassword("DISABLED");
        boolean boolean20 = studentUser15.isVerified();
        Model.User.AccountType accountType21 = studentUser15.getAccountType();
        // The following exception was thrown during execution in test generation
        try {
            Model.User.User user22 = authenticationService0.register("PARTNER", "7", "src/main/data/scanid_sensor_logs.csv", accountType21);
            org.junit.Assert.fail("Expected exception of type Service.AuthenticationException; message: Please enter a valid email address.");
        } catch (Service.AuthenticationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + accountType21 + "' != '" + Model.User.AccountType.STUDENT + "'", accountType21.equals(Model.User.AccountType.STUDENT));
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        java.time.LocalTime localTime5 = null;
        java.time.LocalTime localTime6 = null;
        Model.Room.Booking booking8 = new Model.Room.Booking("32", "22", "14", localDate3, localDate4, localTime5, localTime6, "47");
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        Model.User.StudentUser studentUser6 = new Model.User.StudentUser("4", "3", "CANCELLED", "28", false, "1");
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        Model.User.FacultyUser facultyUser3 = new Model.User.FacultyUser("COMPLETED", "3", "EECS3311 Course Project Database - Rooms.csv");
        java.lang.String str4 = facultyUser3.getPassword();
        facultyUser3.setEmail("26");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EECS3311 Course Project Database - Rooms.csv" + "'", str4, "EECS3311 Course Project Database - Rooms.csv");
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        View.AddSensorView addSensorView0 = null;
        Service.SensorService sensorService1 = new Service.SensorService();
        boolean boolean3 = false; // flaky "65) test443(RegressionTest0)": sensorService1.addOccupancySensorData("CHECKED_IN");
        boolean boolean7 = false; // flaky "44) test443(RegressionTest0)": sensorService1.addScanIDSensorData("", "src/main/data/sensors.csv", "7");
        // The following exception was thrown during execution in test generation
        try {
            Controller.AddSensorController addSensorController8 = new Controller.AddSensorController(addSensorView0, sensorService1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"backButton\" because \"this.view\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "28) test443(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "17) test443(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        Repository.ServiceRequestRepository serviceRequestRepository0 = Repository.ServiceRequestRepository.getInstance();
        Repository.ServiceRequestRepository serviceRequestRepository1 = Repository.ServiceRequestRepository.getInstance();
        Repository.ServiceRequestRepository serviceRequestRepository2 = Repository.ServiceRequestRepository.getInstance();
        Model.ServiceRequest.SensorEssentialServiceRequest sensorEssentialServiceRequest8 = new Model.ServiceRequest.SensorEssentialServiceRequest(1, "COMPLETED", "Service.AuthenticationException: ", (int) 'a', (int) (short) -1);
        sensorEssentialServiceRequest8.assignRoomID(100);
        java.lang.String str11 = sensorEssentialServiceRequest8.getStatus();
        serviceRequestRepository2.updateExistingServiceRequest((Model.ServiceRequest.ServiceRequest) sensorEssentialServiceRequest8);
        Model.ServiceRequest.SensorEssentialServiceRequest sensorEssentialServiceRequest18 = new Model.ServiceRequest.SensorEssentialServiceRequest((int) (short) 100, "CHECKED_IN", "EECS3311 Course Project Database - Bookings.csv", 0, (int) (byte) 0);
        serviceRequestRepository2.updateExistingServiceRequest((Model.ServiceRequest.ServiceRequest) sensorEssentialServiceRequest18);
        java.util.Map<java.lang.Integer, java.util.List<Model.ServiceRequest.ServiceRequest>> intMap22 = serviceRequestRepository2.parseCsvFileToMap("EECS3311 Course Project Database - Bookings.csv", true);
        boolean boolean24 = serviceRequestRepository1.saveMapToCsv(intMap22, "Service.AuthenticationException: ");
        boolean boolean26 = serviceRequestRepository0.saveMapToCsv(intMap22, "2");
        java.util.Map<java.lang.Integer, java.util.List<Model.ServiceRequest.ServiceRequest>> intMap27 = null;
        boolean boolean29 = serviceRequestRepository0.saveMapToCsv(intMap27, "");
        org.junit.Assert.assertNotNull(serviceRequestRepository0);
        org.junit.Assert.assertNotNull(serviceRequestRepository1);
        org.junit.Assert.assertNotNull(serviceRequestRepository2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Service.AuthenticationException: " + "'", str11, "Service.AuthenticationException: ");
        org.junit.Assert.assertNotNull(intMap22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        Service.RoomListFacade roomListFacade0 = new Service.RoomListFacade();
        java.util.List<Model.Room.RoomProxy> roomProxyList1 = roomListFacade0.getAllRoomsForAdmin();
        java.util.List<Model.Room.RoomProxy> roomProxyList2 = roomListFacade0.getAllRoomsForAdmin();
        java.util.List<Model.Room.RoomProxy> roomProxyList3 = roomListFacade0.getAvailableRoomsForGuest();
        java.util.List<Model.Room.RoomProxy> roomProxyList4 = roomListFacade0.getAllRoomsForAdmin();
        java.util.List<Model.Room.RoomProxy> roomProxyList5 = roomListFacade0.getAvailableRoomsForGuest();
        org.junit.Assert.assertNotNull(roomProxyList1);
        org.junit.Assert.assertNotNull(roomProxyList2);
        org.junit.Assert.assertNotNull(roomProxyList3);
        org.junit.Assert.assertNotNull(roomProxyList4);
        org.junit.Assert.assertNotNull(roomProxyList5);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        java.time.LocalDateTime localDateTime4 = null;
        Model.Sensor.ScanIDSensorData scanIDSensorData5 = new Model.Sensor.ScanIDSensorData("8903a9bb-0838-41ef-9768-131faa20dcdc", "src/main/data/users.csv", "ENABLED", "512a0e7c-3268-4bb7-bc77-c6d32a14e20d", localDateTime4);
        java.lang.String str6 = scanIDSensorData5.getLogID();
        java.lang.String str7 = scanIDSensorData5.getUserID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "8903a9bb-0838-41ef-9768-131faa20dcdc" + "'", str6, "8903a9bb-0838-41ef-9768-131faa20dcdc");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ENABLED" + "'", str7, "ENABLED");
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        Model.ServiceRequest.NonEssentialServiceRequest nonEssentialServiceRequest4 = new Model.ServiceRequest.NonEssentialServiceRequest((int) 'a', "EECS3311 Course Project Database - Rooms.csv", "3", (int) (byte) -1);
        nonEssentialServiceRequest4.setRoomID((int) (byte) 100);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
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
        Model.State.CompletedState completedState21 = new Model.State.CompletedState();
        java.time.LocalDate localDate25 = null;
        java.time.LocalDate localDate26 = null;
        java.time.LocalTime localTime27 = null;
        java.time.LocalTime localTime28 = null;
        Model.Room.Booking booking30 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate25, localDate26, localTime27, localTime28, "");
        completedState21.checkOut(booking30);
        java.lang.String str32 = completedState21.getStatus();
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
        completedState21.checkIn(booking52);
        completedState0.cancel(booking52);
        java.lang.String str56 = booking52.getBookingId();
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "COMPLETED" + "'", str32, "COMPLETED");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        Model.Payment.Payment payment2 = new Model.Payment.Payment("COMPLETED", (double) 0.0f);
        boolean boolean3 = payment2.isPaid();
        double double4 = payment2.getAmount();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        Repository.ServiceRequestRepository serviceRequestRepository0 = Repository.ServiceRequestRepository.getInstance();
        Model.ServiceRequest.SensorEssentialServiceRequest sensorEssentialServiceRequest6 = new Model.ServiceRequest.SensorEssentialServiceRequest(1, "COMPLETED", "Service.AuthenticationException: ", (int) 'a', (int) (short) -1);
        java.lang.String str7 = sensorEssentialServiceRequest6.getStatus();
        Model.ServiceRequest.ServiceRequest serviceRequest8 = serviceRequestRepository0.addServiceRequest((Model.ServiceRequest.ServiceRequest) sensorEssentialServiceRequest6);
        int int9 = sensorEssentialServiceRequest6.getServiceRequestID();
        sensorEssentialServiceRequest6.setDescription("20");
        org.junit.Assert.assertNotNull(serviceRequestRepository0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Service.AuthenticationException: " + "'", str7, "Service.AuthenticationException: ");
        org.junit.Assert.assertNotNull(serviceRequest8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        Service.RoomService roomService0 = new Service.RoomService();
        roomService0.update(true, (int) (short) 10);
        Model.Room.Booking booking5 = roomService0.getBookingDetails("src/main/data/users.csv");
        boolean boolean7 = roomService0.cancelBooking("hi!");
        Controller.AddRoomController addRoomController8 = new Controller.AddRoomController(roomService0);
        Controller.AdminSelectActionController adminSelectActionController9 = new Controller.AdminSelectActionController(addRoomController8);
        adminSelectActionController9.adminAddRoom("7", (int) (short) -1, (double) 'a');
        adminSelectActionController9.adminAddRoom("43", (int) (byte) 100, (double) 10.0f);
        adminSelectActionController9.disableRoom("12");
        org.junit.Assert.assertNull(booking5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        Service.AuthenticationService authenticationService0 = new Service.AuthenticationService();
        boolean boolean2 = authenticationService0.isYorkEmail("Service.AuthenticationException: ");
        authenticationService0.logout();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        Service.EvaluateRoomMaintenanceRelationshipService evaluateRoomMaintenanceRelationshipService0 = Service.EvaluateRoomMaintenanceRelationshipService.getInstance();
        evaluateRoomMaintenanceRelationshipService0.notifyObservers();
        Service.RoomService roomService2 = new Service.RoomService();
        roomService2.update(true, (int) (short) 10);
        Model.Room.Booking booking7 = roomService2.getBookingDetails("src/main/data/users.csv");
        boolean boolean9 = roomService2.cancelBooking("hi!");
        Controller.AddRoomController addRoomController10 = new Controller.AddRoomController(roomService2);
        evaluateRoomMaintenanceRelationshipService0.removeObserver((Model.Room.Observer) roomService2);
        Controller.AddRoomController addRoomController12 = new Controller.AddRoomController(roomService2);
        addRoomController12.handleAddRoomSubmission("8", (-1), 10.0d);
        addRoomController12.handleAddRoomSubmission("25", (int) (short) 0, (double) ' ');
        org.junit.Assert.assertNotNull(evaluateRoomMaintenanceRelationshipService0);
        org.junit.Assert.assertNull(booking7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        Model.ServiceRequest.EssentialServiceRequest essentialServiceRequest4 = new Model.ServiceRequest.EssentialServiceRequest((int) (byte) 0, "src/main/data/users.csv", "src/main/data/users.csv", (int) ' ');
        int int5 = essentialServiceRequest4.getServiceRequestID();
        int int6 = essentialServiceRequest4.getServiceRequestID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        Service.RoomService roomService0 = new Service.RoomService();
        roomService0.update(true, (int) (short) 10);
        Model.Room.Booking booking5 = roomService0.getBookingDetails("src/main/data/users.csv");
        boolean boolean7 = roomService0.cancelBooking("hi!");
        roomService0.disableRoom("hi!");
        boolean boolean11 = roomService0.cancelBooking("DISABLED");
        roomService0.maintenanceCompleted("CONFIRMED");
        org.junit.Assert.assertNull(booking5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        Service.SensorService sensorService0 = new Service.SensorService();
        Model.Sensor.Sensor sensor3 = null; // flaky "66) test456(RegressionTest0)": sensorService0.getSensorByRoomID("src/main/data/users.csv", "EECS3311 Course Project Database - Bookings.csv");
        boolean boolean7 = false; // flaky "45) test456(RegressionTest0)": sensorService0.addScanIDSensorData("EECS3311 Course Project Database - Rooms.csv", "src/main/data/scanid_sensor_logs.csv", "hi!");
        boolean boolean9 = false; // flaky "29) test456(RegressionTest0)": sensorService0.addOccupancySensorData("57197862-2463-4972-b3b2-977245133f34");
        org.junit.Assert.assertNull(sensor3);
// flaky "18) test456(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
// flaky "9) test456(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        Model.Sensor.Sensor sensor5 = new Model.Sensor.Sensor("1", "", "src/main/data/users.csv", "hi!", true);
        java.lang.String str6 = sensor5.getRoomID();
        java.lang.String str7 = sensor5.getType();
        sensor5.setStatus("READY_FOR_ENABLE");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        java.time.LocalDateTime localDateTime2 = null;
        Model.Sensor.OccupancySensorData occupancySensorData3 = new Model.Sensor.OccupancySensorData("", "", localDateTime2);
        java.time.LocalDateTime localDateTime4 = null;
        occupancySensorData3.dateTime = localDateTime4;
        java.time.LocalDateTime localDateTime6 = null;
        occupancySensorData3.dateTime = localDateTime6;
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        Model.User.EventCoordinator eventCoordinator0 = Model.User.EventCoordinator.getInstance();
        java.lang.String str1 = eventCoordinator0.getChiefEventCoordinatorEmail();
        java.lang.String str2 = eventCoordinator0.getChiefEventCoordinatorEmail();
        org.junit.Assert.assertNotNull(eventCoordinator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jsmith@yorku.ca" + "'", str1, "jsmith@yorku.ca");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jsmith@yorku.ca" + "'", str2, "jsmith@yorku.ca");
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
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
        boolean boolean23 = room18.isAvailable();
        boolean boolean24 = room18.isAvailable();
        Model.Room.GuestRoomProxy guestRoomProxy25 = new Model.Room.GuestRoomProxy(room18);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        Repository.RoomRepository roomRepository0 = new Repository.RoomRepository();
        Model.Room.Room room5 = new Model.Room.Room("1", "7", (double) ' ', "COMPLETED");
        roomRepository0.save(room5);
        java.lang.String str7 = room5.getLocation();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "7" + "'", str7, "7");
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
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
        Model.State.CancelledState cancelledState27 = new Model.State.CancelledState();
        Model.State.CompletedState completedState28 = new Model.State.CompletedState();
        java.time.LocalDate localDate32 = null;
        java.time.LocalDate localDate33 = null;
        java.time.LocalTime localTime34 = null;
        java.time.LocalTime localTime35 = null;
        Model.Room.Booking booking37 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate32, localDate33, localTime34, localTime35, "");
        completedState28.checkOut(booking37);
        java.lang.String str39 = completedState28.getStatus();
        Model.State.CompletedState completedState40 = new Model.State.CompletedState();
        java.time.LocalDate localDate44 = null;
        java.time.LocalDate localDate45 = null;
        java.time.LocalTime localTime46 = null;
        java.time.LocalTime localTime47 = null;
        Model.Room.Booking booking49 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate44, localDate45, localTime46, localTime47, "");
        completedState40.checkOut(booking49);
        java.time.LocalDate localDate54 = null;
        java.time.LocalDate localDate55 = null;
        java.time.LocalTime localTime56 = null;
        java.time.LocalTime localTime57 = null;
        Model.Room.Booking booking59 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate54, localDate55, localTime56, localTime57, "");
        completedState40.checkOut(booking59);
        completedState28.checkIn(booking59);
        cancelledState27.checkOut(booking59);
        Model.State.CompletedState completedState63 = new Model.State.CompletedState();
        java.time.LocalDate localDate67 = null;
        java.time.LocalDate localDate68 = null;
        java.time.LocalTime localTime69 = null;
        java.time.LocalTime localTime70 = null;
        Model.Room.Booking booking72 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate67, localDate68, localTime69, localTime70, "");
        completedState63.checkOut(booking72);
        cancelledState27.cancel(booking72);
        java.lang.String str75 = booking72.getStatus();
        checkInState0.checkOut(booking72);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CHECKED_IN" + "'", str1, "CHECKED_IN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CHECKED_IN" + "'", str2, "CHECKED_IN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CHECKED_IN" + "'", str3, "CHECKED_IN");
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "COMPLETED" + "'", str39, "COMPLETED");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "CONFIRMED" + "'", str75, "CONFIRMED");
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
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
        Model.Room.Booking booking65 = null;
        cancelledState0.checkOut(booking65);
        Model.State.CheckInState checkInState67 = new Model.State.CheckInState();
        java.lang.String str68 = checkInState67.getStatus();
        java.lang.String str69 = checkInState67.getStatus();
        java.lang.String str70 = checkInState67.getStatus();
        java.time.LocalDate localDate74 = null;
        java.time.LocalDate localDate75 = null;
        java.time.LocalTime localTime76 = null;
        java.time.LocalTime localTime77 = null;
        Model.Room.Booking booking79 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate74, localDate75, localTime76, localTime77, "");
        java.lang.String str80 = booking79.getBookingId();
        java.time.LocalTime localTime81 = booking79.getStartTime();
        checkInState67.cancel(booking79);
        cancelledState0.checkOut(booking79);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "COMPLETED" + "'", str12, "COMPLETED");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNull(localDate63);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "CHECKED_IN" + "'", str68, "CHECKED_IN");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "CHECKED_IN" + "'", str69, "CHECKED_IN");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "CHECKED_IN" + "'", str70, "CHECKED_IN");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertNull(localTime81);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
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
        Model.State.ConfirmedState confirmedState15 = new Model.State.ConfirmedState();
        Repository.BookingRepository bookingRepository16 = Repository.BookingRepository.getInstance();
        java.time.LocalDate localDate20 = null;
        java.time.LocalDate localDate21 = null;
        java.time.LocalTime localTime22 = null;
        java.time.LocalTime localTime23 = null;
        Model.Room.Booking booking25 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate20, localDate21, localTime22, localTime23, "");
        java.lang.String str26 = booking25.getBookingId();
        Model.State.BookingState bookingState27 = null;
        booking25.setState(bookingState27);
        Model.State.CompletedState completedState29 = new Model.State.CompletedState();
        booking25.setState((Model.State.BookingState) completedState29);
        bookingRepository16.save(booking25);
        java.time.LocalTime localTime32 = booking25.getStartTime();
        booking25.setPaymentId("STAFF");
        confirmedState15.checkOut(booking25);
        completedState12.cancel(booking25);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "COMPLETED" + "'", str14, "COMPLETED");
        org.junit.Assert.assertNotNull(bookingRepository16);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNull(localTime32);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        Model.User.PartnerUser partnerUser6 = new Model.User.PartnerUser("9", "Service.AuthenticationException: ", "Service.AuthenticationException: ", "7", true, "1");
        Service.UserService userService7 = new Service.UserService();
        Model.User.AccountType accountType8 = Model.User.AccountType.PARTNER;
        Model.User.User user12 = userService7.createUser(accountType8, "src/main/data/scanid_sensor_logs.csv", "CHECKED_IN", "EECS3311 Course Project Database - Rooms.csv");
        double double13 = accountType8.getHourlyRate();
        partnerUser6.setAccountType(accountType8);
        Model.User.User user18 = Model.User.UserFactory.createUser(accountType8, "EECS3311 Course Project Database - payments.csv", "41", "17");
        org.junit.Assert.assertTrue("'" + accountType8 + "' != '" + Model.User.AccountType.PARTNER + "'", accountType8.equals(Model.User.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(user12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
        org.junit.Assert.assertNotNull(user18);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        Model.User.PartnerUser partnerUser6 = new Model.User.PartnerUser("3", "1", "30", "EECS3311 Course Project Database - Bookings.csv", true, "3");
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        Model.ServiceRequest.SensorEssentialServiceRequest sensorEssentialServiceRequest5 = new Model.ServiceRequest.SensorEssentialServiceRequest(2, "30", "CHECKED_IN", (int) '4', 4);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        Service.SubmitServiceRequestService submitServiceRequestService0 = Service.SubmitServiceRequestService.getInstance();
        java.util.ArrayList<Model.ServiceRequest.ServiceRequest> serviceRequestList5 = submitServiceRequestService0.submitServiceRequest(26, "STAFF", false, "EECS3311 Course Project Database - payments.csv");
        org.junit.Assert.assertNotNull(submitServiceRequestService0);
        org.junit.Assert.assertNotNull(serviceRequestList5);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        Model.User.StudentUser studentUser6 = new Model.User.StudentUser("hi!", "", "", "src/main/data/users.csv", false, "src/main/data/users.csv");
        boolean boolean8 = studentUser6.checkPassword("EECS3311 Course Project Database - Bookings.csv");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        Model.ServiceRequest.SensorEssentialServiceRequest sensorEssentialServiceRequest5 = new Model.ServiceRequest.SensorEssentialServiceRequest((int) (short) -1, "4", "hi!", (-1), (int) ' ');
        sensorEssentialServiceRequest5.setRoomID((int) (byte) -1);
        boolean boolean8 = sensorEssentialServiceRequest5.isEssential();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        Repository.BookingRepository bookingRepository0 = Repository.BookingRepository.getInstance();
        java.util.List<Model.Room.Booking> bookingList1 = bookingRepository0.findAll();
        java.util.List<Model.Room.Booking> bookingList2 = bookingRepository0.findAll();
        Model.State.CancelledState cancelledState3 = new Model.State.CancelledState();
        Model.State.CompletedState completedState4 = new Model.State.CompletedState();
        java.time.LocalDate localDate8 = null;
        java.time.LocalDate localDate9 = null;
        java.time.LocalTime localTime10 = null;
        java.time.LocalTime localTime11 = null;
        Model.Room.Booking booking13 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate8, localDate9, localTime10, localTime11, "");
        completedState4.checkOut(booking13);
        java.lang.String str15 = completedState4.getStatus();
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
        completedState4.checkIn(booking35);
        cancelledState3.checkOut(booking35);
        Model.State.CompletedState completedState39 = new Model.State.CompletedState();
        java.time.LocalDate localDate43 = null;
        java.time.LocalDate localDate44 = null;
        java.time.LocalTime localTime45 = null;
        java.time.LocalTime localTime46 = null;
        Model.Room.Booking booking48 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate43, localDate44, localTime45, localTime46, "");
        completedState39.checkOut(booking48);
        cancelledState3.cancel(booking48);
        java.lang.String str51 = booking48.getStatus();
        bookingRepository0.save(booking48);
        Repository.BookingRepository bookingRepository53 = Repository.BookingRepository.getInstance();
        java.util.List<Model.Room.Booking> bookingList54 = bookingRepository53.findAll();
        Model.State.CompletedState completedState55 = new Model.State.CompletedState();
        java.time.LocalDate localDate59 = null;
        java.time.LocalDate localDate60 = null;
        java.time.LocalTime localTime61 = null;
        java.time.LocalTime localTime62 = null;
        Model.Room.Booking booking64 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate59, localDate60, localTime61, localTime62, "");
        completedState55.checkOut(booking64);
        java.time.LocalDate localDate66 = booking64.getEndDate();
        bookingRepository53.save(booking64);
        Model.Room.Booking booking69 = bookingRepository53.findById("");
        Model.State.CompletedState completedState70 = new Model.State.CompletedState();
        java.time.LocalDate localDate74 = null;
        java.time.LocalDate localDate75 = null;
        java.time.LocalTime localTime76 = null;
        java.time.LocalTime localTime77 = null;
        Model.Room.Booking booking79 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate74, localDate75, localTime76, localTime77, "");
        completedState70.checkOut(booking79);
        java.time.LocalDate localDate84 = null;
        java.time.LocalDate localDate85 = null;
        java.time.LocalTime localTime86 = null;
        java.time.LocalTime localTime87 = null;
        Model.Room.Booking booking89 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate84, localDate85, localTime86, localTime87, "");
        completedState70.checkOut(booking89);
        booking69.setState((Model.State.BookingState) completedState70);
        bookingRepository0.save(booking69);
        java.lang.String str93 = booking69.getBookingId();
        org.junit.Assert.assertNotNull(bookingRepository0);
        org.junit.Assert.assertNotNull(bookingList1);
        org.junit.Assert.assertNotNull(bookingList2);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "COMPLETED" + "'", str15, "COMPLETED");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "CONFIRMED" + "'", str51, "CONFIRMED");
        org.junit.Assert.assertNotNull(bookingRepository53);
        org.junit.Assert.assertNotNull(bookingList54);
        org.junit.Assert.assertNull(localDate66);
        org.junit.Assert.assertNotNull(booking69);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "" + "'", str93, "");
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        Repository.RoomRepository roomRepository0 = Repository.RoomRepository.getInstance();
        java.util.List<Model.Room.Room> roomList1 = roomRepository0.findAll();
        java.lang.String str2 = roomRepository0.generateNextId();
        Model.Room.Room room4 = roomRepository0.findById("FACULTY");
        org.junit.Assert.assertNotNull(roomRepository0);
        org.junit.Assert.assertNotNull(roomList1);
// flaky "67) test472(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "64" + "'", str2, "64");
        org.junit.Assert.assertNull(room4);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        Repository.SensorRepository sensorRepository0 = new Repository.SensorRepository();
        java.util.List<Model.Sensor.OccupancySensorData> occupancySensorDataList1 = sensorRepository0.getOccupancySensorLogsList();
        Model.Sensor.ScanIDSensorData scanIDSensorData2 = null;
        boolean boolean3 = sensorRepository0.writeScanIDSensorLog(scanIDSensorData2);
        Model.Sensor.OccupancySensor occupancySensor9 = new Model.Sensor.OccupancySensor("", "1", "1", "EECS3311 Course Project Database - Rooms.csv", true);
        boolean boolean10 = false; // flaky "68) test473(RegressionTest0)": sensorRepository0.writeSensor((Model.Sensor.Sensor) occupancySensor9);
        Model.Sensor.Sensor sensor12 = null; // flaky "46) test473(RegressionTest0)": sensorRepository0.getSensorByID("src/main/data/users.csv");
        java.util.List<Model.Sensor.Sensor> sensorList15 = null; // flaky "30) test473(RegressionTest0)": sensorRepository0.getSensorByRoomIDType("2", "CHECKED_IN");
        java.util.List<Model.Sensor.OccupancySensorData> occupancySensorDataList16 = sensorRepository0.getOccupancySensorLogsList();
// flaky "19) test473(RegressionTest0)":         org.junit.Assert.assertNotNull(occupancySensorDataList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "10) test473(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(sensor12);
// flaky "5) test473(RegressionTest0)":         org.junit.Assert.assertNotNull(sensorList15);
// flaky "3) test473(RegressionTest0)":         org.junit.Assert.assertNotNull(occupancySensorDataList16);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
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
        Service.RoomService roomService17 = roomService16.getInstance();
        Service.RoomService roomService18 = roomService17.getInstance();
        java.time.LocalDate localDate21 = null;
        java.time.LocalDate localDate22 = null;
        java.time.LocalTime localTime23 = null;
        java.time.LocalTime localTime24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = roomService17.createBooking("28", "50", localDate21, localDate22, localTime23, localTime24, "1");
// flaky "69) test474(RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evaluateRoomMaintenanceRelationshipService0);
        org.junit.Assert.assertNull(booking7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(roomService16);
        org.junit.Assert.assertNotNull(roomService17);
        org.junit.Assert.assertNotNull(roomService18);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        Model.State.RoomDisabledState roomDisabledState0 = new Model.State.RoomDisabledState();
        boolean boolean1 = roomDisabledState0.isBookable();
        Model.Room.Room room2 = null;
        roomDisabledState0.disable(room2);
        Model.State.RoomDisabledState roomDisabledState4 = new Model.State.RoomDisabledState();
        boolean boolean5 = roomDisabledState4.isBookable();
        boolean boolean6 = roomDisabledState4.isBookable();
        boolean boolean7 = roomDisabledState4.isBookable();
        Model.Room.Room room12 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        boolean boolean13 = room12.isAvailable();
        roomDisabledState4.maintain(room12);
        roomDisabledState0.maintain(room12);
        Model.State.RoomEnabledState roomEnabledState16 = new Model.State.RoomEnabledState();
        Model.Room.Room room21 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        boolean boolean22 = room21.isAvailable();
        Model.Room.AdminRoomProxy adminRoomProxy23 = new Model.Room.AdminRoomProxy(room21);
        roomEnabledState16.disable(room21);
        roomDisabledState0.disable(room21);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        Service.UserService userService0 = new Service.UserService();
        Model.User.AccountType accountType1 = Model.User.AccountType.PARTNER;
        Model.User.User user5 = userService0.createUser(accountType1, "", "DISABLED", "4");
        Model.User.User user9 = Model.User.UserFactory.createUser(accountType1, "COMPLETED", "", "COMPLETED");
        java.lang.String str10 = user9.getId();
        java.lang.String str11 = user9.getId();
        org.junit.Assert.assertTrue("'" + accountType1 + "' != '" + Model.User.AccountType.PARTNER + "'", accountType1.equals(Model.User.AccountType.PARTNER));
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNotNull(user9);
// flaky "70) test476(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "3b2aa8c1-2019-4186-a988-323e0553d485" + "'", str10, "3b2aa8c1-2019-4186-a988-323e0553d485");
// flaky "47) test476(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "3b2aa8c1-2019-4186-a988-323e0553d485" + "'", str11, "3b2aa8c1-2019-4186-a988-323e0553d485");
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        Service.RoomService roomService0 = new Service.RoomService();
        roomService0.maintenanceCompleted("");
        boolean boolean4 = roomService0.performCheckOut("");
        roomService0.maintenanceCompleted("1");
        Model.Room.Booking booking8 = roomService0.getBookingDetails("EECS3311 Course Project Database - Rooms.csv");
        boolean boolean10 = roomService0.cancelBooking("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(booking8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        View.PaymentView paymentView0 = null;
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
        Service.RoomService roomService17 = roomService13.getInstance();
        boolean boolean19 = roomService17.cancelBooking("3b878a93-2f8d-4168-99fd-22b8dbe103f1");
        // The following exception was thrown during execution in test generation
        try {
            Controller.PaymentViewController paymentViewController20 = new Controller.PaymentViewController(paymentView0, roomService17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"backButton\" because \"this.view\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evaluateRoomMaintenanceRelationshipService1);
        org.junit.Assert.assertNull(booking8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(roomService17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        Service.RoomService roomService0 = new Service.RoomService();
        roomService0.update(true, (int) (short) 10);
        Model.Room.Booking booking5 = roomService0.getBookingDetails("src/main/data/users.csv");
        boolean boolean7 = roomService0.cancelBooking("hi!");
        Controller.AddRoomController addRoomController8 = new Controller.AddRoomController(roomService0);
        addRoomController8.handleAddRoomSubmission("EECS3311 Course Project Database - Rooms.csv", (int) (short) -1, (double) 1);
        addRoomController8.handleAddRoomSubmission("23", (int) (short) 1, (double) (byte) 1);
        Controller.AdminSelectActionController adminSelectActionController17 = new Controller.AdminSelectActionController(addRoomController8);
        org.junit.Assert.assertNull(booking5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        Model.State.CheckInState checkInState0 = new Model.State.CheckInState();
        java.time.LocalDate localDate4 = null;
        java.time.LocalDate localDate5 = null;
        java.time.LocalTime localTime6 = null;
        java.time.LocalTime localTime7 = null;
        Model.Room.Booking booking9 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate4, localDate5, localTime6, localTime7, "");
        java.lang.String str10 = booking9.getBookingId();
        checkInState0.checkIn(booking9);
        java.lang.String str12 = booking9.getUserId();
        java.lang.String str13 = booking9.getRoomId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "src/main/data/users.csv" + "'", str13, "src/main/data/users.csv");
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        Repository.PaymentRepository paymentRepository0 = Repository.PaymentRepository.getInstance();
        java.util.List<Model.Payment.Payment> paymentList1 = paymentRepository0.findAll();
        java.util.List<Model.Payment.Payment> paymentList2 = paymentRepository0.findAll();
        org.junit.Assert.assertNotNull(paymentRepository0);
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        Controller.AddRoomController addRoomController0 = null;
        Controller.AdminSelectActionController adminSelectActionController1 = new Controller.AdminSelectActionController(addRoomController0);
        // The following exception was thrown during execution in test generation
        try {
            adminSelectActionController1.adminAddRoom("47", (int) (byte) 0, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Controller.AddRoomController.handleAddRoomSubmission(String, int, double)\" because \"this.addRoomController\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        Model.User.StaffUser staffUser3 = new Model.User.StaffUser("hi!", "", "hi!");
        boolean boolean4 = staffUser3.isVerified();
        Application.SessionData.setCurrentUser((Model.User.User) staffUser3);
        Application.SessionData.setCurrentUser((Model.User.User) staffUser3);
        Model.User.AccountType accountType7 = staffUser3.getAccountType();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + accountType7 + "' != '" + Model.User.AccountType.STAFF + "'", accountType7.equals(Model.User.AccountType.STAFF));
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        Model.User.PartnerUser partnerUser3 = new Model.User.PartnerUser("CONFIRMED", "8", "48");
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        Service.RoomService roomService0 = new Service.RoomService();
        roomService0.maintenanceCompleted("");
        boolean boolean4 = roomService0.performCheckOut("");
        roomService0.maintenanceCompleted("1");
        boolean boolean8 = roomService0.performCheckOut("CHECKED_IN");
        roomService0.savePayment("", (double) (byte) 0);
        roomService0.disableRoom("3b2aa8c1-2019-4186-a988-323e0553d485");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        Model.Sensor.OccupancySensor occupancySensor5 = new Model.Sensor.OccupancySensor("CANCELLED", "48", "CONFIRMED", "2", true);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        Service.RoomService roomService0 = new Service.RoomService();
        roomService0.update(true, (int) (short) 10);
        java.lang.String str7 = roomService0.createRoom("EECS3311 Course Project Database - Rooms.csv", (double) 0.0f, "");
        java.lang.String str11 = roomService0.createRoom("src/main/data/occupancy_sensor_logs.csv", (double) 0.0f, "21");
        roomService0.enableRoom("");
// flaky "71) test487(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "66" + "'", str7, "66");
// flaky "48) test487(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "67" + "'", str11, "67");
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        Model.Sensor.Sensor sensor5 = new Model.Sensor.Sensor("26", "17", "DISABLED", "src/main/data/scanid_sensor_logs.csv", false);
        boolean boolean6 = sensor5.getOccupied();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        Model.State.RoomDisabledState roomDisabledState0 = new Model.State.RoomDisabledState();
        boolean boolean1 = roomDisabledState0.isBookable();
        boolean boolean2 = roomDisabledState0.isBookable();
        boolean boolean3 = roomDisabledState0.isBookable();
        Model.Room.Room room8 = new Model.Room.Room("COMPLETED", "hi!", (double) 100.0f, "2");
        roomDisabledState0.maintain(room8);
        room8.performMaintenance();
        Model.Room.AdminRoomProxy adminRoomProxy11 = new Model.Room.AdminRoomProxy(room8);
        java.lang.String str12 = room8.getRoomId();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "COMPLETED" + "'", str12, "COMPLETED");
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        Repository.ServiceRequestRepository serviceRequestRepository0 = Repository.ServiceRequestRepository.getInstance();
        Model.ServiceRequest.SensorEssentialServiceRequest sensorEssentialServiceRequest6 = new Model.ServiceRequest.SensorEssentialServiceRequest(1, "COMPLETED", "Service.AuthenticationException: ", (int) 'a', (int) (short) -1);
        java.lang.String str7 = sensorEssentialServiceRequest6.getStatus();
        Model.ServiceRequest.ServiceRequest serviceRequest8 = serviceRequestRepository0.addServiceRequest((Model.ServiceRequest.ServiceRequest) sensorEssentialServiceRequest6);
        int int9 = sensorEssentialServiceRequest6.getServiceRequestID();
        int int10 = sensorEssentialServiceRequest6.getServiceRequestID();
        org.junit.Assert.assertNotNull(serviceRequestRepository0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Service.AuthenticationException: " + "'", str7, "Service.AuthenticationException: ");
        org.junit.Assert.assertNotNull(serviceRequest8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        Model.User.FacultyUser facultyUser3 = new Model.User.FacultyUser("8", "", "src/main/data/users.csv");
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
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
        Repository.BookingRepository bookingRepository65 = Repository.BookingRepository.getInstance();
        java.time.LocalDate localDate69 = null;
        java.time.LocalDate localDate70 = null;
        java.time.LocalTime localTime71 = null;
        java.time.LocalTime localTime72 = null;
        Model.Room.Booking booking74 = new Model.Room.Booking("", "src/main/data/users.csv", "", localDate69, localDate70, localTime71, localTime72, "");
        java.lang.String str75 = booking74.getBookingId();
        Model.State.BookingState bookingState76 = null;
        booking74.setState(bookingState76);
        Model.State.CompletedState completedState78 = new Model.State.CompletedState();
        booking74.setState((Model.State.BookingState) completedState78);
        bookingRepository65.save(booking74);
        java.time.LocalTime localTime81 = booking74.getStartTime();
        cancelledState0.checkOut(booking74);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "COMPLETED" + "'", str12, "COMPLETED");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertNotNull(bookingRepository65);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertNull(localTime81);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
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
        java.lang.String str16 = roomEnabledState0.getStateName();
        java.lang.String str17 = roomEnabledState0.getStateName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ENABLED" + "'", str16, "ENABLED");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ENABLED" + "'", str17, "ENABLED");
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        Repository.SensorRepository sensorRepository0 = new Repository.SensorRepository();
        java.util.List<Model.Sensor.OccupancySensorData> occupancySensorDataList1 = sensorRepository0.getOccupancySensorLogsList();
        Model.Sensor.ScanIDSensorData scanIDSensorData2 = null;
        boolean boolean3 = sensorRepository0.writeScanIDSensorLog(scanIDSensorData2);
        Model.Sensor.OccupancySensor occupancySensor9 = new Model.Sensor.OccupancySensor("", "1", "1", "EECS3311 Course Project Database - Rooms.csv", true);
        boolean boolean10 = false; // flaky "72) test494(RegressionTest0)": sensorRepository0.writeSensor((Model.Sensor.Sensor) occupancySensor9);
        java.util.List<Model.Sensor.ScanIDSensorData> scanIDSensorDataList11 = sensorRepository0.getScanIDSensorLogsList();
        Model.Sensor.Sensor sensor13 = null; // flaky "49) test494(RegressionTest0)": sensorRepository0.getSensorByID("EECS3311 Course Project Database - Bookings.csv");
        java.time.LocalDateTime localDateTime16 = null;
        Model.Sensor.OccupancySensorData occupancySensorData17 = new Model.Sensor.OccupancySensorData("", "hi!", localDateTime16);
        java.time.LocalDateTime localDateTime18 = null;
        occupancySensorData17.dateTime = localDateTime18;
        boolean boolean20 = false; // flaky "31) test494(RegressionTest0)": sensorRepository0.writeOccupancySensorLog(occupancySensorData17);
        java.lang.String str21 = occupancySensorData17.getLogID();
// flaky "20) test494(RegressionTest0)":         org.junit.Assert.assertNotNull(occupancySensorDataList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "11) test494(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky "6) test494(RegressionTest0)":         org.junit.Assert.assertNotNull(scanIDSensorDataList11);
        org.junit.Assert.assertNull(sensor13);
// flaky "4) test494(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        Model.State.RoomDisabledState roomDisabledState0 = new Model.State.RoomDisabledState();
        boolean boolean1 = roomDisabledState0.isBookable();
        boolean boolean2 = roomDisabledState0.isBookable();
        Model.State.RoomReadyForEnableState roomReadyForEnableState3 = new Model.State.RoomReadyForEnableState();
        boolean boolean4 = roomReadyForEnableState3.isBookable();
        Model.Room.Room room9 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        roomReadyForEnableState3.disable(room9);
        roomDisabledState0.disable(room9);
        Model.State.RoomDisabledState roomDisabledState12 = new Model.State.RoomDisabledState();
        boolean boolean13 = roomDisabledState12.isBookable();
        Model.State.RoomReadyForEnableState roomReadyForEnableState14 = new Model.State.RoomReadyForEnableState();
        boolean boolean15 = roomReadyForEnableState14.isBookable();
        Model.Room.Room room20 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        roomReadyForEnableState14.disable(room20);
        roomDisabledState12.enable(room20);
        Model.State.RoomState roomState23 = room20.getState();
        roomDisabledState0.disable(room20);
        java.lang.String str25 = room20.getLocation();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(roomState23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        Model.State.RoomReadyForEnableState roomReadyForEnableState0 = new Model.State.RoomReadyForEnableState();
        boolean boolean1 = roomReadyForEnableState0.isBookable();
        Model.State.RoomDisabledState roomDisabledState2 = new Model.State.RoomDisabledState();
        boolean boolean3 = roomDisabledState2.isBookable();
        boolean boolean4 = roomDisabledState2.isBookable();
        boolean boolean5 = roomDisabledState2.isBookable();
        Model.Room.Room room10 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        boolean boolean11 = room10.isAvailable();
        roomDisabledState2.maintain(room10);
        Model.State.RoomReadyForEnableState roomReadyForEnableState13 = new Model.State.RoomReadyForEnableState();
        boolean boolean14 = roomReadyForEnableState13.isBookable();
        Model.Room.Room room19 = new Model.Room.Room("COMPLETED", "", (double) 100, "CHECKED_IN");
        roomReadyForEnableState13.disable(room19);
        room19.requestEnable();
        roomDisabledState2.maintain(room19);
        roomReadyForEnableState0.disable(room19);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        Service.EvaluateRoomMaintenanceRelationshipService evaluateRoomMaintenanceRelationshipService0 = Service.EvaluateRoomMaintenanceRelationshipService.getInstance();
        evaluateRoomMaintenanceRelationshipService0.notifyObservers();
        Service.RoomService roomService2 = new Service.RoomService();
        roomService2.update(true, (int) (short) 10);
        Model.Room.Booking booking7 = roomService2.getBookingDetails("src/main/data/users.csv");
        boolean boolean9 = roomService2.cancelBooking("hi!");
        Controller.AddRoomController addRoomController10 = new Controller.AddRoomController(roomService2);
        evaluateRoomMaintenanceRelationshipService0.removeObserver((Model.Room.Observer) roomService2);
        roomService2.savePayment("17", (double) 3);
        org.junit.Assert.assertNotNull(evaluateRoomMaintenanceRelationshipService0);
        org.junit.Assert.assertNull(booking7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        Service.RoomService roomService0 = new Service.RoomService();
        roomService0.update(true, (int) (short) 10);
        Model.Room.Booking booking5 = roomService0.getBookingDetails("src/main/data/users.csv");
        boolean boolean7 = roomService0.cancelBooking("hi!");
        Controller.AddRoomController addRoomController8 = new Controller.AddRoomController(roomService0);
        Controller.AdminSelectActionController adminSelectActionController9 = new Controller.AdminSelectActionController(addRoomController8);
        adminSelectActionController9.adminAddRoom("7", (int) (short) -1, (double) 'a');
        adminSelectActionController9.adminAddRoom("43", (int) (byte) 100, (double) 10.0f);
        adminSelectActionController9.adminAddRoom("17", 3, (double) 100.0f);
        org.junit.Assert.assertNull(booking5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        Model.ServiceRequest.SensorEssentialServiceRequest sensorEssentialServiceRequest5 = new Model.ServiceRequest.SensorEssentialServiceRequest(1, "COMPLETED", "Service.AuthenticationException: ", (int) 'a', (int) (short) -1);
        sensorEssentialServiceRequest5.isEssential = true;
        sensorEssentialServiceRequest5.isEssential = true;
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        Controller.AdminServiceRequestController adminServiceRequestController0 = new Controller.AdminServiceRequestController();
        adminServiceRequestController0.handleAddServiceRequest("4", false, "src/main/data/occupancy_sensor_logs.csv");
        java.util.ArrayList<Model.ServiceRequest.ServiceRequest> serviceRequestList5 = adminServiceRequestController0.handleServiceRequestListCompilation();
        // The following exception was thrown during execution in test generation
        try {
            adminServiceRequestController0.handleAddServiceRequest("PARTNER", true, "FACULTY");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"FACULTY\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serviceRequestList5);
    }
}
