package home.anastasia.prog.bookshelf.exception.ui;

public class WrongUserInputException extends BookshelfException {
    public WrongUserInputException() {
    }

    public WrongUserInputException(String message) {
        super(message);
    }

    public WrongUserInputException(String message, Throwable cause) {
        super(message, cause);
    }

    public WrongUserInputException(Throwable cause) {
        super(cause);
    }
}
