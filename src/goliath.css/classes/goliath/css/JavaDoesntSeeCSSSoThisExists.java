package goliath.css;

import java.nio.channels.Selector;
import javafx.css.CssParser;
import javafx.css.Declaration;
import javafx.css.ParsedValue;
import javafx.css.Style;
import javafx.css.Stylesheet;
import javafx.css.converter.ColorConverter;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;


public class JavaDoesntSeeCSSSoThisExists
{
    public JavaDoesntSeeCSSSoThisExists()
    {
       CssParser parser = new CssParser();
       Stylesheet sh = parser.parse("goliath/css/Goliath-Envy.css");
       
    }
}
