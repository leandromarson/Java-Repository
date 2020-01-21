package primeiroprograma;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;
import java.util.Locale;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        System.out.println("Hora do System");
        Date data = new Date();
        System.out.println(data);
        
        Locale idioma = Locale.getDefault();
        System.out.println("Idioma: "+idioma.getDisplayLanguage()+" "+idioma.getLanguage());
        
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.println("Resolução: "+d.width+"x"+d.height);
        
    }
    
    
}
