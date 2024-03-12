package boardexample.myboard.domain.comment.repository;

import boardexample.myboard.domain.comment.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}