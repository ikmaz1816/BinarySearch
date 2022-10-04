package step5_binarySearch;

import java.util.Arrays;

public class FindingFirstAndLastOcc {

	public static void main(String[] args) {
		int[] arr= {1,2,2,2,2,2,8};
		int key=2;
		int[] ans=binarySearch(arr,key);
		System.out.println(Arrays.toString(ans));

	}

	private static int[] binarySearch(int[] arr, int key) {
		int first=binarysearch(arr,key,true);
		int last=binarysearch(arr,key,false);
		return new int[] {first,last};
	}

	private static int binarysearch(int[] arr, int key, boolean b) {
		int start=0;
		int end=arr.length-1;
		int ans=-1;
		while(start<=end)
		{
			int mid=(start+end)/2;
			if(arr[mid]==key)
			{
				ans=mid;
				if(b)
					end=mid-1;
				else
					start=mid+1;
			}
			else if(arr[mid]>key)
				end=mid-1;
			else
				start=mid+1;
		}
		return ans;
	}

}
