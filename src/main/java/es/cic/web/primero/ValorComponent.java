package es.cic.web.primero;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ValorComponent {
    

    public String getValor() {
        return "mensaje";
    }

}
