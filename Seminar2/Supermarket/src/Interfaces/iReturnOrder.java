package Interfaces;
/**
 * Интерфейс возврата товара
 */
public interface iReturnOrder {
    void takeMoney(iActorBehavior actor);
    void giveBackOrder(iActorBehavior actor);
}
