package PersonInterface;

public class Assistant extends Academician implements IStudent{
    private String name;
    private double averageGrade;
    @Override
    public String getName() {
        return name;
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public double getAverageGrade() {
        return averageGrade;
    }
}
