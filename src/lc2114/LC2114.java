package lc2114;

public class LC2114 {
	
	public static void main(String[] args) {
		
	}
	
	public int mostWordsFound(String[] sentences) {
		// 思路，先把字符串split，再看split成几个
		int count = 0;
		for (String se: sentences) {
			int split = se.split(" ").length;
			// 当一个函数结果需要被使用一次以上时，先存下来，而不是再次运行
			// 这样会加速
			count = (count > split) ? count : split;
		}
		return count;
		
	}
	
	
	// method two from Baoxia
//    int re = 0;
//    for (int i = 0; i < sentences.length; i++) {
//        re = Math.max(re, sentences[i].split(" ").length);
//    }
//    return re;


}
