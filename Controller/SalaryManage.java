package Controller;
import Interface.Action;
import Model.*;
import java.util.ArrayList;
import java.util.Scanner;

public class SalaryManage implements Action<Salary> {

    @Override
    public Salary add() {
        Salary salary = new Salary();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Salary ID: ");
        String salaryID = sc.nextLine();
        salary.setSalaryID(salaryID);
        System.out.println("Enter Employee: ");
        Employee emp = new EmployeeManage().add();
        salary.setEmp(emp);
        //Lỗi ở đây
        return salary;
    }

    @Override
    public boolean edit(ArrayList<Salary> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Salary ID: ");
        String salaryID = sc.nextLine();
        for(int i=0; i<list.size(); i++)
        {
            if(list.get(i).getSalaryID().equals(salaryID))
            {
                System.out.println("Enter Employee: ");
                Employee emp = new EmployeeManage().add();
                list.get(i).setEmp(emp);
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
        for(int i=0; i<list.size(); i++)
        {
            if(list.get(i).getSalaryID().equals(salaryID))
            {
                list.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public void show(ArrayList<Salary> list) {
        for(int i=0; i<list.size(); i++)
        {
            System.out.println("Salary ID: " + list.get(i).getSalaryID());
            System.out.println("Employee: " + list.get(i).getEmp().getEmpName());
            // System.out.println("Salary: " + list.get(i).getSalary());
            // System.out.println("Bonus: " + list.get(i).getBonus());
            // System.out.println("Total Salary: " + list.get(i).getTotalSalary());
        }
    }

    @Override
    public void search(ArrayList<Salary> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Salary ID: ");
        String salaryID = sc.nextLine();
        for(int i=0; i<list.size(); i++)
        {
            if(list.get(i).getSalaryID().equals(salaryID))
            {
                System.out.println("Salary ID: " + list.get(i).getSalaryID());
                System.out.println("Employee: " + list.get(i).getEmp().getEmpName());
                // System.out.println("Salary: " + list.get(i).getSalary());
                // System.out.println("Bonus: " + list.get(i).getBonus());
                // System.out.println("Total Salary: " + list.get(i).getTotalSalary());
            }
        }
    }

    @Override
    public void sort(ArrayList<Salary> list) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
