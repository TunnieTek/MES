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

    public Double setTotalSalary(Employee emp) {
        double totalSalary = 0;
        totalSalary = emp.getWorkingHours() * emp.getDep().getDepSalary() + emp.getPos().getPosBonus();
        return totalSalary;
    }

    
}
