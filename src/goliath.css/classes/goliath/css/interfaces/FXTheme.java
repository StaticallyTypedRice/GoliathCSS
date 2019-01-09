package goliath.css.interfaces;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ObjectProperty;
import javafx.scene.text.Font;

public interface FXTheme
{
    public DoubleProperty scaleProperty();
    public ObjectProperty<Font> fontProperty();
    public ObjectProperty<String> backgroundColorProperty();
    public ObjectProperty<String> secondaryBackgroundColorProeprty();
    public ObjectProperty<String> selectedColorProperty();
    public ObjectProperty<String> textColorProperty();
}
