class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1 || numRows>=s.length()) return s;
        StringBuilder [] rows=new StringBuilder[numRows];
        int curr_row=0;
        for(int i=0;i<numRows;i++)
        rows[i]=new StringBuilder();
        boolean down=false;
        for(char a:s.toCharArray()){
            rows[curr_row].append(a);
            if(curr_row==0 || curr_row==numRows-1)
            down=!down;
            curr_row+=down?1:-1;
        }
        StringBuilder res=new StringBuilder();
        for (StringBuilder r : rows) {
            res.append(r);
        }

        return res.toString();
    }
}