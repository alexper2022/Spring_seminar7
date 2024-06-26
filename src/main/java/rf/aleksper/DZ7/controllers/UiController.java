package rf.aleksper.DZ7.controllers;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import rf.aleksper.DZ7.entity.Book;
import rf.aleksper.DZ7.entity.Issue;
import rf.aleksper.DZ7.entity.Reader;
import rf.aleksper.DZ7.services.BookService;
import rf.aleksper.DZ7.services.IssueService;
import rf.aleksper.DZ7.services.ReaderService;

import java.util.List;

@Slf4j
@Controller
@RequiredArgsConstructor
@RequestMapping(value = "ui")
public class UiController {
    private final IssueService issueService;
    private final ReaderService readerService;
    private final BookService bookService;

    @GetMapping("issues")
    public String issuesAll(Model model) {
        log.info("Поступил запрос /ui/issues/");
        List<Issue> issuesList = issueService.allIssues();
        model.addAttribute("issues", issuesList);
        return "issues";
    }

    @GetMapping("readers")
    public String readersAll(Model model) {
        log.info("Поступил запрос /ui/readers/");
        List<Reader> readersList = readerService.allReaders();
        model.addAttribute("readers", readersList);
        return "readers";
    }

    @GetMapping("books")
    public String booksAll(Model model) {
        log.info("Поступил запрос /ui/books/");
        List<Book> booksList = bookService.allBooks();
        model.addAttribute("books", booksList);
        return "books";
    }
}
