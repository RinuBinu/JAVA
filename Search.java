import java.util.Scanner;
public class Search
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the size of the array:");
int size=sc.nextInt();
int array[]=new int[size];
System.out.print("Enter the elements of array:");
for(int i=0;i<size;i++)
{
System.out.print("Enter the element to search:");
int searchElement=sc.nextInt();
boolean found=false;
for (int j=0;j<size;j++)
{
if(array[i]==searchElement)
{
found=true;

System.out.println("Element found at index"+i);
break;
}
}
if(!found)
System.out.println("Element not found in the array");
}
}
}
