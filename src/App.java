import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        boolean resume = true;
        while (resume) {
            printOptions();
            int option = getOption();
            boolean order = getOrder();
            boolean steps = getSteps();

            if (option==5) {
                System.out.println("Goodbye... ");
                resume = false;
                break;
            }
            
            int[] arreglo = { 12, -7, 25, 0, -15, 33, 19, -22, 5, 48, -3, 27, -30, 14, 7, -1, 41, 20, -11, 8 };
            switch (option) {
                case 1:
                    Burbuja burbuja = new Burbuja();
                    int[] resultadosBurbuja = burbuja.ordenarAscendente(arreglo, order, steps);
                    if (steps) {
                        System.out.print("Arreglo ordenado ->");
                        burbuja.imprimirArreglo(arreglo);
                        System.out.println("Comparaciones totales -> "+resultadosBurbuja[0]);
                        System.out.println("Cambios totales -> "+resultadosBurbuja[1]);
                        System.out.println();
                    } else burbuja.imprimirArreglo(arreglo);
                    break;
                case 2:
                    Seleccion seleccion = new Seleccion();
                    int[] resultadosSeleccion = seleccion.ordenarAscendente(arreglo, order, steps);
                    if (steps) {
                        System.out.print("Arreglo ordenado ->");
                        seleccion.imprimirArreglo(arreglo);
                        System.out.println("Comparaciones totales -> "+resultadosSeleccion[0]);
                        System.out.println("Cambios totales -> "+resultadosSeleccion[1]);
                        System.out.println();   
                    } else seleccion.imprimirArreglo(arreglo);
                    break;
                case 3:
                    Insercion insercion = new Insercion();
                    int[] resultadosInsercion = insercion.ordenarAscendente(arreglo, order, steps);
                    if (steps) {
                        System.out.print("Arreglo ordenado ->");
                        insercion.imprimirArreglo(arreglo);
                        System.out.println("Comparaciones totales -> "+resultadosInsercion[0]);
                        System.out.println("Cambios totales -> "+resultadosInsercion[1]);
                        System.out.println();   
                    } else insercion.imprimirArreglo(arreglo);
                    break;
                case 4:
                    BurbujaMejorado burbujaMejorado = new BurbujaMejorado();
                    int[] resultadoBurbujaM = burbujaMejorado.ordenarAscendente(arreglo, order, steps);
                    if (steps) {
                        System.out.print("Arreglo ordenado ->");
                        burbujaMejorado.imprimirArreglo(arreglo);
                        System.out.println("Comparaciones totales -> "+resultadoBurbujaM[0]);
                        System.out.println("Cambios totales -> "+resultadoBurbujaM[1]);
                        System.out.println();   
                    } else burbujaMejorado.imprimirArreglo(arreglo);
                    break;
            }

        }
    }

    public static void printOptions() {
        System.out.println("Seleccione un método de ordenamiento:");
        System.out.println("1. Burbuja");    
        System.out.println("2. Selección");    
        System.out.println("3. Inserción");    
        System.out.println("4. Burbuja Mejorado");    
        System.out.println("5. Salir");    
    }

    public static int getOption() {
        Scanner s = new Scanner(System.in);
        int option;
        do {
            System.out.print("Digite la opcion: ");
            option = s.nextInt();
            if (option<1 || option>5) System.out.println("Opcion No Valida. Intente nuevamente");
        } while (option<1 || option>5);
        return option;
    }

    public static boolean getOrder() {
        Scanner s = new Scanner(System.in);
        String order;
        boolean valid;
        String[] orders = new String[] {"A","D"};
        do {
            valid = false;
            System.out.print("¿Desea ordenar ascendentemente (A) o descendentemente (D)?: ");
            order = s.nextLine();
            for (String o : orders) {
                if (o.equalsIgnoreCase(order)) {
                    valid = true;
                    break;
                }
            }
            if (!valid) System.out.println("Orden No Valido. Intente nuevamente");
        } while (!valid);
        return order.equalsIgnoreCase("A")? true:false;
    }

    public static boolean getSteps() {
        Scanner s = new Scanner(System.in);
        String step;
        boolean valid;
        String[] options = new String[] {"true","false"};
        do {
            valid = false;
            System.out.print("¿Desea ver los pasos? (true/false): ");
            step = s.nextLine();
            for (String o : options) {
                if (o.equalsIgnoreCase(step)) {
                    valid = true;
                    break;
                }
            }
            if (!valid) System.out.println("No Valido. Intente nuevamente");
        } while (!valid);
        return step.equalsIgnoreCase("true")? true:false;
    }
}
