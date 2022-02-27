import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MyStack {
        private Queue<Integer> q1;
        private Queue<Integer> q2;

        public MyStack(){
            q1 = new LinkedList<Integer>();
            q2 = new LinkedList<Integer>();
        }
        
          
        public void push(int x){
            this.q1.add(x);
            
        }
        
        public int pop(){
            if(this.q1.isEmpty() && this.q2.isEmpty()){
                return -1;
            }

            if(this.q1.isEmpty()){
                while(!this.q2.isEmpty()){
                    this.q1.add(this.q2.poll());
                }
            }
            
            while(!(this.q1.size()==1)){
                this.q2.add(q1.poll());
            }
            
            return this.q1.poll();	
        }	

        public static void main(String[] args){
            MyStack mySt = new MyStack();
            Stack<Integer> st = new Stack<Integer>();

            mySt.push(1);
            st.push(1);
            mySt.push(2);
            st.push(2);
            mySt.push(3);
            st.push(3);

            while(!st.isEmpty()){
                System.out.println("MyST: "+mySt.pop());
                System.out.println("ST:   "+st.pop());
            }
        }
    }	

