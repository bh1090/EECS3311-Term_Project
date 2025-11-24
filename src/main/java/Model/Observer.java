package Model;

import javax.security.auth.Subject;

public interface Observer {
    void update(boolean isAnyEssentialMaintenanceRequestPending, int currentRoomID);
}