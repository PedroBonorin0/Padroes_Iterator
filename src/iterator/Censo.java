package iterator;

import java.util.Iterator;

public class Censo {

    public static Integer contarClientesComCompraRealizada(Plataforma plataforma) {
        int quantidade = 0;
        for (Cliente cliente : plataforma) {
            if (cliente.hasCompraRealizada()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalClientes(Plataforma plataforma) {
        int quantidade = 0;
        for (Cliente cliente : plataforma) {
            quantidade++;
        }
//        for (Iterator a = plataforma.iterator(); a.hasNext(); ) {
//            quantidade++;
//            a.next();
//        }
        return quantidade;
    }

    public static float calcularPorcentagemClientesCompradores(Plataforma plataforma) {
        int temCompra = contarClientesComCompraRealizada(plataforma);
        int total = contarTotalClientes(plataforma);
        float result = (float) temCompra/total;
        return result*100;
    }
}
