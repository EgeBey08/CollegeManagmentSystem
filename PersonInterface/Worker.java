package PersonInterface;

import java.sql.Date;
import java.util.UUID;

public class Worker implements IPerson{
    private UUID id;
    private int salary;
    private Date startingDate;

    public UUID getID(){ // set id olamaz herhalde ?
        return id;
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
