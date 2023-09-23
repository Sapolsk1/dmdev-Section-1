package com.leetcode;

import java.util.ArrayList;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution2 {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(9);

        ListNode listNode1 = new ListNode(9);
        ListNode listNode2 = new ListNode(9, listNode1);
        ListNode listNode3 = new ListNode(9, listNode2);
        ListNode listNode4 = new ListNode(9, listNode3);
        ListNode listNode5 = new ListNode(9, listNode4);
        ListNode listNode6 = new ListNode(9, listNode5);
        ListNode listNode7 = new ListNode(9, listNode6);
        ListNode listNode8 = new ListNode(9, listNode7);
        ListNode listNode9 = new ListNode(9, listNode8);
        ListNode l2 = new ListNode(1, listNode9);
        System.out.println(addTwoNumbers(l1, l2));
    }
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            return "" + val + next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int i = 0;
        int l1result = 0;
        int value1 = l1.val;
        do {
            l1result += value1 * Math.pow(10, i);
            i++;
            l1 = l1.next;
            if (l1 != null) {
                value1 = l1.val;
            }
        } while (l1 != null);
        System.out.println(l1result);

        int j = 0;
        int l2result = 0;
        int value2 = l2.val;
        do {
            l2result += value2 * Math.pow(10, j);
            j++;
            l2 = l2.next;
            if (l2 != null) {
                value2 = l2.val;
            }
        } while (l2 != null);
        System.out.println(l2result);
        int temp = l1result + l2result;
        ArrayList<Integer> array = new ArrayList<Integer>();
        do{
            array.add(temp % 10);
            temp /= 10;
        } while  (temp > 0);
        ListNode listNode = new ListNode();
        for (int k = array.size() - 1; k >= 0; k--) {
            listNode.val = array.get(k);
            if (k > 0) {
                ListNode previous = listNode;
                listNode = new ListNode();
                listNode.next = previous;
            }
            System.out.println(array.get(k));
        }
        return listNode;
    }
}
