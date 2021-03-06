package besthouserental.models;

import javax.persistence.*;
import java.util.List;

@Entity(name = "houses")
public class House {
    @Id @GeneratedValue
    private int propertyId;
    @ElementCollection()
    List<RoomImage> pictures;
    private String location;
    private int numberOfRooms;
    private String amenities;
    private int rentAmount;
    private int totalArea;

    public House(List<RoomImage> pictures, String location, int numberOfRooms, String amenities, int rentAmount, int totalArea) {
        this.pictures = pictures;
        this.location = location;
        this.numberOfRooms = numberOfRooms;
        this.amenities = amenities;
        this.rentAmount = rentAmount;
        this.totalArea = totalArea;
    }

  
    public int getTotalArea() {
        return totalArea;
    }

    public void setTotalArea(int totalArea) {
        this.totalArea = totalArea;
    }


    public int getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(int propertyId) {
        this.propertyId = propertyId;
    }

    public List<RoomImage> getPictures() {
        return pictures;
    }

    public void setPictures(List<RoomImage> pictures) {
        this.pictures = pictures;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public String getAmenities() {
        return amenities;
    }

    public void setAmenities(String amenities) {
        this.amenities = amenities;
    }

    public int getRentAmount() {
        return rentAmount;
    }

    public void setRentAmount(int rentAmount) {
        this.rentAmount = rentAmount;
    }
}
