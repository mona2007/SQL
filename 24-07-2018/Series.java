import java.util.*;
class Series{
public static void main(String args[])
{
     int i,n,x,r=1,sum=0;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the value of X:");
     x = sc.nextInt();
     System.out.println("\nEnter the value of range for series:");
     n = sc.nextInt();
     for(i=1;i<=n;i++)
     {
         r=r*x;
         sum+=r;
	 System.out.println(+x+"^"+i+"+");
     }
    
     System.out.println("\n"+sum);
 }
}