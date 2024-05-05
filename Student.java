package schoolManagement;

/**
 * Created by Nishtha.
 * This class is responsible for keeping the track of students fees, name ,grade & fees paid.
 */
public class Student {

    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    public Student(int id, String name,int grade){
        this.feesPaid=0;
        this.feesTotal=30000;
        this.id=id;
        this.name=name;
        this.grade=grade;

    }


    //Used to update the student's grade.
    public void setGrade(int grade){
        this.grade=grade;
    }

    public void payFees(int fees){
        feesPaid+=fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    //return id of the student.

    public int getId() {
        return id;
    }

    //return name of the student.
    public String getName() {
        return name;
    }
    //return the grade of the student.
    public int getGrade() {
        return grade;
    }
    //return fees paid by the student.
    public int getFeesPaid() {
        return feesPaid;
    }

    //return the total fees of the student.
    public int getFeesTotal() {
        return feesTotal;
    }

    //return the remaining fees.
    public int getRemainingFees(){
        return feesTotal-feesPaid;
    }

    @Override
    public String toString() {
        return "Student's name :"+name+
                " Total fees paid so far $"+ feesPaid;
    }
}