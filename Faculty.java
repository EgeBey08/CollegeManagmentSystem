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
    public Department getDepartment(String departmentName){
        for(Department department : departmentList){
            if(department.getName() == departmentName){
                return department;
            }
        }
        return null;
    }
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
