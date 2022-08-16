package revision;

public class MaximumNOInArray {

	public static void main(String[] args)
	{
		int []a= {19,24,86,678,94,456};
		int max=a[0];
		for(int i =0;i<a.length;i++)
		{
			if (a[i]>max)
			{
				max=a[i];
			}
		}

		System.out.println(max);
		System.out.println("===============");
		int []k= {19,24,86,678,94,456};
		int min=k[0];

		for(int i=0;i<k.length;i++)
		{
			if ( k[i]<min)
			{
				min=k[i];
			}
		}
		System.out.println(min);
		
		System.out.println("===============");
		int []l= {19,24,24,19,94,456,94,456};

		for(int i=0;i<l.length;i++)
		{
			for(int j=i+1;j<l.length;j++)
			{
				if(l[i]==l[j])
				{
					System.out.println(l[i]);
				}
			}
		}
		System.out.println("===============");
		int arr1[]={20,65,23056,67,678};
	    int arr2[]={76,23,4545,98,90909};
	    int len1=arr1.length;
	    int len2=arr2.length;
	    int max1=arr1[0];
	    for(int i=0;i<len1;i++){
	        if(arr1[i]>max1){
	            max1=arr1[i];
	        }

	    }
	    int max2=arr2[0];
	    for(int j=0;j<len2;j++){
	        if(arr2[j]>max2){
	            max2=arr2[j];
	        }

	    }
	    if(max1>max2){
	        System.out.print("max element is:"+max1);
	    }
	    else{
	        System.out.print("Max element is: "+max2);
	    }
	}

}
