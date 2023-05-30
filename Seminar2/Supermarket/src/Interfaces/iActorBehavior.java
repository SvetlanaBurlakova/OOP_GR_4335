package Interfaces;

import java.util.List;

import Classes.Actor;
/**
 * Интерфейс действий покупателя на рынке
 */

public interface iActorBehavior {
    void setMakeOrder(boolean makeOrder);
    void setTakeOrder(boolean pickUpOrder);
    boolean isMakeOrder();
    boolean isTakeOrder();
    Actor getActor();

}
