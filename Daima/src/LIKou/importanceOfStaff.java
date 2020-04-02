package LIKou;

import java.util.List;

class importanceOfStaff {
    class Employee{
        public    int id;
        public int importance;
        public List<Integer>subordinates;

    }
    class solution{
        public int getImportance(List<Employee>employees,int id){
            Employee root=null;
            for (Employee e:employees){
                if (e.id==id){
                    root=e;
                    break;
                }
            }
            int ans=root.importance;
            for (int sub:root.subordinates){
                ans+=getImportance(employees,sub);
            }
            return ans;
        }
    }
}
