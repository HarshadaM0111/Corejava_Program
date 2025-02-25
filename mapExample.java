package Package_Java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class mapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map m= new HashMap();
		m.put(1,"CSK");
		m.put(2, "MI");
		m.put(3,"DC");
		m.put(4,"RCB");
		m.put(5,"KKR");
		m.put(6,"GCC");
		m.put(7,"KER");
		System.out.println(m);
		Set s = m.entrySet();
		Iterator it = s.iterator();
		while(it .hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			System.out.println(e.getKey()+ " " +e.getValue());
		}
		
		

	}

}
