import flowerstore.Flower;

public class Main {
    public static void main(String[] args){
        Flower[] flowers = new Flower[3];
        int[] color = {127, 0, 0};
        for (int i = 0; i < flowers.length; i++) {
            flowers[i] = new Flower();
            flowers[i].setColor(color);
            System.out.println(flowers[i]);
        }
//        color = new int[]{0, 127, 0};
        color[1] = 127;

        for (int i = 0; i < flowers.length; i++){
            System.out.println(flowers[i]);
        }
    }
}
