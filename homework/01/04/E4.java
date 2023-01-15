
class E4 {

public static String repeat1(char character, int amount) {
    String answer = "";
    for(int i=0; i < amount; i++) {
        answer = answer + character;
    }
    return answer;
}

public static void repeat2(char character, int amount) {
    for(int i=0; i < amount; i++) {
        System.out.print(character);
    }
}

public static void main(String [] args) {
    System.out.println(repeat1('a', 5));
    repeat2('a', 5);
}
}