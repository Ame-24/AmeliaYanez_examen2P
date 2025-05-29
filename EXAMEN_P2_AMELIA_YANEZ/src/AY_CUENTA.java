public class AY_CUENTA {
    protected float saldo;
    protected int numeroDepositos;
    protected int numeroRetiros;
    protected float tasaAnual;

    public AY_CUENTA(float saldo_Inicial, float tasaAnual) {
        this.saldo = saldo_Inicial;
        this.tasaAnual = tasaAnual;
        this.numeroDepositos = 0;
        this.numeroRetiros = 0;
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            numeroDepositos++;
        } else {
            System.out.println("El valor no puede ser menor que 0");
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            numeroRetiros++;
        } else {
            System.out.println("Fondos insuficientes");
        }
    }
}