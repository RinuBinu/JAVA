import java.util.Scanner;
import java.util.Arrays;
public class SortName
{
public static void main(String[]args)
{
int i,j;
String temp;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number of String");
int num=sc.nextInt();
sc.nextLine();
String Word[]=new String[num];
System.out.println("Enter Strings");
for(i=0;i<num;i++)
   Word[i]=sc.nextLine();
for(i=0;i<num-1;i++)
  for(j=i+1;j<num;j++)
    if(Word[i].compareTo (Word[j]) > 0 )
{
  temp=Word[i];
  Word[i]=Word[j];
  Word[j]=temp;
}
System.out.println("sorted Strings are:");
System.out.println(Arrays.toString(Word));
}
}
