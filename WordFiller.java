import java.util.Collections;
import java.util.List;

public class WordFiller{
    public static List<String> words;
    public static String getAuthorName(){
        return "Khatter, Joy";
    }

    public static String getRyersonID(){
        return "500866988";
    }
    public static void processWordList(List<String> word){
        words = word;
        Collections.sort(words);
    }

    public static String fillPattern(String pattern){
        String temp="";
        int d = 0, size =pattern.length();
        char []ar;
        ar = pattern.toCharArray();
        for(int z=0; z<3; z++) {
            for (int i = 0; i < size-4; ++i) {
                temp = "";
                for (int j = i; j < i + 5; ++j) {
                    char c = ar[j];
                    temp += c;
                }
                if (findWord(temp)) {
                    d = 0;
                    for (int k = i; k < i + 5; k++) {
                        ar[k] = str.charAt(d);
                        d++;
                    }
                }
            }
        }
        ar = fillRemaining(ar);
        pattern = new String(ar);
        return pattern;
    }

    public static char[] fillRemaining(char[] ar){
        for(int i=0; i< ar.length; ++i){
            if(("" + ar[i]).equals("*")){
                ar[i] = 'a';
            }
        }
        return ar;
    }
    public static boolean findWord(String word){
        int counter = 0;
        boolean []boolArr = new boolean[5];
        for(int i=0; i<5; ++i){
            String a = "" + word.charAt(i);
            String s = "*";
            boolean b = (s.equals(a));
            if(!b){
                 boolArr[i] = true;
            }
        }
        boolean same = false;
        String temp = "";
        String x="", y="";
        for(int i=0; i<words.size(); ++i){
            temp = words.get(i);
            if(i == 2706)
                i++;
            if((boolArr[0])){
                x = ""+temp.charAt(0);
                y = ""+word.charAt(0);
                if((x).equals(y)){
                    same = true;
                }else{
                    same = false;
                    continue;
                }
            }else{

            }
            if((boolArr[1])){
                x = ""+temp.charAt(1);
                y = ""+word.charAt(1);
                if((x).equals(y)){
                    same = true;
                }else{
                    same = false;
                    continue;
                }
            }else{

            }
            if((boolArr[2])){
                x = ""+temp.charAt(2);
                y = ""+word.charAt(2);
                if((x).equals(y)){
                    same = true;
                }else{
                    same = false;
                    continue;
                }
            }else{

            }
            if((boolArr[3])){
                x = ""+temp.charAt(3);
                y = ""+word.charAt(3);
                if((x).equals(y)){
                    same = true;
                }else{
                    same = false;
                    continue;
                }
            }else{

            }
            if((boolArr[4])){
                x = ""+temp.charAt(4);
                y = ""+word.charAt(4);
                if((x).equals(y)){
                    same = true;
                    break;
                }else{
                    same =false;
                    continue;
                }
            }else{
                if(same == true){
                    break;
                }
            }
        }
        str= temp;
        return same;
    }

    public static String str;
}