class Sum2 {
    static int sum = 0;
    static void add(int i) { sum += i; }
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) add(i);
        System.out.println(sum);
    }
}