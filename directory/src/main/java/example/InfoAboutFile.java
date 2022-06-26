package example;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class InfoAboutFile {

    private File file;
    private String fileName;
    private String dateLastModified;
    private String typeFile;
    private String size;

    public InfoAboutFile(File file, String fileName, String dateLastModified, String typeFile, String size) {
        this.file = file;
        this.fileName = fileName;
        this.dateLastModified = dateLastModified;
        this.typeFile = typeFile;
        this.size = size;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
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
}
