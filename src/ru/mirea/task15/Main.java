package ru.mirea.task15;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        try (FileWriter writer = new FileWriter("text.txt", false))
        {
            String text = sc.nextLine();
            writer.write(text + '\n');
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try(FileReader reader = new FileReader("text.txt"))
        {
            int symb;
            while((symb=reader.read())!=-1){

                System.out.print((char)symb);
            }
        }
        catch(IOException e){

            System.out.println(e.getMessage());
        }

        try (FileWriter writer = new FileWriter("text.txt", false))
        {
            String text = sc.nextLine();
            writer.write(text + '\n');
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (FileWriter writer = new FileWriter("text.txt", true))
        {
            String text = sc.nextLine();
            writer.write(text + '\n');
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try(FileReader reader = new FileReader("text.txt"))
        {
            // читаем посимвольно
            int symb;
            while((symb=reader.read())!=-1){

                System.out.print((char)symb);
            }
        }
        catch(IOException e){

            System.out.println(e.getMessage());
        }
    }
}
