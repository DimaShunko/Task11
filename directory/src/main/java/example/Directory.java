package example;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Directory {
    private String path;
    private List<InfoAboutFile> files = new ArrayList<>();
    private List<InfoAboutDisk> disks = new ArrayList<>();
    private boolean isDisk;

    public Directory() {
        this.path = System.getProperty("user.dir");
        File root = new File(path);
        File[] list = root.listFiles();
        if (list != null) {
            for (File f : list) {
                this.files.add(new InfoAboutFile(f));
            }
        }
        this.isDisk = false;
    }

    public Directory(String path) {
        this.path = path;
        File root = new File(path);
        File[] list = root.listFiles();
        if (list != null) {
            for (File f : list) {
                this.files.add(new InfoAboutFile(f));
            }
        }
        this.isDisk = false;
    }

    public Directory(File[] files) {
        this.path = "Этот компьютер";

        for (File f : files) {
            this.disks.add(new InfoAboutDisk(f));
        }

        this.isDisk = true;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public List<InfoAboutFile> getFiles() {
        return files;
    }

    public void setFiles(List<InfoAboutFile> files) {
        this.files = files;
    }

    public boolean isDisk() {
        return isDisk;
    }

    public void setDisk(boolean disk) {
        isDisk = disk;
    }

    public List<InfoAboutDisk> getDisks() {
        return disks;
    }

    public void setDisks(List<InfoAboutDisk> disks) {
        this.disks = disks;
    }
}
