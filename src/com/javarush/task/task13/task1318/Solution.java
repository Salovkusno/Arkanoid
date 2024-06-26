/*package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

/*public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String sourceFile = bufferedReader.readLine();
        FileInputStream fileInputStream = new FileInputStream(sourceFile);

        Scanner scanner = new Scanner(fileInputStream);
        StringBuilder stringBuilder = new StringBuilder();

        while (scanner.hasNextLine()){
            stringBuilder.append(scanner.nextLine()).append("\n");
        }
        System.out.println(stringBuilder.toString());

        scanner.close();
        bufferedReader.close();
    }
}//C:\мое обучение\123.txt
*/
package com.javarush.task.task13.task1318;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sourceFileName = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(sourceFileName);

        Scanner scanner = new Scanner(fileInputStream);
        StringBuilder builder = new StringBuilder();

        while (scanner.hasNextLine()) {
            builder.append(scanner.nextLine()).append("\n");
        }

        System.out.print(builder.toString());

        scanner.close();
        reader.close();
    }
}
