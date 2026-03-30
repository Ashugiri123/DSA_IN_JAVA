package Stack;
import java.util.*;
public class TheCelebrityProblem {

        public static int celebrity(int arr[][]){
            int n=arr.length;
            boolean aflag=true;
            boolean bflag = true;
            Stack<Integer> st = new Stack<>();
            for(int i=0;i<n;i++){
                st.push(i);
            }while(st.size()>1){
                int a=st.pop();
                int b=st.pop();
                if(arr[a][b]==1){
                    aflag=false;
                }else{
                    bflag=false;
                }if(arr[b][a]==1){
                    bflag=false;
                }if(aflag)st.push(a);
                if(bflag)st.push(b);
            }if(st.size()==0)return -1;
            int celb=st.pop();
            for(int j=0;j<n;j++){
                if(j==celb)continue;
                if(arr[j][celb]==0)return -1;
            }return celb;
        }
        public static void main(String[] args){
            System.out.print("enter length numberr of people:");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[][] arr = new int[n][n];
            for(int i=0;i<n;i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = sc.nextInt();
                }
            } System.out.print(celebrity(arr));
        }
    }
