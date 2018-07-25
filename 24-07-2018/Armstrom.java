// find the number is armstrom or not
import java.util.*;
class Armstrom
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n,a,sum=0,r;
System.out.println("enter the number\n");
n=sc.nextInt();
a=n;
while(n>0)
{
r=n%10;
sum=sum+(r*r*r);
n=n/10;
}
if(sum==a)
{
System.out.println("armstrom\n");
}
else{
System.out.println("not armstrom\n");
}
}
}
     

