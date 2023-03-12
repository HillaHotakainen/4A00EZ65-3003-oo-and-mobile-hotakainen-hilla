class E3 {
    public static void main(String [] args) {

        int result = 0;
        int [] arr = new int[10];
        for(int i = 0; i < arr.length; i++) {
            int random = 1 + (int)(Math.random() * ((50 - 1) + 1));
            arr[i] = random;
            result = result + arr[i];
        }System.out.println(result);
    }
}