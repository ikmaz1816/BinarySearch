package step5_binarySearch;

public class AgnosticBinarySearch {

	public static void main(String[] args) {
		int[] arr= {6,5,4,3,2,1};
		int key=5;
		int ans=orderBinarySearch(arr,key);
		System.out.println(ans);
	}

	private static int orderBinarySearch(int[] arr, int key) {
		int start=0;
		int end=arr.length-1;
		boolean flag=arr[start]<=arr[end];
		while(start<=end)
		{
			int mid=(start+end)/2;
			if(arr[mid]==key)
				return mid;
			if(flag)
			{
			if(arr[mid]>key)
				end=mid-1;
			else
				start=mid+1;
			}
			else
			{
				if(arr[mid]>key)
				{
					start=mid+1;
				}
				else
				{
					end=mid-1;
				}
			}
		}
		return -1;
	}

}
