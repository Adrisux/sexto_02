package ec.com.educalibro.dalc;

import java.sql.Connection;
import java.sql.DriverManager;


public class dalc {
    private Connection cn;
    
    /**
     * Abre una conexión al motor de base de datos
     * @throws Exception captura el error y lo muestra
     */
    public void Conectar() throws Exception{
        try {
            Class.forName("org.postgresql.Driver");
            cn = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/prueba?user=postgres&password=postgres");
        } catch (Exception e) {
            throw e;
        }
    }
    
    /**
     * Cierra las conexiones abiertas al motor de la base de datos
     * @throws Exception captura el error y lo muestra
     */
    public void Cerrar() throws Exception{
        try {
            if (cn != null) {
                if (cn.isClosed() == false) {
                    cn.close();
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public Connection getCn() {
        return cn;
    }

    public void setCn(Connection cn) {
        this.cn = cn;
    }    
}
