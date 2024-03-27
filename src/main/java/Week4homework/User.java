package Week4homework;

public class User {
    private String username;
    private String password;
    private String email;
    private String gender;
    private String brithday;
    public User(String username, String password, String email, String gender, String brithday){
        this.username = username;
        this.password = password;
        this.email = email;
        this.gender =gender;
        this.brithday =brithday;
    }
    public String getUsername(){
        return this.username;
    }
    public String getPassword(){
        return this.password;
    }
    public String getEmail(){
        return this.email;
    }
    public String getGender(){
        return this.gender;
    }
    public String getBrithday(){
        return this.brithday;
    }
}
