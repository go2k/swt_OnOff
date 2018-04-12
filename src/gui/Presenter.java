package gui;


import model.Model;
import model.OnOffModel;

import javax.xml.bind.Unmarshaller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

public class Presenter implements Observer {

    private View view;
    private OnOffModel onOffModel;


    public Presenter() {
        view = new OnOffView();
        view.setButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onOffModel.toggle();
            }
        });
        onOffModel = new OnOffModel();
        onOffModel.addObserver(this);
        onOffModel.toggle(); }

    @Override
    public void update(Observable o, Object arg) {

        boolean istAn = onOffModel.isAn();
        String text = onOffModel.getAnAusText();

        view.setAusgabeText(text);

        if (istAn) {
            view.setButtonText("Aus");
        } else {
            view.setButtonText("An");
        }
    }
}
