public class BurbujaMejorado {
    public int[] ordenarAscendente(int[] arreglo, boolean ascendente, boolean pasos) {
        int comparaciones = 0, cambios = 0;
        if (pasos) {
            System.out.println("Método Burbuja Mejorado");
            System.out.print("Arreglo original -> ");
            imprimirArreglo(arreglo);
            System.out.println();
        }
        for (int i = 0; i < arreglo.length - 1; i++) {
            boolean intercambio = false;
            for (int j = 0; j < arreglo.length - 1 - i; j++) {
                comparaciones++;
                if (pasos) System.out.println("Comparación " + comparaciones + ": " + arreglo[j] + " > " + arreglo[j + 1]);
                
                if (ascendente) {
                    if (arreglo[j] > arreglo[j + 1]) {
                        cambios++;
                        if (pasos) System.out.println("Intercambio: " + arreglo[j] + " <-> " + arreglo[j + 1]);
                        int aux = arreglo[j];
                        arreglo[j] = arreglo[j + 1];
                        arreglo[j + 1] = aux;
                        intercambio = true;
                    } else {
                        if (pasos) System.out.println("(No hay intercambio)");
                    }
                } else {
                    if (arreglo[j] < arreglo[j + 1]) {
                        cambios++;
                        if (pasos) System.out.println("Intercambio: " + arreglo[j] + " <-> " + arreglo[j + 1]);
                        int aux = arreglo[j];
                        arreglo[j] = arreglo[j + 1];
                        arreglo[j + 1] = aux;
                        intercambio = true;
                    } else {
                        if (pasos) System.out.println("(No hay intercambio)");
                    }
                }
            }
            if (!intercambio) break;
            
            if (pasos) {
                System.out.print("Estado actual -> ");
                imprimirArreglo(arreglo);
                System.out.println();
            }
        }
        
        if (pasos) System.out.println("--FIN DEL METODO--");
        return new int[]{comparaciones, cambios};
    }

    public void imprimirArreglo(int[] arreglo) {
		for (int n : arreglo) System.out.print(" "+n);
		System.out.println();
	}
    
}