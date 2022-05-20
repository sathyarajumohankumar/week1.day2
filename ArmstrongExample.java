package week1.day2;

public class ArmstrongExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int input=153;
int sum=0;
int orno=input;
while(input>0)
{
	int rem=input%10;
	
	sum=sum+(rem*rem*rem);
	input=input/10;
}
if(sum==orno)
{

System.out.println(sum + " " + "is" + " " + "armstrong number");
	}
else
	System.out.println("its not armstrong no");
}
}
