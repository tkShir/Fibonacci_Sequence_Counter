public class fibSeq{
	private LLList fibArr;
	private  
	
	public fibSeq(int start, int n){

	}

	public static int FindnTerm(int n){
		int prevTerm = 0;
		int curTerm = 1;
		int holdCur; 
		count = 1;
		while(count != n){
			holdCur = curTerm;
			curTerm = curTerm + prevTerm;
			prevTerm = holdCur;

			count ++;
		}

	}
}