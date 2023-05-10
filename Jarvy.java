package com.AM.Inside.AMCO;



public class Jarvy {
      public static void main(String[] args) throws InterruptedException {
            int[][] table = {
                {1, 3 ,4},
                {5,6,7},
                {10,9,8}
            };
            System.out.println(table[1][0]); 
            for(int row = 0; row<table.length; row++){
                  for(int col = 0; col<table[row].length; col++ ){
                        System.out.printf(table[row][col]+ "\t");
                  }
                  System.out.println();
            };
           
            String[][] grid = {
                  {"Spam", "Ham", "Damn"},
                  {"Ate", "Mate", "Late"},
                  {"Hate", "Wait", "Bait"}
            };
               
            for(int row = 0; row < grid.length; row++){
                        for(int col = 0; col < grid[row].length; col++){
                              System.out.printf(grid[row][col]+ "\t");
                        };
                        System.out.println();
            }
            }
      }
