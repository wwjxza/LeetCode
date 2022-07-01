package lc771;

public class LC771 {

	public static void main(String[] args) {
		
		System.out.println('A' - 0);
		System.out.print((int)'A');
		// 字符的四则运算是对其ASC码进行的
		// 也可以对字符进行强制类型转换，变成数字
		
		
	}
	
	public static int numJewelsInStones(String jewels, String stones) {
		
		int count = 0;
		for (int i = 0; i < stones.length(); i ++) {
			count += jewels.contains(stones.substring(i, i + 1)) ? 1 : 0;
			// substring(beginIdx, endIdx), 左闭右开
			//  所以，这里返回的是idx = i 的字符，以string 的形式
			// 因为contains的param 是 string
			// charAt(i) return is: char, 不能作为contains() 的 param
//			
//			Method Two
//			for (int j = 0; j < jewels.length(); j ++) {
//				if (stones.charAt(i) == jewels.charAt(j)) {
//					count ++;
//				}
//
//			}
			
			//- Method 3: from LC discussions
			// 思路：用 array 实现 dictionary 的功能
			// 先把 stones 里各个字母出现的个数算出来
			// 再把 jewels 里出现的字母在stones里出现的个数加起来
//		    int[] stone = new int[58];  
//		    for(int i =0;i<stones.length();i++){
//		         int index= stones.charAt(i)-'A';
//		         stone[index]++;
//
//		    }
//		    int count =0;
//		    for(int i =0 ;i<jewels.length();i++){
//		        int c = jewels.charAt(i)-'A';
//		        count = count+stone[c];
//		   
//		}
//		     return count;

		}
		
		return count;
	}
	
}
