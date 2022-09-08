package apps.hw7;

public class DetermineNums {

    public static void main(String[] args) {

//        // стрінга з текстом
//        String str = "Test123 all in 45";
//
//
//        int count = 0;
//        System.out.println("String: "+str);
//        for (int i = 0; i < str.length(); i++) {
//            if (Character.isLetter(str.charAt(i)))
//
//                count++;
//        }
//        System.out.println("Letters: "+count);
//    }


        String test = "123 321 Lorem6 ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim 543ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure d5olor in reprehenderit 33in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum. 097 778 55 44";
        count(test);

    }
    public static void count(String x){
        char[] ch = x.toCharArray();
        int letter = 0;
        int space = 0;
        int num = 0;
        int other = 0;
        for(int i = 0; i < x.length(); i++){
            if(Character.isLetter(ch[i])){
                letter ++ ;
            }
            else if(Character.isDigit(ch[i])){
                num ++ ;
            }
            else if(Character.isSpaceChar(ch[i])){
                space ++ ;
            }
            else{
                other ++;
            }
        }
        System.out.println("Введена стрінга містить");
        System.out.println("букв: " + letter);
        System.out.println("пробілів: " + space);
        System.out.println("цифер: " + num);
        System.out.println("символів: " + other);
    }

}
