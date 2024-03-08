package TreeSet.Comparator;

import java.util.*;

import TreeSet.pojo.Employee;

public class IdComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getempId() - o2.getempId();
    }
}
