package Library.Access;

import Library.Document.IDocument;
import Library.User.User;

import java.util.*;

public class AccessControlService {

    private static AccessControlService instance = new AccessControlService();

    public static AccessControlService getInstance() {
        return instance;
    }

    private AccessControlService() {}


    private Map<String, Set<Integer>> accesses = new HashMap<>();

    public void grantAccess(User user, IDocument document) {
        String username = user.getUsername();
        if(!accesses.containsKey(username)) {
            accesses.put(username, new HashSet<>());
        }
        accesses.get(username).add(document.getId());
    }

    public void revokeAccess(User user, IDocument document) {
        String username = user.getUsername();
        if(!accesses.containsKey(username)) return;
        accesses.get(username).remove(document.getId());
    }

    public void displayAccesses() {
        for(Map.Entry<String, Set<Integer>> entry : accesses.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue().toString());
        }
    }

    public boolean hasAccess(User user, IDocument document) {
        String username = user.getUsername();
        if(!accesses.containsKey(username)) return false;
        return accesses.get(username).contains(document.getId());
    }
}
