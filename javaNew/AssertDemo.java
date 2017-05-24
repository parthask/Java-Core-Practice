package javaNew;

public class AssertDemo {

	public static int x;
	public static int foo(int y)
	{
		return y * 2;
	}
	public static void main(String [] args)
	{
		int z = 6;
		assert z > 0; /* Line 11 */
		assert z > 2: z=foo(z); /* Line 12 */
		if ( z < 7 ){
			assert z > 4; /* Line 14 */
			switch (z)
			{
			case 4: System.out.println("4");
			case 6: System.out.println("6");
			default: assert z < 10;
			}
			if ( z < 10 ){
				assert z > 4: z++;
				System.out.println(z);
			}/* Line 22 */
			//System.out.println(z);
		}
	}

}

