// find the factroial number
import java.util.*;
class Factroial
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n,fact=1;
System.out.println("enter the number\n");
n=sc.nextInt();
for(int i=1;i<=n;i++)
{
fact = fact*i;
}
System.out.println("factroial number is \n"+fact);
}
}
     

