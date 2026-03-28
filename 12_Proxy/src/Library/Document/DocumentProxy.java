package Library.Document;

import Library.Access.AccessControlService;
import Library.Access.AccessDeniedException;
import Library.User.User;

import java.time.LocalDate;

public class DocumentProxy implements IDocument {

    private Document document;

    public DocumentProxy(Document document) {
        this.document = document;
    }

    @Override
    public int getId() {
        return document.getId();
    }

    @Override
    public LocalDate getCreationDate() {
        return document.getCreationDate();
    }

    @Override
    public String getContent(User user) throws AccessDeniedException {
        AccessControlService acs = AccessControlService.getInstance();
        if(!acs.hasAccess(user, document)) throw new AccessDeniedException("User (" + user.getUsername() + ") doesn't have access to that file");
        return document.getContent(user);
    }
}
