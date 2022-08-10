package Controller;
import Interface.Action;
import Model.*;
import java.util.ArrayList;
import java.util.Scanner;


public class DepartmentManage implements Action  
{

    @Override
    public Department add() {
        Scanner sc = new Scanner(System.in);
        Department dep = new Department();
        System.out.println("Enter Department ID: ");
        dep.setDepID(sc.nextLine());    
        System.out.println("Enter Department Name: ");
        dep.setDepName(sc.nextLine());
        System.out.println("Enter Department Salary: ");
        dep.setDepSalary(sc.nextDouble());
        return new Department();
    }

    @Override
    public boolean edit(ArrayList<Object> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Department ID: ");
        String depID = sc.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (depID.equals(((Department) list.get(i)).getDepID())) {
                System.out.println("Enter Department Name: ");
                ((Department) list.get(i)).setDepName(sc.nextLine());
                System.out.println("Enter Department Salary: ");
                ((Department) list.get(i)).setDepSalary(sc.nextDouble());
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(ArrayList<Object> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Department ID: ");
        String depID = sc.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (depID.equals(((Department) list.get(i)).getDepID())) {
                list.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public void show(ArrayList<Object> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Department ID: " + ((Department) list.get(i)).getDepID());
            System.out.println("Department Name: " + ((Department) list.get(i)).getDepName());
            System.out.println("Department Salary: " + ((Department) list.get(i)).getDepSalary());
        }
    }

    @Override
    public void search(ArrayList<Object> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Department ID: ");
        String depID = sc.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (depID.equals(((Department) list.get(i)).getDepID())) {
                System.out.println("Department ID: " + ((Department) list.get(i)).getDepID());
                System.out.println("Department Name: " + ((Department) list.get(i)).getDepName());
                System.out.println("Department Salary: " + ((Department) list.get(i)).getDepSalary());
            }
        }
    }

    @Override
    public void sort(ArrayList<Object> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (((Department) list.get(i)).getDepSalary() > ((Department) list.get(j)).getDepSalary()) {
                    Department temp = (Department) list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
    }

    @Override
    public void print(ArrayList<Object> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Department ID: " + ((Department) list.get(i)).getDepID());
            System.out.println("Department Name: " + ((Department) list.get(i)).getDepName());
            System.out.println("Department Salary: " + ((Department) list.get(i)).getDepSalary());
        }
    }
    
}

