public class Stack extends List{

    public  Stack(){
        super();
    }
    public void push (int n) {
        addFirst(n);
    }
    public int pop() {
        return remove().getValue;
    }
    public int peek() {
        return getHead.getValue();
    }
}
