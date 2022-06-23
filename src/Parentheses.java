import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class Parentheses {


    public static void main(String[] args) {


        //String example = "1 + ( 1 - ( 1 + ( 1 + 1 ) ) + ( 1 - 1 ) - 1 ) - 1";
        //String example = "(1+3) - (2+3)";
        //String example = "1 + (2 - (2 + 3) * 4 / (3 + 1)) * 5";
        Scanner in = new Scanner(System.in);
        ArrayDeque<String> hooks = new ArrayDeque<>();
        String helpString = "";
        String[] mainString = in.nextLine().split("");
        int bracketCounterClose = 0;
        int bracketCounterOpen = 0;

        for (int i = 0; i < mainString.length; i++) {
            if(mainString[i].equals("(")){

                for (int j = i; j < mainString.length; j++) {

                    helpString += mainString[j];

                    if(mainString[j].equals("(")){

                        bracketCounterOpen++;

                    }else if(mainString[j].equals(")")){

                        bracketCounterClose++;

                        if(bracketCounterClose == bracketCounterOpen){
                            break;
                        }
                    }
                }
                hooks.push(helpString);
                helpString = "";
                bracketCounterOpen = 0;
                bracketCounterClose = 0;
            }
        }

        hooks.forEach(System.out::println);
    }
}

