import java.util.TreeMap;

public class MyTreeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> tm=new TreeMap<Integer,String>();
		tm.put(3,"gjg");
		tm.put(4, "kggj");
		tm.put(7, "jhgj");
		tm.put(6, "jg22j");
		System.out.println(tm);
		for(Integer k:tm.keySet()) {
			System.out.println(k);
		}
		System.out.println(tm.containsKey(3));
		
		
		TreeMap<Integer, Srikanth> map2 = new TreeMap<Integer, Srikanth>();
		// <int, String ,String>
		map2.put(1001, new Srikanth(1001,"abc","1000"));
		map2.put(1001, new Srikanth(1002,"ac","1030"));
		map2.put(1001, new Srikanth(1003,"ac","1080"));
		map2.put(1001, new Srikanth(1004,"ahc","1800"));
		map2.put(1001, new Srikanth(1005,"akc","1002"));
		
System.out.println(map2);

	}

}
