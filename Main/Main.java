package Main;
import Interface.Action;
import Model.*;
import java.util.ArrayList;
import java.util.Scanner;

import Controller.EmployeeManage;


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
            System.out.println("||||        [1]   Employee Manage                      ||||");
            System.out.println("||||        [2]   Department Manage                    ||||");
            System.out.println("||||        [3]   Salary Manage                        ||||");
            System.out.println("||||        [4]   Position Manage                      ||||");
            System.out.println("||||        [5]   Exit                                 ||||");
            System.out.println("||||                                                   ||||");
            System.out.println("==========================================================");
            System.out.println("==========================================================");


            Scanner sc = new Scanner(System.in);
            int choose = sc.nextInt();
            switch(choose)
            {
                case 1:
                    int empChoose = 0;
                    while (true)
                    {
                        System.out.println("==========================================================");
                        System.out.println("==========================================================");
                        System.out.println("||||                                                   ||||");
                        System.out.println("||||              Employee Management System           ||||");
                        System.out.println("||||        [1]   Add Employee                         ||||");
                        System.out.println("||||        [2]   Edit Employee                        ||||");
                        System.out.println("||||        [3]   Delete Employee                      ||||");
                        System.out.println("||||        [4]   Show Employee                        ||||");
                        System.out.println("||||        [5]   Search Employee                      ||||");
                        System.out.println("||||        [6]   Sort Employee                        ||||");
                        System.out.println("||||        [7]   Print Employee                       ||||");
                        System.out.println("||||        [8]   Back                                 ||||");
                        System.out.println("||||                                                   ||||");
                        System.out.println("==========================================================");
                        System.out.println("==========================================================");
                        empChoose = sc.nextInt();
                        if (empChoose == 8)
                            break;
                        EmployeeManage empManage = new EmployeeManage();
                        ArrayList<Object> list = new ArrayList<>();
                        switch (empChoose)
                        {
                            case 1:
                                list.add(empManage.add());
                                break;
                            case 2:
                                if (empManage.edit(list))
                                    System.out.println("Edit Success");
                                else
                                    System.out.println("Edit Fail");
                                break;
                            case 3:
                                if (empManage.delete(list))
                                    System.out.println("Delete Success");
                                else
                                    System.out.println("Delete Fail");
                                break;
                            case 4:
                                empManage.show(list);
                                break;
                            case 5:
                                empManage.search(list);
                                break;
                            case 6:
                                empManage.sort(list);
                                break;
                            case 7:
                                empManage.print(list);
                                break;
                        }
                    }
                    break;
            }

        }
    }
}
