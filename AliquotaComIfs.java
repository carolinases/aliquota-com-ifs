package SintaxeTiposEFluxo;

import javax.swing.*;

public class AliquotaComIfs {
    public static void main(String[] args) {

        // De 1.903,99 até 2.826,65 o IR é de 7.5% e pode deduzir R$ 142
        // De 2.826,66 até 3.751,05 o IR é de 15% e pode deduzir R$ 350
        // De 3.751,06 até 4.664,68 o IR é de 22.5% e pode deduzir R$ 636
        // Acima de 4.664,68 o IR é de 27.5% e pode deduzir R$ 869

        System.out.println("Alíquota com ifs");

        double salario = Double.parseDouble((JOptionPane.showInputDialog("Entre com o salário: ")));

        if (salario >= 1903.98 && salario <= 2886.65) {
            System.out.println("A sua aliquota é de 7,5%");
            System.out.println("Você pode deduzir até R$ 142,80");
        } else if (salario >= 2886.65 && salario <= 3751.05) {
            System.out.println("A sua aliquota é de 15%");
            System.out.println("Você pode deduzir até R$ 350,80");
        } else if (salario >= 3751.05 && salario <= 4664.68) {
            System.out.println("A sua aliquota é de 22,5%");
            System.out.println("Você pode deduzir até R$ 636,13");
        } else if (salario > 4664.68) {
            System.out.println("A sua aliquota é de 27,5%");
            System.out.println("Você pode deduzir até R$ 869,36");
        } else {
            System.out.println("Não se aplica. Talvez você queira dar uma olhada no site da receita: " +
                    "http://receita.economia.gov.br/acesso-rapido/tributos/irpf-imposto-de-renda-pessoa-fisica");
        }
    }
}
