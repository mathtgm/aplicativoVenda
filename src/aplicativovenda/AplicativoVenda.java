package aplicativovenda;

import aplicativovenda.view.MenuPrincipal;

public class AplicativoVenda {

    public static void main(String[] args) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }
    
}
