package ru.dgaponov99.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.dgaponov99.domain.User;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);

    User findByActivationCode(String code);
}
