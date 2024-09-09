package home.anastasia.prog.bookshelf.exception;

public class BookshelfException extends RuntimeException {
    public BookshelfException() {
    }

    public BookshelfException(String message) {
        super(message);
    }

    public BookshelfException(String message, Throwable cause) {
        super(message, cause);
    }

    public BookshelfException(Throwable cause) {
        super(cause);
    }
}
