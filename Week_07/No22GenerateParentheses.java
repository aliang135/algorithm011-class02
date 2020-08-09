import java.util.ArrayList;
import java.util.List;

class Solution {

    public List<String> generateParenthesis(int n) {
        String s = "";
        List<String> result = new ArrayList<>();
        generateParenthesis(0,0,n,s,result);

        return result;
    }
    void generateParenthesis(int left, int right, int n, String s, List<String> result){
        if(left==n&&right==n){
            result.add(s);
            return;
        }
        if(left<n){
            generateParenthesis(left+1,right,n,s+"(",result);
        }
        if(right<left){
            generateParenthesis(left,right+1,n,s+")",result);
        }
    }

    /**
     List <String> result = new ArrayList<>();
     public List<String> generateParenthesis(int n) {
     String s = "";
     generateParenthesis(0,0,n,s);

     return result;
     }
     void generateParenthesis(int left, int right, int n, String s){
     if(left==n&&right==n){
     result.add(s);
     return;
     }
     if(left<n)  generateParenthesis(left+1,right,n,s+"(");
     if(right<left)  generateParenthesis(left,right+1,n,s+")");

     }*/

    /**
     List <String> result = new ArrayList<>();

     public List<String> generateParenthesis(int n) {
     String s = "";
     generateParenthesis(0,0,n,s);

     return result;
     }

     public void generateParenthesis(int left, int right, int n, String s){
     if(left ==n && right == n){
     result.add(s);
     return;
     }

     if(left<n){
     generateParenthesis(left+1,right,n,s+"(");
     }
     if(right<left){
     generateParenthesis(left,right+1,n,s+")");
     }
     }
     */
    /**
     List <String> list = new ArrayList<>();

     public List<String> generateParenthesis(int n) {
     generateParenthesis(0,0, n, "");
     return list;
     }

     public void generateParenthesis(int left,int right, int n, String s) {
     if(left==n&&right==n){
     list.add(s);
     return;
     }

     if(left<n){
     generateParenthesis(left+1,right, n, s+"(");
     }
     if(right<left){
     generateParenthesis(left,right+1,n,s+")");
     }
     }
     */
}