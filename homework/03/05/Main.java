import java.util.Arrays;

class Team {

    Person [] members = new Person [20];

    private String name;

    public Team(String name) {
        setName(name);
    }

    public void setName(String name){
        if(name.length() < 3) {
            throw new IllegalArgumentException("Team name must be 3 or more letters");
        }
        this.name = name;
    }

    public Person get(int index){
        return members[index];
    }

    public void add(Person person) {
        for(int i = 0; i <= members.length-1; i++) {
            if (members[i] != null) {
            } 
            else if (members[i] == null) {
                members[i] = person;
                i = members.length;
            } else {
                members = Arrays.copyOf(members, 10);
            }
        }
    }

    public String toString() {
        String result = "Team name is " + name + ", player names are: ";
        for( int i = 0; i < members.length-1; i++) {
            if(members[i] != null){
                result = result + members[i] + "";
            }
            
        }
        return result;
    }
}

class Person {
    private String name;

    public Person(String name){
        setName(name);
    }

    public void setName(String name){
        if(name.length() < 2) {
            throw new IllegalArgumentException("Person name must be 2 or more letters");
        }
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return "" + this.name;
    }
}



class Main {
    public static void main(String [] args){
        var tappara = new Team("tappara");
        var timo = new Person("timo jutila");
        tappara.add(timo);
        System.out.println(tappara); // outputs team name and each player's name
        var temp = tappara.get(0);   // gets the first player in the team
    } 
}