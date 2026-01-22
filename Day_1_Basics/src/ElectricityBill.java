import java.util.*;
import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Previous Reading: ");
        int prev = sc.nextInt();

        System.out.print("Enter Current Reading: ");
        int curr = sc.nextInt();

        int units = curr - prev;
        System.out.println("Units Consumed: " + units);

        double energyCharge = 0;

        if (units <= 50) {
            energyCharge = units * 3;
        }
        else if (units <= 100) {
            energyCharge = (50 * 3) + (units - 50) * 4.5;
        }
        else if (units <= 150) {
            energyCharge = (50 * 3) + (50 * 4.5) + (units - 100) * 5;
        }
        else {
            energyCharge = (50 * 3) + (50 * 4.5) + (50 * 5)
                    + (units - 150) * 6;
        }

        double fixedCharge = 100;
        double duty = energyCharge * 0.05;
        double totalBill = energyCharge + fixedCharge + duty;

        System.out.println("\n--- Electricity Bill ---");
        System.out.println("Energy Charges   : ₹" + energyCharge);
        System.out.println("Fixed Charges    : ₹" + fixedCharge);
        System.out.println("Electricity Duty : ₹" + duty);
        System.out.println("Total Payable    : ₹" + totalBill);
    }
}












/*public class ElectricityBill {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter current Units: ");
        int curr=sc.nextInt();
        System.out.println("Enter Previous Units: ");
        int prev=sc.nextInt();
        int units_consumed=curr-prev;
        System.out.println("Units Consumed: "+units_consumed);
        int bill=0;
        if(units_consumed>0 && units_consumed<=50){
            //bill= (int) ((units_consumed-50)*3.0);
            bill= (int) (units_consumed*3.0);
        }
        if(units_consumed>50 && units_consumed<=100){
            //bill= (int) (((units_consumed-50)*3.0)+((units_consumed-100)*4.5));
            bill=(int) ((units_consumed*3.0)+((units_consumed-50)*4.5));
        }
        if(units_consumed>100 && units_consumed<=150){
            //bill= (int) (((units_consumed-50)*3.0)+((units_consumed-100)*4.5)+((units_consumed-150)*5.0));
            bill=(int) ((units_consumed*3.0)+(units_consumed-50)*4.5);
        }
        System.out.println("Bill is "+bill);
    }
}*/
