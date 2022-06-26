package example;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class App {

    public static List<InfoAboutFile> addFile(String path) {
        List<InfoAboutFile> file = new ArrayList<>();
        File root = new File(path);
        File[] list = root.listFiles();
        if (list != null) {
            for (File f : list) {
                String dateModified = new SimpleDateFormat("dd.MM.yyyy HH:mm").format(new Date(f.lastModified()));

                if (f.isDirectory()) {
                    file.add(new InfoAboutFile(f, f.getName(), dateModified, "Папка", ""));
                } else {
                    file.add(new InfoAboutFile(f, f.getName(), dateModified, "Файл", String.valueOf(f.length())));
                }
            }
        }
        return file;
    }
}
