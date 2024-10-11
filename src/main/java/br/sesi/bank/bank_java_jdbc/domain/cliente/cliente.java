package br.sesi.bank.bank_java_jdbc.domain.cliente;

public class cliente {

    private String nome;
    private String cpf;
    private String email;

     public Clinte(DadosCadastroCliente dados) {

     }
     public String getNome () {
         return this.nome;
     }
      public String getCpf () {
          return this.cpf;
      }
      public String getEmail (){
          return this.email;
     }
     public boolean equale (Object o){
         return true;
     }
     public int hashCode () {
         return  0;
     }
}
