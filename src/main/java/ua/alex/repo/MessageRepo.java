package ua.alex.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.alex.domain.Message;

public interface MessageRepo extends JpaRepository<Message,Long> {
}
