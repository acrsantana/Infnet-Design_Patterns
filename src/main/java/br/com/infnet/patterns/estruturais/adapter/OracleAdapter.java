package br.com.infnet.patterns.estruturais.adapter;

public class OracleAdapter implements Target{

    OracleCommands sql;

    public OracleAdapter(OracleCommands sql) {
        this.sql = sql;
    }

    @Override public void insert() {
        sql.insertOracle();
    }

    @Override public void delete() {
        sql.deleteOracle();
    }

    @Override public void update() {
        sql.updateOracle();
    }
}
