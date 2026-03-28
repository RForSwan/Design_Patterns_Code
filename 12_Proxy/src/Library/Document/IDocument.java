package Library.Document;

import Library.User.User;

import java.time.LocalDate;

public interface IDocument {
    int getId();
    LocalDate getCreationDate();
    String getContent(User user);
}
