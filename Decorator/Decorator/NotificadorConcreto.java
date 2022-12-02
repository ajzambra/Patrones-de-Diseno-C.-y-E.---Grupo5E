public class NotificadorConcreto implements Notificador {
    private boolean status;

    public NotificadorConcreto() {
        this.status = false;
    }

    @Override
    public void enviar(String mensaje) {
        // TODO Auto-generated method stub
        System.out.println("Enviando mensaje: " + mensaje);
    }

    @Override
    public void establecerEstado() {
        // TODO Auto-generated method stub
        
        
    }

    @Override
    public void establecerEstadoOff() {
        // TODO Auto-generated method stub
        status=false;
    }
    
    
    public boolean isStatus() {
        return status;
    }

}