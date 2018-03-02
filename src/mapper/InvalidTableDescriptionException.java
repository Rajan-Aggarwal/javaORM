package mapper;

public class InvalidTableDescriptionException extends Exception {
    private String sqlException;
    public InvalidTableDescriptionException(String sqlException) {
        this.sqlException = sqlException;
    }
    public String toString() {
        return "Invalid table definition: " + this.sqlException;
    }
}