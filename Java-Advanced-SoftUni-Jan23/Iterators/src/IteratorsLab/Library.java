package IteratorsLab;

import java.awt.print.Book;
import java.util.Iterator;

public class Library implements Iterable<Book> {

    private Book[] books;

    public Library(Book... books) {
        this.books = books;
    }

    public Iterator<Book> iterator() {
        return new LibIterator();
    }

    private class LibIterator implements Iterator<Book> {
        private int counter;

        public LibIterator() {
            this.counter = 0;
        }

        @Override
        public boolean hasNext() {
            return this.counter < books.length;
        }

        @Override
        public Book next() {
            //return books[this.counter++];
            Book result =  books[this.counter];
            this.counter++;
            return result;
        }
    }
}
