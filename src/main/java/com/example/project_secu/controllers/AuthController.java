package com.example.project_secu.controllers;

import com.example.project_secu.models.AuthenticationRequest;
import com.example.project_secu.services.AuthService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/auth")
public class AuthController {
    private final AuthService authService;

    @GetMapping("/register")
    public String getRegisterForm(Model model) {
        model.addAttribute("mode", "register");
        model.addAttribute("formValues", AuthenticationRequest.builder().build());

        return "auth/registerForm";
    }

    @PostMapping("/register")
    public String registerHandler(AuthenticationRequest formValues, HttpServletRequest request) {
        authService.register(formValues);

        SecurityContext context = SecurityContextHolder.getContext();
        HttpSession session = request.getSession();

        session.setAttribute("SPRING_SECURITY_CONTEXT", context);

        return "redirect:/private";
    }
}