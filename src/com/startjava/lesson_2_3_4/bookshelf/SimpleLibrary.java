package com.startjava.lesson_2_3_4.bookshelf;

import java.util.Scanner;

public class SimpleLibrary {

    private final BookShelf bookShelf = new BookShelf();
    private final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        SimpleLibrary simpleLibrary = new SimpleLibrary();
        int userAction;
        do {
            simpleLibrary.showBookShelf();
            simpleLibrary.showMenu();
            userAction = simpleLibrary.inputAction();
        } while (simpleLibrary.executeAction(userAction));
    }

    private void showBookShelf() {
        if (bookShelf.getCountBooks() == 0) {
            System.out.println("Полка пуста. Вы можете добавить в нее первую книгу");
            return;
        }
        String delimiter = "-".repeat(bookShelf.getMaxLengthShelf());
        System.out.println('|' + delimiter + '|');
        for (Book book : bookShelf.getBooks()) {
            System.out.println('|' + (book != null ?
                    book + " ".repeat(delimiter.length() - book.toString().length()) :
                    " ".repeat(delimiter.length())) + '|');
            System.out.println('|' + delimiter + '|');
        }
        System.out.println();
    }

    private void showMenu() {
        System.out.println("""
                Меню команд:
                 1. Добавить книгу.
                 2. Найти книгу.
                 3. Отобразить информацию о загрузке полки.
                 4. Удалить книгу.
                 5. Удалить все книги.
                 0. Завершить работу.
                """);
    }

    private int inputAction() {
        System.out.print("Введите номер команды от 0 до 5: ");
        while (true) {
            try {
                int action = Integer.parseInt(scanner.nextLine());
                if (action < 0 || action > 5) throw new IllegalArgumentException();
                return action;
            } catch (IllegalArgumentException e) {
                System.out.print("Ошибка ввода! Введите целое число от 0 до 5: ");
            }
        }
    }

    private boolean executeAction(int action) {
        switch (action) {
            case 0: return false;
            case 1:
                addBook();
                break;
            case 2:
                findBook();
                break;
            case 3:
                showBookShelfInfo();
                break;
            case 4:
                deleteBook();
                break;
            case 5:
                deleteAllBooks();
                break;
            default:
                System.out.println("введена неподдерживаемая операция");
        }
        System.out.print("Для продолжения работы нажмите клавишу Enter");
        scanner.nextLine();
        System.out.println();
        return true;
    }

    private void addBook() {
        System.out.println("Введите информацию о книге:");
        System.out.print(" - автор: ");
        String author = scanner.nextLine();
        System.out.print(" - название: ");
        String title = scanner.nextLine();
        System.out.print(" - год издания: ");
        String publishYear = scanner.nextLine();
        if (bookShelf.add(new Book(author, title, publishYear))) {
            System.out.println("Книга успешно добавлена");
        } else {
            System.out.println("Книга не может быть добавлена, на полке нет свободных мест");
        }
    }

    private void findBook() {
        System.out.print("Введите название книги: ");
        String title = scanner.nextLine();
        Book book = bookShelf.find(title);
        if (book != null) {
            System.out.println("Найдена книга: " + book);
        } else {
            System.out.println("Книга " + title + " отсутствует на полке");
        }
    }

    private void showBookShelfInfo() {
        System.out.println("Книг на полке: " + bookShelf.getCountBooks() +
                ", свободных мест: " + bookShelf.hasFreePlace());
    }

    private void deleteBook() {
        System.out.print("Введите название удаляемой книги: ");
        String title = scanner.nextLine();
        if (bookShelf.delete(title)) {
            System.out.println("Книга удалена");
        } else {
            System.out.println("Книга " + title + " отсутствует на полке");
        }
    }

    private void deleteAllBooks() {
        bookShelf.clear();
        System.out.println("Полка очищена");
    }
}