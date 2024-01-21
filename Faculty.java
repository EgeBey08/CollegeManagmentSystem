import java.util.ArrayList;

public class Faculty {
    private String name;
    private String location;
    private ArrayList<Department> departmentList = new ArrayList<>();

    public String getName(){
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
    public ArrayList<Department> getDepartmentList(){
        return departmentList;
    }
    public void addDepartment(Department department){
        departmentList.add(department);
    }
    public void removeDepartment(Department department){
        departmentList.remove(department);
    }
}
