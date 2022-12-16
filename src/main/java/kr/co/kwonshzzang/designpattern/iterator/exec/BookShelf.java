package kr.co.kwonshzzang.designpattern.iterator.exec;

import java.util.ArrayList;
import java.util.List;

public class BookShelf implements Aggregate {
    private List<Book> books;
    private int last;

    public BookShelf() {
        this.books = new ArrayList<>();
        this.last = 0;
    }

    public void appendBook(Book book) {
        this.books.add(book);
    }

    public int getLength() {
        return this.books.size();
    }

    public Book getBookAt(int index) {
        return books.get(index);
    }


    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
