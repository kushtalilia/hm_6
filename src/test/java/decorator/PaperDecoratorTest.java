package decorator;

import flowerstore.Flower;
import flowerstore.FlowerType;
import flowerstore.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaperDecoratorTest {

    Item flower = new Flower(FlowerType.ROSE);

    @BeforeEach
    void setUp() {
        flower.setPrice(10);
        flower = new PaperDecorator(flower);
    }

    @Test
    void getPrice() {
        assertEquals(23, flower.getPrice());
    }

    @Test
    void getDescription() {
        assertEquals("Flower with paper", flower.getDescription());
    }
}