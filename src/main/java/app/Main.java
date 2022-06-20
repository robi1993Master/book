package app;

import app.book.BookController;
import app.book.BookDao;
import io.javalin.Javalin;

public class Main {

    public static BookDao bookDao;

    public static void main(String[] args) {

        bookDao = new BookDao();

        Javalin app = Javalin.create().start(7001);
        app.get("/books", BookController::fetchAllBooks);


    }
}
