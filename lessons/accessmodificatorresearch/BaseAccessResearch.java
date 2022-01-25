package accessmodificatorresearch;

import java.util.Date;
import java.util.UUID;

public class BaseAccessResearch {

    String CalculateDate() {
        return "BaseAccessResearch.CalculateDate(): " + new Date();
    }

    public String TrimString() {
        return "BaseAccessResearch.TrimString(): " + UUID.randomUUID();
    }

    public String RunTimer() {
        return "BaseAccessResearch.RunTimer(): " + UUID.randomUUID();
    }
}
