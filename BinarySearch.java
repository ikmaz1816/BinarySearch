package step5_binarySearch;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6};
		int key=5;
		int ans=binarySearch(arr,key);
		System.out.println(ans);
	}

	public static int binarySearch(int[] arr, int key) {
		int start=0;
		int end=arr.length-1;
		while(start<=end)
		{
			int mid=(start+end)/2;
			if(arr[mid]==key)
				return mid;
			if(arr[mid]>key)
				end=mid-1;
			else
				start=mid+1;
		}
		return -1;
	}

}
