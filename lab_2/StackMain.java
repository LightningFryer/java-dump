package lab_2;

class Stack{
    int[] arr;
    int tos = -1;

    void init(int n){
        this.arr = new int[n];
    }

    void push(int ele){
        if (this.tos == this.arr.length){
            System.out.println("Stack overflow!");
        }
        else{
            this.tos++;
            this.arr[this.tos] = ele;
            System.out.println("Successfully pushed " + ele + " to stack");
        }

        return;
    }

    void pop(){
        if (this.tos == -1){
            System.out.println("Stack underflow!");
        }
        else{
            System.out.println("Successfully popped " + this.arr[this.tos] + " from stack");
            this.tos--;
        }

        return;
    }

    void display(){
        System.out.print("Stack: ");
        // System.out.println(this.tos);
        for (int i = 0; i <= this.tos; i++){
            System.out.print(this.arr[i] + " ");
        }
        return;
    }

}

public class StackMain {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.init(5);
        stack.push(3);
        stack.push(2);
        stack.push(2);
        stack.push(2);
        stack.pop();
        stack.display();
    }
}
