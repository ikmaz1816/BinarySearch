package step5_binarySearch;

public class SearchIn2DMatrix {

	public static void main(String[] args) {
		int[][] arr= {
						{10,20,30},
						{15,25,35},
						{28,29,37}};
		binarySearch(arr,15);
		}

	private static void binarySearch(int[][] arr,int key) {
		int r=0;
		int c=arr[0].length-1;
		while(r<arr.length && c>=0)
		{
			if(arr[r][c]==key)
			{
				System.out.println(arr[r][c]);
				return;
			}
			else if(arr[r][c]<key)
			{
				r++;
			}
			else
				c--;
		}
		System.out.println("-1");
	}
	
	}
