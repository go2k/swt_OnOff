package model;

import java.util.Observable;

public class OnOffModel extends Observable implements Model {

    private boolean istAn;

    private String istAnAus;


    @Override
    public String getAnAusText() {
        String text = "";
        if (istAn) {
            text =  "Lampe an";
        } else {
            text= "Lampe aus";
        }
        return text;
    }

    @Override
    public boolean isAn() {
        return istAn;
    }

    @Override
    public boolean isAus() {
        return !istAn;
    }

    @Override
    public void setAn() {
        istAn = true;
        this.setChanged();
        notifyObservers();
    }

    @Override
    public void setAus() {
        istAn = false;
        this.setChanged();
        notifyObservers();
    }

    @Override
    public void toggle() {

        istAn = !istAn;
        this.setChanged();
        notifyObservers();
    }
}
