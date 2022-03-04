public class Queue {

    public void enqueue(DeliveryList first, Pizza T) {

        if (first.head == null) {
            first.head = T;
            first.tail = T;

            //System.out.println("Deliver a pizza with " + T.ingredients + " to " + T.address);

        } else {
            first.tail.next = T;
            first.tail = T;

           //System.out.println("Deliver a pizza with " +T.ingredients + " to " + T.address);
        }
    }
    public Pizza dequeue(DeliveryList first) {
        Pizza pizzaToDeliver = new Pizza();

        if (first.head != null)
        {
            pizzaToDeliver = first.head;
            first.head = first.head.next;
        }

        if (first.head == null)
            first.tail = null;

        return pizzaToDeliver;
    }

    public void deliver(DeliveryList first) {
        Pizza thispizza = new Pizza();

        thispizza = dequeue(first);

        if (thispizza.ingredients == null) {
            System.out.println("No deliveries pending");
            return;
        }
        System.out.println("Deliver a pizza with " + thispizza.ingredients + " to " + thispizza.address);
    }
}