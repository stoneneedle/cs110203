class Compute {
    static int compute() { return 42; }
    static int compute(int i) { return i+1; }
    public static void main(String[] args) {
        System.out.println(compute(compute()));
    }
}