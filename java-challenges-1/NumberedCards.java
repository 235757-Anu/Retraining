import java.util.Arrays;

public class NumberedCards {
    public static void main(String[] args){
        winRound(new int[]{2, 5, 2, 6, 9}, new int[]{3, 7, 3, 1, 2});
        winRound(new int[]{4, 3, 4, 4, 5}, new int[]{3, 2, 5, 4, 1});
        winRound(new int[]{2, 5, 2, 6, 9}, new int[]{3, 7, 3, 1, 2});
        winRound(new int[]{1, 2, 3, 4, 5}, new int[]{9, 8, 7, 6, 5});
    }
    private static void winRound(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);
        int l1=a[a.length-1]*10 + a[a.length-2];
        int l2=b[b.length-1]*10 + b[b.length-2];
        if(l1>l2){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
