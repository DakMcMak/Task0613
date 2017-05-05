public class Main {
    public static void main(String[] args) {
        int i = 0;
        while(10 > i){
            Cat catCount = new Cat();
            catCount = null;
            i++;
        }
        System.out.println(Cat.catCount);
    }

    public static class Cat {
        public static int catCount = 0;

        public Cat(){
            Cat.catCount++;
        }
    }
}
