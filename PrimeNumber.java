import java.util.*;
public class PrimeNumber {
	public static void main(String args[]) {
		int i, n,f=0;
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a number:");
		n=sc.nextInt();
		
		if(n==0 || n==1) {
			System.out.println("it is not prime");
		}else {
		for(i=2;i<n/2;i++) {
			if(n%i==0) {
				System.out.println(n+" is not a prime number");
				f=1;
				break;
			}
		}
		
		if(f==0) {
			System.out.println(n+"Is a prime number");
		}
	}

}
}
