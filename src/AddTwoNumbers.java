import javax.lang.model.type.NullType;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = null;
        ListNode p = null;
        int carry = 0;
        while (l1 != null || l2!=null){
            int a = (l1 != null) ? l1.val : 0;
            int b = (l2 != null) ? l2.val : 0;
            int sum = a + b + carry;
            carry = sum/10;
            sum = sum%10;
            if (l3 == null){
                l3 = new ListNode(sum);
                p = l3;
            }else{
                p.next = new ListNode(sum % 10);
                p = p.next;
            }
            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }
        if (carry != 0){
            p.next = new ListNode(carry);
        }
        return l3;
    }
    public ListNode BuildLinkedList(int[] values){
        ListNode list = new ListNode(values[0]);
        ListNode p = list;
        for (int i=1;i< values.length;i++){
            p.next = new ListNode(values[i]);
            p = p.next;
        }
        return list;
    }
}
