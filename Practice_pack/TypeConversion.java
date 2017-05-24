package Practice_pack;

public class TypeConversion {
	public static int strToInt( String str ){
	    int i = 0;
	    int num = 0;
	    boolean isNeg = false;

	    //Check for negative sign; if it's there, set the isNeg flag
	    if (str.charAt(0) == '-') {
	        isNeg = true;
	        i = 1;
	    }

	    //Process each character of the string;
	    while( i < str.length()) {
	        num *= 10;
	        System.out.println(num);
	        num += str.charAt(i++) - '0'; 
	        //Minus the ASCII code of '0' to get the value of the charAt(i++).
	    }

	    if (isNeg)
	        num = -num;
	    return num;
	}
	public static void main(String[] args) {
		String s= "a1478";
		String st= "ab";
//		System.out.println(Character.valueOf('0'));
		System.out.println('a'-'c');
		System.out.println('0'-1);
        
		System.out.println(strToInt(s));
		System.out.println();
		System.out.println(strToInt(st));
//		System.out.println(strToInt("b"));
	}
}
