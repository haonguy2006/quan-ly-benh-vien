package com.example.hospital;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BenhNhanController {

    @GetMapping("/")
    public String hienThiForm(Model model) {
        model.addAttribute("benhNhan", new BenhNhan());
        return "form";
    }

    @PostMapping("/ketqua")
    public String xuLy(@ModelAttribute BenhNhan benhNhan, Model model) {
        model.addAttribute("benhNhan", benhNhan);
        return "ketqua";
    }
}
