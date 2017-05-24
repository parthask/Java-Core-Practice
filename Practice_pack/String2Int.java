package Practice_pack;

public class String2Int {
	static public Integer str2Int(String str) {
	    Integer result = null;
	    if (null == str || 0 == str.length()) {
	        return null;
	    }
	    try {
	        result = Integer.parseInt(str);
	    } 
	    catch (NumberFormatException e) {
	        String negativeMode = "";
	        if(str.indexOf('-') != -1)
	            negativeMode = "-";
	        str = str.replaceAll("-", "" );
	        if (str.indexOf('.') != -1) {
	            str = str.substring(0, str.indexOf('.'));
	            if (str.length() == 0) {
	                return (Integer)0;
	            }
	        }
	        String strNum = str.replaceAll("[^\\d]", "" );
	        if (0 == strNum.length()) {
	            return null;
	        }
	        result = Integer.parseInt(negativeMode + strNum);
	    }
	    return result;
	}
	public static void main(String[] args) {
		String s= "a1478";
		String st= "ab";
//		System.out.println(Character.valueOf('0'));
//		System.out.println('a'-'c');
//		System.out.println('0'-1);
       
		System.out.println(str2Int(s));
		System.out.println(str2Int(st));
		System.out.println(str2Int("2fd323.ew44"));
	
	}
}
