//package exercicio_11;
//
//public class Teste_11_7 {
//
//	public static void main(String[] args) {
//
//		// EX1
//		boolean saca(double valor) {
//			if (this.saldo < valor) {
//				return false;
//			} else {
//				this.saldo -= valor;
//				return true;
//			}
//		}
//
//		// EX2
//		void saca(double valor){
//			throw new RuntimeException();
//		} else {
//			this.saldo -= valor;
//		}
//		
//		// EX3
//		void saca(double valor){
//			if (this.saldo < valor){
//				throw new IllegalAccessException();
//			} else {
//				this.saldo -= valor;
//			}
//		}
//		
//		// EX4
//		Conta cc = new ContaCorrente();
//		cc.deposita(100);
//		
//		try {
//			cc.saca(100);
//		} catch (IllegalArgumentException e) {
//			System.out.println("Saldo Insuficiente");
//		}
//		
//		// EX5
//		void saca(double valor){
//			if (this.saldo < saldo){
//				throw new IllegalArgumentException("Saldo insuficiente");
//			} else {
//				this.saldo -= valor;
//			}
//		}
//		
//		// EX6
//		try {
//			cc.saca(100);
//		} catch (IllegalArgumentException e) {
//			System.out.println(e.getMessage());
//		}
//	}
//}