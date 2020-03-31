package LIKou;

import Employee.Employee;

import java.util.List;

public class importanceOfStaff {
    //    员工的重要性
    class Solution {
        public int getImportance(List<Employee> employees, int id) {
            Employee root=null;
            for (Employee e : employees) {
                if (e.id == id) {
                    root = e;
                    break;
                }
            }
            int ans = root.importance;
            for (int sub : root.subordinates) {
                ans += getImportance(employees, sub);
            }
            return ans;
        }
    }
}
