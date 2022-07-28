package TelePhone;

import java.time.LocalDateTime;

public class TelePhone {
    String name ;
    String brand ;
    LocalDateTime localDateTime = LocalDateTime.now();
public TelePhone(){

}
    public TelePhone(String name, String brand, LocalDateTime localDateTime) {
        this.name = name;
        this.brand = brand;
        this.localDateTime = localDateTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }
}
