import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ParenthesesR {
    public static String parenthesesSearch(String stringLine){
        String[] line = stringLine.substring(stringLine.indexOf("(")).split("");
        String helpString = "(";
        for (int i = 0; i < line.length; i++) {
            helpString += line[i];
            if(line[i].equals(")")){
                System.out.println(helpString);
                return helpString;
            }else if(line[i].equals("(")){
                String timeRes = parenthesesSearch(Arrays.stream(line).skip(i+1).collect(Collectors.joining()));
                helpString += timeRes;
                i += timeRes.length()-1;
            }
        }
        return "Can't find";
    }
    public static void main(String[] args) {
        parenthesesSearch(new Scanner(System.in).nextLine());
    }
}
