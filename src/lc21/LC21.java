// claim a package
package lc21;

// Definition for singly-linked list.
class ListNode {
	int val;
	ListNode next;
	ListNode() {}
	ListNode(int val) { this.val = val; }
	ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

public class LC21 {
	
	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(1);
		l1.next = new ListNode(6);
		l1.next.next = new ListNode(7);
		l2.next = new ListNode(3);
		l2.next.next = new ListNode(4);
		
		ListNode output = mergeTwoLists(l1, l2);
		while(output != null) {
			System.out.println(output.val);
			output = output.next;
			// 一定要明确写出来，node 往下走！！！！ 否则，不会自动走，尽管node有next
		}
		
	}

	public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
// 当两个ListNode 都不为空时，比较两个的当前ListNode，将小的附给returning list。
// 同时，小的所在的ListNode 的current 往下移动一个。另一个ListNode的current 不变。

		ListNode curr1 = list1;
		ListNode curr2 = list2;
		ListNode dummyHead = new ListNode(0);
		ListNode curr = dummyHead;
		
		while (curr1 != null && curr2 != null) {
			
			if ((curr1.val <= curr2.val)) {
				curr.next = new ListNode(curr1.val);
				// !!!!! 随用随创建，保证next 不为空，不会报错！！！
				curr = curr.next;
				curr1 = curr1.next;
			} else {
				curr.next = new ListNode(curr2.val);
				curr = curr.next;
				curr2 = curr2.next;
			}
		}
			
		if (curr1 == null) {curr.next = curr2;}
		else if (curr2 == null) {curr.next = curr1;}
		else curr.next = null;
		
		return dummyHead.next;
	}
	
}
