package br.com.devtech.emailspringboot;

public record Email(String to, String subject, String body) {
    
    public Email {
        if (to == null || to.isBlank()) {
            throw new IllegalArgumentException("O destinatário não pode ser nulo ou vazio");
        }
        if (subject == null || subject.isBlank()) {
            throw new IllegalArgumentException("O assunto não pode ser nulo ou vazio");
        }
        if (body == null) {
            throw new IllegalArgumentException("O corpo do e-mail não pode ser nulo");
        }
    }
}
