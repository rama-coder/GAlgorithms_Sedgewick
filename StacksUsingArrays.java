/**
 * Created by GAYATHRI GUTTA on 3/20/2014.
 */
public class StacksUsingArrays {
    String[] dataArray;
    int pointer = 0;
    StacksUsingArrays() {
        dataArray = new String[30];
    }
    public void push(String data) {
        if (pointer == dataArray.length) {
            System.out.println("Stack is full");
            return;
        }
        dataArray[pointer++] = data;
    }
    public String pop() {
        if (pointer < 0) {
           System.out.println("Stack is empty");
            return "-1";
        }
        String data = dataArray[--pointer];
        return data;
    }
    public static void main(String[] args) {
        StacksUsingArrays stack = new StacksUsingArrays();
        stack.push("Hello ");
        System.out.print(stack.pop());
        stack.push("you!\n");
        stack.push("are ");
        stack.push("Gayathri\n");
        System.out.print(stack.pop());
        stack.push("How ");
        System.out.print(stack.pop());
        System.out.print(stack.pop());
        System.out.print(stack.pop());
//        System.out.print(stack.pop());
    }
}
