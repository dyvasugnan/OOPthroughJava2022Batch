import java.util.*;
public classs Sort{
	public static void main(String[] args){
		int array[]={0,1,0,0,2,1};
		int i,j,min,temp;
		for(i=0;i<5;i++)
		{
			min=i;
			for(j=i+1;j<6;j++)
			{
				if(array[min]>array[j])
				{
					min=j;
				}
			}
		}
		if(array[i]!=array[min])
		{
			temp=array[min];
			array[min]=array[i];
			array[i]=temp;
		}
		System.out.println("sorted array is-");
		for(i=0;i<6;i++)
		{
			System.out.println(array[i]);
		}
}
}