public class Insercion {
	public int[] ordenarAscendente(int[] arreglo, boolean ascendente, boolean pasos) {
		int comparaciones = 0, cambios = 0;
		if (pasos) {
			System.out.println("Método Inserción");
			System.out.print("Arreglo original -> ");
			imprimirArreglo(arreglo);
			System.out.println();
		}
		for (int i = 1; i < arreglo.length; i++) {
			int actual = arreglo[i];
			int j = i - 1;
			boolean huboCambio = false;	
			if (ascendente) {
				while (j >= 0 && arreglo[j] > actual) {
					comparaciones++;
					if (pasos) System.out.println("Comparación " + comparaciones + ": " + arreglo[j] + " > " + actual);
					
					arreglo[j + 1] = arreglo[j];
					j--;
					cambios++;
					huboCambio = true;
					if (pasos) System.out.println("Intercambio: " + arreglo[j + 1] + " <-> " + arreglo[j + 2]);
				}
			} else {
				while (j >= 0 && arreglo[j] < actual) {
					comparaciones++;
					if (pasos) System.out.println("Comparación " + comparaciones + ": " + arreglo[j] + " < " + actual);
					
					arreglo[j + 1] = arreglo[j];
					j--;
					cambios++;
					huboCambio = true;
					if (pasos) System.out.println("Intercambio: " + arreglo[j + 1] + " <-> " + arreglo[j + 2]);
				}
			}
			
			arreglo[j + 1] = actual;
			if (!huboCambio) {
				comparaciones++;
				if (pasos) System.out.println("Comparación " + comparaciones + ": " + arreglo[j + 1] + (ascendente ? " > " : " < ") + actual);
				if (pasos) System.out.println("(No hay intercambio)");
			}
			
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
