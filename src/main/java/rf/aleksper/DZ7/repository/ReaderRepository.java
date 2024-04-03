package rf.aleksper.DZ7.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rf.aleksper.DZ7.entity.Reader;

import java.util.Optional;

public interface ReaderRepository extends JpaRepository<Reader, Long> {
    Optional<Reader> findByLogin(String login);
}
