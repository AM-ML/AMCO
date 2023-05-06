package Javy.AMCO;



public class Jarvy {
      public static void main(String[] args) throws InterruptedException {

                 int value =7 ; value = value+1;
                 int[] values; 
                 values = new int[5]; 
               
                 values[0] =10;
                 values[1] = 20;
                 values[2] = 30;
                 values[3] = 40;
                 values[4] = 50;
                ;
               for( int i = 0; i < values.length; i++ ){
                System.out.printf("Values = %d \n" , values[i]);
            
               }
                     
                int[] vals;
                vals = new int[5];
                vals[0]= 10;
                vals[1]= 20;
                vals[2]= 30;
                vals[3]= 40;
                vals[4] = 50;
                for( int s = 0; s < vals.length; s++ ){
                    System.out.printf("Vals = %d \n" , vals[s]);
                    
                }
                String[] assoc = {"Kiwi", "Bread" , "Pineapple"};
                for(String i : assoc){
                    System.out.printf("assoc = "+ i + "\n");
                }   
                String[] Txts = new String[2];
 
                System.out.printf("txt n1 = %d \n", Txts[0]);
                Txts[0] = "Apple";
                Thread.sleep(1000);
                System.out.printf("txt n2 = "+Txts[0]+"\n");
                
            }
      }
