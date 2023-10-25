import java.awt.*;

public class FibonacciKernel {
    double d1 = 1;
    double d2 = 1;
    boolean isTruncated = false;

    public FibonacciKernel(double d1, double d2, boolean isTruncated) {
        this.d1 = d1;
        this.d2 = d2;
        this.isTruncated = isTruncated;
    }
    public static FibonacciKernel nextFibKern(FibonacciKernel fibKern) {
        FibonacciKernel fibKernOut = new FibonacciKernel(1.0, 1.0, false);
        if(fibKern.isTruncated) {
            double nextFibKern = (fibKern.d1 / 10) + fibKern.d2;
            if(nextFibKern > 999999999.0) {
                fibKernOut.isTruncated = true;
                fibKernOut.d1 = fibKern.d2;
                fibKernOut.d2 = nextFibKern/10;
            } else {
                fibKernOut.isTruncated = false;
                fibKernOut.d1 = fibKern.d2;
                fibKernOut.d2 = nextFibKern;
            }
            return fibKernOut;
        } else {
            double nextFibKern = fibKern.d1 + fibKern.d2;
            if (nextFibKern > 999999999.0) {
                fibKernOut.isTruncated = true;
                fibKernOut.d1 = fibKern.d2;
                fibKernOut.d2 = nextFibKern / 10;
            } else {
                fibKernOut.isTruncated = false;
                fibKernOut.d1 = fibKern.d2;
                fibKernOut.d2 = nextFibKern;
            }
            return fibKernOut;
        }
    }
}