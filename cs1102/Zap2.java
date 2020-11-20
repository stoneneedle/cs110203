class Zap2 {
    static boolean zap() { return true; }
    static int zap(boolean x) { return 0; }
    static double zap(int x) { return 0.5; }
    static String zap(double x) { return "Zap!"; }
    static boolean zap(String x) { return false; }
    public static void main(String[] args) {
        System.out.println(zap(zap(zap(zap(1)))));
    }
}