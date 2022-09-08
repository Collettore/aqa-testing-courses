package apps.hw7;

import java.util.regex.Pattern;

public class StringReverce {

//    public static void main(String[] args) {
//        String s = "String ecrever";
//        String[] wordsArr = s.split(" ");
//        StringBuilder sb = new StringBuilder();
//        for(int i = 0 ; i< wordsArr.length; i++){
//            if(i%2 == 0)
//                sb.append(wordsArr[i]);
//            else sb.append(new StringBuilder(wordsArr[i]).reverse());
//            sb.append(" ");
//        }
//        System.out.println(sb.toString().trim());

    static String reverseWords(String str) {
        Pattern pattern = Pattern.compile("\\s");
        String[] temp = pattern.split(str);
        String result = "";
        for (int i = 0; i < temp.length; i++) {
            if (i == temp.length - 1)
                result = temp[i] + result;
            else
                result = " " + temp[i] + result;
        }
        return result;
    }
    public static void main(String[] args) {
        String s1 = "There is first sentence";
        System.out.println(reverseWords(s1));
        String s2 = "In to second i....";
        System.out.println(reverseWords(s2));
    }
}
