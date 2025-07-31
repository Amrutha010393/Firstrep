package stringbuffer;

public class BufferBuilder {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Hello");
		System.out.println(sb);
		StringBuilder sa=new StringBuilder("Hi");
		System.out.println(sa);
		//insert()-Top insert a parti element in a string ,used based on index
		System.out.println(sb.insert(5, "World"));
		//append()-to add new value atthe last of the string
		System.out.println(sb.append("World"));
		//replace()-to replace the value based on index-starting and ending position should be given
		System.out.println(sb.replace(0, 4, "W"));
		//reverse()-To reverse the string
		System.out.println(sb.reverse());
		//delete()-T delete based on inder
		System.out.println(sb.delete(0, 3));
	}

}
