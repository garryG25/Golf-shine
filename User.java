public class User extends GolfClub {
    String Username;
    String password;
    String FName;
    String email;
    User(){

    }
    void setUserName(String Username){
        this.Username=Username;
    }
    void setPassword(String password){
        this.password=password;
    }
    void setFName(String FName){
        this.FName=FName;
    }
    void setEmail(String email){
        this.email=email;
    }
    String getUserName(){
        return Username;
    }
    String getPassword(){
        return password;
    }
    String getFName(){
        return FName;
    }
    String getEmail(){
        return email;
    }

}
