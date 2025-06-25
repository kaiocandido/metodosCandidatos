import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class candidatos {
    public static void main(String[] args) {
        String [] candidatosNew = {"Katia", "Claudinei", "Maria","Katia","Kamila"};

        for(String candidato : candidatosNew){
            entrandoEmcontato(candidato);
        }

    }

    static void entrandoEmcontato(String candidato){
        int tentativasRealizdas = 1;
        boolean continuartentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuartentando = !atendeu;
            if(continuartentando){
                tentativasRealizdas++;
            }
        }while (continuartentando && tentativasRealizdas < 3);
        if(atendeu){
            System.out.println("Contato Realizado com sucesso com o " + candidato +"!!") ;
        }else {
            System.out.println("Sem sucesso no contato Realizado com o " + candidato + "!!") ;
        }
    }

    static boolean atender(){
        return new Random().nextInt(3)==1;
    }


    static void selecionados(){
        String [] candidatos = {"Katia", "Claudinei", "Maria","Katia","Kamila"};

        for(int i = 0; i < candidatos.length; i++){
            System.out.println("Candidato selecionado: " + candidatos[i]);
        }
    }

    static void selecaoCandidatos (){
        String [] candidatos =
                {"Katia", "Claudinei", "Maria","Katia","Kamila","Irone",
                        "Matheus","Lucas","Kaio"};
        int candidatosSelecionado = 0;
        int candidatoAtual = 0;
        double salariobase = 2000.0;
        while (candidatosSelecionado < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato +
                    " Solicitou este valor de salario " + salarioPretendido);

            if (salariobase >= salarioPretendido){
                System.out.println("O candidato " + candidato +
                        " foi selecionado");
                candidatosSelecionado++;
            }else{
                System.out.println("O candidato " + candidato +
                        " não foi selecionado");
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }

    static void analisarCandidato(double salarioPretendido, String nome) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato " + nome + "!!");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato " + nome + " com a contraproposta!!");
        } else {
            System.out.println("Aguardando resultado!!");
        }

    }
}