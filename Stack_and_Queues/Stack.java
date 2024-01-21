 

 class dynamicstack extends intro{
    public dynamicstack(){
        super();
    }
    public dynamicstack(int no){
        super(no);
    }
    @Override
    public void push(int no) {
        if(stack.length==top){
            int arr[]=new int[2*stack.length];
            for(int i=0;i<stack.length;i++){
                arr[i]=stack[i];
            }
            stack=arr;
        }
        super.push(no);
        // stack[top]=no;
        // top++;
    }

}

public class Stack{
    public static void main(String[] args) {
        dynamicstack st = new dynamicstack(2);
        st.push(5);
        st.push(6);
        st.push(7);
        System.out.println("_______");
        st.display();
        st.pop();
        System.out.println("______");
        st.display();
    }
}
