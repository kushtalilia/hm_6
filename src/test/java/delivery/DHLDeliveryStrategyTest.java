package delivery;

import flowerstore.Flower;
import flowerstore.FlowerType;
import flowerstore.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DHLDeliveryStrategyTest {
    List<Item> items = new ArrayList<>();
    DHLDeliveryStrategy dhlDeliveryStrategy = new DHLDeliveryStrategy();

    @BeforeEach
    void setUp() {
        Flower flower_1 = new Flower(FlowerType.CHAMOMILE);
        items.add(flower_1);
    }

    @Test
    void deliver() {
        assertEquals("Deliver in DNL items: [Flower(price=0.0, sepalLength=0.0, color=null, flowerType=CHAMOMILE)]", dhlDeliveryStrategy.deliver(items));
    }
}