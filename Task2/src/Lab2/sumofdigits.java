package Lab2;
import java.util.Scanner;
public class sumofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner a=new Scanner(System.in);
System.out.print("Enter a number:");
int x=a.nextInt();
int sum=0;
while(x!=0) {
int r=x%10;
sum=sum+r;
x=x/10;
}
System.out.print("The sum is:"+sum);
a.close();
	}

}
