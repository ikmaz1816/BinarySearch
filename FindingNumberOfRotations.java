package step5_binarySearch;

public class FindingNumberOfRotations {

	public static void main(String[] args) {
		int[] arr= {4,5,1,2,3};
		int pivot=findPivot(arr);
		if(pivot==-1)
		{
			System.out.println("0");
			return;
		}
		System.out.println(pivot+1);
	}
	private static int findPivot(int[] arr) {
		int start=0;
		int end=arr.length-1;
		while(start<=end) {
			int mid=(start+end)/2;
			if(mid<end && arr[mid]>arr[mid+1])
				return mid;
			if(mid>start && arr[mid]<arr[mid-1])
				return mid-1;
			if(arr[start]<=arr[mid])
				start=mid+1;
			else
				end=mid-1;
		}
		return -1;
	}


}
