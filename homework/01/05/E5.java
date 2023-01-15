class E5 {

public static char[][] getRandomTable(int height, int width) {
    char[][] arr = new char[height][width];
    char x = 'x';
    char line = '-';
    for(int i = 0; i<arr.length; i++){
        for(int j = 0; j<arr[i].length; j++){
            int random = 1 + (int)(Math.random() * ((2 - 1) + 1));
            if(random == 1){
                arr[i][j] = x;
            } else {
                arr[i][j] = line;
            }
        }
    }
    return arr;
}

public static void output(char[][] table) {
    for(int i = 0; i<table.length; i++){
        for(int j = 0; j<table[i].length; j++){
            System.out.print(table[i][j]);
        }
        System.out.println();
    }
}

    public static void main(String [] args) {
        char [][] arry = getRandomTable(6,5);
        output(arry);
    }
}