import java.util.Stack;

public class StC {
    static class Queue{
        static Stack<Integer> s1= new Stack<Integer>();
        static Stack<Integer> s2= new Stack<Integer>();

        static void retrive (){
            while(!s1.empty()){
                s2.push(s1.pop());

            }
            System.out.println(s2.pop());
        }

    }

}
