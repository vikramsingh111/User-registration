package com.example.UserRegistrationApp;

import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @PostMapping("/register")
    public Response registerUser(@RequestBody User user) {
        // Here you would save the user to a database
        System.out.println("User registered: " + user.getName() + ", " + user.getEmail());
        return new Response("User registered successfully!");
    }

    public static class Response {
        private String message;

        public Response(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }
}
