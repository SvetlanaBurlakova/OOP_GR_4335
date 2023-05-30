package Interfaces;

import Classes.Actor;
/**
 * Интерфейс действий с очередями
 */

public interface iQueueBehavoir {
    void takeInQueue(iActorBehavior actor);
    void releaseFromQueue();
    void takeOrder();
    void giveOrder();
}
