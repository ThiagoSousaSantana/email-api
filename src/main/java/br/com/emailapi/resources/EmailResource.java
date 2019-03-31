package br.com.emailapi.resources;

import br.com.emailapi.models.Email;
import br.com.emailapi.service.SmtpEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequestMapping(value = "/email")
@RestController
public class EmailResource {

    @Autowired
    private SmtpEmailService emailService;

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Void> sendEmail(@Valid @RequestBody Email email){
        try {
            emailService.sendEmail(email);
            return ResponseEntity.ok().build();
        }catch (Exception e){
            return ResponseEntity.badRequest().build();
        }
    }
}
