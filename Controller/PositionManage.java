package Controller;
import Interface.Action;
import Model.*;
import java.util.ArrayList;
import java.util.Scanner;

public class PositionManage implements Action<Position> {

    @Override
    public Position add() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter position ID: ");
        String posID = sc.nextLine();
        System.out.println("Enter position name: ");
        String posName = sc.nextLine();
        System.out.println("Enter position bonus: ");
        Double posBonus = sc.nextDouble();
        return new Position(posID, posName, posBonus);
    }

    @Override
    public boolean edit(ArrayList<Position> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter position ID: ");
        String posID = sc.nextLine();
        for (Position p : list) {
            if (p.getPosID().equals(posID)) {
                System.out.println("Enter new position name: ");
                String posName = sc.nextLine();
                System.out.println("Enter new position bonus: ");
                Double posBonus = sc.nextDouble();
                p.setPosName(posName);
                p.setPosBonus(posBonus);
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
        for (Position p : list) {
            if (p.getPosID().equals(posID)) {
                list.remove(p);
                return true;
            }
        }
        return false;
    }

    @Override
    public void show(ArrayList<Position> list) {
        for (Position p : list) {
            System.out.println(p);
        }
    }

    @Override
    public void search(ArrayList<Position> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter position ID: ");
        String posID = sc.nextLine();
        for (Position p : list) {
            if (p.getPosID().equals(posID)) {
                System.out.println(p);
            }
        }
        
    }

    @Override
    public void sort(ArrayList<Position> list) {
        list.sort((Position p1, Position p2) -> p1.getPosID().compareTo(p2.getPosID()));
    }


}
