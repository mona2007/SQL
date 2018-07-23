// find the Marks of 3 subject and calculate grade and percentage
import java.util.*;
class SubjectMarks
{
public static void main(String args[])
{
int num1, num2, num3, num4,num5;
System.out.println("enter the all 3 subject marks\n");
Scanner sc = new Scanner(System.in);
num1 = sc.nextInt();
num2 = sc.nextInt();
num3 = sc.nextInt();

//num4=(num1+num2+num3)/3;
//System.out.println("The average of 3 subject marks is:  \n"+num4);

num5=(100*(num1+num2+num3))/300;
System.out.println("Total percentage is: \n"+num5);
if(num5>40 && num5<50)
{
System.out.println("Just Pass\n");
}
else if(num5>50 && num5<60)
{
System.out.println(" Pass\n");
}
else if(num5>70 && num5<90)
{
System.out.println("Distinction\n");
}
else
{
System.out.println("Excellent\n");
}
}
}