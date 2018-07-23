//check the user enter is alphabet, digit, special symbols

import java.util.*;
class Userchar
{
public static void main(String args[])
{
char ch;
Scanner sc = new Scanner(System.in);

System.out.println("enter the value\n");
ch = sc.next().charAt(0);
if(ch>64 && ch<91)
{
System.out.println("It is in upper case\n");
}
else if(ch>96 && ch<123)
{
System.out.println("It is in lower case\n");
}
else if(ch>47 && ch<58)
{
System.out.println("It is in digit\n");
}

else
{
System.out.println("It is special symbol\n");
}
}
}