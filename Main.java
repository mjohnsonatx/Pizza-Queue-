public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();
        DeliveryList list = new DeliveryList();
        //DeliveryList last = new DeliveryList();

        queue.enqueue(list, new Pizza("pepperoni", "1234 Bobcat Trail"));
        queue.enqueue(list, new Pizza("sausage","2345 University Drive"));
        queue.deliver(list);
        queue.enqueue(list, new Pizza("extra cheese", "3456 Rickster Road"));
        queue.enqueue(list, new Pizza("everything", "4567 King Court"));
        queue.enqueue(list, new Pizza("coffee beans", "5678 Java Circle"));
        queue.deliver(list);
        queue.deliver(list);
        queue.deliver(list);
        queue.deliver(list);
        queue.deliver(list);
        queue.deliver(list);




    }
}