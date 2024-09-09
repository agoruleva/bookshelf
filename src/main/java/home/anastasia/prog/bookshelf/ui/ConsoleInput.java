package home.anastasia.prog.bookshelf.ui;

import home.anastasia.prog.bookshelf.exception.ui.WrongUserInputException;
import java.util.Scanner;

import static home.anastasia.prog.bookshelf.ui.ConsoleOutput.display;
import static home.anastasia.prog.bookshelf.ui.ConsoleOutput.displayPrompt;

public class ConsoleInput {
    private final Scanner scanner = new Scanner(System.in);

    public Command getUserCommand(String prompt) {
        displayPrompt(prompt);
        try {
            return Command.ALL.get(Integer.parseInt(scanner.nextLine()) - 1);
        } catch (RuntimeException e) {
            throw new WrongUserInputException(e);
        }
    }

    public void askForContinue(String prompt) {
        display(prompt);
        scanner.nextLine();
    }
}
