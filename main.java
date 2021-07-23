public class Main{
	public static void main(String[] args)
{
	System.out.println("Hello world, I literally finally figured out M1");
	System.out.println("Starting to print numbers: ");
	int[] testArr = {1,3,5,6,8};
	Main.reverse(testArr);
	for(int i: testArr)
	{
		System.out.print(i + " ");
	}
	System.out.println("Done");
}

public static void reverse(int[] arr)
{
	int begin = 0;
	int end = arr.length - 1;
	while(begin <= end)
	{
		int temp = arr[begin];
		arr[begin] = arr[end];
		arr[end] = temp;
		begin++;
		end--;
	}
}
}

