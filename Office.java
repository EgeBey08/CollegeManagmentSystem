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
    public ArrayList<OfficeWorker> getOfficeWorkerList(){
        return officeWorkerList;
    }
    public void addOfficeWorker(OfficeWorker officeWorker){
        officeWorkerList.add(officeWorker);
    }
    public void removeOfficeWorker(OfficeWorker officeWorker){
        officeWorkerList.add(officeWorker);
    }
}
