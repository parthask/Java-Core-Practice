package javaNew;

public class StaticCheak {

	public static void main(String[] args)
	{
		String name="\"Partha Sarathi\"";
		showSomeSome();
		System.out.println("I said, \"What is that?\" "+name);

	}

	public static void showSomeSome() {
		StaticClass.showSome();	
	}

	static class StaticClass {
		public static void showSome (){
			System.out.println("\"V\" for \"VenDetta\"");
		}
	}
}


