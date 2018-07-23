//check the user enter is a then perform addition otherwise invalid

import java.util.*;
class AdditionPer
{
public static void main(String args[])
{
char ch;
Scanner sc = new Scanner(System.in);
int num1, num2, num3;

System.out.println("enter the value\n");
ch = sc.next().charAt(0);
if(ch==65 || ch==97)
{
System.out.println("enter the 2 numbers\n");
num1 = sc.nextInt();
num2 = sc.nextInt();

num3=num1+num2;
System.out.println("Addition is\n"+num3);

}
else
{
System.out.println("invalid choice\n");
}
}
}