package Classes;

import java.util.HashMap;

public class ActionedClient extends Actor {
    private int maxActionedClients = 2;
    public String actionName;
    private static HashMap<String, Integer> countOfActionedClient;
    private boolean isActionEligible;

    /**
     * конструктор для акционного клиента
     * @param Имя клиента
     * @param Название акции
     */
    public ActionedClient(String name, String actionName) {
        super(name);
        this.actionName = actionName;
    }
    /**
     * Получение имени клиента
     * @return
     */
    public String getActionName() {
        return actionName;
    }
    /**
     * Установка нового названия акции
     * @param Название акции
     */
    public void setActionName(String actionName) {
        this.actionName = actionName;
    }
    /**
     * Метод возвращает кол-во активных клиентов в указанной акции
     * @return 
     */
    public static Integer getCountOfActionedClient(String actionName) {
        return countOfActionedClient.get(actionName);
    }
    /**
     * установка кол-ва клиентов в указанной акции
     * @param Название акции
     */
    public static void setCountOfActionedClient(String actionName) {
        countOfActionedClient.put(actionName,countOfActionedClient.get(actionName)+1);

    }
    /**
     * Метод для получения заказа
     * @param pickUpOrder
     */
    @Override
    public void setTakeOrder(boolean pickUpOrder) {
        super.isTakeOrder = pickUpOrder;
    }
    /**
     * Метод для установления заказа
     * @param pikUpOrder
     */
    public void setMakeOrder(boolean pikUpOrder) {
        super.isMakeOrder = pikUpOrder;
      }  
    /**
     * Метод возвращает клиента
     * @return
     */
    @Override
    public Actor getActor() {
        return this;
    }
    /**
     * Метод возвращает имя клиента
     * @return
     */
    @Override
    public String getName() {
        return super.name;
    }
    /**
     * Метод возвращает сделан ли заказ
     * @return
     */
    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }
    /**
     * Метод возвращает получен ли заказ
     * @return
     */
    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    } 
    public boolean isActionEligible(String actionName){
        if (countOfActionedClient.get(actionName) > maxActionedClients){
            return true;
        }
        else return false;
     }

}
