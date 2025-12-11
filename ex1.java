import java.util.Scanner;
import java.util.List.*;
public class ex1
{
public static void main(String[] args)
{
List<Integer> arr =new ArrayList<>();
Scanner sc=new Scanner(System.in);
System.out.println("Enter the no. of elements:");
int num=sc.nextInt();
for(int i=0;i<=num;i++)
{
System.out.println("Enter the elements:");
arr[i]=sc.nextInt();
}
int[] sorted=collections.sort(arr);
int[] reverse=collections.reverse(sorted);
System.out.println("The largest number in the array is:"+reverse[0]);
System.out.println("The second largest number in the array is "+reverse[1]);
}
}