public class Main1 {
    public static void main(String[] arg){
        String str = "aaaabbbcdd"; 
        System.out.println(zipString(str));
    }
    
    static String zipString(String line){
        StringBuilder sb = new StringBuilder();
        char[] ch_line = line.toCharArray();
        int count = 1;
        for (int i = 0; i < ch_line.length-1; i++) {
            if (ch_line[i] == ch_line[i+1]){
                System.out.println(ch_line[i]);
                count++;
                }
            else{
                sb.append(ch_line[i]);
                if (count>1){
                    sb.append(count);
                }
                count = 1;
            }
        }
        sb.append(ch_line[ch_line.length-1]);
        if (count>1){
            sb.append(count);
        }
        return sb.toString();
    }
}