package Rappel_heritag.models;

import java.time.LocalTime;

public class FormationCenter {

    // Const
    public final LocalTime MIN_OPEN_TIME = LocalTime.of(5,0);
    public final LocalTime MAX_CLOSE_TIM = LocalTime.of(21,0);

    // Champ (Fields)
    private String name;
    private String address; //TODO Remplace by class Adress
    private LocalTime openTime;
    private LocalTime closeTime;



    // Constructeur


    public FormationCenter(String name, String address, LocalTime openTime, LocalTime closeTime) {
        this.name = name;
        this.address = address;
        this.openTime = openTime;
        this.closeTime = closeTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) /* || name.trim().length() == 0 || name.trim().isEqual("")*/ {
            throw new RuntimeException("Le nom du centre de formateur ne peut pas etre vide !");
        }
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalTime getOpenTime() {
        return openTime;
    }

    public void setOpenTime(LocalTime openTime) {
        if (openTime != null && openTime.isBefore(MIN_OPEN_TIME) ){
            this.openTime = MIN_OPEN_TIME;
            return;
        }
        this.openTime = openTime;
    }

    public LocalTime getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(LocalTime closeTime) {
        this.closeTime = (closeTime != null && closeTime.isAfter(MAX_CLOSE_TIM)) ? MAX_CLOSE_TIM : closeTime;
    }
}