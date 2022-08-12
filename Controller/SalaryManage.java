package Controller;
import Interface.Action;
import Model.*;
import java.util.ArrayList;
import java.util.Scanner;

public class SalaryManage implements Action<Salary> {

    @Override
    public Salary add() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Salary ID: ");
        String salaryID = sc.nextLine();
        System.out.println("Enter Employee: ");
        Employee emp = new EmployeeManage().add();
        return new Salary(salaryID, emp, emp.getPos().getPosBonus() + emp.getDep().getDepSalary() * emp.getWorkingHours());
    }

    @Override
    public boolean edit(ArrayList<Salary> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Salary ID: ");
        String salaryID = sc.nextLine();
        for (Salary s : list) {
            if (s.getSalaryID().equals(salaryID)) {
                System.out.println("Enter new Employee: ");
                Employee emp = new EmployeeManage().add();
                s.setEmp(emp);
                s.setTotalSalary(emp);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(ArrayList<Salary> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Salary ID: ");
        String salaryID = sc.nextLine();
        for (Salary s : list) {
            if (s.getSalaryID().equals(salaryID)) {
                list.remove(s);
                return true;
            }
        }
        return false;
    }

    @Override
    public void show(ArrayList<Salary> list) {
        for (Salary s : list) {
            System.out.println(s);
        }
    }

    @Override
    public void search(ArrayList<Salary> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Salary ID: ");
        String salaryID = sc.nextLine();
        for (Salary s : list) {
            if (s.getSalaryID().equals(salaryID)) {
                System.out.println(s);
            }
        }
    }

    @Override
    public void sort(ArrayList<Salary> list) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
