package lesson11.Classwork;



public class StorageMain {
    public static class Storage<T>{
        private T value;

        public void store(T value) {
            this.value = value;
        }

        public T retrieve(){
            return value;
        }
    }
    public static void main(String[] args) {
        Storage<Phone> phoneStorage = new Storage<>();
        Phone myphone = new Phone("Iphone 15");
        phoneStorage.store(myphone);
        System.out.println(phoneStorage.retrieve());
        Storage<Food> foodStorage = new Storage<>();
        Food myfood = new Food("Burger");
        foodStorage.store(myfood);
        System.out.println(foodStorage.retrieve());
    }
}
