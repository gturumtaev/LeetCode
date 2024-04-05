package A83RemoveDuplicatesFromSortedList;

import java.util.List;

//Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.
//Учитывая заголовок отсортированного связанного списка, удалите все дубликаты, чтобы каждый элемент появлялся только один раз. Верните связанный список также отсортированным.
//
//Example 1:
//
//Input: head = [1,1,2]
//Output: [1,2]
//Example 2:
//
//Input: head = [1,1,2,3,3]
//Output: [1,2,3]
public class Main {
    public static void main(String[] args) {
        ListNode head1 = new ListNode(1, new ListNode(1, new ListNode(2)));
        System.out.println(deleteDuplicates(head1));
        System.out.println();
        ListNode head2 = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3)))));
        System.out.println(deleteDuplicates(head2));
    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;

        while (temp != null && temp.next != null) {
            if (temp.val == temp.next.val) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
        return head;
    }
}


