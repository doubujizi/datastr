import java.util.List;
import java.util.Map;

/**
 * @author tianfuxian
 * @Description:
 * @Date: 2018-10-18 16:06
 */
public class MapDemo {
    public static void main(String[] args) {

    }
    public static void  printHighChangeables(Map<String, List<String>> addjWord,int minWords){
        for (Map.Entry<String,List<String>> entry : addjWord.entrySet()){
            List<String> words =entry.getValue();
            if( words.size()>= minWords){
                System.out.println(entry.getKey()+"(");
                System.out.println(words.size() + "):");
                for (String w:words){
                    System.out.println(""+w);
                    System.out.println();
                }
            }
        }
    }
}
