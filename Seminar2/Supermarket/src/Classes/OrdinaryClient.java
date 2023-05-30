package Classes;

public class OrdinaryClient extends Actor{

    public OrdinaryClient(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.name;
    }
    public boolean isMakeOrder(){
        return super.isMakeOrder;
    }
    public boolean isTakeOrder(){
        return super.isTakeOrder;
    }

    public Actor getActor(){
        return this;
    }

    public void setTakeOrder(boolean makeOder) {
        super.isMakeOrder = makeOder;
      }
      
      public void setMakeOrder(boolean pikUpOrder) {
        super.isTakeOrder = pikUpOrder;
      }
    
}