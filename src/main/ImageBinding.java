package main;

import javafx.beans.binding.ObjectBinding;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.image.Image;

public class ImageBinding extends ObjectBinding<Image> {
    StringProperty stringProperty = new SimpleStringProperty();

    @Override
    protected Image computeValue() {
        try{
            return new Image("img/" + stringProperty.getValue(), true);
        }catch (Exception ex){
            return null;
        }
    }

    public ImageBinding(StringProperty textProperty){
        super.bind(textProperty);
        this.stringProperty.bind(textProperty);
    }

}
