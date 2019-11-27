package complex;

public class UserServiceImpl {
    private UserDaoImpl dao;
    private String string;

    public void setString(String string) {
        this.string = string;
    }

    //    public UserServiceImpl(UserDaoImpl userDao) {
//        this.dao = userDao;
//    }
//
    public void setDao(UserDaoImpl dao) {
        this.dao = dao;
    }


//
//    public void update() {
//        dao.update();
//    }

    @Override
    public String toString() {
        return "UserServiceImpl{" +
                "dao=" + dao +
                ", string='" + string + '\'' +
                '}';
    }
}
