import java.util.*;

public class ArrayGame {
    public static boolean canWin(int leap, int[] game) {
        
        int len = game.length;
        int c = 0;
        
        for(int i=0;i<len;i++)
        {
            if(i<=(len-2))
            {
                if(game[i+1]==0 )
                {
                     c++;  
                }
            }
            
            else if(i==len-1 && game[i]==0)
            {
                c = c+leap;
            }
            else if((i+leap)<len && game[i+leap]==0)
            {
                c = c+leap;
            }
            else if((i+leap)>len)
            {
                c = c+leap;
            }
        }
        if(c>=len)
        {
            return true;
        }
        else
        {
          return false;  
        }
        
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i=0;i<t;i++){
            int n = scan.nextInt();
            int m = scan.nextInt();
            int[] a = new int[n];
            boolean[] win = new boolean[n];
            for (int j=0;j<n;j++)
                a[j] = scan.nextInt();
            
            for (int j=n-1;j>=0;j--){
                if (a[j]==0&&(j+Math.max(1,m)>=n || win[j+1] || win[j+m])){
                    win[j] = true;
                    int k = j+1;
                    while (k<n-1&&a[k]==0&&!win[k]){
                        win[k] = true;
                        k++;
                    }
                }
            }
            
            System.out.println(win[0]?"YES":"NO");
        }
        scan.close();
    }
}
