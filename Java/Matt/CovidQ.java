import java.util.LinkedList;

public class CovidQ {
	private LinkedList<Customer> queue = new LinkedList<Customer>();
	
    public void add(Customer c) {
        for (int i = 0; i < queue.size(); i++) {
            if (c.compareTo(queue.get(i)) == -1) {
                queue.add(i, c);
                return;
            }
        }
        queue.add(patient);
    }

    public Customer remove() {
        if (queue.isEmpty())
            return null;
        return queue.remove(0);
    }

    public Customer peek() {
        if (queue.isEmpty())
            return null;
        return queue.get(0);
    }
    
    public LinkedList<Customer> getQueue() {
        return queue;
    }
}