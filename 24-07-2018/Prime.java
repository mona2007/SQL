// find the number is prime or not
import java.util.*;
class Prime
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int number,count1=0,count2=0;
System.out.println("enter the number\n");
number=sc.nextInt();
for(int i=1; i<=number;i++)
{
if(number%i==0)
{
count1++;
}
}
if(count1==2)
{
System.out.println("prime\n");
}
else{
System.out.println("not prime\n");
}
                                                               }}

