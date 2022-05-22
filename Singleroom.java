package HotelManagement;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;

class Singleroom implements Serializable
{
    String name;
    String contact;
    String gender;   
    ArrayList<Food> food =new ArrayList<>();
    HotelData hd = new HotelData();

   
    Singleroom()
    {
        this.name="";
    }
    Singleroom(String name,String contact,String gender) throws ClassNotFoundException, SQLException
    {
        this.name=name;
        this.contact=contact;
        this.gender=gender;
        //hd.data(name,contact,gender);
    }
}