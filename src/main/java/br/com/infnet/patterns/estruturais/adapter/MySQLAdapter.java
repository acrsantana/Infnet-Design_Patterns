package br.com.infnet.patterns.estruturais.adapter;

public class MySQLAdapter implements Target{

    MyQSLCommands sql;

    public MySQLAdapter(MyQSLCommands sql) {
        this.sql = sql;
    }

    @Override public void insert() {
        sql.insertMySQL();
    }

    @Override public void delete() {
        sql.deleteMySQL();
    }

    @Override public void update() {
        sql.updateMySQL();
    }
}
