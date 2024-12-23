package es.cic.web.primero;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/portada")
public class RestPortadaCoontroller {

        @Autowired
        private ValorComponent valorComponent;

        @GetMapping
        public String get() {
            return valorComponent.getValor();
        }
}
