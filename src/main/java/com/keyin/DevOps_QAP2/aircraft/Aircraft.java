package com.keyin.DevOps_QAP2.aircraft;
import java.util.List;

import jakarta.persistence.*;
import com.keyin.DevOps_QAP2.airport.Airport;

@Entity
public class Aircraft {
    @Id
    @SequenceGenerator(name = "aircraft_sequence", sequenceName = "aircraft_sequence", allocationSize = 1, initialValue = 1)
    @GeneratedValue(generator = "aircraft_sequence")
    private Long id;
    private String callsign;
    private String model;
    private String serialNumber;
    private String brand;

    @ManyToMany
    private List<Airport> airports;
    public long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getCallsign(){
        return this.callsign;
    }
    public void setCallsign(String callsign){
        this.callsign = callsign;
    }
    public String getModel(){
        return this.model;
    }
    public void setModel(String model){
        this.model = model;
    }
    public String getSerialNumber(){
        return this.serialNumber;
    }
    public void setSerialNumber(String serialNumber){
        this.serialNumber = serialNumber;
    }
    public String getBrand(){
        return this.brand;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
}
