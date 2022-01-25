package accessmodificatorresearch;

import java.util.Date;

public class ChildAAccessResearch extends BaseAccessResearch {

     @Override
     public String CalculateDate() {
         return "ChildAAccessResearch.CalculateDate(): " + new Date();
     }
}
