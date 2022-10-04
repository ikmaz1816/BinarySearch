package step5_binarySearch;

public class SearchInMountainArray {

	public static void main(String[] args) {
		int[] arr= {1,4,7,8,9,6,5,2};
		int peak=peakMountain(arr);
		int last=-1;
		int first=binarysearch(arr,0,peak,4);
		if(first!=-1)
		{
			System.out.println(first);
			return;
		}
		else
		{
		last=binarysearch(arr,peak+1,arr.length-1,4);
		}
		System.out.println(last);
	}
	private static int binarysearch(int[] arr, int start, int end,int key
			) 
	{
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
	private static int peakMountain(int[] arr) {
		int start=0;
		int end=arr.length-1;
		while(start<end)
		{
			int mid=(start+end)/2;
			if(arr[mid]>arr[mid+1])
				end=mid;
			else if(arr[mid]<arr[mid+1])
				start=mid+1;
		}
		return end;
	}
}
