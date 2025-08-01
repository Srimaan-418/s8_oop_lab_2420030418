package Lab2;
import java.util.Scanner;
public class gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
System.out.print("Enter a number:");
int x=sc.nextInt();
System.out.print("Enter another number:");
int y=sc.nextInt();
int max=1;
int count=0;
if(x>y)
{
count=y;	
}
else
{
	count=x;
}
for(int i=1;i<=count;i++)
{
	if(x%i==0&&y%i==0)
	{
		max=i;
	}
}
System.out.print("The GCD of the numbers is:"+max);
sc.close();
	}

}
