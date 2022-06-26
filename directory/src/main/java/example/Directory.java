package example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

@Controller
public class Directory {

    private String path = System.getProperty("user.dir");
    private List<InfoAboutFile> files = new ArrayList<>();

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

    @GetMapping("/")
    public String getDirectory(Model model) {
        model.addAttribute("path", getPath());
        setFiles(App.addFile(path));
        model.addAttribute("files", getFiles());
        return "index";
    }

    @PostMapping("/")
    public String postDirectory(@RequestParam String file) {
        if (file.equals("back")) {
            String newPath = String.valueOf(Paths.get(path).getParent());
            if (!newPath.equals("null")) {
                setPath(newPath);
            }
        } else {
            setPath(path + File.separator + file);
        }
        return "redirect:/";
    }

}
