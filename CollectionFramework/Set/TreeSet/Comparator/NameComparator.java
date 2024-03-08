package TreeSet.Comparator;

import java.util.*;
import TreeSet.pojo.Employee;

public class NameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getempName().compareTo(o2.getempName());
    }
}
