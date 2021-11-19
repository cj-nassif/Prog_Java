package massacorporalexemplo;

import java.util.Scanner;

public class MassaCorporalExemplo {

    public static void main(String[] args) {
        
    //  Início Programa Calcula Média

        
        Scanner sc = new Scanner(System.in);

double media, nota1, nota2;

System.out.println("Digite a nota 1:");

nota1 = Double.parseDouble(sc.nextLine());

System.out.println("Digite a nota 2:");

nota2 = Double.parseDouble(sc.nextLine());

media = (nota1 + nota2) /2.0;

System.out.println("A sua média é:" + media);

sc.close();

    //  Fim Programa Calcula Média

        
        //  Início Programa Verifica se numero entrado é primo
//        Scanner sc = new Scanner(System.in);
//        
//        int nr, i, cont = 0;
//        System.out.print("Número..: ");
//        nr = Integer.parseInt(sc.nextLine());
//        
//        for (i = 1; i <= nr; i++) {
//            if(nr % i == 0) {
//                cont++;
//            }
//        }
//        if (cont == 2) {
//           System.out.print("--- O número é PRIMO ---");
//
//        }
//        else {
//           System.out.print("--- O número NÃO é primo ---");
//
//        }

        //  Fim Programa Verifica se numero entrado é primo
//        
        

        //  Início Programa Verifica IMC
        
//        double peso, alt, imc;
//        System.out.print("Peso...: ");
//        peso = Double.parseDouble(sc.nextLine());
//        System.out.print("Altura.: ");
//        alt = Double.parseDouble(sc.nextLine());
//        imc = peso / (alt * alt);
//        System.out.println("IMC..: " + imc);
//        
//        if (imc < 18.5) {
//             System.out.println("Abaixo do peso");
//
//        }
//        else if (imc < 25) {
//             System.out.println("Peso Normal");
//
//        } else if (imc < 30) {
//             System.out.println("Sobrepeso");
//
//        } else if (imc < 35) {
//             System.out.println("Obesidade grau 1");
//
//        } else if (imc < 40) {
//             System.out.println("Obesidade Grau 2");
//
//        }
//        else {
//             System.out.println("Obesidade Grau 3");
//
//        }
        //  Fim Programa Verifica IMC


    }

}
