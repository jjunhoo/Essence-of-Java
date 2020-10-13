package TestDome_11ST;

import java.util.ArrayList;
import java.util.HashMap;

public class Runner {
    private HashMap<Integer, Resource> resources = new HashMap<Integer, Resource>();

    public Iterable<Resource> getResources() {
        return this.resources.values();
    }

    public Resource acquireResource(int id) {
        Resource w = this.resources.getOrDefault(id, null);
        // 최초인 경우, Resource 생성 후 HashMap > put
        if (w == null) {
            w = new Resource(id);
            this.resources.put(id, w);
        }

        return w;
    }

    public void releaseResource(int id) {
        Resource w = this.resources.getOrDefault(id, null);
        if (w == null)
            throw new IllegalArgumentException();

        w.dispose();
        resources.clear();
    }

    public class Resource {
        private ArrayList<String> tasks = new ArrayList<String>();

        private int id;

        public int getId() {
            return this.id;
        }

        public Iterable<String> getTasks() {
            return this.tasks;
        }

        public Resource(int id) {
            this.id = id;
        }
        // performTask 호출 시 현재 tasks 가 null 이면, throw
        public void performTask(String task) {
            if (this.tasks == null)
                throw new IllegalStateException(this.getClass().getName());
            // null 이 아닌 경우, ArrayList 에 추가 (add)
            this.tasks.add(task);
        }

        public void dispose() {
            this.tasks = null;
        }
    }

    public static void main(String[] args) {
        Runner d = new Runner();

        d.acquireResource(1).performTask("Task11");
        d.acquireResource(2).performTask("Task21");
        System.out.println(String.join(", ", d.acquireResource(2).getTasks()));
        d.releaseResource(2);
        // System.out.println("[]" + String.join(", ", d.acquireResource(2).getTasks())); // add
        d.acquireResource(1).performTask("Task12");
        System.out.println(String.join(", ", d.acquireResource(1).getTasks()));
        d.releaseResource(1);
        // System.out.println("[]" + String.join(", ", d.acquireResource(1).getTasks())); // add
    }
}
