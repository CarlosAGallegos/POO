package _p110_CuentaBancariaV1;

public class App {
    public static void main(String[] args) {
        System.out.println("\nProbando clase CuentaBancaria");
        CuentaBancaria cuenta1 = new CuentaBancaria(5000);
        System.out.println("Saldo inicial: " + cuenta1.getSaldo());
        cuenta1.deposita(10000);
        System.out.println("Saldo deposito: " + cuenta1.getSaldo());
        double cretiro = 1500;
        boolean retiro = cuenta1.retira(cretiro);
        if(retiro){
            System.out.println("Retiro de " + cretiro + "exitoso");
        }else System.out.println("Retiro no exitoso");
        
        System.out.println("\nProbando clase Cliente");
        Cliente cliente1 = new Cliente("Juan Perez", cuenta1);
        System.out.println("Cliente 1:" + cliente1);
        Cliente cliente2 =  new Cliente("Carlos Castaneda", new CuentaBancaria(1000));
        System.out.println("Cliente 2: " + cliente2);
        cliente2.getCuentaBancaria().deposita(8500);
        System.out.println("Cliente 2 despues del deposito: " + cliente2);
        if(cliente2.getCuentaBancaria().retira(1500)){
            System.out.println("El retiro de 1500 fue exitoso, te queda: " + cliente2.getCuentaBancaria().getSaldo());
        }else System.out.println("No money man");

        System.out.println("\nProbando clase Banco");
        Banco mibanco = new Banco("Banco Patito SA de CV", "Calle la Escondida S/N");
        mibanco.agregarCliente(cliente1);
        mibanco.agregarCliente(cliente2);
        mibanco.agregarCliente(new Cliente("Felipe Correo", new CuentaBancaria(2000)));
        mibanco.getClientes().get(0).getCuentaBancaria().deposita(1500);
        mibanco.getClientes().get(1).getCuentaBancaria().retira(1000);
        mibanco.getClientes().get(2).getCuentaBancaria().deposita(12000);
        double totalbanco = 0;
        for(Cliente cliente : mibanco.getClientes()){
            System.out.println(cliente);
            totalbanco = totalbanco + cliente.getCuentaBancaria().getSaldo();
        }
        System.out.println("Total de dinero en el banco: " + totalbanco);
    }

        
}
