import java.util.*;
public class Runner{

	public Runner(){

		Quotient q =  (x, y) -> System.out.printf("%.3f%n", x/y);
        q.remainder(200, 23);

	}

	interface Quotient{
        void remainder(float x, float y);
    }


	public static void main(String[] args)
	{
		Runner r = new Runner();
	}

}