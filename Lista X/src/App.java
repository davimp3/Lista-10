public class App {
    public static void main(String[] args) throws Exception {
        // Carro carro = new Carro(null, null, 0, null, 0);
        // carro.setCor("Azul");
        // carro.setMarca("Subaru");
        // carro.setAno(2023);
        // carro.setMotorTipo("v6 3.0 turbo");
        // carro.setRenavam(12345);

        // System.out.println("Informações do carro:"+" "+carro.getCor()+" "+carro.getMarca()+" "+carro.getAno()+" "+carro.getMotorTipo()+" "+carro.getRenavam());

        Professor professor = new Professor(0, 0, null, null, null);
        professor.setIdRegistro(235335);
        professor.setSalario(125.000);
        professor.setNome("Daniel Paiva");
        professor.setUc("PSC - Programação de soluções computacionais");
        professor.setComputador("Nitro V i9 12, rtx4060, 24gb ram, 2tbssd");

        System.out.println("Dados professor, Nome:"+" "+professor.getNome()+" "+"ID Registro:"+professor.getIdRegistro()+" "+"Salario:"+professor.getSalario()+"UC:"+" "+professor.getUc()+" "+"Máquina:"+" "+professor.getComputador());
    }
}
