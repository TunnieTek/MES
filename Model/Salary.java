package Model;
public class Salary {
    public String salaryID;
    public Employee emp;
    private Double totalSalary;

    public Salary() {
        super();
    }

    public Salary(String salaryID, Employee emp, Double totalSalary) {
        this.salaryID = salaryID;
        this.emp = emp;
        this.totalSalary = totalSalary;
    }

    public void setSalaryID(String salaryID) {
        this.salaryID = salaryID;
    }

    public String getSalaryID() {
        return salaryID;
    }

    public Employee getEmp() {
        return emp;
    }

    public void setEmp(Employee emp) {
        this.emp = emp;
    }

    public Double setTotalSalary(Employee emp) {
        double totalSalary = 0;
        totalSalary = emp.getWorkingHours() * emp.getDep().getDepSalary() + emp.getPos().getPosBonus();
        return totalSalary;
    }

    
}
