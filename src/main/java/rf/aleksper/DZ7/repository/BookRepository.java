package rf.aleksper.DZ7.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rf.aleksper.DZ7.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
