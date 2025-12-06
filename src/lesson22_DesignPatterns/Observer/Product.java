package lesson22_DesignPatterns.Observer;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private double newPrice;
    private String name;
    private Customer customer;
    public List<ProductObserver> observerList;

    public Product(String name, double newPrice) {
        this.name = name;
        this.newPrice = newPrice;
        this.observerList = new ArrayList<>();
        System.out.printf("Yeni mehsul: %s  %f AZN bazaya elave edildi. ",name,newPrice);
        System.out.println("\n-----------------------------------");
    }

    public  void addObserver(Customer customer){
        observerList.add(customer);
        System.out.println(customer.getCustomerName()+" adli yeni istifadeci elave edildi. ");
        System.out.println("\n------------------------------------");
    }
    public void removeObserver(Customer customer){
        System.out.println(customer.getCustomerName()+ " istifadeci bazadan silindi. ");
        System.out.println("\n------------------------------------");
        observerList.remove(customer);
    }
    public void notifyObservers(){
        for (ProductObserver observer : observerList){
            observer.update(name,newPrice);
        }
    }

    public void setNewPrice(double newPrice) {
        this.newPrice = newPrice;
        System.out.printf(" mehsul: %s  %f AZN olaraq qiymeti deyishdi.Isdifadechilere melumat gonderildi. ",name,newPrice);
        System.out.println("\n--------------------------------------");
        notifyObservers();
    }
}
