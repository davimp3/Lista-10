public class Carro {
    private String cor, marca, motorTipo;
    private int ano, renavam;

        public Carro(String cor, String marca, int ano, String motorTipo, int renavam){
                this.cor = cor;
                this.marca = marca;
                this.ano = ano;
                this. motorTipo = motorTipo;
                this.renavam = renavam;
        }

            public String getCor(){
                return cor;
            } 

            public void setCor(String cor){
                this.cor = cor;
            }

            public String getMarca(){
                return marca;
            }

            public void setMarca(String marca){
                this.marca = marca;
            }

            public String getMotorTipo(){
                return  motorTipo;
            }

            public void setMotorTipo(String motorTipo){
                this.motorTipo = motorTipo;
            }

            public int getAno(){
                return ano;
            }

            public void setAno(int ano){
                this.ano = ano;
            }

            public int getRenavam(){
                return renavam;
            }

            public void setRenavam(int renavam){
                this.renavam = renavam;
            }
}
