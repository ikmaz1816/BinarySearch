package step5_binarySearch;

public class SearchInAnInfiniteSortedArray {
	
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9,10};
		int key=4;
		int start=0;
		int end=1;
		while(key>arr[end])
		{
			int temp=end+1;
			end=end+(end-start+1)*2;
			start=temp;
		}
		int ans=-1;
		while(start<=end)
		{
			int mid=(start+end)/2;
			if(arr[mid]==key)

			{
				ans=mid;
				break;
			}
			else if(arr[mid]>key)
				end=mid-1;
			else
				start=mid+1;
		}
		System.out.println(ans);
	}

}
