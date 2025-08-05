import java.lang.reflect.Array;
import java.util.ArrayList;

public class GolfClub {
    String name;
    String Address;
    double price;
    String Option;

    GolfClub(){

    }
    void setGolfClubName(String name){
        this.name=name;
    }
    void setGolfClubAddress(String Address){
        this.Address=Address;
    }
    void setPrice(double price){
        this.price=price;
    }
    void setOption(String Option){
        this.Option=Option;
    }
    String getGolfClubName(){
        return name;
    }
    String getGolfClubAddress(){
        return Address;
    }
    double getPrice(){
        return price;
    }
    String getOption(){
        return Option;
    }



}


