package Javy.AMCO;
import java.util.Scanner;


public class Jarvy {
      public static void main(String[] args) throws InterruptedException {

                 try( Scanner input = new Scanner(System.in)){
                              System.out.println("Please Enter  Command");
                              String line = input.nextLine();
                              switch(line){
                                    case "Y":
                                    case "y":
                                        System.out.println("IS THAT A YES?!");
                                        long starttTime = System.currentTimeMillis();
                                        while(System.currentTimeMillis() - starttTime < 2000) {
                                            System.out.print(".");
                                            Thread.sleep(100);
                                        }
                                        System.out.println("\nWELL THAT'S A NO FOR ME!");
                                        break;
                                    case "N":
                                    case "n":
                                        System.out.println("No?.....:<");
                                        long startrrTime = System.currentTimeMillis();
                                        while(System.currentTimeMillis() - startrrTime < 2000) {
                                            System.out.print(".");
                                            Thread.sleep(100);
                                        }
                                        System.out.println("\nFUCK YOU THEN!");
                                        break;
                                    case "Start":
                                    case "start":
                                        Thread.sleep(2000);
                                        System.out.println("Starting Operator");
                                        long startime = System.currentTimeMillis();
                                        while(System.currentTimeMillis() - startime < 2000) {
                                            System.out.print(".");
                                            Thread.sleep(100);
                                        }
                                        System.out.println("\nOperator Successfully Started");
                                        break;
                                        case "Stop":
                                        case "stop":
                                        Thread.sleep(2000);
                                        System.out.println("Stopping Operator");
                                        long startTime = System.currentTimeMillis();
                                        while(System.currentTimeMillis() - startTime < 2000) {
                                            System.out.print(".");
                                            Thread.sleep(60);
                                        }
                                        System.out.println("\nOperator Successfully Stopped");
                                        break;
                                        default:
                                        // code for invalid command
                                       
                                        long startrTime = System.currentTimeMillis();
                                        while(System.currentTimeMillis() - startrTime < 1000) {
                                            System.out.print(".");
                                            Thread.sleep(70);
                                        }
                                         System.out.println("\n command not recognized");
                                        break;

                                    
                                        
                                }
                                
                                
                 }
                      catch( Exception e){
                        System.out.println(e.getMessage());
                        
                      }                  


            }
      }
