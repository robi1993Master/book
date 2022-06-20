package app.book;

import app.Main;
import io.javalin.http.Context;

import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Handler;

import static app.Main.bookDao;


public class BookController {

    public static void fetchAllBooks (Context ctx) {
        Map<String, Object> model = new HashMap<>();
        model.put("books", bookDao.getAllBooks());
        ctx.json(model);
    };


    public static void fetchOneBook (Context ctx ) {
        Map<String, Object> model = new HashMap<>();
        String isbn = ctx.pathParam("isbn");
        model.put("app/book", bookDao.getBookByIsbn(isbn));
        ctx.json(model);
    };

}
