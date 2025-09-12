package polifasico;

import java.util.*;

class RegistroVenta {

    int id;
    double monto;

    public RegistroVenta(int id, double monto) {
        this.id = id;
        this.monto = monto;
    }

    @Override
    public String toString() {
        return "ID:" + id + " Monto:" + monto;
    }
}

public class Ejemplo_Polifasico2 {

    private List<Queue<RegistroVenta>> archivos;

    public Ejemplo_Polifasico2(int numArchivos) {
        archivos = new ArrayList<>();
        for (int i = 0; i < numArchivos; i++) {
            archivos.add(new LinkedList<>());
        }
    }

    // Distribuye registros en archivos simulando runs ordenados
    public void distribuir(List<RegistroVenta> registros) {
        // Para simplificar, dividimos en partes iguales
        int n = registros.size();
        int parte = n / archivos.size();
        for (int i = 0; i < n; i++) {
            archivos.get(i / parte).add(registros.get(i));
        }
    }

    // Mezcla los archivos extrayendo el registro con menor monto
    public List<RegistroVenta> mezclar() {
        List<RegistroVenta> resultado = new ArrayList<>();

        while (archivos.stream().anyMatch(q -> !q.isEmpty())) {
            RegistroVenta min = null;
            int indiceMin = -1;

            for (int i = 0; i < archivos.size(); i++) {
                Queue<RegistroVenta> cola = archivos.get(i);
                if (!cola.isEmpty()) {
                    RegistroVenta actual = cola.peek();
                    if (min == null || actual.monto < min.monto) {
                        min = actual;
                        indiceMin = i;
                    }
                }
            }

            resultado.add(min);
            archivos.get(indiceMin).poll();
        }

        return resultado;
    }

    public static void main(String[] args) {
        Ejemplo_Polifasico2 opv = new Ejemplo_Polifasico2(3);

        List<RegistroVenta> ventas = Arrays.asList(
                new RegistroVenta(101, 250.75),
                new RegistroVenta(102, 100.00),
                new RegistroVenta(103, 300.50),
                new RegistroVenta(104, 50.25),
                new RegistroVenta(105, 400.00),
                new RegistroVenta(106, 150.00),
                new RegistroVenta(107, 200.00),
                new RegistroVenta(108, 350.00),
                new RegistroVenta(109, 75.00)
        );

        System.out.println("Registros de ventas originales:");
        ventas.forEach(System.out::println);

        opv.distribuir(ventas);

        List<RegistroVenta> ordenados = opv.mezclar();

        System.out.println("\nRegistros de ventas ordenados por monto:");
        ordenados.forEach(System.out::println);
    }
}
