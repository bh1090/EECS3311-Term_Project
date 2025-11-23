package database;

public class Database { //PLACEHOLDER
	private static Database singleton;
	public final String usersPath;
	public final String roomsPath;
	public final String bookingssPath;
	public final String nonSensorMaintenanceRequestsPath;
	public final String sensorMaintenanceRequestsPath;
	public final String sensorsPath;
	public final String occupancySensorLogsPath;
	public final String scanIDSensorLogsPath;
	
	private Database() {
		this.usersPath = "";
		this.roomsPath = "";
		this.bookingssPath = "";
		this.nonSensorMaintenanceRequestsPath = "";
		this.sensorMaintenanceRequestsPath = "";
		this.sensorsPath = "";
		this.occupancySensorLogsPath = "";
		this.scanIDSensorLogsPath = "";
	}

	public static Database getInstance() {
		if (Database.singleton == null) {
			Database.singleton = new Database();
		}
		return singleton;
	}
}
