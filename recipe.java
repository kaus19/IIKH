import java.util.Scanner;
class recipe
{
int i,j=1,d,e,count=1;
String[] rec1=new String[100];
String[] rec2=new String[100];
String[] rec3=new String[100];

void rec()
{
System.out.println("Enter :");
System.out.println("1 to Add a recipe");
System.out.println("2 to View existing recipies");
System.out.println("3 to Modify a recipe");
System.out.println("4 to Delete a recipe");

Scanner sc1=new Scanner(System.in);
int m=sc1.nextInt();

switch (m)
{
case 1:
{
System.out.println("Enter recipe name");
Scanner sc=new Scanner(System.in);
rec1[count]=sc.nextLine();
System.out.println("Enter recipe ingriedients");
rec2[count]=sc.nextLine();
System.out.println("Enter recipe method");
rec3[count]=sc.nextLine();
count++;
}
break;

case 2: 
print();
break;

case 3:
{
print();
System.out.println("Enter recipe no. which is to be modified");
d=sc1.nextInt();
System.out.println("Modify: 1-Recipe name   2-Recipe Ingredient    3-Recipe method");
e=sc1.nextInt();
Scanner sc2=new Scanner(System.in);
switch (e)
{
case 1:
{
System.out.println("Enter New Recipe name");
rec1[d]=sc2.nextLine();
}break;

case 2:
{
System.out.println("Enter New Recipe Ingredients");
rec2[d]=sc2.nextLine();
}break;

case 3:
{
System.out.println("Enter New Recipe method");
rec3[d]=sc2.nextLine();
}break;

default:
System.out.println("Wrong Input");
break;
}
}
break;

case 4:
{
i=1;j=1;
print();
i=1;j=1;
System.out.println("Enter recipe no. which is to be deleted");
d=sc1.nextInt();
count--;
while(rec1[i]!=null)
{
if(d!=i)
{
rec1[j]=rec1[i];
rec2[j]=rec2[i];
rec3[j]=rec3[i];
j++;
}
i++;
}
rec1[j]=null;
rec2[j]=null;
rec3[j]=null;
}
break;

default:
System.out.println("Wrong Input");
break;
}
}

int print()
{
i=1;
System.out.println();
if(rec1[i]==null)
{
System.out.println("Sorry! No recipe found in database ");
return 1;
}
while(rec1[i]!=null)
{
System.out.println("Recipe no. "+(i));
System.out.println("Recipe name is: "+rec1[i]);
System.out.println("Recipe ingredients are: "+rec2[i]);
System.out.println("Recipe method is: "+rec3[i]);
System.out.println();
i++;
}
return 0;
}

void meal1()
{int p,h;
int[] meal2=new int[4];
int[][] meal=new int[4][8];
int l=print();
if(l==0)
{
System.out.println("Enter 1 to plan for a day and 2 to plan for a week");
Scanner sc=new Scanner(System.in);
h=sc.nextInt();
if(h==1)
{
System.out.println("Enter serial no. of recipe which you want for breakfast");
meal2[1]=sc.nextInt();
System.out.println("Enter serial no. of recipe which you want for lunch");
meal2[2]=sc.nextInt();
System.out.println("Enter serial no. of recipe which you want for dinner");
meal2[3]=sc.nextInt();

System.out.println("Breakfast name: "+rec1[meal2[1]]);
System.out.println("Breakfast ingredients: "+rec2[meal2[1]]);
System.out.println("Breakfast method: "+rec3[meal2[1]]);
System.out.println();
System.out.println("Lunch name: "+rec1[meal2[2]]);
System.out.println("Lunch ingredients: "+rec2[meal2[2]]);
System.out.println("Lunch method: "+rec3[meal2[2]]);
System.out.println();
System.out.println("Dinner name: "+rec1[meal2[3]]);
System.out.println("Dinner ingredients: "+rec2[meal2[3]]);
System.out.println("Dinner method: "+rec3[meal2[3]]);
System.out.println();
}
else if(h==2)
{
for(p=1;p<=7;p++)
{
System.out.println();
System.out.println();
switch (p)
{
case 1:
{
System.out.println("Enter serial no. of recipe which you want for breakfast on Monday");
meal[1][1]=sc.nextInt();
System.out.println("Enter serial no. of recipe which you want for lunch on Monday");
meal[2][1]=sc.nextInt();
System.out.println("Enter serial no. of recipe which you want for dinner on Monday");
meal[3][1]=sc.nextInt();
}break;

case 2:
{
System.out.println("Enter serial no. of recipe which you want for breakfast on Tuesday");
meal[1][2]=sc.nextInt();
System.out.println("Enter serial no. of recipe which you want for lunch on Tuesday");
meal[2][2]=sc.nextInt();
System.out.println("Enter serial no. of recipe which you want for dinner on Tuesday");
meal[3][2]=sc.nextInt();
}break;

case 3:
{
System.out.println("Enter serial no. of recipe which you want for breakfast on Wednesday");
meal[1][3]=sc.nextInt();
System.out.println("Enter serial no. of recipe which you want for lunch on Wednesday");
meal[2][3]=sc.nextInt();
System.out.println("Enter serial no. of recipe which you want for dinner on Wednesday");
meal[3][3]=sc.nextInt();
}break;

case 4:
{
System.out.println("Enter serial no. of recipe which you want for breakfast on Thursday");
meal[1][4]=sc.nextInt();
System.out.println("Enter serial no. of recipe which you want for lunch on Thursday");
meal[2][4]=sc.nextInt();
System.out.println("Enter serial no. of recipe which you want for dinner on Thursday");
meal[3][4]=sc.nextInt();
}break;

case 5:
{
System.out.println("Enter serial no. of recipe which you want for breakfast on Friday");
meal[1][5]=sc.nextInt();
System.out.println("Enter serial no. of recipe which you want for lunch on Friday");
meal[2][5]=sc.nextInt();
System.out.println("Enter serial no. of recipe which you want for dinner on Friday");
meal[3][5]=sc.nextInt();
}break;
case 6:
{
System.out.println("Enter serial no. of recipe which you want for breakfast on Saturday");
meal[1][6]=sc.nextInt();
System.out.println("Enter serial no. of recipe which you want for lunch on Saturday");
meal[2][6]=sc.nextInt();
System.out.println("Enter serial no. of recipe which you want for dinner on Saturday");
meal[3][6]=sc.nextInt();
}break;

case 7:
{
System.out.println("Enter serial no. of recipe which you want for breakfast on Sunday");
meal[1][7]=sc.nextInt();
System.out.println("Enter serial no. of recipe which you want for lunch on Sunday");
meal[2][7]=sc.nextInt();
System.out.println("Enter serial no. of recipe which you want for dinner on Sunday");
meal[3][7]=sc.nextInt();
}break;

}
}
for(p=1;p<=7;p++)
{
System.out.println("Day "+p);
System.out.println("Breakfast "+rec1[meal[1][p]]);
System.out.println("Lunch "+rec1[meal[2][p]]);
System.out.println("Dinner "+rec1[meal[3][p]]);
System.out.println();
}
}
}
}
}
