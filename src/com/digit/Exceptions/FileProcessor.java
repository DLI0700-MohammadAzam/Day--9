package com.digit.Exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class  FileProcessor{

    static void processFiles(List<String> paths) throws Exception
    {

        for(String path : paths)
        {
            try(BufferedReader reader = new BufferedReader(new FileReader(path))
            ) {
                String line ;
                while((line = reader.readLine())!=null )
                {
                    System.out.println(line);
                }
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {

        List<String> files = Arrays.asList("C:\\Users\\mohammad.azam\\IdeaProjects\\Day 9\\src\\com\\digit\\Exceptions\\demo.txt","fileNotFound.txt","Error.txt");

        try {
            processFiles(files);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
