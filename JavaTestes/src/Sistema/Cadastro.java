package Sistema;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> nome_lista = new ArrayList<String>();
        ArrayList<Integer> idade_lista = new ArrayList<Integer>();
        ArrayList<String> cpf_lista = new ArrayList<String>();
        ArrayList<Integer> salario_lista = new ArrayList<Integer>();

        while (true) {
            System.out.println("================================");
            System.out.println("[0] Cadastrar funcionario");
            System.out.println("[1] Procurar por um funcionario");
            System.out.println("[2] Remover funcionario");
            System.out.println("[3] Sair do programa");
            System.out.println("================================");
            System.out.print("Selecione uma opcao:");
            Integer escolha = scanner.nextInt();


            if (escolha == 0) {

                System.out.print("Nome:");
                String nome = scanner.next();

                System.out.print("Idade:");
                Integer idade = scanner.nextInt();

                System.out.print("CPF:");
                String cpf = scanner.next();

                System.out.print("Salario:");
                Integer salario = scanner.nextInt();



                nome_lista.add(nome);
                idade_lista.add(idade);
                cpf_lista.add(cpf);
                salario_lista.add(salario);

            }


            if (escolha == 1) {
                System.out.print("Digite o nome do funcionario:");
                String nome_funcionario = scanner.next();
                if (nome_lista.contains(nome_funcionario)) {
                    Integer indice = nome_lista.indexOf(nome_funcionario);
                    System.out.println();
                    System.out.printf("Nome: %s", nome_lista.get(indice));
                    System.out.println();
                    System.out.printf("Idade: %d", idade_lista.get(indice));
                    System.out.println();
                    System.out.printf("CPF: %s", cpf_lista.get(indice));
                    System.out.println();
                    System.out.printf("Salario: %d", salario_lista.get(indice));
                    System.out.println();
                }
            }


            if (escolha == 2) {
                System.out.print("Digite o nome do funcionario:");
                String nome_funcionario = scanner.next();
                if (nome_lista.contains(nome_funcionario)) {
                    Integer indice = nome_lista.indexOf(nome_funcionario);
                    nome_lista.remove(nome_lista.get(indice));
                    idade_lista.remove(idade_lista.get(indice));
                    cpf_lista.remove(cpf_lista.get(indice));
                    salario_lista.remove(salario_lista.get(indice));
                    System.out.println("Usuario removido com sucesso!");
                }
            }



            if (escolha==3){
                break;
            }



            System.out.print("Quer continuar? [Ss/Nn]:");
            String sn = scanner.next();
            if (sn.contains("Nn")) {
                break;
            } else if (sn.contains("Ss")) {
                continue;
            } else {
                System.out.println("Resposta invalida. Voltando ao inicio do programa...");
            }

        }
        System.out.println(nome_lista);
        System.out.println(idade_lista);
        System.out.println(cpf_lista);
        System.out.println(salario_lista);
    }
}