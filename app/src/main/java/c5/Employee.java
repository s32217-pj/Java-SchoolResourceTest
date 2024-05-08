package c5;
public class Employee extends SchoolResource{
    private double salary;
    public String department;

    

    public Employee(int resourceID, String resourceName, String description, double salary, String department) {
        super(resourceID, resourceName, description);
        this.salary = salary;
        this.department = department;
    }

    public String work(){
        return "Employee from: "+department+" is working right now";
    }

    @Override
    public String getResourceDetails(){
        return "Employee{Department: "+department+" Salary: "+salary+" " +super.getResourceDetails() +"}";
    }

    protected void allocateResource(){
        totalResources++;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}