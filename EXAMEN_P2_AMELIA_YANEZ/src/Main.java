//Un programa en Java, donde tengo una cuneta de ahorros, los parametros iniciales son que te pide que cargues un saldo inicial, tasa de interes anual. Despues de que te pide esos parametros se depliega un menu que te dice
// 1. Depositas 2. Retirar. 3. Ver saldo 4. Salir
// Cada que pida una opcion debe salir el numero de transaccioes que llevo
// 2 clases una AY_CUENTA y una clase heredada que se llama  AY_CUENTAAHORROS
// Atributos de clase cuenta: saldo, numeroDepositos, numeroRetiros, tasaAnual. Metodos de la clase cuenta: cuenta(), depositar(), retira()
// Atributos de clase cuentaAhorro: saldo, numeroDepositos, numeroRetiros, tasaAnual, activa. Metodos de la clase cuenta: cuentaAhorro(), depositar(), retira(), imprimir()


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese saldo inicial: ");
        float saldoInicial = sc.nextFloat();

        System.out.print("Ingrese tasa de interés anual (%): ");
        float tasaAnual = sc.nextFloat();

        AY_CUENTAAHORROS cuenta = new AY_CUENTAAHORROS(saldoInicial, tasaAnual);

        int opcion;
                do{
                    System.out.println("\nMenú");
                    System.out.println(" 1. Depositar");
                    System.out.println(" 2. Retirar");
                    System.out.println(" 3. Ver saldo");
                    System.out.println(" 4. Salir");
                    System.out.println("Número total de transacciones: " + (cuenta.numeroDepositos + cuenta.numeroRetiros));
                    opcion= sc.nextInt();
                    sc.nextLine();

                    switch (opcion) {
                        case 1:
                            System.out.print("Cantidad a depositar: ");
                            double deposito = sc.nextDouble();
                            cuenta.depositar(deposito);
                            break;
                        case 2:
                            System.out.print("Cantidad a retirar: ");
                            double retiro = sc.nextDouble();
                            cuenta.retirar(retiro);
                            break;
                        case 3:
                            cuenta.imprimir();
                            break;
                        case 4:
                            System.out.println("Gracias profe.");
                            break;
                        default:
                            System.out.println("Opción no válida.");

                    }
                } while (opcion != 4);

        sc.close();
    }
}