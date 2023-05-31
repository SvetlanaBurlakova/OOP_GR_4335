package Classes;

import java.util.HashMap;


public class ActionedClient extends Actor {
    public boolean isActionEligible;
    private int maxActionedClients = 2;
    private String actionName;
    private static HashMap<String, Integer> countOfActionedClient = new HashMap<String, Integer>();

    /**
     * конструктор для акционного клиента
     * @param Имя клиента
     * @param Название акции
     */
    public ActionedClient(String name, String actionName) {
        super(name);
        this.actionName = actionName;
        setActionName(actionName);
        if (countOfActionedClient.get(actionName) <= maxActionedClients){
            this.isActionEligible = true;
        }
        else this.isActionEligible = false;
    }
    /**
     * Получение имени клиента
     * @return
     */
    public String getActionName() {
        return actionName;
    }
    /**
     * Метод увеличивающий счетчик кол-ва клиентов указанной акции.
     * Если акции в списке нет - акция добавляется и счетчик ставится 1
     * @param Название акции
     */
    private void setActionName(String actionName) {
        if (countOfActionedClient.containsKey(actionName)){
            countOfActionedClient.put(actionName, countOfActionedClient.get(actionName)+1);
        }
        else countOfActionedClient.put(actionName,1);
    }
    /**
     * Метод возвращает кол-во активных клиентов в указанной акции
     * @return 
     */
    public static Integer getCountOfActionedClient(String actionName) {
        return countOfActionedClient.get(actionName);
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

}
