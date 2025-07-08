package Task4Jul4.Task5;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;

public class IntegerStack {
    static Stack<Integer> stack = new Stack<>();
    public static void main(String[] args){
            add(3);
            add(5);
            stack.add(2);
            stack.add(1);
            stack.add(3);

            System.out.println();
            System.out.println("Before removing ");
            display();

            remove();
        System.out.println();
        System.out.println("After removing ");
            display();

    }
    public static void add(int num){
        stack.push(num);
    }
    public static void remove(){
        stack.pop();
    }
    public static void display(){
        System.out.println(stack);
        for(Integer i : stack){
            System.out.println(i);
        }
    }

}
