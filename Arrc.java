public class Arrc
{// Class Open 

public static void main(String arg[]) 
	 { //main open
 //write code here 
int arr[]={1,2,3,4,5};
int arr2[]={1,3,5};
int n=arr2.length;
for(int i=0;i<arr.length;i++)
{
for(int j=0;j<arr2.length;j++)
{
if(arr[i]==arr2[j])
{
break;
}
else if(j==n-1)
{
System.out.print(arr[i]+"\t");
}
}
}

	 } //main close 
  } //Class Close
