package GUI;

import java.io.File;
import javax.swing.filechooser.FileFilter;

public class CustomFilter extends FileFilter {

    private final String[] extensions;
    private final String description;

    public CustomFilter(String[] extensions, String description) {
        this.extensions = extensions;
        this.description = description;
    }

    @Override
    public boolean accept(File f) {
        if (f.isDirectory()) {
            return true; 
        }
        String fileName = f.getName().toLowerCase();
        for (String ext : extensions) {
            if (fileName.endsWith("." + ext.toLowerCase())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String getDescription() {
        return description;
    }

}
