package ClassTest_02.Question_01;
public class GradeAssignment 
{
    public char getGrade(String strMarks)
    {
        int marks = Integer.parseInt(strMarks);
        if(marks>= 70 && marks<=100) {return 'A';}
        else if(marks>= 70 && marks<=100) {return 'B';}
        else if(marks>= 40 && marks<=69) {return 'C';}
        else if(marks>= 10 && marks<=39) {return 'D';}
        else if(marks>=0 && marks<=9) {return 'D';}
        else
        {
            throw new IndexOutOfBoundsException("Marks is out of bounds <0 or >100");
        }
    }
}
