package com.AM.calc;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Inside {
    public static void main(String[] args) throws InterruptedException {
        try (Scanner scn = new Scanner(System.in)) {
            DecimalFormat df = new DecimalFormat("#.###");
            System.out.println("Enter:");
            System.out.println("1 to Start ");
            System.out.println("2 to Exit");
            int n = scn.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Starting Operation");
                    boolean z = true ;
                    String x =".";
                 
                    while(z == true){
                        System.out.printf(x);
                        x = x + ".";
                        Thread.sleep(80);
                        if(x.equals(".....")){
                            z = false;
                        }
                    }
                    System.out.println("Operation Started..........");
                    Scanner zcn = new Scanner(System.in);
                    System.out.println("Enter 1 for addition");
                    System.out.println("Enter 2 for subtraction");
                    System.out.println("Enter 3 for multiplication");
                    System.out.println("Enter 4 for division");
                    System.out.println("Enter 5 to exit");
                    int intij = zcn.nextInt();
                    switch (intij) {
                        case 1:
                            Scanner add = new Scanner(System.in);
                            System.out.println("Enter Numbers:");
                            float addInt1 = add.nextFloat();
                            float addInt2 = add.nextFloat();
                            float addResult = addInt1 + addInt2;
                            
                            System.out.println("Result: " + df.format(addResult));
                            
                            break;
                        case 2:
                            Scanner subt = new Scanner(System.in);
                            System.out.println("Enter Numbers:");

                            float subtInt1 = subt.nextFloat();
                            float subtInt2 = subt.nextFloat();
                            float subtResult = subtInt1 - subtInt2;
                            
                            System.out.println("Result: " + df.format(subtResult));
                            break;
                        case 3:
                            Scanner multi = new Scanner(System.in);
                            System.out.println("Enter Numbers:");
                            float multiInt1 = multi.nextFloat();
                            
                            float multiInt2 = multi.nextFloat();
                            float multiResult = multiInt1 * multiInt2;
                            
                            System.out.println("Result: " + df.format(multiResult));
                            break;
                        case 4:
                            Scanner div = new Scanner(System.in);
                            System.out.println("Enter Numbers:");
                            float divInt1 = div.nextFloat();
                            float divInt2 = div.nextFloat();
                            if(divInt2 == 0){
                                System.out.println("Cannot divide by 0");
                            } else{
                                float divResult = (float)divInt1 / divInt2;
                               
                                System.out.println("Result: " + df.format(divResult));
                            }
                            break;
                            case 5:
                            System.out.println("Goodbye!");
                            break;
                        default:
                            System.out.println("Invalid input");
                            break;
                    }
                 
                    break;
                case 2:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }
    }
}
