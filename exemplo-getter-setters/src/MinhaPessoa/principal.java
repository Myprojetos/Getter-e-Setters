package MinhaPessoa;

public class principal {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();

        usuario.setNome("Julio Cesar");
        usuario.setCpf("123.456.789.00");
        usuario.setIdade(23);
        usuario.setEmail("Cesarjulio1475@gmail.com");
        usuario.setDateNascimento("22/10/2000");
        usuario.setProfissao("Estudante");
        usuario.setNacionalidade("Brasileiro");
        usuario.setEstadoCivil("Solteiro");
        usuario.setTel("11.94367-0409");
        usuario.setPais("Brasil");
        usuario.setCidade("Embu das Artes");
        usuario.setCep("06823270");
        usuario.setEstado("São Paulo");
        usuario.setBairro("Jardim Santo Eduardo");
        usuario.setRua("Rua 29");


        System.out.println(" ========= DADOS DO USUARIO ========== ");

        System.out.println("Nome: " + usuario.getNome());
        System.out.println("Email: " + usuario.getEmail());
        System.out.println("CPF: " + usuario.getCpf());
        System.out.println("Telefone: " + usuario.getTel());
        System.out.println("Idade: " + usuario.getIdade());
        System.out.println("Data de Nascimento: " + usuario.getDateNascimento());
        System.out.println("Estado Civil: " + usuario.getEstadoCivil());
        System.out.println("Nacionalidade: " + usuario.getNacionalidade());
        System.out.println("Profissão: " + usuario.getProfissao());
        System.out.println("CEP: " + usuario.getCep());
        System.out.println("Pais: " + usuario.getPais());
        System.out.println("Estado: " + usuario.getEstado());
        System.out.println("Cidade: " + usuario.getCidade());
        System.out.println("Rua: " + usuario.getRua());



    }
}
