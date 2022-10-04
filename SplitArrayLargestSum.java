package step5_binarySearch;

public class SplitArrayLargestSum {

	public static void main(String[] args) {
		int[] arr= {7,5,2,8,10};
		int m=2;
		int ans=splitArray(arr,m);
		System.out.println(ans);
	}

	private static int splitArray(int[] arr, int m) {
		int start=0;
		int end=arr.length-1;
		for(int i=0;i<arr.length;i++)
		{
			start=Math.max(start, arr[i]);
			end+=arr[i];
		}
		while(start<end)
		{
			int count=1;
			int sum=0;
			int mid=(start+end)/2;
			for(int num:arr)
			{
				if(sum+num>mid)
				{
					sum=num;
					count++;
				}
				else
				{
					sum+=num;
				}
			}
			if(count>m)
			{
				start=mid+1;
			}
			else
			{
				end=mid;
			}
		}
		return end;
	}

}
