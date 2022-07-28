public class Demo {
    public static void main(String[] args) {
        Gen<String> gen1=new Gen<>();
        gen1.add("Hello");
        System.out.println(gen1.get());

        Gen<Integer> gen2=new Gen<>();
        gen2.add(6);
        System.out.println(gen2.get());
    }
}
