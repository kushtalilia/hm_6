package decorator;

import flowerstore.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasketDecoratorTest {
    Item flower = new Flower(FlowerType.ROSE);

    @BeforeEach
    void setUp() {
        flower.setPrice(10);
        flower = new BasketDecorator(flower);
    }

    @Test
    void getPrice() {
        assertEquals(14, flower.getPrice());
    }

    @Test
    void getDescription() {
        assertEquals("Flower in basket", flower.getDescription());
    }
}