// find the number is even/odd
import java.util.*;
class EvenOdd
{
public static void main(String args[])
{
int num1=0, num2=0;
for(int i=1;i<=100;i++)
{
if(i%2==0)
{
System.out.println("Even\n"+i);
num1++;
}
else
{
System.out.println("Odd\n"+i);
num2++;
}
System.out.println(num1+num2);
}
}
}
