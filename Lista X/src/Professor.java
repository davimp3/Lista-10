public class Professor {
    private double salario, idRegistro;
    private String nome, uc, computador;
    
        public Professor(double salario, double idRegistro, String nome, String uc, String computador){
            this.salario = salario;
            this.idRegistro = idRegistro;
            this. nome = nome;
            this.uc = uc;
            this. computador = computador;
        }

            public double getSalario(){
                return  salario;
            }

            public void setSalario(double salario){
                this. salario = salario;
            }

            public double getIdRegistro(){
                return  idRegistro;
            }

            public void setIdRegistro(double idRegistro){
                this.idRegistro = idRegistro;
            }

            public String getNome(){
                return  nome;
            }

            public void setNome(String nome){
                this.nome = nome;
            }

            public String getUc(){
                return  uc;
            }

            public void setUc(String uc){
                this.uc = uc;
            }

            public String getComputador(){
                return computador;
            }

            public void setComputador(String computador){
                this.computador = computador;
            }




    
}
