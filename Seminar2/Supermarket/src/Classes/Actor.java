package Classes;

import Interfaces.iActorBehavior;

public abstract class Actor implements iActorBehavior{
    protected String name;
    protected Boolean isTakeOrder;
    protected Boolean isMakeOrder;
    protected Boolean isActionEligible;
    public int getIdVip;

    
    public Actor(String name){
        this.name = name;
    }

    public abstract String getName();

}