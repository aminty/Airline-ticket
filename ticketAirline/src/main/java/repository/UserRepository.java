package repository;

import base.repository.BaseRepository;
import domain.User;

public interface UserRepository extends BaseRepository<User,Long> {
    boolean isExistsByUsername(String username);

    User fingByUsername(String username);
}
