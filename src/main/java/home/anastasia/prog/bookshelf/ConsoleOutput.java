package home.anastasia.prog.bookshelf;

import static home.anastasia.prog.bookshelf.Messages.EMPTY_BOOKSHELF_MESSAGE;

public class ConsoleOutput {
    private ConsoleOutput() {
    }

    public static void displayMenu() {
        for (final Command command : Command.ALL) {
            display(formMenuItem(command));
        }
    }

    public static void display(String text) {
        System.out.println(text);
    }

    public static void displayPrompt(String prompt) {
        System.out.printf("%s: ", prompt);
    }

    public static void displayBlock(boolean empty) {
        displayMenu();
        if (empty) {
            display(EMPTY_BOOKSHELF_MESSAGE);
        }
    }

    private static String formMenuItem(Command command) {
        return String.format("%d. %s", command.ordinal() + 1, command);
    }
}
