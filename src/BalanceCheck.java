import java.util.*;

public class BalanceCheck {
    public static boolean balanceCheck(String str){
        Deque<String> deque = new LinkedList<>();
        for(String x:str.split("")){
            if(x.equals("{") || x.equals("[") || x.equals("(")) {
                deque.addFirst(x);
            }else if(!deque.isEmpty()){
                if ((deque.peekFirst().equals("{") && x.equals("}") ) || (deque.peekFirst().equals("[") && x.equals("]")) || (deque.peekFirst().equals("(")  && x.equals(")"))) {
                    deque.removeFirst();
                }else{
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {



        System.out.println(balanceCheck(new Scanner(System.in).nextLine()));

    }
}
