package week1.day2;

public class CalcExample {
	public int add(int a, int b)
	{
	int value=a+b;	
	return value;
	
	
	}
public double sub(double a,double b)
{
	double value=a-b;
	return value;
}
public double mul(double a,double b)
{
	double value=a*b;
	return value;
}
	
public int div(int a,int b)
{
	int value=a/b;
	return value;
	
			
}



		public static void main(String[] args) {
		// TODO Auto-generated method stub


CalcExample ca=new CalcExample();
System.out.println(ca.add(20,10));
System.out.println(ca.sub(50.00, 30.00));
System.out.println(ca.mul(50.00, 30.00));
System.out.println(ca.div(20,10));


	}

}
