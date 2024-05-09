package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Classe User responsável por gerenciar as operações de autenticação de usuários.
 * Esta classe fornece métodos para conectar-se a um banco de dados e verificar a existência de um usuário.
 */
public class User {

    /**
     * Estabelece uma conexão com o banco de dados.
     *
     * @return Uma conexão com o banco de dados ou null se uma exceção ocorrer.
     */
    public Connection conectarBD() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            String url = "jdbc:mysql://127.0.0.1/test?user=lopes&password=123";
            conn = DriverManager.getConnection(url);
        } catch (Exception e) {
            // Consider logging the exception or handling it according to your application's requirements.
            e.printStackTrace();
        }
        return conn;
    }

    // Variáveis de instância
    /** Nome do usuário obtido do banco de dados, se autenticado com sucesso. */
    public String nome = "";

    /** Resultado da verificação do usuário, verdadeiro se autenticado, falso caso contrário. */
    public boolean result = false;

    /**
     * Verifica se um usuário com as credenciais fornecidas existe no banco de dados.
     *
     * @param login O login do usuário a ser verificado.
     * @param senha A senha do usuário a ser verificada.
     * @return true se o usuário existir e a senha corresponder, false caso contrário.
     */
    public boolean verificarUsuario(String login, String senha) {
        String sql = "";
        Connection conn = conectarBD();
        sql += "select nome from usuarios ";
        sql += "where login = '" + login + "'";
        sql += "and senha = '" + senha + "';";
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                result = true;
                nome = rs.getString("nome");
            }
        } catch (Exception e) {
            // Consider logging the exception or handling it according to your application's requirements.
            e.printStackTrace();
        }
        return result;
    }
}