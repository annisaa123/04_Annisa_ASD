/**
 * NilaiAkar_04
 */
public class NilaiAkar_04 {
        public int nilai;
    
        public int akarPangkatDuaBF(int bilangan) {
            int akar = 0;
            while (akar * akar <= bilangan) {
                akar++;
            }
            return akar - 1;
        }
    
        public int akarPangkatDuaDC(int bilangan, int min, int max) {
            if (max < min) {
                return min - 1;
            }
            int mid = (min + max) / 2;
            if (mid * mid == bilangan) {
                return mid;
            } else if (mid * mid < bilangan) {
                return akarPangkatDuaDC(bilangan, mid + 1, max);
            } else {
                return akarPangkatDuaDC(bilangan, min, mid - 1);
            }
    }
    }