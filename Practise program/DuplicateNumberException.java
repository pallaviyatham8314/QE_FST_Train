package Examples;
import java.util.HashSet;
import java.util.Set;

class DuplicateNumberException extends Exception {
    public DuplicateNumberException(Set<Integer> duplicates) {
        super("Duplicate numbers found: " + duplicates);
    }

}


