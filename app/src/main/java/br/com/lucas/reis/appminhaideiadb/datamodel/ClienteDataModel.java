package br.com.lucas.reis.appminhaideiadb.datamodel;

public class ClienteDataModel {
    //Modelo Objeto Relacional

    //TODA CLASSE DATA MODEL TEM ESTA ESTRUTURA

    // 1 - Atributo nome da tabela
    public static final String TABELA = "cliente";

    // 2 - Atributos"STRING" para cada um dos campos do Model "Cliente"
    // Nomes das colunas da tabela
    public static final String ID = "id"; // integer
    public static final String NOME = "nome"; // text
    public static final String EMAIL = "email"; // text

    // 3 - Query para criar a tabela no banco de dados
    public static String queryCriarTabela = "";

    // 4 - Metodo para criar o script para criar a tabela
    public static String criarTabela( ){

        queryCriarTabela += "CREATE TABLE "+TABELA+" (";
        queryCriarTabela += ID+" integer primary key autoincrement, ";
        queryCriarTabela += NOME+" text, ";
        queryCriarTabela += EMAIL+" text ";
        queryCriarTabela += ")";

        //

        return queryCriarTabela;
    }

    // 5 - Queries de consultas gerais
}
