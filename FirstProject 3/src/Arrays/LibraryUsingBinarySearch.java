package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class LibraryUsingBinarySearch {

    //Given you have a library of 5 books. Write a program that will ask user to enter the name of one of the books.
    // If the book is in the library, ask the user what book they replace the original book with. If the book the user
    // enters is not in the library, print “library not changed”. In both cases print out the library for the user to
    // see.
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String [] books= {"Leaders eat last", "Harry Potter", "Mindset", "OCA", "Eragon"};
        Arrays.sort(books);
        System.out.println(Arrays.toString(books));
        System.out.println("Enter the book you want to replace");
        String answer = input.nextLine();

        int index = Arrays.binarySearch(books,answer);//tracks position of the book

        if(index>=0){//means valid book, continue....if they do find a book given in library

            System.out.println("What will you replace?" + answer+ "with");
            String nextBook = input.nextLine();

            books[index]= nextBook;

        }else{
            System.out.println("Book not found");
        }
        System.out.println(Arrays.toString(books));











    }
}
