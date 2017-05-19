package LeetCode;

public class RansomNote_383 {
	public static void main(String[] args){
		String ransomNote = "aabbcc";
		String magazine = "aafetbsivbpmopmqwclac";
		System.out.println(canConstruct(ransomNote,magazine));
		
	}
	public static boolean canConstruct(String ransomNote, String magazine) {
        StringBuffer ma = new StringBuffer(magazine);
        char[] ran = ransomNote.toCharArray();
        int i;
        for(i = 0; i < ran.length; i++){
            if(ma.indexOf(String.valueOf(ran[i])) < 0 )
                break;
            else
                ma.deleteCharAt(ma.indexOf(String.valueOf(ran[i])));
        }
                
        
        if(i<ran.length)
            return false;
        else
            return true;
    }
}
