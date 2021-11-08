package order;

import static order.IdCount.genId;

public class Sender implements User{
    String status;
    int id;

    @Override
    public void update(String status){
        this.status = status;
    }

    @Override
    public int gen_id(){
        this.id = IdCount.genId();
        return id;
    }


}
