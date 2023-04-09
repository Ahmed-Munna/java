package basicJava;

public class Condition {
    
    public static void main(String[] args){

        int a = 4;
        switch(a)  {
            case 1:
                System.out.println(a);
            break;
            case 2:
                System.out.println(a);
            break;
            case 3:
                System.out.println(a);
            break;
            case 4:
                System.out.println(a);
            break;
            default:
              System.out.println("Nothing");
            break;
        }

        String[] name = {
            "Munna",
            "beshu",
            "Debu",
            "Shiblu",
            "Uttam"
        };

        for (String single : name) {
            System.out.println(single);
        }

    }

}
