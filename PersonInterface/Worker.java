package PersonInterface;

import java.sql.Date;
import java.util.UUID;

public class Worker implements IPerson{
    private String name;
    private UUID IIID;
    private int salary;
    private Date startingDate;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    //---------------------------------\\
    public UUID getID(){ 
        return IIID;
    }
    //---------------------------------\\
    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    //---------------------------------\\
    public Date getStartingDate(){
        return startingDate;
    }
}
