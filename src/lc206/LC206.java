package lc206;
import java.util.Stack;

class ListNode {
	int val;
	ListNode next;
	ListNode() {}
	ListNode(int val) { this.val = val; }
	ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }


public class LC206 {
	
	public static void main(String[] args) {
		
		ListNode l = new ListNode(1);
		l.next = new ListNode(2);
		l.next.next = new ListNode(3);
		l.next.next.next = new ListNode(4);
		l.next.next.next.next = new ListNode(5);
		ListNode output = reverseList2(l);
		ListNode cur = output;
// 当死循环时，加个计数器，分析如何循环的。
//		int x = 0;
//		while (cur != null && x < 12) {
//			System.out.println(cur.val);
//			cur = cur.next;
//			x ++;
//		}

		int x = 0;
		while (cur != null && x < 12) {
			System.out.println(cur.val);
			cur = cur.next;
			x ++;
		}

		
		
	}
	
	public static ListNode reverseList2(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode prev = head;
		ListNode cur = head.next;
		head = cur.next;

		prev.next = null;
		while (head != null) {
			cur.next = prev;
			prev = cur;
			cur = head;
			head = head.next;
		}
		cur.next = prev;
		return cur;
	}

	public static ListNode reverseList(ListNode head) {
		if (head == null) return null;
		
		Stack<ListNode> stack = new Stack<ListNode>();
		
		ListNode cur = head;
		
		while (cur != null) {
			stack.push(cur);
			cur = cur.next;
		}
		
		ListNode newHead = stack.pop();
		ListNode cur1 = newHead;
		while (! stack.empty()) {
			cur1.next = stack.pop();
			cur1 = cur1.next;
			
		}
		
		cur1.next = null;
		
		return newHead;
	}
	
}
