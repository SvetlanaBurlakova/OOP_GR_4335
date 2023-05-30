package Classes;

public class SpecialClient extends Actor{
    public int idVip;

    public SpecialClient(String name, int idVip) {
        super(name);
        this.idVip = idVip;
    }

    @Override
    public String getName() {
        return super.name;
    }
    public boolean isTakeOrder() {
        return super.isTakeOrder;
      }
  
    public boolean isMakeOrder() {
        return super.isMakeOrder;
      }
  
    public void setTakeOrder(boolean makeOder) {
        super.isMakeOrder = makeOder;
      }
      
    public void setMakeOrder(boolean pikUpOrder) {
        super.isTakeOrder = pikUpOrder;
      }
    public Actor getActor(){
        return this;
    }

    
}