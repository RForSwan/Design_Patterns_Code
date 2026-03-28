package Library.Document;

import Library.User.User;

import java.time.LocalDate;

public class Document implements IDocument {
    private int id;
    private LocalDate creationDate;
    private String content;

    public Document(int id, LocalDate creationDate, String content) {
        this.id = id;
        this.creationDate = creationDate;
        this.content = content;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public LocalDate getCreationDate() {
        return creationDate;
    }

    @Override
    public String getContent(User user) {
        return content;
    }
}