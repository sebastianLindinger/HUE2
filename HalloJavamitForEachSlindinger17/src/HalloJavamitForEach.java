import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author slindinger17
 */
public class HalloJavamitForEach {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<String> list = new LinkedList<String>();

        list.add("hallo");
        list.add("grias di");
        list.add("geht denn");

        for(String str : list) {
            System.out.println(str);
        }

        System.out.println("-----------------------");

        list.forEach(System.out::println);
    }

}
