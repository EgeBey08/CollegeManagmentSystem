import java.util.ArrayList;
import PersonInterface.OfficeWorker;

import java.util.UUID;

public class Office {
    private String name;
    private ArrayList<OfficeWorker> officeWorkerList= new ArrayList<>();

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    //---------------------------------\\
    public OfficeWorker getOfficeWorker(UUID id){
        for(OfficeWorker officeWorker : officeWorkerList){
            if(officeWorker.getID() == id){
                return officeWorker;
            }
        }
        return null;
    }
    public void addOfficeWorker(OfficeWorker officeWorker){
        officeWorkerList.add(officeWorker);
    }
    public void removeOfficeWorker(OfficeWorker officeWorker){
        officeWorkerList.add(officeWorker);
    }
}
