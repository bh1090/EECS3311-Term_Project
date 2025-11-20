package controller;
import service.SensorService;
import service.CheckinService;

public class CheckinController {
	final SensorService sensorService;
	final CheckinService checkinService;
	public CheckinController(SensorService sensorService, CheckinService checkinService) {
		this.sensorService = sensorService;
		this.checkinService = checkinService;
	}
}
