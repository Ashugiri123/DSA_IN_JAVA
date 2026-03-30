package Stack;

import javax.net.ssl.SSLContext;
import java.util.Stack;

public class BasicSTLOfStack {

        public static void main(String[] args){

            Stack<String> st = new Stack<>();
            System.out.println(st.isEmpty());
            System.out.println(st.size()==0);
//        st.pop();st.peek(); shows EmptyStackException
            st.push("Khusi");
            st.push("preet");
            st.push("risshika");
            st.push("isha");
            System.out.println(st.size());
            System.out.println(st);
            st.pop();
            System.out.println(st+" "+st.size());
            System.out.println(st.peek());
            System.out.print(st.pop());
        }
    }


