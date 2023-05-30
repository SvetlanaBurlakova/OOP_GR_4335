import Classes.ActionedClient;
import Classes.Market;
import Classes.OrdinaryClient;
import Classes.SpecialClient;
import Interfaces.iActorBehavior;

public class App {jkg
    public static void main(String[] args) throws Exception {
        Market market = new Market();
        iActorBehavior client1 = new OrdinaryClient("Boris");
        iActorBehavior client2 = new OrdinaryClient("Darya");
        iActorBehavior client3 = new SpecialClient("Prezident", 1);
        iActorBehavior client4 = new ActionedClient("Oleg", "Дополнительная скидка 5%");
        iActorBehavior client5 = new ActionedClient("Alexey", "Дополнительная скидка 5%");
        iActorBehavior client6 = new ActionedClient("Maria", "Дополнительная скидка 5%");
        market.acceptToMarket(client1);
        market.acceptToMarket(client2);
        market.acceptToMarket(client3);
        market.acceptToMarket(client4);
        market.acceptToMarket(client5);
        market.acceptToMarket(client6);
        market.giveBackOrder(client2);




    }
}
