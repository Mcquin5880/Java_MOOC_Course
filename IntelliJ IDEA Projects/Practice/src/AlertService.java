import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

class AlertService {
    private final MapAlertDAO storage = new MapAlertDAO();
    private AlertDAO alertDAO;

    public AlertService(AlertDAO alertDAO) {
        this.alertDAO = alertDAO;
    }

    public UUID raiseAlert() {
        //return this.storage.addAlert(new Date());
        return this.alertDAO.addAlert(new Date());
    }

    public Date getAlertTime(UUID id) {
        //return this.storage.getAlert(id);
        return this.alertDAO.getAlert(id);
    }
}

class MapAlertDAO implements AlertDAO {
    private final Map<UUID, Date> alerts = new HashMap<UUID, Date>();

    public UUID addAlert(Date time) {
        UUID id = UUID.randomUUID();
        this.alerts.put(id, time);
        return id;
    }

    public Date getAlert(UUID id) {
        return this.alerts.get(id);
    }
}

interface AlertDAO {
    UUID addAlert(Date time);
    Date getAlert(UUID id);
}