package lesson9.Classwork;

public class Age {
    int age;

    public Age(int age) {
        this.age = age;
    }
    public String checkAge() throws Exception{
        if (age<18){
            throw new Exception("Yaş 18-dən aşağı ola bilməz.");
        }else {
            return "Qeydiyyat uğurla tamamlandı.";
        }
    }
}
