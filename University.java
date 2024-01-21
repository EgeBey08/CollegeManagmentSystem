import java.util.ArrayList;

public class University {
    private String name;
    private String location;
    private ArrayList<Faculty> facultyList = new ArrayList<>();
    
    public String setName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    //---------------------------------\\
    public String getLocation(){
        return location;
    }
    public void setLocation(String location){
        this.location = location;
    }
    //---------------------------------\\
    public Faculty getFaculty(String facultyName){
        for(Faculty faculty : facultyList){
            if(faculty.getName() == facultyName){
                return faculty;
            }
        }
        return null;
    }
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
