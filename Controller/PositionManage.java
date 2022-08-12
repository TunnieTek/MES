package Controller;
import Interface.Action;
import Model.*;
import java.util.ArrayList;
import java.util.Scanner;

public class PositionManage implements Action<Position> {

    @Override
    public Position add() {
        Position pos = new Position();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter position ID: ");
        String posID = sc.nextLine();
        pos.setPosID(posID);
        System.out.println("Enter position name: ");
        String posName = sc.nextLine();
        pos.setPosName(posName);
        System.out.println("Enter position bonus: ");
        Double posBonus = sc.nextDouble();
        pos.setPosBonus(posBonus);
        return pos;
    }

    @Override
    public boolean edit(ArrayList<Position> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter position ID: ");
        String posID = sc.nextLine();
        for(int i=0; i<list.size(); i++)
        {
            if(list.get(i).getPosID().equals(posID))
            {
                System.out.println("Enter position name: ");
                String posName = sc.nextLine();
                System.out.println("Enter position bonus: ");
                Double posBonus = sc.nextDouble();
                list.get(i).setPosName(posName);
                list.get(i).setPosBonus(posBonus);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(ArrayList<Position> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter position ID: ");
        String posID = sc.nextLine();
        for(int i=0; i<list.size(); i++)
        {
            if(list.get(i).getPosID().equals(posID))
            {
                System.out.println("Do you want to delete this position? (Y/N)");
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
    public void show(ArrayList<Position> list) {
        for(int i=0; i<list.size(); i++)
        {
            System.out.println("Position ID: " + list.get(i).getPosID());
            System.out.println("Position name: " + list.get(i).getPosName());
            System.out.println("Position bonus: " + list.get(i).getPosBonus());
        }
    }

    @Override
    public void search(ArrayList<Position> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter position ID: ");
        String posID = sc.nextLine();
        for(int i=0; i<list.size(); i++)
        {
            if(list.get(i).getPosID().equals(posID))
            {
                System.out.println("Position ID: " + list.get(i).getPosID());
                System.out.println("Position name: " + list.get(i).getPosName());
                System.out.println("Position bonus: " + list.get(i).getPosBonus());
            }
        }
    }

    @Override
    public void sort(ArrayList<Position> list) {
        for(int i=0; i<list.size()-1; i++)
        {
            for(int j=i+1; j<list.size(); j++)
            {
                if(list.get(i).getPosID().compareTo(list.get(j).getPosID()) > 0)
                {
                    Position temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
    }


}
