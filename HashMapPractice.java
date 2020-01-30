package DS;

import java.util.HashMap;
import java.util.Map;
public class HashMapPractice {

	public static void main(String[] args) {
		HashMap<Integer,Integer> map = new HashMap<>();
		map.put(100,1);
		map.put(200, 2);
		map.put(300,3);
		map.put(400,4);
		map.put(500,5);
		System.out.println(map.size());
		System.out.println(map.containsKey(100));
		System.out.println(map.get(400));
		System.out.println(map);
		System.out.println(map.containsValue(4));
		map.clear();
		System.out.println(map);
		System.out.println(map.containsKey(300));
		System.out.println(map.containsValue(4));
		Student s1=new Student(1,20000);
		Student s2=new Student(2,30000);
		Student s3=new Student(3,40000);
		Student s4=new Student(4,50000);
		Student s5=new Student(5,60000);
		map.put(s1.empid,s1.salary);
		map.put(s2.empid,s2.salary);
		map.put(s3.empid,s3.salary);
		map.put(s4.empid,s4.salary);
		map.put(s5.empid,s5.salary);
		for(int i=0;i<=map.size();i++) {
			System.out.println(map.get(i));
		}
	    for(Map.Entry m: map.entrySet())
	        {
	            System.out.println(m.getKey()+" "+m.getValue());  
	        }

		
	}

}
