package polifasico;

import java.util.*;

public class Ejemplo_Polifasico1 {

    // Simula archivos temporales con listas
    private List<Queue<Integer>> archivos;

    public Ejemplo_Polifasico1() {
        archivos = new ArrayList<>();
        // Inicializamos 3 archivos (colas)
        for (int i = 0; i < 3; i++) {
            archivos.add(new LinkedList<>());
        }
    }

    // Método para distribuir los datos iniciales en los archivos (runs)
    public void distribuir(List<Integer> datos) {
        // Para simplificar, distribuimos los datos en secuencias ordenadas (runs)
        // Aquí simplemente dividimos los datos en 3 partes iguales
        int n = datos.size();
        int parte = n / 3;
        for (int i = 0; i < n; i++) {
            archivos.get(i / parte).add(datos.get(i));
        }
    }

    // Método para realizar la mezcla polifásica
    public List<Integer> mezclar() {
        List<Integer> resultado = new ArrayList<>();
        // Mientras haya datos en al menos un archivo
        while (archivos.stream().anyMatch(q -> !q.isEmpty())) {
            // Encontrar el mínimo entre las cabezas de las colas
            int min = Integer.MAX_VALUE;
            int indiceMin = -1;
            for (int i = 0; i < archivos.size(); i++) {
                Queue<Integer> cola = archivos.get(i);
                if (!cola.isEmpty() && cola.peek() < min) {
                    min = cola.peek();
                    indiceMin = i;
                }
            }
            // Extraer el mínimo y agregarlo al resultado
            resultado.add(min);
            archivos.get(indiceMin).poll();
        }
        return resultado;
    }

    public static void main(String[] args) {
        Ejemplo_Polifasico1 op = new Ejemplo_Polifasico1();

        // Datos desordenados
        List<Integer> datos = Arrays.asList(20, 5, 15, 10, 30, 25, 35, 40, 1);

        System.out.println("Datos originales: " + datos);

        // Distribuir datos en archivos (runs)
        op.distribuir(datos);

        // Mezclar y ordenar
        List<Integer> ordenados = op.mezclar();

        System.out.println("Datos ordenados: " + ordenados);
    }
}
