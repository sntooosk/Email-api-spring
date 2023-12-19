
# API de E-mail com Spring Boot

Esta é uma simples API de e-mail desenvolvida usando Spring Boot. Ela permite o envio de e-mails utilizando um serviço de e-mail configurado.

## Pré-requisitos

Antes de começar, certifique-se de ter instalado em sua máquina:

- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Maven](https://maven.apache.org/)
- Uma conta configurada na [Mailtrap](https://mailtrap.io/)

## Configuração

1. Clone este repositório:

   ```bash
   git clone https://github.com/seu-usuario/api-email-spring-boot.git
   ```

2. Configure as propriedades do e-mail no arquivo `application.properties`:

   ```properties
   spring.mail.host=your-smtp-host
   spring.mail.port=your-smtp-port
   spring.mail.username=your-email@example.com
   spring.mail.password=your-email-password
   ```

## Executando a Aplicação

Execute a aplicação Spring Boot:

```bash
mvn spring-boot:run
```

A API estará disponível em `http://localhost:8080`.

## Uso da API

### Enviar E-mail

Endpoint: `POST /email`

Exemplo de payload:

```json
{
  "to": "destinatario@example.com",
  "subject": "Assunto do E-mail",
  "body": "Corpo do E-mail",
  "sender": "remetente@example.com"
}
```

## Licença

Este projeto é distribuído sob a licença [MIT](LICENSE).
```

Lembre-se de personalizar as informações, como URLs, credenciais de e-mail e outras configurações, conforme necessário para o seu projeto. Este é apenas um exemplo básico, e você pode expandi-lo de acordo com as necessidades específicas do seu projeto.