
package cuenta;

public class Cuenta {
    int saldo;

        public void consul_saldo(){     //CONSULTA DE LA CUENTA
            System.out.println("EL SALDO ES: "+saldo);
        }
    
        public void abono(int abono){        //ABONO EN LAS CUENTAS
            saldo += abono;
            
            System.out.println("EL ABONO A SU CUENTA ES: "+abono);
        }
        
        public void debito(int debito){
            saldo -= debito;
            System.out.println("EL DEBITO A SU CUENTA ES:"+debito);
        }
    
    public static void main(String[] args) {
        Cuenta obj1 = new Cuenta();             //CREACION CUENTA NO.1
        Cuenta obj2 = new Cuenta();             //CREACION CUENTA NO.2
            System.out.println("-------CUENTA NO.1-------");
            obj1.saldo=1500;
            obj1.consul_saldo();
            obj1.abono(500);
            obj1.debito(800);
            System.out.println("-------------------------");
            
            System.out.println("-------CUENTA NO.2-------");
            obj2.saldo=3000;
            obj2.consul_saldo();
            obj2.abono(500);
            obj2.debito(800);
            System.out.println("-------------------------");
        
    }
    
}
