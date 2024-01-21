import java.util.ArrayList;

public class Department {
    private String name;
    private String location;
    private ArrayList<Classroom> classroomList = new ArrayList<>();
    private ArrayList<Office> officeList = new ArrayList<>();

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    //---------------------------------\\
    public String getLocation(){
        return this.location;
    }
    public void setLocation(String location){
        this.location = location;
    }
    //---------------------------------\\
    public ArrayList<Classroom> getClassroomList(){
        return classroomList;
    }
    public void addClassroom(Classroom classroom){
        classroomList.add(classroom);
    }
    public void removeClassroom(Classroom clasroom){
        classroomList.add(clasroom);
    }
    //---------------------------------\\
    public ArrayList<Office> getOfficeList(){ // diyagramda direk getOffice yazıyordu ben bu şekilde yaptım.
        return officeList;
    }
    public void addOffice(Office office){
        officeList.add(office);
    }
    public void removeOffice(Office office){
        officeList.add(office);
    }
}
