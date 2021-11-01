package delivery;

import flowerstore.Item;

import java.util.List;

public class DHLDeliveryStrategy implements Delivery{
    @Override
    public boolean deliver(List<Item> items){
        System.out.format("Deliver in DNL items: " + items);
        return true;
    }

}
