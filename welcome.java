import java.util.Scanner; 

class welcome
{
int k;
public static void main(String[] args)
{
int b=0;
System.out.println("Welcome To IIKH");
Scanner sc=new Scanner(System.in);
//recipe ob=new recipe();
recipe ob[]=new recipe[10];
while(true)
{
System.out.println();
System.out.println("User "+(b+1));
b=b+1;
ob[b]=new recipe();
while(true)
{  
System.out.println("Enter n: 1 to access database and 2 for planning and 3 for another user");
int n=sc.nextInt();
if(n==1)
{
System.out.println();
ob[b].rec();
}
else if(n==2)
{
ob[b].meal1();
}
else if(n==3)
break;
else
System.out.println("Wrong Input");
}
}
}
}
