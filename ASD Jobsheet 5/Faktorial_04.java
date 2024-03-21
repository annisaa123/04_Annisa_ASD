/**
 * Faktorial_04
 */
public class Faktorial_04 {

    public int nilai;
    public int faktorialBF (int n) {
        int fakto04 = 1;
        int i = 1;
        while (i <= n) {
            fakto04 = fakto04*1;
            i++ ;
        }
        return fakto04;
    }
    public int faktorialDC(int n) {
        if (n==1) {
            return 1;
        }
        else
        {
            int fakto04 = n * faktorialDC (n-1);
            return fakto04;
        }
            
        }
    }