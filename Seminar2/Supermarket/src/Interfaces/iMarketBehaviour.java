package Interfaces;

import java.util.List;

import Classes.Actor;
/**
 * Интерфейс действий на рынке
 */

public interface iMarketBehaviour {
    void acceptToMarket(iActorBehavior actor);
    void releaseFromMarket(List<Actor> actors);
    void update();    
}
