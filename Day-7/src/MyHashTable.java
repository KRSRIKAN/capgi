import java.util.Hashtable;

public class MyHashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<String,Integer> marks=new Hashtable<String,Integer>();
		marks.put("srikanth", 100);
		marks.put("abc", 200);
		marks.put("def", 300);
		marks.put("ghi", 400);
		System.out.println(marks.contains(300));
		System.out.println(marks);
	for(String word:marks.keySet())	{
		System.out.println(word);
	}
		

	}

}
