public class AY_CUENTA {
    protected float saldo;
    protected int numeroDepositos;
    protected int numeroRetiros;
    protected float tasaAnual;

    public AY_CUENTA(float saldoInicial, float tasaAnual) {
        this.saldo = saldoInicial;
        this.tasaAnual = tasaAnual;
        this.numeroDepositos = 0;
        this.numeroRetiros = 0;
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            numeroDepositos++;
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