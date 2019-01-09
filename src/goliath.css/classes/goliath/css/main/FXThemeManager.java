package goliath.css.main;

import goliath.css.interfaces.FXTheme;
import java.util.ArrayList;
import java.util.List;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.scene.Node;
import javafx.scene.Scene;

public class FXThemeManager
{
    private static final String SCALE = "-fx-theme-scale: ";
    private static final String PRIMARY_BACKGROUND = "-fx-theme-background-color: ";
    private static final String SECONDARY_BACKGROUND = "-fx-theme-background-color-alt: ";
    private static final String SEMI_COLON = ";";
    
    private final Scene scene;
    private final ObjectProperty<FXTheme> theme;
    
    public FXThemeManager(Scene sc)
    {
        scene = sc;
        scene.getRoot().getStylesheets().add("goliath/css/Goliath-Base.css");
        
        theme = new SimpleObjectProperty<>();
    }
    
    public ObjectProperty<FXTheme> themeProperty()
    {
        return theme;
    }
    
    public void setScale(double scale)
    {
        scene.getRoot().setStyle(PRIMARY_BACKGROUND + scale + SEMI_COLON);
    }
    
    public void setBackgroundColor(String hex)
    {
        scene.getRoot().setStyle(PRIMARY_BACKGROUND + hex + SEMI_COLON);
    }
    
    public void setBackgroundAltColor(String hex)
    {
        scene.getRoot().setStyle(SECONDARY_BACKGROUND + hex + SEMI_COLON);
    }
    
    public void scale(Node node, double x, double y)
    {
        node.minHeight(x*theme.get().scaleProperty().get());
        node.maxHeight(x*theme.get().scaleProperty().get());
        
        node.minWidth(y*theme.get().scaleProperty().get());
        node.maxWidth(y*theme.get().scaleProperty().get());
    }
    
    public void scaleX(Node node, double x)
    {
        node.minHeight(x*theme.get().scaleProperty().get());
        node.maxHeight(x*theme.get().scaleProperty().get());
    }
    
    public void scaleY(Node node, double y)
    {
        node.minWidth(y*theme.get().scaleProperty().get());
        node.maxWidth(y*theme.get().scaleProperty().get());
    }
}
