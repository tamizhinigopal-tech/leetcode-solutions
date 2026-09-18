class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x=0;
        for(String op:operations){
            if(op.contains("+")){
          //if(op.charAt(1)=='+')
          //if(op.equals("++x") || op.equals(x++))
                x++;
            }
            else{
                x--;
            }
        }
        return x;
    }
}