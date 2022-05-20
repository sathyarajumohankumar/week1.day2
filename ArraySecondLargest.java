package week1.day2;

import java.util.Arrays;

public class ArraySecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] numbers= {3,2,11,4,6,7};
int length=numbers.length;
Arrays.sort(numbers);
for(int i=0;i<length;i++)
{
	System.out.println(numbers[i]);
}

	
System.out.println("second largest number is" + numbers[length-2]);
	}
}



	
