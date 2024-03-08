package TreeSet.pojo;

public class Employee {
    private int empId;
    private String empName;

    public Employee(){      };   

    public Employee(int empId, String empName){
        this.empId=empId;
        this.empName=empName;
    }

    public int getempId() {
        return empId;
    }

    public void setempId(int empId) {
        this.empId = empId;
    }

    public String getempName() {
        return empName;
    }

    public void setempName(String empName) {
        this.empName = empName;
    }

    @Override
    public String toString(){
        return empId +" : "+empName;
    }

    @Override
    public int hashCode(){
        int number=7;
        int hash = 20*number +empId;

        return hash;
    }
    @Override
    public boolean equals(Object obj){
        Employee Employee = (Employee) obj; //DwonCasting

        return this.empId==Employee.empId;
    }

}
