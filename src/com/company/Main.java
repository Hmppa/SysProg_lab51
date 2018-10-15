package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

        public static void main (String[]args) {
            // write your code here

            try {
                FileReader reader = new FileReader("C:/Users/Johan-Lohi/IdeaProjects/SysProg_lab51/write.txt");
                BufferedReader bufferedReader = new BufferedReader(reader);

                String line;

                while ((line = bufferedReader.readLine()) != null) {
                    System.out.println(line);
                }
                reader.close();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            try {
                FileWriter writer = new FileWriter("C:/Users/Johan-Lohi/IdeaProjects/SysProg_lab51/write.txt");
                BufferedWriter bufferedWriter = new BufferedWriter(writer);

                Scanner scanner = new Scanner(System.in);
                String text = scanner.nextLine();

                bufferedWriter.write(text);

                bufferedWriter.close();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }

}
