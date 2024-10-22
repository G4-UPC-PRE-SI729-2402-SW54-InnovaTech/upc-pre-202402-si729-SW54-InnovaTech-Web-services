package pe.upc.connexbackend.users.domain.model.commands;

public record CreateCompanyCommand (
        String name,
        String industry,
        String phoneNumber,
        String website,
        String email,
        String passwordHash
){
    public CreateCompanyCommand {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name is required");
        }
        if (industry == null || industry.isBlank()) {
            throw new IllegalArgumentException("Industry is required");
        }
        if (phoneNumber == null || phoneNumber.isBlank()) {
            throw new IllegalArgumentException("Phone number is required");
        }
        if (website == null || website.isBlank()) {
            throw new IllegalArgumentException("Website is required");
        }
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("Email is required");
        }
        if (passwordHash == null || passwordHash.isBlank()) {
            throw new IllegalArgumentException("Password is required");
        }
    }
}
