package com.javarush.task.pro.task05.task0529;

import java.util.Arrays;

/* 
Галаксианские роботанки (1)
*/

public class Solution {
    public static String robotank = "☖";
    public static String empty = "_";
    public static String hit = "🎯";
    public static int width = 30;
    public static int height = 10;
    public static String[][] field = new String[height][width];
    public static String[][] bombs = new String[height][width];


    public static void main(String[] args) {
        for (int i = 0; i < field.length; i++) {
            Arrays.fill(field[i], empty);//напишите тут ваш код
        }
        for (int i = 0; i < field.length; i++) {
            int j = (int) (Math.random() * width);
            field[i][j] = robotank;
        }
        for (int i = 0; i < bombs.length; i++) {
            int bombCount = 10;
            while (bombCount > 0) {
                int j = (int) (Math.random() * width);
                //if (bombs[i][j] == 0) {
               //     bombs[i][j] = 1;
                    bombCount--;
                }
            }
        }

       // for (int i = 0; i < field.length; i++) {
          //  for (int j = 0; j < field[i].length; j++) {
            //    System.out.print(field[i][j]);
            }
           // System.out.println();
       // }
   // }
//}

