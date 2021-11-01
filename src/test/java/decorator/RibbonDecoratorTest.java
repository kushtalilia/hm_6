package decorator;

import flowerstore.Flower;
import flowerstore.FlowerType;
import flowerstore.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RibbonDecoratorTest {
    Item flower = new Flower(FlowerType.ROSE);

    @BeforeEach
    void setUp() {
        flower.setPrice(10);
        flower = new RibbonDecorator(flower);
    }

    @Test
    void getPrice() {
        assertEquals(50, flower.getPrice());
    }

    @Test
    void getDescription() {
        assertEquals("Flower with ribbon", flower.getDescription());
    }
}