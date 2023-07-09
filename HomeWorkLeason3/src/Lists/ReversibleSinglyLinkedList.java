package Lists;

import reversible.Reversible;

public class ReversibleSinglyLinkedList extends SinglyLinkedList implements Reversible {
    @Override
    public void reverse() {
        Node firstNodeToExchange = head;
        Node previousExchangedNode = null;
        while (firstNodeToExchange != previousExchangedNode && firstNodeToExchange != null){
            Node secondNodeToExchange = firstNodeToExchange;
            while (secondNodeToExchange.next() != previousExchangedNode && secondNodeToExchange.next() != null){
                secondNodeToExchange = secondNodeToExchange.next();
            }
            if(firstNodeToExchange == secondNodeToExchange)break;
            int temp = firstNodeToExchange.getValue();
            firstNodeToExchange.setValue(secondNodeToExchange.getValue());
            secondNodeToExchange.setValue(temp);
            previousExchangedNode = secondNodeToExchange;
            firstNodeToExchange = firstNodeToExchange.next();
        }
    }

}