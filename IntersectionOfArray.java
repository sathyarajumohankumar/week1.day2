package week1.day2;

public class IntersectionOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr1= {3,5,6,7,8,2,1,9};
int[] arr2= {7,3,4,10,1,5};
int len1=arr1.length;
int len2=arr2.length;
for(int i=0;i<len1;i++)
{
	for( int j=0;j<len2;j++)
	{
		if(arr1[i]==arr2[j])
		{
			System.out.println("intersection is:" +arr1[i]);
		}
	}

	}

}
}