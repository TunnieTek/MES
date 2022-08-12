package Main;
import Interface.Action;
import Model.*;
import java.util.ArrayList;
import java.util.Scanner;
import Controller.*;



public class Main 
{
    public static void main(String[] args) {
        System.out.println("Management Employee System");
        while (true) 
        {
            System.out.println("==========================================================");
            System.out.println("==========================================================");
            System.out.println("||||                                                   ||||");
            System.out.println("||||              Employee Management System           ||||");
            System.out.println("||||        [1]   Department Manage                    ||||");
            System.out.println("||||        [2]   Position Manage                      ||||");
            System.out.println("||||        [3]   Employee Manage                      ||||");
            System.out.println("||||        [4]   Salary Manage                        ||||");
            System.out.println("||||        [5]   Exit                                 ||||");
            System.out.println("||||                                                   ||||");
            System.out.println("==========================================================");
            System.out.println("==========================================================");

            Scanner sc = new Scanner(System.in);
            int choose = sc.nextInt();
            switch(choose)
            {
                case 1:
                    int depChoose = 0;
                    while (true)
                    {
                        System.out.println("=====================================================");
                        System.out.println("||                                                 ||");
                        System.out.println("||            Department Management System         ||");
                        System.out.println("||      [1]   Add Department                       ||");
                        System.out.println("||      [2]   Edit Department                      ||");
                        System.out.println("||      [3]   Delete Department                    ||");
                        System.out.println("||      [4]   Show Department                      ||");
                        System.out.println("||      [5]   Search Department                    ||");
                        System.out.println("||      [6]   Sort Department                      ||");
                        System.out.println("||      [7]   Back                                 ||");
                        System.out.println("||                                                 ||");
                        System.out.println("=====================================================");
                        depChoose = sc.nextInt();
                        ArrayList<Department> depList = new ArrayList<Department>();
                        DepartmentManage depManage = new DepartmentManage();
                        switch(depChoose)
                        {
                            case 1:
                                depList.add(depManage.add());
                                break;
                            case 2:
                                depManage.edit(depList);
                                break;
                            case 3:
                                depManage.delete(depList);
                                break;
                            case 4:
                                depManage.show(depList);
                                break;
                            case 5:
                                depManage.search(depList);
                                break;
                            case 6:
                                depManage.sort(depList);
                                break;
                            case 7:
                                break;
                            default:
                                System.out.println("Please choose again!");
                                break;
                        }
                    }
                case 2:
                    int posChoose = 0;
                    while (true)
                    {
                        System.out.println("=====================================================");
                        System.out.println("||                                                 ||");
                        System.out.println("||            Position Management System           ||");
                        System.out.println("||      [1]   Add Position                         ||");
                        System.out.println("||      [2]   Edit Position                        ||");
                        System.out.println("||      [3]   Delete Position                      ||");
                        System.out.println("||      [4]   Show Position                        ||");
                        System.out.println("||      [5]   Search Position                      ||");
                        System.out.println("||      [6]   Sort Position                        ||");
                        System.out.println("||      [7]   Back                                 ||");
                        System.out.println("||                                                 ||");
                        System.out.println("=====================================================");
                        posChoose = sc.nextInt();
                        switch(posChoose)
                        {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            case 5:
                                break;
                            case 6:
                                break;
                            case 7:
                                break;
                            default:
                                System.out.println("Please choose again!");
                                break;
                        }
                    }
                case 3:
                int empChoose = 0;
                while (true)
                {
                    System.out.println("=====================================================");
                    System.out.println("||                                                 ||");
                    System.out.println("||            Employee Management System           ||");
                    System.out.println("||      [1]   Add Employee                         ||");
                    System.out.println("||      [2]   Edit Employee                        ||");
                    System.out.println("||      [3]   Delete Employee                      ||");
                    System.out.println("||      [4]   Show Employee                        ||");
                    System.out.println("||      [5]   Search Employee                      ||");
                    System.out.println("||      [6]   Sort Employee                        ||");
                    System.out.println("||      [7]   Back                                 ||");
                    System.out.println("||                                                 ||");
                    System.out.println("=====================================================");
                    empChoose = sc.nextInt();
                    switch(empChoose)
                    {
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        case 5:
                            break;
                        case 6:
                            break;
                        case 7:
                            break;
                        default:
                            System.out.println("Please choose again!");
                            break;
                    }
                }
                case 4:
                int salChoose = 0;
                while (true)
                {
                    System.out.println("=====================================================");
                    System.out.println("||                                                 ||");
                    System.out.println("||            Salary Management System             ||");
                    System.out.println("||      [1]   Add Salary                           ||");
                    System.out.println("||      [2]   Edit Salary                          ||");
                    System.out.println("||      [3]   Delete Salary                        ||");
                    System.out.println("||      [4]   Show Salary                          ||");
                    System.out.println("||      [5]   Search Salary                        ||");
                    System.out.println("||      [6]   Sort Salary                          ||");
                    System.out.println("||      [7]   Back                                 ||");
                    System.out.println("||                                                 ||");
                    System.out.println("=====================================================");
                    salChoose = sc.nextInt();
                    switch(salChoose)
                    {
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        case 5:
                            break;
                        case 6:
                            break;
                        case 7:
                            break;
                        default:
                            System.out.println("Please choose again!");
                            break;
                    }
                }
            }

        }
    }
}
