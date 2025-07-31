package stringbuilder;

public class BuilderBuffer {

	public static void main(String[] args) {
	StringBuffer a=new StringBuffer("Hello");
	System.out.println(a);
	StringBuilder b=new StringBuilder("World");
	System.out.println(b);
    System.out.println(b.insert(5, "hi"));
    System.out.println(b.append("bye"));
    System.out.println(b.replace(0, 2, "B"));
    System.out.println(b.reverse());
    System.out.println(b.delete(3, 8));
	}

}
