public class Hello{
    public static void main(String[] args){
        System.out.println("Vs code is awasome");
        greeting("Kamruzzaman");
        System.out.println(sqr(5));
    }
    public static void greeting(String name){
        System.out.println("Welcome " + name);
    }
    public static int sqr(int x){
        return x*x;
    }
}