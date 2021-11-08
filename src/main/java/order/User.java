package order;

public interface User {

    String status = "";
    int id = 0;

    void update(String status);

    int gen_id();
}
