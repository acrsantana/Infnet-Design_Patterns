package br.com.infnet.patterns.estruturais.adapter;

public class PostgresCommands implements Target{
    @Override public void insert() {
        System.out.println("Insert no Postgres");
    }

    @Override public void delete() {
        System.out.println("Delete no Postgres");
    }

    @Override public void update() {
        System.out.println("Upgrade no Postgres");
    }
}
