package HotelManagement;

import java.io.Serializable;

class Food implements Serializable
{
    int itemno;
    int quantity;   
    float price;
    
    Food(int itemno,int quantity)
    {
        this.itemno=itemno;
        this.quantity=quantity;
        switch(itemno)
        {
            case 1:price=quantity*50;
                break;
            case 2:price=quantity*60;
                break;
            case 3:price=quantity*70;
                break;
            case 4:price=quantity*30;
                break;
            case 5:price=quantity*80;
                break;
            case 6:price=quantity*200;
                break;
            case 7:price=quantity*90;
                break;
            case 8:price=quantity*9;
                break;
            case 9:price=quantity*60;
                break;
            case 10:price=quantity*190;
                break;
            case 11:price=quantity*200;
                break;
    
        }
    }
}