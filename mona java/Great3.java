// find the greatest of 3 number
import java.util.*;
class Great3
{
public static void main(String args[])
{
int num1, num2, num3;
System.out.println("enter the value\n");
Scanner sc = new Scanner(System.in);
num1 = sc.nextInt();
num2 = sc.nextInt();
num3 = sc.nextInt();
if(num1>num2)
{
System.out.println("Greater value is:  "+num1);
}
else if(num2>num3)
{
System.out.println("Greater value is:  "+num2);
}
else
{
System.out.println("Greater value is:  "+num3);
}
}
}