@RestController
public class ContactController {
    
    @PostMapping("/contact")
    public ResponseEntity<String> handleContact(@RequestBody ContactForm form) {
        // Procesar el formulario de contacto
        return ResponseEntity.ok("Mensaje recibido");
    }
}

public class ContactForm {
    private String name;
    private String email;
    private String message;
    
    // Getters y setters
}
