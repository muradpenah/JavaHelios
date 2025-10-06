package lesson8.Classwork;

public class Student extends User implements ExamParticipant {
    private String major;
    public Student(int id, String name,String major) {
        super(id, name);
        this.major=major;
    }

    public String getMajor() {
        return major;
    }

    @Override
    public void getDetails() {
        System.out.println(getId()+" -> Nomreli Ad: "+getName()+" Ixtisas:"+getMajor()+" telebe");
    }

    @Override
    public void takeExam() {
        getDetails();
        System.out.println(" imtahanda istirak edir");
    }
}
