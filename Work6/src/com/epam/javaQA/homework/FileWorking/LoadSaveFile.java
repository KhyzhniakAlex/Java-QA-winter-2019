package com.epam.javaQA.homework.FileWorking;

import com.epam.javaQA.homework.Model.Book;
import com.epam.javaQA.homework.Model.Books;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class LoadSaveFile {

    private SimpleDateFormat format = new SimpleDateFormat("yyyy");
    private List<String> booksArray = new ArrayList<>();
    private File file;

    public LoadSaveFile(String fileName) {
        file = new File(fileName);
    }

    public int countBooks() {

        int counter = 0;
        try(BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8))) {
            String line;
            while((line = br.readLine()) != null) {
                counter++;
                booksArray.add(line);
            }
        } catch (FileNotFoundException fileExp) {
            System.out.println(fileExp.getMessage());
        } catch (IOException io) {
            System.out.println(io.getMessage());
        }
        return counter;
    }

    public void loadBooks(Books books) throws ParseException {

        for(String line : booksArray) {
            String[] array = line.split(", ");
            Book newBook = new Book();

            int i = 0;
            newBook.setName(array[i++]);
            newBook.setAuthor(array[i++]);
            newBook.setPublisher(array[i++]);
            newBook.setReleaseYear(format.parse(array[i++]));
            newBook.setPageAmount(Integer.parseInt(array[i++]));
            newBook.setPrice(Double.parseDouble(array[i]));

            books.addBook(newBook);
        }
    }

    public void saveBooks(Books books) {

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            bw.write(books.printAllBooks());
        } catch (IOException io) {
            System.out.println(io.getMessage());
        }
    }
}
