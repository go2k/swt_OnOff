package gui;


import java.awt.event.ActionListener;

public interface View {
    public void setButtonListener(ActionListener listener);
    public void setButtonText(String text);
    public void setAusgabeText(String text);
}




