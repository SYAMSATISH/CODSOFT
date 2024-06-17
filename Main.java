import java.util.Scanner;
class GradeCalculator
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number of subjects:");
        int numsubjects = scanner.nextInt();
        int totalMarks =  0;
        for(int i=1;i<=numsubjects;i++)
        {
            System.out.println("Enter marks obtained in subject" + i+ ":");
            int marks = scanner.nextInt();
            totalMarks += marks;
        }
        double avarageParcentage = (double) totalMarks  /numsubjects ;

        char garde;

        if( avarageParcentage >= 85)
        {
            garde = 'A';
        }
        else if(avarageParcentage >= 80)
        {
            garde = 'B';
        }
        else if(avarageParcentage >= 75)
        {
            garde = 'C';
        }
        else if(avarageParcentage >= 65)
        {
            garde = 'D';
        }
        else if(avarageParcentage >= 50) {
            garde = 'E';
        }
            else
            {
                garde= 'F';
            }
            System.out.println("Grade: " + garde);
            scanner.close();
    }
}