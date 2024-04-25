package com.liavb.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}
