package es.cic.web.primero;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/portada")
public class RestPortadaCoontroller {

        @GetMapping
        public String get() {
            return "pasaba por aquí";
        }
}
