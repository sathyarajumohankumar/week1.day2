package week1.day2;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= {1,2,3,4,7,6,8};
Arrays.sort(arr);

int lengt=arr.length;

int firnum=arr[0];
System.out.println("first number" +firnum);
for(int i=0;i<lengt;i++)
{
	if(arr[i]==(firnum+i))
	{
		continue;
	}
	else
	{
		System.out.println("missing element is" +(firnum+i));
	
}

break;
}


}
}
