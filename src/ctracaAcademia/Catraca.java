package ctracaAcademia;

import java.util.Scanner;

public class Catraca {
    public static void main(String args []){
        Scanner entrada = new Scanner ( System.in);

        Aluno aluno = new Aluno("Jorge", 1224, 123, true);

        System.out.println("Digite sua senha :  ");
        int validaSenha = entrada.nextInt();
        if (validaSenha == aluno.senha && aluno.mensalidadePaga == true ){
            System.out.println("Acesso liberado !");
        }else{
            System.out.println("Acesso negado !");
        }

    }
}
