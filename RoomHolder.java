package HotelManagement;

import java.io.Serializable;

class RoomHolder implements Serializable
{
    Doubleroom luxury_doubleroom[]=new Doubleroom[10]; //Luxury
    Doubleroom deluxe_doubleroom[]=new Doubleroom[20]; //Deluxe
    Singleroom luxury_singleroom[]=new Singleroom[10]; //Luxury
    Singleroom deluxe_singleroom[]=new Singleroom[20]; //Deluxe
}