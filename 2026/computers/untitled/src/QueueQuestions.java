public class QueueQuestions {

    public void priorityQueue(Patient p, Queue<Patient> q) {
        Queue<Patient> tempQ = new Queue<>();
        while (!q.isEmpty() && p.getPriority() >= q.head().getPriority()) {
            tempQ.insert(q.remove());
        }
        tempQ.insert(p);
        while (!q.isEmpty()) {
            tempQ.insert(q.remove());
        }
        while (!tempQ.isEmpty()) {
            q.insert(tempQ.remove());
        }
    }

    public void update(int id, int pri, Queue<Patient> q) {
        Queue<Patient> tempQ = new Queue<>();
        while (q.head().getId() != id) {
            tempQ.insert(q.remove());
        }

        Patient p = q.remove();
        p.setPriority(pri);

        while (!q.isEmpty()) {
            tempQ.insert(q.remove());
        }
        while (!tempQ.isEmpty()) {
            q.insert(tempQ.remove());
        }
        priorityQueue(p, q);
    }
}
