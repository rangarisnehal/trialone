import java.util.Scanner;


public class A
{

public static void main(String args[])
{
System.out.println("Enter 5 Sub marks");
Scanner sc=new Scanner(System.in);

System.out.println("Enter sub 1 marks");
int a=sc.nextInt();


System.out.println("Enter sub2 marks");
int b=sc.nextInt();


System.out.println("Enter sub3 marks");
int c=sc.nextInt();


System.out.println("Enter sub 4 marks");
int d=sc.nextInt();


System.out.println("Enter sub 5 marks");
int e=sc.nextInt();



float x=((a+b+c+d+e)*100)/500;

System.out.println("Percentage of Student is :" +x+"%");


}

}