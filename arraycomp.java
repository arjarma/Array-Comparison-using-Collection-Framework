import java.util.*;
// this program compares the 2 arrays and find the missing element
// of another one
public class arraycomp
{// Class Open 

public static void main(String arg[]) 
	 { //main open
 //write code here 
int arr[]={1,2,3,4,5};
int arr2[]={1,3,5};
List<Integer> arl=new ArrayList<>();
for(int a:arr)
{
arl.add(a);
}
List<Integer> arl1=new ArrayList<>();
for(int a:arr2)
{
arl1.add(a);
}

arl.removeAll(arl1); // a=a-b
//arl1.removeAll(arl); // a=a-b //op []

//arl.retainAll(arl1);//a=a intersection b
//System.out.println(arl);
System.out.println(arl);




	 } //main close 
  } //Class Close
