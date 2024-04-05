package A206ReverseLinkedList;
//Given the head of a singly linked list, reverse the list, and return the reversed list.
//A linked list can be reversed either iteratively or recursively. Could you implement both?
//Учитывая заголовок односвязного списка, переверните список и верните перевернутый список.
//Cвязанный список можно переворачивать итеративно или рекурсивно. Не могли бы вы реализовать оба?
//Example 1:
//
//
//Input: head = [1,2,3,4,5]
//Output: [5,4,3,2,1]
//Example 2:
//
//
//Input: head = [1,2]
//Output: [2,1]
//Example 3:
//
//Input: head = []
//Output: []
public class Main {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        System.out.println(reverseList(node1));
        ListNode node2 = new ListNode(1, new ListNode(2));
        System.out.println(reverseList(node2));
    }

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}
