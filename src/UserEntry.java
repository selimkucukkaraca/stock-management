public class UserEntry extends User{

    User user = new User("selim",123);

    public UserEntry(String name, int password) {
        super(name, password);
    }

    public boolean login(User user){
        if (user.getName().equals(this.user.getName()) && user.getPassword() == this.user.getPassword()){
            return true;
        }
        else {
            return false;
        }
    }
}
