/**
 * pangkat_04
 */
public class pangkat_04 {

    public int nilai, pangkat_04;

    public int pangkatBF (int a, int n) {
        int hasil = 1;
        for (int i = 0; i < n; i++) {
            hasil = hasil * a ;
        }
        return hasil;
    }

        public int pangkatDC(int a, int n) {
            if (n==0) {
                return 1;
            } else {
                if (n%2==1) //bilangan ganjil
                return (pangkatDC(a, n/2) * pangkatDC(a, n/2)*a);
                
                else //bilangan genap
                return (pangkatDC(a, n/2) * pangkatDC(a, n/2));
            }
        }
    public pangkat_04(){
        this.nilai = nilai;
        this.pangkat_04 = pangkat_04;
    }
    public pangkat_04 (int nilai2, int pangkat2) {
    }
}