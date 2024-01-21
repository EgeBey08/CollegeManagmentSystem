import java.util.ArrayList;

public class CollegeManagmentSystem {
    
}

class University {
    private String name;
    private String location;
    private ArrayList<Faculty> facultyList = new ArrayList<>();
    
    //---------------------------------\\
    public String setName(){
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
    public ArrayList<Faculty> getFacultyList(){
        return facultyList;
    }
    public void addFaculty(Faculty faculty){
        facultyList.add(faculty);
    }
    public void removeFaculty(Faculty faculty){
        facultyList.remove(faculty);
    }
    
}

class Faculty {
    private String name;
    private String location;
    //---------------------------------\\
    public String setName(){
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
}
        