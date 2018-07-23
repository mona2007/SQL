// check the triangle is iso, scalar, equilateral triangle
import java.util.*;
class Triangle
{
public static void main(String args[])
{
int num1, num2, num3,num4;
System.out.println("enter the all 3 side of the triangle\n");
Scanner sc = new Scanner(System.in);
num1 = sc.nextInt();
num2 = sc.nextInt();
num3 = sc.nextInt();

if(num1 == num2 && num2 == num3)
{
System.out.println("It is equilateral triangle\n");
}
else if (num1==num2 || num2==num3 || num3==num1)
{
System.out.println("It is Isoscales triangle\n");
}
else 
{
System.out.println("It is Scaler triangle\n");
}

}
}