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
public class DirectoryController {
    Directory directory = new Directory();

    @GetMapping("/")
    public String getDirectory(Model model) {
        model.addAttribute("directory", directory);
        return "index";
    }

    @PostMapping("/next")
    public String postNextDirectory(@RequestParam String file, @RequestParam String path) {
        if (path.equals("Этот компьютер")) {
            directory = new Directory(file);
        } else {
            directory = new Directory(path + File.separator + file);
        }
        return "redirect:/";
    }

    @PostMapping("/back")
    public String postBackDirectory(@RequestParam String path) {
        String newPath = String.valueOf(Paths.get(path).getParent());
        if (newPath.equals("null")) {
            directory = new Directory(File.listRoots());
        } else {
            directory = new Directory(newPath);
        }
        return "redirect:/";
    }
}
