package epam.learning.task.exceptions;

public class TaskException extends Exception {
    public TaskException() {
    }

    public TaskException(String message) {
        super(message);
    }

    public TaskException(String message, Throwable throwable) {
        super(message, throwable);
    }

}
