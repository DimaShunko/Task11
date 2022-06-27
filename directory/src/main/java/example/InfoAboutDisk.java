package example;

import java.io.File;

public class InfoAboutDisk {
    private File diskName;

    public InfoAboutDisk(File f) {
        this.diskName = f;
    }

    public File getDiskName() {
        return diskName;
    }

    public void setDiskName(File diskName) {
        this.diskName = diskName;
    }
}
