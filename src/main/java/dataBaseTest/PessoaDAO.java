package dataBaseTest;

import java.sql.Connection;
import java.sql.PreparedStatement;



public class PessoaDAO extends DAO{
    public void cadastarPessoa(Pessoa p){
        try {
            Connection con = getConnection();
            PreparedStatement statement = con.prepareStatement("insert into java values(?,?,?,?)");
            statement.setString(1, p.getNome());
            statement.setInt(2, p.getIdade());
            statement.setString(3, p.getEstado());
            statement.setString(4, p.getCpf());
            statement.execute();
            statement.close();
            closeConnection(con, statement);
        }catch (Exception ex){
            throw new RuntimeException("Erro ao conectar com o banco", ex);
        }
    }

    public void alterarPessoa(Pessoa p){
        try{
            Connection con = getConnection();
            PreparedStatement statement = con.prepareStatement("UPDATE java SET nome = ?, idade = ?, estado = ?, cpf = ? WHERE idTabela = ?");
            statement.setString(1, p.getNome());
            statement.setInt(2, p.getIdade());
            statement.setString(3, p.getEstado());
            statement.setString(4, p.getCpf());
            statement.setInt(5, p.getIdTabela());
            statement.execute();
            statement.close();
            closeConnection(con, statement);
        }catch (Exception ex){
            throw new RuntimeException("Erro ao conectar com o banco", ex);
        }
    }

    public void deletarPessoa(Pessoa p){
        try{
            Connection con = getConnection();
            PreparedStatement statement = con.prepareStatement("DELETE FROM java where idTabela = ?");
            statement.setInt(1, p.getIdTabela());
            statement.execute();
            statement.close();
            closeConnection(con, statement);
        }catch (Exception ex){
            throw new RuntimeException("Erro ao conectar com o banco", ex);
        }
    }
}
