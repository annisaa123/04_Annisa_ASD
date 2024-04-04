/**
 * Sum_04
 */
public class Sum_04 {

    public int elemen;
    public double keuntungan [];

    public Sum_04 (int elemen) {
        this.elemen = elemen;
        this.keuntungan = new double[elemen];
    }

    public double totalBF(double[] arr) {
        double total = 0;
        for (int i = 0; i < elemen; i++){
            total += arr[i];
        }
        return total;
    }

        public double totalDC(double[] arr, int start, int end) {
            if (start == end) {
                return arr[start];
            } else {
                int mid = (start + end) / 2;
                double leftTotal = totalDC(arr, start, mid);
                double rightTotal = totalDC(arr, mid + 1, end);
                return leftTotal + rightTotal;
            }
        }
    }