package A21MergeTwoSortedLists;
//You are given the heads of two sorted linked lists list1 and list2.
//Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
//Return the head of the merged linked list.
//Вам даны заголовки двух отсортированных связанных списков list1 и list2.
//Объединяем два списка в один отсортированный список. Список должен быть составлен путем сращивания узлов первых двух списков.
//Вернем заголовок объединенного связанного списка.
//
//Example 1:
//
//
//Input: list1 = [1,2,4], list2 = [1,3,4]
//Output: [1,1,2,3,4,4]
//Example 2:
//
//Input: list1 = [], list2 = []
//Output: []
//Example 3:
//
//Input: list1 = [], list2 = [0]
//Output: [0]
public class Main {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        System.out.println(mergeTwoLists(list1, list2));
        ListNode list3 = null;
        ListNode list4 = null;
        System.out.println(mergeTwoLists(list3, list4));
        ListNode list5 = null;
        ListNode list6 = new ListNode(0);
        System.out.println(mergeTwoLists(list5, list6));
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
       if (list1 == null) return list2;
       if (list2 == null) return list1;
        if (list1.val < list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }
}
