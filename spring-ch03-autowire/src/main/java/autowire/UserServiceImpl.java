package autowire;

public class UserServiceImpl implements UserService {
    private UserDao dao;

    public UserServiceImpl() {
    }

    public UserServiceImpl(UserDao dao) {
        this.dao = dao;
    }

    public UserDao getDao() {
        return dao;
    }

    public void setDao(UserDao dao) {
        this.dao = dao;
    }

    public void update() {
        dao.update();
    }

    @Override
    public String toString() {
        return "UserServiceImpl{" +
                "dao=" + dao +
                '}';
    }
}
