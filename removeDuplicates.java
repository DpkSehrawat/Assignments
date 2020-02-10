package Assignment;

import java.util.*;

public class removeDuplicates {

	public static ArrayList<Integer> duplicates(ArrayList<Integer> list) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < list.size(); i++) {
			if (!map.containsKey(list.get(i))) {
				map.put(list.get(i), 1);
			} else {
				int x = map.get(list.get(i));
				map.put(list.get(i), ++x);
			}
		}
		for (int i = 0; i < list.size(); i++) {
			if (map.get(list.get(i)) == 2) {
				map.put(list.get(i), 1);
				list.remove(i);
			}
		}
		return list;
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter no. of elements in Array List");
		int n = s.nextInt();
		for (int i = 0; i < n; i++) {
			list.add(s.nextInt());
		}
		list = duplicates(list);
		for(int i=0;i<list.size();i++) {
			
		}
	}

}
