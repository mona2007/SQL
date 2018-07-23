// Calculate the area and simple interest
import java.util.*;
class Area
{
public static void main(String args[])
{
int num1, num2, num3,num4;
float principle, simple, rate, time;

System.out.println("enter the all 3 side of the triangle\n");
Scanner sc = new Scanner(System.in);
num1 = sc.nextInt();
num2 = sc.nextInt();

num4 = (num1*num2)/2;
System.out.println("Area of triangle is:\n"+num4);

System.out.println("Enter the radius of circle\n");
num3 = sc.nextInt();
double pi = 3.14, area;
area= pi * num3 * num3;
System.out.println("Area of circle is:\n"+area);

System.out.println("Enter the year\n");
time = sc.nextInt();
System.out.println("Enter the rate\n");
rate = sc.nextInt();
System.out.println("Enter the principle\n");
principle = sc.nextInt();
simple= (principle * rate * time)/100;
System.out.println("The simple interest is\n"+simple);


}
}