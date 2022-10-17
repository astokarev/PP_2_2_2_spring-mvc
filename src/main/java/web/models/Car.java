package web.models;

import javax.persistence.*;

//Большоое спасибо за подробный комментарий, надеюсь я правильно разорбрался
@Entity
@Table(name = "cars")
public class Car {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "vendor")
    private String vendor;

    @Column(name = "model")
    private String model;
    @Column(name = "date")
    private int date;


    public static String header = "Vendor/" + ' ' + "Model/" + ' ' + "Date of production";

    public Car(String vendor, String model, int date) {
        this.vendor = vendor;
        this.model = model;
        this.date = date;
    }

    public Car() {
    }

    ;

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Car{" +
                "vendor='" + vendor + '\'' +
                ", model='" + model + '\'' +
                ", date=" + date +
                '}';
    }

    public String toStringFormatted() {
        return vendor + "/ " + model + "/ " + +date;
    }

    public String header() {
        return header;
    }
}

