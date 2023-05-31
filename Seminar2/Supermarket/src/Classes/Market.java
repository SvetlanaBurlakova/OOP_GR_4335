package Classes;

import java.util.List;
import java.util.ArrayList;

import Interfaces.iActorBehavior;
import Interfaces.iMarketBehaviour;
import Interfaces.iQueueBehavoir;
import Interfaces.iReturnOrder;

public class Market implements iMarketBehaviour,iQueueBehavoir,iReturnOrder {
    private List<iActorBehavior> queue;
    /**
     * Создается пустой список клиентов
     */
    public Market() {
        this.queue = new ArrayList<iActorBehavior>();
    }
    /**
     * Выводится сообщение о том, что клиент пришел в магазин
     * вызывается метод добавления клиента в список покупателей
     * если клиент акционный, проверяется и выводится информация об участия в акции
     */
    @Override
    public void acceptToMarket(iActorBehavior actor) {
        System.out.println(actor.getActor().getName()+" клиент пришел в магазин ");
        takeInQueue(actor);
        if (actor instanceof ActionedClient) {
            ActionedClient  actionedClient = (ActionedClient) actor;
            if (actionedClient.isActionEligible) {                
                System.out.println(actor.getActor().getName() +" клиент учавствует в акции");
            }
            else System.out.println(actor.getActor().getName() +" клиент не учавствует в акции, кол-во допустимых участников акции превышено");
        }
    }
    /**
     * Клиент добавляется в очередь
     */
    @Override
    public void takeInQueue(iActorBehavior actor) {
        this.queue.add(actor);
        System.out.println(actor.getActor().getName()+" клиент добавлен в очередь ");
    }
    /**
     * Очищение списка клиентов, для каждого клиента в очереди - вывод сообщения, что клиент из очереди ушел
     */
    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for(Actor actor:actors)
        {
            System.out.println(actor.getName()+" клиент ушел из магазина ");
            queue.remove(actor);
        }
    }
    /**
     * Обновление статуса и действия клиента - заказал, получил товар, ушел
     */
    @Override
    public void update() {
       takeOrder();
       giveOrder();
       releaseFromQueue();
    }
    /**
     * Утсановления флага, что товар получен для всех клиентов из очереди и вывод соответвующего сообщения
     */
    @Override
    public void giveOrder() {
        for(iActorBehavior actor: queue)
        {
            if(actor.isMakeOrder())
            {
                actor.setTakeOrder(true);
                System.out.println(actor.getActor().getName()+" клиент получил свой заказ ");
            }
        }
        
    }
    /**
     * Создание списка клиентов, которые покинули очередь
     */
    @Override
    public void releaseFromQueue() {
       List<Actor> releaseActors = new ArrayList<>();
       for(iActorBehavior actor:queue)
       {
        if(actor.isTakeOrder())
        {
            releaseActors.add(actor.getActor());
            System.out.println(actor.getActor().getName()+" клиент ушел из очереди ");
        }

       }
    releaseFromMarket(releaseActors);
    }
    /**
     * Установления флага, что заказ сделан для всех клиентов, у которых флаг был False
     */
    @Override
    public void takeOrder() {
        for(iActorBehavior actor:queue)
        {
            if(!actor.isMakeOrder())
            {
                actor.setMakeOrder(true);
                System.out.println(actor.getActor().getName()+" клиент сделал заказ ");

            }
        }
        
    }
    /**
     * Информация, что клиент вернул товар и вызов метода - получение денег
     * @param клиент
     */
    @Override
    public void giveBackOrder(iActorBehavior actor) {
        System.out.println(actor.getActor().getName()+" клиент вернул товар ");
        takeMoney(actor);
    }
    /**
     * Информация, что клиент взял деньги за возвращенный товар
     * @param клиент
     */
    @Override
    public void takeMoney(iActorBehavior actor) {
        System.out.println(actor.getActor().getName()+" клиент взял деньги ");
    }
    public void action(iActorBehavior actor){

    }

}