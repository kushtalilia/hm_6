package flowerstore;

import java.util.List;
import java.util.ArrayList;

public class FlowerBucket {

    List<FlowerPack> flowerPacks = new ArrayList<FlowerPack>();

    //add flower pack
    // getPrice
    public double getPrice() {
        double price = 0;
        for (int i = 0; i < flowerPacks.size(); i++) {
            price += flowerPacks.get(i).getPrice();
        }
        return price;




    }
}
