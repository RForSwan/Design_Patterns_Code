package BookRecommendationsSystem;

import java.util.ArrayList;
import java.util.List;

public class Recommendation implements Cloneable{
    private String targetAudience;
    private List<Book> books;

    public Recommendation(String targetAudience) {
        this.targetAudience = targetAudience;
        books = new ArrayList<>();
    }

    public String getTargetAudience() {
        return targetAudience;
    }

    public void setTargetAudience(String targetAudience) {
        this.targetAudience = targetAudience;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public String toString() {
        return "Target Audience : " + targetAudience + ", Books : " + books.toString();
    }

    public Recommendation clone() {
        try {
            Recommendation clone = (Recommendation) super.clone();
            List<Book> newList = new ArrayList<>();
            for(Book book : clone.getBooks()) {
                newList.add(book.clone());
            }
            clone.setBooks(newList);
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

}
