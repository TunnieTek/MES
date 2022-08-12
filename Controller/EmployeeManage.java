package Controller;
import Interface.Action;
import Model.*;
import java.util.ArrayList;
import java.util.Scanner;


public class EmployeeManage implements Action<Employee> 
{

    @Override
    public Employee add() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee ID: ");
        String empID = sc.nextLine();
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
        return new Employee(empID, empName, empEmail, workingHours, dep, pos);

    }

    @Override
    public boolean edit(ArrayList<Employee> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee ID: ");
        String empID = sc.nextLine();
        for (Employee e : list) {
            if (e.getEmpID().equals(empID)) {
                System.out.println("Enter new Employee Name: ");
                String empName = sc.nextLine();
                System.out.println("Enter new Employee Email: ");
                String empEmail = sc.nextLine();
                System.out.println("Enter new Employee Working Hours: ");
                Double workingHours = sc.nextDouble();
                System.out.println("Enter new Employee Department: ");
                Department dep = new DepartmentManage().add();
                System.out.println("Enter new Employee Position: ");
                Position pos = new PositionManage().add();
                e.setEmpName(empName);
                e.setEmpEmail(empEmail);
                e.setWorkingHours(workingHours);
                e.setDep(dep);
                e.setPos(pos);
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
        for (Employee e : list) {
            if (e.getEmpID().equals(empID)) {
                list.remove(e);
                return true;
            }
        }
        return false;
    }

    @Override
    public void show(ArrayList<Employee> list) {
        for (Employee e : list) {
            System.out.println(e);
        }
    }

    @Override
    public void search(ArrayList<Employee> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee ID: ");
        String empID = sc.nextLine();
        for (Employee e : list) {
            if (e.getEmpID().equals(empID)) {
                System.out.println(e);
            }
        }
    }

    @Override
    public void sort(ArrayList<Employee> list) {
        list.sort((Employee e1, Employee e2) -> e1.getEmpID().compareTo(e2.getEmpID()));
    
    }
    

}


