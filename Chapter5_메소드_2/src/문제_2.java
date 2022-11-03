import java.util.Arrays;

public class 문제_2 {
	// ASC(올림차순)
	static int[] asc_sort(int[] arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
	//DESC(내리차순)
	static int[] desc_sort(int[] arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
	/*
	 *  30 10 40 50 20
	 *  -- --
	 *  10 30
	 *  --	  --
	 *  10	  40
	 *  --       --
	 *  10		 50
	 *  --           --
	 *  10			 20
	 *  ---------------------
	 *  10 30  40 50 20
	 *     --  --
	 *     30  40
	 *     --     --
	 *     30     50
	 *     --         --
	 *     20         30
	 *  ----------------------
	 *  10 20 40 50 30
	 *  	  -- --
	 *        40 50
	 *        --    --
	 *        30	40
	 *  ------------------------
	 *  10 20 30 50 40 
	 *  		 -- --
	 *  		 40 50
	 *        
	 */
	// 혼합
	static int[] sort(int[] arr,String type)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(type.equals("ASC"))
				{
					if(arr[i]>arr[j])
					{
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
				else
				{
					if(arr[i]<arr[j])
					{
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
				
			}
		}
		return arr;
	}
	static int[] lib_sort(int[] arr)
	{
		Arrays.sort(arr);
		return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[5];
		for(int i=0;i<num.length;i++)
		{
			num[i] = (int)(Math.random()*100)+1;
		}
		System.out.println("정렬 전:");
		System.out.println(Arrays.toString(num));
		
		System.out.println("올림 차순:");
		//int[] num1=asc_sort(num);
		//int[] num1=sort(num,"ASC");
		int[] num1=lib_sort(num);
		System.out.println(Arrays.toString(num1));
		
		System.out.println("내림 차순:");
		//int[] num2=desc_sort(num);
		//int[] num2=sort(num,"DESC");
		int[] num2=lib_sort(num);
		System.out.print("[");
		for(int i=num2.length-1;i>=0;i--)
		{
			System.out.print(num2[i]+" ");
		}
		System.out.print("]");
		//System.out.println(Arrays.toString(num2));
	}

}
