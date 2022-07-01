package br.com.infnet.patterns.estruturais.adapter;

public class Runner {
    public static void main(String[] args) {
        Target pc = new MySQLAdapter(new MyQSLCommands());

        pc.insert();
        pc.delete();
        pc.update();
    }

}
