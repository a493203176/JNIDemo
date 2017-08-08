
interface A {
	public static final int i = 21;
	public abstract int getAge();
}
interface B {
	public static  String name = "Your name is limingrui";
	public abstract String getName();
}

abstract class Father {
	public abstract void study();
}


class Son extends Father implements A,B {
	public  int getAge(){return i;};
	public  String getName(){return name;};
	public  void study() {
		System.out.println("I have a dream");
	}

}

public class Ext7 {
	public static void main( String arg[] ) {
		Son a = new Son();
		System.out.println(a.getAge());
		System.out.println(a.getName());
		a.study();

	}
	
}

