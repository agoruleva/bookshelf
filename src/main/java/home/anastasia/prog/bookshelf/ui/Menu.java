package home.anastasia.prog.bookshelf.ui;

import home.anastasia.prog.bookshelf.exception.ui.BookshelfException;
import home.anastasia.prog.bookshelf.exception.ui.WrongUserInputException;

import static home.anastasia.prog.bookshelf.ui.ConsoleOutput.*;
import static home.anastasia.prog.bookshelf.ui.Messages.*;

public class Menu {
    public void launch() {
        Command command = null;
        String prompt = COMMAND_PROMPT;
        final ConsoleInput input = new ConsoleInput();

        displayBlock(true);
        do {
            try {
                command = input.getUserCommand(prompt);
                execute(command);
            } catch (WrongUserInputException e) {
                prompt = INPUT_ERROR_PROMPT;
                continue;
            } catch (BookshelfException e) {
                display(e.getMessage());
            }

            prompt = COMMAND_PROMPT;
            if (command != Command.QUIT) {
                // показать шкаф после выполнения команды (количество книг и свободных полок)
                input.askForContinue(ENTER_PROMPT);
                displayBlock(true);
            }
        } while (command != Command.QUIT);
    }

    private void execute(Command command) {
        switch (command) {
            case ADD, FIND, DELETE, CLEAR -> throw new BookshelfException(
                    NOT_IMPLEMENTED_YET.formatted(command.getText()));
            default -> {
                if (command != Command.QUIT) {
                    throw new BookshelfException(UNKNOWN_COMMAND);
                }
            }
        }
    }
}
