package stringpackage;

public class StringSample {

	public static void main(String[] args) {
		String s="hi";
		System.out.println(s);
		String a=new String("hello");
		System.out.println(a);
		//length()-it returns the size or length of string
		System.out.println(a.length());
		//charAt()-it returns character of string based on index
		System.out.println(a.charAt(1));
		//concat()-addng 2 strings
		System.out.println(a.concat(s));
		//contains-to check a word/char is present in a string
		String b="India is my Country";
		System.out.println(b.contains("my"));
		System.out.println(a.contains(s));//False since s and a is still the first word coz it is nit immutable.
			//toUpperCase()-to convert small letters to caps
		System.out.println(a.toUpperCase());
		//toLowercase-caps to small
		System.out.println(a.toLowerCase());
		//equals()-
		String c="java";
		String d="java";
		String e="Java";
		String f="selenium";
		System.out.println(c.equals(d));
		//equalsIgnorecase()-case(upper/lower) can be ignored
		System.out.println(d.equalsIgnoreCase(e));
		System.out.println(c==d);//operator
		String g=new String("java");
		System.out.println(c==g);//it points diff memory location not the content.son o/p is false
		System.out.println(c.equals(g));//it points content
		//isEmpty()-to check whr a string is empty or contains a value
		System.out.println(c.isEmpty());
		String h="";
		System.out.println(h.isEmpty());
		//trim()-to remove white space
		String i="I cantake";
		System.out.println(i.trim().replaceAll("a","b"));
		//substring()extract the string based on index
		System.out.println(b.substring(0,3));//it ll take space too
		//valueof()-to convert any data type to string
		int n=5;
		System.out.println(String.valueOf(n));
		
		
		

	}

}
