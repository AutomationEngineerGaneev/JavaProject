package stream_api_base;

import java.util.ArrayList;
import java.util.List;

public class Library {


    private List<Book> books;
    private List<Reader> readers;

    public Library() {
        init();
    }

    private void init() {
        books = new ArrayList<>();
        books.add(new Book("Оруэлл", "1984", 2021));
        books.add(new Book("Пушкин", "1789", 2024));
        books.add(new Book("Фауст", "1890", 2023));
        books.add(new Book("Фауст", "1890", 2023));
        //и так далее для других книг

        readers = new ArrayList<>();
        readers.add(new Reader("Иванов Иван Иванович", "ivanov.email@test.ru", true));
        readers.add(new Reader("Ильин Илья Иванович", "ilyin.email@test.ru", true));
        readers.add(new Reader("Ильин Илья Иванович", "ilyin.email@test.ru", true));
        readers.add(new Reader("Петров Петр Петрович", "petrov.email@test.ru", true));
        //и так далее для других читателей

        readers.get(0).getBooks().add(books.get(1));
        readers.get(0).getBooks().add(books.get(2));
        readers.get(0).getBooks().add(books.get(3));
        //и так далее для других читателей и взятых книг
    }

    public List<Book> getBooks() {
        return books;
    }

    public List<Reader> getReaders() {
        return readers;
    }
}
