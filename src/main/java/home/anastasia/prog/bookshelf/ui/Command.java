package home.anastasia.prog.bookshelf.ui;

import java.util.List;

public enum Command {
    ADD("ДОБАВИТЬ"),
    FIND("НАЙТИ"),
    DELETE("УДАЛИТЬ"),
    CLEAR("ОЧИСТИТЬ ШКАФ"),
    QUIT("ВЫЙТИ");

    public static final List<Command> ALL = List.of(values());

    private final String text;

    Command(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return getText();
    }
}
