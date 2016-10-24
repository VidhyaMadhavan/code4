import java.io.*;
import java.util.*;
class oddnumber
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
 
int n,n1,count=0;
System.out.println("Enter first interval:");
n=sc.nextInt();
System.out.println("Enter second interval:");
n1=sc.nextInt();
for(int i=n;i<=n1;i++)
{
if(1%2==0)
{
count++;
}
else
{
System.out.println(i);
}
}
}
}

