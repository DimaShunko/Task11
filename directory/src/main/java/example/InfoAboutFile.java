package example;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InfoAboutFile {

    private String fileName;
    private String dateLastModified;
    private String typeFile;
    private String size;
    private boolean isDirectory;

    public InfoAboutFile(File file) {
        this.fileName = file.getName();

        this.dateLastModified = new SimpleDateFormat("dd.MM.yyyy HH:mm").format(new Date(file.lastModified()));

        if (file.isDirectory()) {
            this.typeFile = "Папка";
            this.size = "";
        } else {
            this.typeFile = "Файл";
            this.size = String.valueOf(file.length());
        }

        this.isDirectory = file.isDirectory();

    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getDateLastModified() {
        return dateLastModified;
    }

    public void setDateLastModified(String dateLastModified) {
        this.dateLastModified = dateLastModified;
    }

    public String getTypeFile() {
        return typeFile;
    }

    public void setTypeFile(String typeFile) {
        this.typeFile = typeFile;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public boolean isDirectory() {
        return isDirectory;
    }

    public void setDirectory(boolean directory) {
        isDirectory = directory;
    }
}
