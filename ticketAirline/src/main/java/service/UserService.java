package service;

import base.service.BaseService;
import domain.User;
import ui.Subject;

public interface UserService extends BaseService<User,Long> {
    boolean isExistsByUsername(String username);
    boolean login(Subject title);
    void signup(Subject title);
}
