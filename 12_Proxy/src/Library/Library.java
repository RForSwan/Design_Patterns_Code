package Library;

import Library.Access.AccessControlService;
import Library.Document.Document;
import Library.Document.DocumentFactory;
import Library.Document.IDocument;
import Library.User.User;

import java.time.LocalDate;
import java.util.*;

public class Library {
    private Map<String, User> users = new HashMap<>();
    private Map<Integer, IDocument> documents = new HashMap<>();

    public void addNewUser(String username) {
        if(users.containsKey(username)) throw new IllegalArgumentException("Username ("+username+") already used");
        users.put(username, new User(username));
    }

    public void addNewDocument(int id, LocalDate date, String content, boolean isPrivate) {
        if(documents.containsKey(id)) throw new IllegalArgumentException("Id ("+id+") already used");
        documents.put(id, DocumentFactory.createDocument(id, date, content, isPrivate));
    }

    public String accessDocument(String username, int id) {
        if(!users.containsKey(username) || !documents.containsKey(id)) {
            throw new IllegalArgumentException("Username ("+username+") or ID ("+id+") doesn't exist");
        }
        return documents.get(id).getContent(users.get(username));
    }

    public void grantAccess(String username, int id) {
        if(!users.containsKey(username) || !documents.containsKey(id)) {
            throw new IllegalArgumentException("Username ("+username+") or ID ("+id+") doesn't exist");
        }
        AccessControlService.getInstance().grantAccess(users.get(username), documents.get(id));
    }

    public void revokeAccess(String username, int id) {
        if(!users.containsKey(username) || !documents.containsKey(id)) {
            throw new IllegalArgumentException("Username ("+username+") or ID ("+id+") doesn't exist");
        }
        AccessControlService.getInstance().revokeAccess(users.get(username), documents.get(id));
    }
}
