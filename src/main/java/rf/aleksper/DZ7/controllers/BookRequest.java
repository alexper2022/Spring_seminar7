package rf.aleksper.DZ7.controllers;

import lombok.Data;

@Data
public class BookRequest {
    private final long bookId;
    private final String bookName;
}
