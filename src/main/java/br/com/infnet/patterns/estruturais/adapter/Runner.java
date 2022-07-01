package br.com.infnet.patterns.estruturais.adapter;

public class Runner {
    public static void main(String[] args) {
        Target comandos = new MySQLAdapter(new MyQSLCommands());

        comandos.insert();
        comandos.delete();
        comandos.update();

        comandos = new OracleAdapter(new OracleCommands());

        comandos.insert();
        comandos.delete();
        comandos.update();
    }

}
