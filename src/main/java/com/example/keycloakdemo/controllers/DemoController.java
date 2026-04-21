
package com.example.keycloakdemo.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/api")
public class DemoController {

    @GetMapping("/public")
    public String publicEndpoint() {
        return "This is a public endpoint accessible by anyone.";
    }

    @PreAuthorize("hasRole('user')")
    @GetMapping("/protected")
    public String protectedEndpoint( Principal principal, Model model) {
        return "This is a protected endpoint accessible only by authenticated users.";
    }

    @PreAuthorize("hasRole('admin')")
    @GetMapping("/admin")
    public String adminEndpoint(Principal principal, Model model) {
        return "This is a protected endpoint accessible by admin.";
    }

    @PreAuthorize("hasRole('moderator')")
    @GetMapping("/moderator")
    public String moderatorEndpoint(Principal principal, Model model) {
        return "This is a protected endpoint accessible by moderators.";
    }
}
