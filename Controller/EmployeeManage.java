package Controller;
import Interface.Action;
import Model.*;
import java.util.ArrayList;
import java.util.Scanner;


public class EmployeeManage implements Action<Employee> 
{

    @Override
    public Employee add() {
        Employee emp = new Employee();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee ID: ");
        String empID = sc.nextLine();
        emp.setEmpID(empID);
        System.out.println("Enter Employee Name: ");
        String empName = sc.nextLine();
        emp.setEmpName(empName);
        System.out.println("Enter Employee Email: ");
        String empEmail = sc.nextLine();
        emp.setEmpEmail(empEmail);
        System.out.println("Enter Employee Working Hours: ");
        Double workingHours = sc.nextDouble();
        emp.setWorkingHours(workingHours);
        System.out.println("Choose Employee Department: ");
        // ===================================================DDANG FIX (TUAN)
        
        // ===================================================
        System.out.println("Choose Employee Position: ");
        // ===================================================DANG FIX (TUAN)

        // ===================================================
        return emp;
    }

    @Override
    public boolean edit(ArrayList<Employee> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee ID: ");
        String empID = sc.nextLine();
        for(int i=0; i<list.size(); i++)
        {
            if(list.get(i).getEmpID().equals(empID))
            {
                System.out.println("Enter Employee Name: ");
                String empName = sc.nextLine();
                System.out.println("Enter Employee Email: ");
                String empEmail = sc.nextLine();
                System.out.println("Enter Employee Working Hours: ");
                Double workingHours = sc.nextDouble();
                System.out.println("Enter Employee Department: ");
                Department dep = new DepartmentManage().add();
                System.out.println("Enter Employee Position: ");
                Position pos = new PositionManage().add();
                list.get(i).setEmpName(empName);
                list.get(i).setEmpEmail(empEmail);
                list.get(i).setWorkingHours(workingHours);
                list.get(i).setDep(dep);
                list.get(i).setPos(pos);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(ArrayList<Employee> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee ID: ");
        String empID = sc.nextLine();
        for(int i=0; i<list.size(); i++)
        {
            if(list.get(i).getEmpID().equals(empID))
            {
                System.out.println("Do you want to delete this employee? (Y/N)");
                String choice = sc.nextLine();
                if(choice.equals("Y"))
                {
                    list.remove(i);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public void show(ArrayList<Employee> list) {
        for(int i=0; i<list.size(); i++)
        {
            System.out.println("Employee ID: " + list.get(i).getEmpID());
            System.out.println("Employee Name: " + list.get(i).getEmpName());
            System.out.println("Employee Email: " + list.get(i).getEmpEmail());
            System.out.println("Employee Working Hours: " + list.get(i).getWorkingHours());
            System.out.println("Employee Department: " + list.get(i).getDep().getDepName());
            System.out.println("Employee Position: " + list.get(i).getPos().getPosName());
            System.out.println("Employee Salary: " + list.get(i).getSalary());
            System.out.println("Employee Bonus: " + list.get(i).getBonus());
            System.out.println("Employee Total Salary: " + list.get(i).getTotalSalary());
            System.out.println("==========================================");
        }
    }

    @Override
    public void search(ArrayList<Employee> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee ID: ");
        String empID = sc.nextLine();
        for(int i=0; i<list.size(); i++)
        {
            if(list.get(i).getEmpID().equals(empID))
            {
                System.out.println("Employee ID: " + list.get(i).getEmpID());
                System.out.println("Employee Name: " + list.get(i).getEmpName());
                System.out.println("Employee Email: " + list.get(i).getEmpEmail());
                System.out.println("Employee Working Hours: " + list.get(i).getWorkingHours());
                System.out.println("Employee Department: " + list.get(i).getDep().getDepName());
                System.out.println("Employee Position: " + list.get(i).getPos().getPosName());
                System.out.println("Employee Salary: " + list.get(i).getSalary());
                System.out.println("Employee Bonus: " + list.get(i).getBonus());
                System.out.println("Employee Total Salary: " + list.get(i).getTotalSalary());
                System.out.println("==========================================");
            }
        }
    }

    @Override
    public void sort(ArrayList<Employee> list) {
        list.sort((Employee e1, Employee e2) -> e1.getEmpID().compareTo(e2.getEmpID()));
    
    }
    

}


