package PersonInterface;

public class OfficeWorker extends Worker{
    private String shift;

    public String getShift(){
        return shift;
    }
    public void setShift(String shift){
        this.shift = shift;
    }
}
