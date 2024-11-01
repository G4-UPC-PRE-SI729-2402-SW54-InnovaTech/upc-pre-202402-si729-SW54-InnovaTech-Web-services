package pe.upc.connexbackend.users.domain.model.commands;

// Define un comando inmutable para crear una entidad de Influencer
public record CreateInfluencerCommand(
        String firstName,
        String lastName,
        String phoneNumber,
        String socialMediaHandle,
        String email,
        String passwordHash
) {
    // Constructor validado que lanza excepciones si los campos obligatorios están vacíos o nulos
    public CreateInfluencerCommand {
        if (firstName == null || firstName.isBlank()) {
            throw new IllegalArgumentException("First name is required");
        }
        if (lastName == null || lastName.isBlank()) {
            throw new IllegalArgumentException("Last name is required");
        }
        if (phoneNumber == null || phoneNumber.isBlank()) {
            throw new IllegalArgumentException("Phone number is required");
        }
        if (socialMediaHandle == null || socialMediaHandle.isBlank()) {
            throw new IllegalArgumentException("Social media handle is required");
        }
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("Email is required");
        }
        if (passwordHash == null || passwordHash.isBlank()) {
            throw new IllegalArgumentException("Password is required");
        }
    }
}
