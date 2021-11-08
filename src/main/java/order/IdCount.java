package order;

public class IdCount{
    static int id = 0;
    public static int genId(){
        id += 1;
        return id;
    }
}
