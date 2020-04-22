package HomeWork;
import java.awt.font.FontRenderContext;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class theImportanceOfStaff {
    class Employee {
        // It's the unique id of each node;
        // unique id of this employee
        public int id;
        // the importance value of this employee
        public int importance;
        // the id of direct subordinates
        public List<Integer> subordinates;
    }

    class solution {
        private Map<Integer, Employee> map = new HashMap<>();

        public int getImportance(List<Employee> employees, int id) {
            for (Employee e : employees)
                map.put(e.id, e);
            System.out.println(map);
            return search(employees, id);
        }

        public int search(List<Employee> employees, int id) {
            Employee e = map.get(id);
            int result = e.importance;
            for (int i : e.subordinates) {
                result += search(employees, i);
            }
            return result;
        }
    }
}
