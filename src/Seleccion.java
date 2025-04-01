public class Seleccion {
	public int[] ordenarAscendente(int[] arreglo, boolean ascendente, boolean pasos) {
		int comparaciones = 0, cambios = 0;
		if (pasos) {
			System.out.println("Metodo Seleccion");
			System.out.print("Arreglo original -> ");
			imprimirArreglo(arreglo);
			System.out.println();
		}
		for (int i = 0; i < arreglo.length - 1; i++) {
			int iM = i;
			for (int j = i + 1; j < arreglo.length; j++) {
				comparaciones++;
				if (ascendente) {
					if (pasos) System.out.println("Comparación " + comparaciones + ": " + arreglo[j] + " < " + arreglo[iM]);
					if (arreglo[j] < arreglo[iM]) {
						iM = j;
					}
				} else {
					if (pasos) System.out.println("Comparación " + comparaciones + ": " + arreglo[j] + " > " + arreglo[iM]);
					if (arreglo[j] > arreglo[iM]) {
						iM = j;
					}
				}
			}
			
			if (iM != i) {
				cambios++;
				if (pasos) System.out.println("Intercambio: " + arreglo[i] + " <-> " + arreglo[iM]);
				int aux = arreglo[i];
				arreglo[i] = arreglo[iM];
				arreglo[iM] = aux;
			} else {
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
