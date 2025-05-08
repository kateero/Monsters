package GUI;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.IOException;
import java.io.InputStream;

public class CustomFonts {

    private static Font titleFont;
    private static Font valueFont;
    private static Font treeFont;

    static {
        try (InputStream fontStream = CustomFonts.class.getResourceAsStream("/fonts/ofont.ru_Geoform.ttf")) {
            titleFont = Font.createFont(Font.TRUETYPE_FONT, fontStream);
            titleFont = titleFont.deriveFont(Font.BOLD,18f);
            GraphicsEnvironment.getLocalGraphicsEnvironment().registerFont(titleFont);
        } catch (IOException | FontFormatException e) {
            System.err.println("Ошибка загрузки шрифта! Будет использован стандартный шрифт.");
            titleFont = new Font("Serif", Font.BOLD, 18);
        }
    }

    static {
        try (InputStream fontStream = CustomFonts.class.getResourceAsStream("/fonts/ofont.ru_Flow Ext.ttf")) {
            valueFont = Font.createFont(Font.TRUETYPE_FONT, fontStream);
            valueFont = valueFont.deriveFont(18f);
            GraphicsEnvironment.getLocalGraphicsEnvironment().registerFont(valueFont);
        } catch (IOException | FontFormatException e) {
            System.err.println("Ошибка загрузки шрифта! Будет использован стандартный шрифт.");
            valueFont = new Font("Serif", Font.BOLD, 18);
        }
    }
    
    static {
        try (InputStream fontStream = CustomFonts.class.getResourceAsStream("/fonts/ofont.ru_Zhizn.ttf")) {
            treeFont = Font.createFont(Font.TRUETYPE_FONT, fontStream);
            treeFont = treeFont.deriveFont(18f);
            GraphicsEnvironment.getLocalGraphicsEnvironment().registerFont(treeFont);
        } catch (IOException | FontFormatException e) {
            System.err.println("Ошибка загрузки шрифта! Будет использован стандартный шрифт.");
            treeFont = new Font("Serif", Font.BOLD, 18);
        }
    }

    public static Font getTitleFont() {
        return titleFont;
    }

    public static Font getValueFont() {
        return valueFont;
    }

    public static Font getTreeFont() {
        return treeFont;
    }
    
}
