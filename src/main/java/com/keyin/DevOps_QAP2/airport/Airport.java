package com.keyin.DevOps_QAP2.airport;

import com.keyin.DevOps_QAP2.city.City;
import jakarta.persistence.*;
@Entity
public class Airport {
    @Id
    @SequenceGenerator(name = "airport_sequence", sequenceName = "airport_sequence", allocationSize = 1, initialValue = 1)
    @GeneratedValue(generator = "airport_sequence")
    private Long id;

    private String name;
    private String code;

    @OneToOne
    private City city;
    public long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code = code;
    }
    public City getCity(){
        return this.city;
    }
    public void setCity(City city){
        this.city = city;
    }
}
