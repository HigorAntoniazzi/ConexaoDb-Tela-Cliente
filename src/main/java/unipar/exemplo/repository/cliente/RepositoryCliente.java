package unipar.exemplo.repository.cliente;

import unipar.exemplo.connection.ConnectionGeneric;

import java.sql.ResultSet;

public class Cliente {

    public void inserirCliete(){}
    public void alterarCliente(){}
    public void deletarCliente(){}



    public void buscarCliente(){
        ConnectionGeneric connection = new ConnectionGeneric();

        try {

            connection.getConnection();
            String query = "SELECT * FROM clientes";

            ResultSet result = connection.statement.executeQuery(query);

            while (result.next()){

                Integer id = result.getInt("id");
                String nome = result.getString("nome");
                String cnpj = result.getString("cnpj");
                String telefone = result.getString("telefone");
                String email = result.getNString("email");
                String situacao = result.getNString("situacao");
                String cidade = result.getNString("cidade");
                String estado = result.getNString("estado");
                Double credito = result.getDouble("credito");

                System.out.println("Cadastro cliente");
                System.out.println("id" + id);
                System.out.println("Nome" + nome);
                System.out.println("CNPJ" + cnpj);
                System.out.println("telefone" + telefone);
                System.out.println("email" + email);
                System.out.println("situacao" + situacao);
                System.out.println("cidade" + cidade);
                System.out.println("estado" + estado);
                System.out.println("credito" + credito);

            }


            connection.closeConnection();



        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
