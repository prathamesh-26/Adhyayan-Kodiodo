package Program_1;

import java.util.HashMap;
import java.util.Map;

public class Department {
	String empName;

	public static void main(String[] args) {
		// Hash map holds a list of department where department contain a list of its emp iterate through the hash map and names of all emp along repective depatment

		Department d1 = new Department();
		d1.empName = "Uday";

		Department d2 = new Department();
		d2.empName = "Yash";

		Department d3 = new Department();
		d3.empName = "Pranali";

		Department d4 = new Department();
		d4.empName = "Madhuri";

		Map<Integer, Department> m = new HashMap<Integer, Department>();

		m.put(1, d1);
		m.put(2, d2);
		m.put(3, d3);
		m.put(4, d4);

		m.forEach((t, u) -> System.out.println("Department : " + t + " Employee Name : " + u.empName));

	}
}
