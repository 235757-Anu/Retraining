package in.stackroute.ust.Repository;

import in.stackroute.ust.Domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
