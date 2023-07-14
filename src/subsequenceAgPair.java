import java.util.Scanner;

public class subsequenceAgPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        System.out.println(findSubsequencePair(word));
    }
    public static int findSubsequencePair(String s)
    {
        int A=0,result =0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='A')
            {
                A++;
            }
            if(s.charAt(i) == 'G')
            {
                result+=A;
            }
        }
        return result;
    }
}
