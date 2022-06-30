package br.com.infnet.patterns.builder;

public class Runner {
    public static void main(String[] args) {
        Engenheiro engenheiro = new EngenheiroBuilder()
            .matricula(1L)
            .nome("José")
            .sobrenome("da Silva")
            .idade(31)
            .numeroConselho("23443")
            .possuiInglesFluente(true)
//            .notaMestrado(0)
            .notaMestrado(6)
            .build();

        Vendedor vendedor = new VendedorBuilder()
            .matricula(2L)
            .nome("João")
            .sobrenome("Santos")
            .idade(22)
            .quantidadeDeVendas(36)
            .build();

        System.out.println("====================== ENGENHEIRO ========================");
        System.out.println(engenheiro);
        System.out.println("Menor de 50 anos: " + engenheiro.eMenorDe50Anos());
        System.out.println("Habilitado para trabalhar fora: " + engenheiro.eHabilitadoParaTrabalharFora());
        System.out.println("Fluente em inglês: " + engenheiro.eFluenteEmIngles());
        System.out.println("======================= VENDEDOR =======================");
        System.out.println(vendedor);
        System.out.println("É platinum? " + (vendedor.isPlatinum() ? "Sim" : "Não"));
    }
}
