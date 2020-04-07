package LinkedList02;

public class deleteDuplication {
//    在一个排序的链表中，存在重复的节点，删除链表中重复的节点
//    重复的节点不保留，返回链表头指针
    public static class ListNode{
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode deleteDuplication(ListNode pHead){
        ListNode newHead=new ListNode(-1);
        ListNode newTail=newHead;
        ListNode cur=pHead;
        while (cur!=null){
            if (cur!=null&&cur.val==cur.next.val){
                while (cur!=null&&cur.val==cur.next.val){
                    cur=cur.next;
                }
                cur=cur.next;
            }else {
                newTail.next=new ListNode(cur.val);
                newTail=newTail.next;
                cur=cur.next;
            }

        }
        return newHead.next;
    }

}
