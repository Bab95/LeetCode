import java.util.PriorityQueue;

public class Problem23 {
    public ListNode BuildLinkedList(int[] values){
        ListNode list = new ListNode(values[0]);
        ListNode p = list;
        for (int i=1;i< values.length;i++){
            p.next = new ListNode(values[i]);
            p = p.next;
        }
        return list;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode result = null;
        PriorityQueue<ListNode> pq = new PriorityQueue<>(new ListNodeComparator());
        for(int i=0;i<lists.length;i++){
            if(lists[i] != null){
                pq.add(lists[i]);
            }
        }
        ListNode q = null;
        while (!pq.isEmpty()){
            ListNode current = pq.peek();
            pq.remove(current);
            if (current.next != null){
                pq.add(current.next);
            }
            if (result == null){
                result = current;
                q = result;
                q.next = null;
            }else{
                q.next = current;
                q = q.next;
                q.next = null;
            }
        }
        return result;
    }
}
