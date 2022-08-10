package Controller;
import Interface.Action;
import Model.*;
import java.util.ArrayList;
import java.util.Scanner;


public class EmployeeManage implements Action 
{
        @Override
        public Employee add() {
            Scanner sc = new Scanner(System.in);
            Employee emp = new Employee();
            System.out.println("Enter Employee ID: ");
            emp.setEmpID(sc.nextLine());
            System.out.println("Enter Employee Name: ");
            emp.setEmpName(sc.nextLine());
            System.out.println("Enter Employee Email: ");
            emp.setEmpEmail(sc.nextLine());
            System.out.println("Enter Employee Working Hours: ");
            emp.setWorkingHours(sc.nextDouble());
            // System.out.println("Enter Employee Department ID: ");
            // emp.setDep(sc.nextLine());
            // System.out.println("Enter Employee Position ID: ");
            // emp.setPos(sc.nextLine());
            return new Employee();
        }
    
        @Override
        public boolean edit(ArrayList<Object> list) {
            System.out.println("Enter Employee ID: ");
            Scanner sc = new Scanner(System.in);
            String empID = sc.nextLine();
            for (int i = 0; i < list.size(); i++) {
                if (empID.equals(((Employee) list.get(i)).getEmpID())) {
                    System.out.println("Enter Employee Name: ");
                    ((Employee) list.get(i)).setEmpName(sc.nextLine());
                    System.out.println("Enter Employee Email: ");
                    ((Employee) list.get(i)).setEmpEmail(sc.nextLine());
                    System.out.println("Enter Employee Working Hours: ");
                    ((Employee) list.get(i)).setWorkingHours(sc.nextDouble());
                    System.out.println("Enter Employee Department ID: ");
                    ((Employee) list.get(i)).getDep().setDepID(sc.nextLine());
                    System.out.println("Enter Employee Position ID: ");
                    ((Employee) list.get(i)).getPos().setPosID(sc.nextLine());
                    return true;
                }
            }
            return false;
        }
    
        @Override
        public boolean delete(ArrayList<Object> list) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Employee ID: ");
            String empID = sc.nextLine();
            for (int i = 0; i < list.size(); i++) {
                if (empID.equals(((Employee) list.get(i)).getEmpID())) {
                    list.remove(i);
                    return true;
                }
            }
            return false;
        }
    
        @Override
        public void show(ArrayList<Object> list) {
            for (int i = 0; i < list.size(); i++) {
                System.out.println("Employee ID: " + ((Employee) list.get(i)).getEmpID());
                System.out.println("Employee Name: " + ((Employee) list.get(i)).getEmpName());
                System.out.println("Employee Email: " + ((Employee) list.get(i)).getEmpEmail());
                System.out.println("Employee Working Hours: " + ((Employee) list.get(i)).getWorkingHours());
                System.out.println("Employee Department ID: " + ((Employee) list.get(i)).getDep().getDepID());
                System.out.println("Employee Position ID: " + ((Employee) list.get(i)).getPos().getPosID());
            }
        }
    
        @Override
        public void search(ArrayList<Object> list) {
            System.out.println("Enter Employee ID: ");
            Scanner sc = new Scanner(System.in);
            String empID = sc.nextLine();
            for (int i = 0; i < list.size(); i++) {
                if (empID.equals(((Employee) list.get(i)).getEmpID())) {
                    System.out.println("Employee ID: " + ((Employee) list.get(i)).getEmpID());
                    System.out.println("Employee Name: " + ((Employee) list.get(i)).getEmpName());
                    System.out.println("Employee Email: " + ((Employee) list.get(i)).getEmpEmail());
                    System.out.println("Employee Working Hours: " + ((Employee) list.get(i)).getWorkingHours());
                    System.out.println("Employee Department ID: " + ((Employee) list.get(i)).getDep().getDepID());
                    System.out.println("Employee Position ID: " + ((Employee) list.get(i)).getPos().getPosID());
                }
            }
        }
    
        @Override
        public void sort(ArrayList<Object> list) {
            for (int i = 0; i < list.size() - 1; i++) {
                for (int j = i + 1; j < list.size(); j++) {
                    if (((Employee) list.get(i)).getEmpID().compareTo(((Employee) list.get(j)).getEmpID()) > 0) {
                        Employee temp = (Employee) list.get(i);
                        list.set(i, list.get(j));
                        list.set(j, temp);
                    }
                }
            }
        }
    
        @Override
        public void print(ArrayList<Object> list) {
            for (int i = 0; i < list.size(); i++) {
                System.out.println("Employee ID: " + ((Employee) list.get(i)).getEmpID());
                System.out.println("Employee Name: " + ((Employee) list.get(i)).getEmpName());
                System.out.println("Employee Email: " + ((Employee) list.get(i)).getEmpEmail());
                System.out.println("Employee Working Hours: " + ((Employee) list.get(i)).getWorkingHours());
                System.out.println("Employee Department ID: " + ((Employee) list.get(i)).getDep().getDepID());
                System.out.println("Employee Position ID: " + ((Employee) list.get(i)).getPos().getPosID());
            }
        }
}


