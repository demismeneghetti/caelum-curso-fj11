
package exercicio_11;

import java.io.IOException;
import java.sql.SQLException;

public class Teste_11_6 {

	public static void main(String[] args) {

		try{
			objeto.metodoQuePodeLancarIOeSQLException();
		}catch (IOException e){
			//....
		}catch (SQLException e){
			//....
		}
	}
	
	public void abre1(String arquivo) throws IOException, SQLException {
		//....
	}
	
	public void abre2(String arquivo) throws IOException{
		try {
			objeto.metodoQuePodeLancarIOeSQLException();
		} catch (SQLException e) {
			// TODO: handle exception
		}
	}
}
