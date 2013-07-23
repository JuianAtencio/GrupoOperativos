public class ImprimeGrupo {
    public boolean devuelve_mensajeGrupo(boolean dato) {
        if (dato != true) {
            System.out.println("Imprime desde mensaje para dato true");
            dato = false;
        } else {
            System.out.println("Imprime desde mensaje para dato false");
            dato = true;
        }
        return dato;
    }
}
