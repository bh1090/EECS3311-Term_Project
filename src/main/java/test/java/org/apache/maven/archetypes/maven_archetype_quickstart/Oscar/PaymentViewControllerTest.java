package test.java.org.apache.maven.archetypes.maven_archetype_quickstart.Oscar;

import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

import javax.swing.*;

import org.junit.jupiter.api.*;
import org.mockito.MockedStatic;

import Application.SessionData;
import Controller.PaymentViewController;
import Model.User.StudentUser;
import Service.RoomService;
import View.PaymentView;

public class PaymentViewControllerTest {
	PaymentView view;
    RoomService service;
    PaymentViewController controller;
    MockedStatic<SessionData> sessionMock;
    @BeforeEach
    void setUp() {
    	sessionMock = mockStatic(SessionData.class);
    	StudentUser fakeUser = new StudentUser("User54", "mail7", "pwd");
    	sessionMock.when(SessionData::getCurrentUser).thenReturn(fakeUser);
        view = mock(PaymentView.class);
        service = mock(RoomService.class);
        
        view.bookingIDTextField = new JTextField(1);
        view.institutionalBillingCheckBox = new JCheckBox("Institutional billing");
        view.cardNumberTextField = new JTextField(1);
        view.expiryTextField = new JTextField(1);
        view.ccvTextField = new JTextField(1);
        view.backButton = new JButton("Back");
        view.payButton = new JButton("Pay");
        
        controller = new PaymentViewController(view, service);
    }
    @AfterEach
    void setDown() {
    	sessionMock.close();
    }
	@Test
	void test0() {
		view.institutionalBillingCheckBox.setSelected(false);
        view.cardNumberTextField.setText("1234567812345678");
        view.expiryTextField.setText("1234");
        view.ccvTextField.setText("123");
        
        view.payButton.doClick();

        verify(service).savePayment(startsWith("TXN-"), eq(20.0));

        verify(view).dispose();
	}
	@Test
	void test1() {
		view.institutionalBillingCheckBox.setSelected(true);
        view.cardNumberTextField.setText("1234567812345678");
        view.expiryTextField.setText("1234");
        view.ccvTextField.setText("123");
        
        view.payButton.doClick();

        verify(service).savePayment(startsWith("TXN-"), eq(20.0));

        verify(view).dispose();
	}
	@Test
	void test2() {
		view.institutionalBillingCheckBox.setSelected(false);
        view.cardNumberTextField.setText("35");
        view.expiryTextField.setText("1234");
        view.ccvTextField.setText("123");
        try (MockedStatic<JOptionPane> msgMock = mockStatic(JOptionPane.class)) {
        	view.payButton.doClick();
        	msgMock.verify(() -> JOptionPane.showMessageDialog(null, "invalid parameters"));
        }
	}
	@Test
	void test3() {
		view.institutionalBillingCheckBox.setSelected(false);
        view.cardNumberTextField.setText("123456781234567a");
        view.expiryTextField.setText("1234");
        view.ccvTextField.setText("123");
        try (MockedStatic<JOptionPane> msgMock = mockStatic(JOptionPane.class)) {
        	view.payButton.doClick();
        	msgMock.verify(() -> JOptionPane.showMessageDialog(null, "invalid parameters"));
        }
	}
	@Test
	void test4() {
		view.institutionalBillingCheckBox.setSelected(false);
        view.cardNumberTextField.setText("1234567812345678");
        view.expiryTextField.setText("123");
        view.ccvTextField.setText("123");
        try (MockedStatic<JOptionPane> msgMock = mockStatic(JOptionPane.class)) {
        	view.payButton.doClick();
        	msgMock.verify(() -> JOptionPane.showMessageDialog(null, "invalid parameters"));
        }
	}
	@Test
	void test5() {
		view.institutionalBillingCheckBox.setSelected(false);
        view.cardNumberTextField.setText("1234567812345678");
        view.expiryTextField.setText("123a");
        view.ccvTextField.setText("123");
        try (MockedStatic<JOptionPane> msgMock = mockStatic(JOptionPane.class)) {
        	view.payButton.doClick();
        	msgMock.verify(() -> JOptionPane.showMessageDialog(null, "invalid parameters"));
        }
	}
	@Test
	void test6() {
		view.institutionalBillingCheckBox.setSelected(false);
        view.cardNumberTextField.setText("1234567812345678");
        view.expiryTextField.setText("1234");
        view.ccvTextField.setText("12");
        try (MockedStatic<JOptionPane> msgMock = mockStatic(JOptionPane.class)) {
        	view.payButton.doClick();
        	msgMock.verify(() -> JOptionPane.showMessageDialog(null, "invalid parameters"));
        }
	}
	@Test
	void test7() {
		view.institutionalBillingCheckBox.setSelected(false);
        view.cardNumberTextField.setText("1234567812345678");
        view.expiryTextField.setText("1234");
        view.ccvTextField.setText("12d");
        try (MockedStatic<JOptionPane> msgMock = mockStatic(JOptionPane.class)) {
        	view.payButton.doClick();
        	msgMock.verify(() -> JOptionPane.showMessageDialog(null, "invalid parameters"));
        }
	}
	@Test
	void test8() {
		view.institutionalBillingCheckBox.setSelected(true);
        view.cardNumberTextField.setText("123456781fdsagdaggfadgg2345678");
        view.expiryTextField.setText("123fdshfdshsha");
        view.ccvTextField.setText("12gfdshfshf3");
        try (MockedStatic<JOptionPane> msgMock = mockStatic(JOptionPane.class)) {
        	view.payButton.doClick();
        	verify(service).savePayment(startsWith("TXN-"), eq(20.0));
            verify(view).dispose();
        }
	}
	@Test
	void test9() {
		view.institutionalBillingCheckBox.setSelected(true);
        view.cardNumberTextField.setText("1234567812345678");
        view.expiryTextField.setText("1234");
        view.ccvTextField.setText("12q");
        try (MockedStatic<JOptionPane> msgMock = mockStatic(JOptionPane.class)) {
        	view.backButton.doClick();
            verify(view).dispose();
        }
	}
}
