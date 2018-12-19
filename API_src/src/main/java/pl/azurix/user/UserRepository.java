package pl.azurix.user;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User,Long> {
    public Optional<User> findByLoginAndPassword(String login, String password);
}
