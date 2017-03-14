package training;


public class Runner {
    public static void main(String[] args) {
        System.out.println("Application started...");
        System.out.println("Args length: "+ args.length);
        if (args.length > 0){
            System.out.println("Arg[0]: " + args[0]);
        }
    }
}
