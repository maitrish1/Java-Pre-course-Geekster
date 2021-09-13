import java.util.*;

public class LargestOfnNos {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		 
        int i,n,large;

System.out.println("Enter the number of elements:") ;
n = sc.nextInt();
int[] a = new int[n];

    System.out.println("Enter the elements") ;
    for(i=0;i<n;i++)
    {
        a[i] = sc.nextInt();
    }

large = a[0];    
for(i=1;i<n;i++)
    	{
if(large<a[i])
        {
large = a[i];
}
    }
    
System.out.println("Largest of "+n+" elements in an array = "+large);

	}

}
