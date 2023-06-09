package StudentDomen;

public class Teacher extends Person{
    private String acadDegree;
    public Teacher(String firstName, String secondName, int age, String acadDegree) {
        super(firstName, secondName, age);
        this.acadDegree = acadDegree;
    }
    public void setAcademDegree(String acadDegree){
        this.acadDegree = acadDegree;
    }
    public String getAcademDegree(){
        return acadDegree;
    } 
    @Override
    public String toString() {
        return "Teacher{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age +
                ", acadDegree=" + acadDegree +
                '}';
    }
}
