package Library.Document;

import java.time.LocalDate;

public class DocumentFactory {

    public static IDocument createDocument(int id, LocalDate date, String content, boolean isPrivate) {
        Document document = new Document(id, date, content);
        return isPrivate ? new DocumentProxy(document) : document;
    }
}
