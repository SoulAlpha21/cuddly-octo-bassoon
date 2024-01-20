import java.util.*;
class PROJECT//class begins
{
public static void main()
{//main begins
int n,x,i,j,l,k,f=0,ch,ch1,ch2,ch3,ch4,q;char cha,z;String w="",a,b;
Scanner sc=new Scanner(System.in);
System.out.println("Enter 1 for pattern");
System.out.println("Enter 2 for string");
ch=sc.nextInt();
if(ch==1)
{
System.out.println("Enter 1 for triangle");
System.out.println("Enter 2 for square");
ch2=sc.nextInt();
System.out.println("Enter line number and element to fill: ");
n=sc.nextInt();
z=sc.next().charAt(0);
if(ch2==1)
{
System.out.println("Enter 1 for  equilateral triangle");
System.out.println("Enter 2 for right angle triangle");
ch3=sc.nextInt();
if(ch3==1)
{
q=n;
for(i=1;i<=n;i++)
{
for(j=1;j<=q;j++)
System.out.print(' ');
for(k=1;k<=i;k++)
System.out.print(z+" ");
System.out.println();
q--;
}
}
else
{
for(i=1;i<=n;i++)
{
for(j=1;j<=i;j++)
System.out.print(z+" ");
System.out.println();
}
}
}
else
{
for(i=1;i<=n;i++)
{
for(j=1;j<=n;j++)
System.out.print(z+" ");
System.out.println();
}
}
}
else
{
System.out.println("Enter string : ");
a=sc.nextLine();
a=sc.nextLine();
a=a+" ";
System.out.println("Enter 1 for  search");
System.out.println("Enter 2 for search and replace");
System.out.println("Enter 3 for search and delete");
ch4=sc.nextInt();
System.out.println("Enter word to search : ");
b=sc.next();
l=a.length();
if(ch4==1)
{
for(i=0;i<l;i++)
{
cha=a.charAt(i);
if(cha!=' ')
w=w+cha;
else
{
if(w.equals(b))
{
f=1;break;}
w="";
}
}
if(f==1)
System.out.println("Present");
else
System.out.println("Not Present");
}
if(ch4==2)
{
System.out.println("Enter word to replace : ");
String t=sc.next();
for(i=0;i<l;i++)
{
cha=a.charAt(i);
if(cha!=' ')
w=w+cha;
else
{
if(w.equals(b))
w=t;
System.out.print(w+" ");
w="";
}
}
}
if(ch4==3)
{
for(i=0;i<l;i++)
{
cha=a.charAt(i);
if(cha!=' ')
w=w+cha;
else
{
if(!(w.equals(b)))
System.out.print(w+" ");
w="";
}
}
}
}
}
}