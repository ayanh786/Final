import java.util.*;
public class Runner{

	public Runner(){
		System.out.println(getPerfectSquare().ps(169));
		Quotient q =  (x, y) -> System.out.printf("%.3f%n", x/y);
		q.remainder(200, 23);
	}


	interface PerfectSquare{
		boolean ps(int num);
	}

	interface Quotient{
        void remainder(float x, float y);
    }

	public static PerfectSquare getPerfectSquare(){
		return (num) -> Math.sqrt(num)-Math.floor(Math.sqrt(num))==0;
	}

	public static void main(String[] args)
	{
		Runner r = new Runner();
	}

}