1class Solution {
2    public String convert(String s, int numRows){
3        if(numRows==1||s.length()==0)return s;
4        int len=s.length();
5        int cycleLen = 2 * numRows - 2;//(numrows + numrows -2) element added to each row then numrows-2 coloumns (length of each cycle)
6        int colsPerCycle = numRows - 1; //for 3 rows, 2 coloumns are occupied  
7        int cycles = (len + cycleLen - 1) / cycleLen;
8        
9        int cols = cycles * colsPerCycle + 1; //rowwise addition then move diagonally up
10        char zigzag[][]=new char[numRows][cols];
11        int n=0,k=0;//k represents coloumns
12        while(n<s.length()){
13            int rows=numRows-2;//second to last row
14            for(int i=0;i<numRows&&n<s.length();i++){
15                zigzag[i][k]=s.charAt(n++);
16            }
17            if(n>=s.length())break;
18            while(rows>=1&&n<s.length()){
19                k++;
20                zigzag[rows][k]=s.charAt(n++);
21                rows--;
22            }
23            k++;
24        } 
25        String op="";
26        for(int i=0;i<numRows;i++){
27            for(int j=0;j<cols;j++){
28                if(Character.isLetter(zigzag[i][j])||(!Character.isLetterOrDigit(zigzag[i][j])&&zigzag[i][j]!='\0'))
29                    op+=zigzag[i][j];
30            }
31        }
32        return op;
33    }
34}