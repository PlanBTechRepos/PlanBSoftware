
package com.pdvtech.view.component;

import com.pdvtech.view.component.util.TextFieldSuggestionUI;

import javax.swing.JTextField;

public class customTextField extends JTextField {

    private TextFieldSuggestionUI textUI;

    public customTextField() {
        textUI = new TextFieldSuggestionUI(this);
        setUI(textUI);
    }

    public void addItemSuggestion(String text) {
        textUI.getItems().add(text);
    }

    public void removeItemSuggestion(String text) {
        textUI.getItems().remove(text);
    }

    public void clearItemSuggestion() {
        textUI.getItems().clear();
    }

    public void setRound(int round) {
        textUI.setRound(round);
    }

    public int getRound() {
        return textUI.getRound();
    }
}