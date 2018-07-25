// Print the Fibonacci number
import java.util.*;
class Fibonacci
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n,n1=0,n2=1,n3,i,count;
System.out.println("enter the total number\n");
count=sc.nextInt();
System.out.println("\n"+n1+"\n"+n2);
for(i=2;i<count;i++)
{
n3=n1+n2;
System.out.print(n3+"\n");    
n1=n2;    
n2=n3;
}

}
}
     

