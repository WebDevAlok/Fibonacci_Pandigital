public class Main {
    public static void main(String[] args) {
        long f1 = 1;
        long f2 = 1;
        long fibShell = FibonacciShell.nextFibSell(f1, f2);
        long dCount = 3;
        FibonacciKernel f3 = new FibonacciKernel(1,1,false);
        while (!(PanDigital.isPanDigital((long) Math.floor(f3.d2)) && PanDigital.isPanDigital(fibShell))) {
            fibShell = FibonacciShell.nextFibSell(f1, f2);
            if (PanDigital.isPanDigital(fibShell)) {
                System.out.println("The value of fibonacci shell f" + dCount + " is " + fibShell);
            }
            f1 = f2;
            f2 = fibShell;
            f3 = FibonacciKernel.nextFibKern(f3);
            if(PanDigital.isPanDigital((long) Math.floor(f3.d2))) {
               System.out.println("The current fibonacci kernel object f" + dCount + " is [" + (long) Math.floor(f3.d1) + "," + (long) Math.floor(f3.d2) + "," + f3.isTruncated + "]");
            }
            dCount++;
        }
    }
}