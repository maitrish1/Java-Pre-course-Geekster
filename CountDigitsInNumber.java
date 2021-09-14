import java.util.*;
public class CountDigitsInNumber {

	public static void main(String[] args) {

	    long count = 0, num;
	    @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter a number");
	    num=sc.nextLong();
	    

	    while (num != 0) {
	      num = num/10;
	      ++count;
	    }

	    System.out.println("Number of digits: " + count);

	}

}
