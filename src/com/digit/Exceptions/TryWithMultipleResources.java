package com.digit.Exceptions;

import java.io.*;

public class TryWithMultipleResources {
    public static void main(String[] args) {
        try(BufferedReader reader1 = new BufferedReader(new FileReader("fileNotFount.txt"));
            BufferedReader reader2 = new BufferedReader(new FileReader("C:\\Users\\mohammad.azam\\IdeaProjects\\Day 9\\src\\com\\digit\\Exceptions\\demo.txt"));
            FileWriter writer = new FileWriter("Writing.txt")) {
            String line1,line2;
            while(((line1 = reader1.readLine())!=null) &&((line2 = reader2.readLine())!=null))
            {
                writer.write(line1);
                writer.write("\n");
                writer.write(line2);

            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found"+e.getMessage());;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String line;
        try (BufferedReader read  = new BufferedReader(new FileReader("C:\\Users\\mohammad.azam\\IdeaProjects\\Day 9\\Writing.txt"))){
            while ((line = read.readLine())!=null) {
                System.out.println(line);
            }
        }catch (IOException e)
        {
            System.out.println(e);
        }


    }
}
