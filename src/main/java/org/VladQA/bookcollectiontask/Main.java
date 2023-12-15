package org.VladQA.bookcollectiontask;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Book mihaisBook = new Book("Atomic habits", "James C.");
        Book alexsBook = new Book("Crime and Punishment", "Feodor D.");
        Book ruxandasBook = new Book("Karamazov Brothers", "Feodor D.");
        Book veronicasBook = new Book("To Kill A Mockingbird", "Harper L.");
        Book mihais2Book = new Book("1984", "George O.");

        System.out.println(mihais2Book.getTitle());
        mihaisBook.printTheBookDetails();
        mihais2Book.printTheBookDetails();
        alexsBook.printTheBookDetails();
        ruxandasBook.printTheBookDetails();
        veronicasBook.printTheBookDetails();

        Library carturestiLibrary = new Library("Carturesti");

        carturestiLibrary.addBook(mihaisBook);
        carturestiLibrary.addBook(mihaisBook);
        carturestiLibrary.addBook(veronicasBook);
        carturestiLibrary.addBook(ruxandasBook);

        System.out.println(carturestiLibrary.getTheStockStatusNumber());
        System.out.println(carturestiLibrary.isThereSuchABookInTheStock(alexsBook));

        carturestiLibrary.addBook(alexsBook);
        System.out.println(carturestiLibrary.getTheStockStatusNumber());
        System.out.println(carturestiLibrary.isThereSuchABookInTheStock(alexsBook));

        carturestiLibrary.printAllTheBooks();

        Library victorsLibrary = new Library("Cartier");

        victorsLibrary.addBook(alexsBook);
        victorsLibrary.addBook(ruxandasBook);
        victorsLibrary.addBook(veronicasBook);
        System.out.println(victorsLibrary.getTheStockStatusNumber());
        victorsLibrary.printAllTheBooks();

        Map<String, Library> librariesMap = new HashMap<>();

        librariesMap.put("Stefan Cel Mare 136", carturestiLibrary);
        librariesMap.put("Str. Dacia 24/3 ap 01", victorsLibrary);

        librariesMap.get("Stefan Cel Mare 136").printAllTheBooks();
        System.out.println(librariesMap.get("Str. Dacia 24/3 ap 01").isThereSuchABookInTheStock(veronicasBook));

        int[] dataTable = {2, 5, 6, 7, 34, 78};
        int[] secondTable = {1, 6, 764, 215, 2145, 65, 7673, 314};

        System.out.println(IntNumberArrayService.findMin(dataTable));
        System.out.println(IntNumberArrayService.calculateSumOfArray(dataTable));
        System.out.println(IntNumberArrayService.calculateSumOfArray(secondTable));
        System.out.println(IntNumberArrayService.findMin(secondTable));
        System.out.println(IntNumberArrayService.getAvg(dataTable));
        System.out.println(IntNumberArrayService.getAvg(secondTable));

    }
}
