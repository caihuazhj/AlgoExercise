package sword;

public class ReplaceSpace {
    public static String replaceSpace(StringBuffer str) {
        StringBuilder sb = new StringBuilder();

        for (int i=0;i<str.length();i++){
            if (str.charAt(i)!=' '){
                sb.append(str.charAt(i));
            }else {
                sb.append("%20");
            }
        }
        System.out.println(sb.toString());
        return sb.toString();

    }

    public static void main(String[] args) {
        StringBuffer ss = new StringBuffer("We Are Happy") ;
        replaceSpace(ss);
    }
}
