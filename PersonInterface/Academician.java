package PersonInterface;

public class Academician extends Worker{
    private String mainField;

    public String getField(){
        return mainField;
    }
    public void setField(String field){
        mainField = field;
    }
}
