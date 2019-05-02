package com.epam.javaQA.homework.FileWorking;

import com.epam.javaQA.homework.Model.Books;

import java.io.*;

public class IntermediateFile {

    private File file;

    public IntermediateFile(String fileName) {
        file = new File(fileName);
    }

    public void saveIntermediateInfo(Books books, String description) {

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
            bw.write(description + ":\r\n" + books.printAllBooks() + "\r\n\r\n");
        } catch (FileNotFoundException exc) {
            System.out.println(exc.getMessage());
        } catch (IOException io) {
            System.out.println(io.getMessage());
        }
    }
}
