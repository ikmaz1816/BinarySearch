package step5_binarySearch;

public class SearchInDuplicatedRotatedArray {
	private static int findPivot(int[] arr) {
		int start=0;
		int end=arr.length-1;
		while(start<=end)
		{
			int mid=(start+end)/2;
			if(mid <end && arr[mid]>arr[mid+1])
				return mid;
			if(mid>start && arr[mid] <arr[mid-1])
				return mid-1;
			if(arr[mid]==arr[start] && arr[mid]==arr[end])
			{
				if(arr[start]>arr[start+1])
					return start;
				start++;
				if(arr[end]<arr[end-1])
					return end-1;
				end--;
			}
			if(arr[start]<=arr[end])
				start=mid+1;
			else
				end=mid-1;
		}
		return -1;
	}
	public static int binarySearch(int[] arr,int start,int end,int target)
	{
		while(start<=end)
		{
		int mid=(start+end)/2;
		if(arr[mid]==target)
			return mid;
		if(arr[mid]>target)
		{
			end=mid-1;
		}
		else
			start=mid+1;
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] arr= {2,2,9,2,2,2};
		int pivot=findPivot(arr);
		int first=binarySearch(arr,0,pivot,2);
		if(first!=-1)
		{
			System.out.println(first);
			return;
		}
		int last=binarySearch(arr,pivot+1,arr.length-1,2);
		if(last!=-1)
		{
			System.out.println(last);
			return;
		}
		System.out.println("-1");
	}

}
