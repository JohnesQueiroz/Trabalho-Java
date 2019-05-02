/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabalho1;

/**
 *
 * @author johnes
 */
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        Contas comum = new Contas();
        ContaPoupanca poupanca = new ContaPoupanca();
        ContaEspecial especial = new ContaEspecial();
        int conta1;
        int conta2;
        int conta3;
        double saqe;
        double depo;
        double trans;
        double reaj;
        double vers;
        int j, q = 0;
        String[] opcoes = {"Saque", "Depósito", "Transfência", "Reajustar", "Ver saldos", "sair"};
        String[] opcoes2 = {"Confirmar", "Cancelar"};
        String[] opcao3 = {"Voltar"};
        String[] opcao4 = {"Continuar"};
              

        JOptionPane.showMessageDialog(null, " Bem Vindo(a)!");

        do {
            comum.setNome(JOptionPane.showInputDialog(null, "Digite o nome do titular da conta comum: ", "Nome do Titular Conta comum", JOptionPane.QUESTION_MESSAGE));
            comum.setNumero(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero da conta comum: ", "Número da Conta comum", JOptionPane.QUESTION_MESSAGE)));
            comum.setSaldo(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o saldo de conta comum (R$):", "Saldo Conta comum", JOptionPane.QUESTION_MESSAGE)));

            poupanca.setNome(JOptionPane.showInputDialog(null, "Digite o nome do titular da conta poupança: ", "Nome do Titular Conta poupança", JOptionPane.QUESTION_MESSAGE));
            poupanca.setNumero(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero da conta poupança: ", "Número da Conta poupanca", JOptionPane.QUESTION_MESSAGE)));
            poupanca.setSaldo(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o saldo de conta poupanca (R$):", "Saldo Conta poupanca", JOptionPane.QUESTION_MESSAGE)));

            especial.setNome(JOptionPane.showInputDialog(null, "Digite o nome do titular da conta especial: ", "Nome do Titular Conta especial", JOptionPane.QUESTION_MESSAGE));
            especial.setNumero(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero da conta especial: ", "Número da Conta especial", JOptionPane.QUESTION_MESSAGE)));
            especial.setSaldo(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o saldo de conta especial (R$):", "Saldo Conta especial", JOptionPane.QUESTION_MESSAGE)));
            especial.limite = (Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o limite da Conta especial (R$):", "Limite do titular da conta especial", JOptionPane.QUESTION_MESSAGE)));
            reaj = (Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a multa para conta especial (%): :", "Multa da Conta especial", JOptionPane.QUESTION_MESSAGE)));

            if ((comum.getNumero() == poupanca.getNumero()) || (comum.getNumero() == especial.getNumero())) {
                
                JOptionPane.showOptionDialog(null, "Número das contas iguais! Refaça o processo de cadastro.", "Contas", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcao3, opcao3[0]);
            } else 
            {
                JOptionPane.showOptionDialog(null, "Cadrastado com sucesso!", "Contas", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcao4, opcao4[0]);

            }

        } while ((comum.getNumero() == poupanca.getNumero()) || (comum.getNumero() == especial.getNumero()));

        do {
            j = JOptionPane.showOptionDialog(null, "Selecione a opção desejada:", "Contas", JOptionPane.CLOSED_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]);
            if (j == 0) {
                conta1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Número da conta para saque:", "Saque", JOptionPane.QUESTION_MESSAGE));
                saqe = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor do saque (R$)", "Saque", JOptionPane.QUESTION_MESSAGE));
                if (conta1 == comum.getNumero()) {

                    q = JOptionPane.showOptionDialog(null, "Nome do titular da conta:\n" + comum.getNome(), "Saque", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoes2, opcoes2[0]);
                    if (q == 0) {
                        if (saqe > 0) {
                            if (comum.getSaldo() >= saqe) {

                                comum.sacar(saqe);
                                q = JOptionPane.showOptionDialog(null, "saque efetuado com sucesso!", "Saque", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcao3, opcao3[0]);

                            } else {

                                JOptionPane.showOptionDialog(null, "Saldo insuficiente!", "Saque", JOptionPane.DEFAULT_OPTION, JOptionPane.OK_CANCEL_OPTION, null, opcao3, opcao3[0]);

                            }

                        } else {

                            JOptionPane.showOptionDialog(null, "Saque inválido", "Saque", JOptionPane.DEFAULT_OPTION, JOptionPane.OK_CANCEL_OPTION, null, opcao3, opcao3[0]);

                        }
                    } else {

                        JOptionPane.showOptionDialog(null, "Saque cancelado", "Saque", JOptionPane.DEFAULT_OPTION, JOptionPane.OK_CANCEL_OPTION, null, opcao3, opcao3[0]);

                    }

                } else if (conta1 == poupanca.getNumero()) {

                    q = JOptionPane.showOptionDialog(null, "Nome do titular da conta:\n" + poupanca.getNome(), "Saque", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoes2, opcoes2[0]);
                    if (q == 0) {
                        if (saqe > 0) {
                            if (poupanca.getSaldo() >= saqe) {

                                poupanca.sacar(saqe);
                                q = JOptionPane.showOptionDialog(null, "saque efetuado com sucesso!", "Saque", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcao3, opcao3[0]);

                            } else {

                                JOptionPane.showOptionDialog(null, "Saldo insuficiente!", "Saque", JOptionPane.DEFAULT_OPTION, JOptionPane.OK_CANCEL_OPTION, null, opcao3, opcao3[0]);

                            }

                        } else {

                            JOptionPane.showOptionDialog(null, "Saque inválido", "Saque", JOptionPane.DEFAULT_OPTION, JOptionPane.OK_CANCEL_OPTION, null, opcao3, opcao3[0]);

                        }
                    } else {

                        JOptionPane.showOptionDialog(null, "Saque cancelado", "Saque", JOptionPane.DEFAULT_OPTION, JOptionPane.OK_CANCEL_OPTION, null, opcao3, opcao3[0]);

                    }
                } else if (conta1 == especial.getNumero()) {
                    q = JOptionPane.showOptionDialog(null, "Nome do titular da conta:\n" + especial.getNome(), "Saque", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoes2, opcoes2[0]);
                    if (q == 0) {
                        if (saqe > 0) {
                            if (especial.getSaldo() >= saqe) {

                                especial.sacar(saqe);
                                q = JOptionPane.showOptionDialog(null, "saque efetuado com sucesso!", "Saque", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcao3, opcao3);

                            } else if (especial.getSaldo() + especial.limite > saqe) {
                                especial.sacar(saqe);
                                especial.descontar(reaj);
                                q = JOptionPane.showOptionDialog(null, "saque efetuado usando cheque especial!", "Saque", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcao3, opcao3);

                            } else {

                                JOptionPane.showOptionDialog(null, "Saldo insuficiente!", "Saque", JOptionPane.DEFAULT_OPTION, JOptionPane.OK_CANCEL_OPTION, null, opcao3, opcao3[0]);

                            }

                        } else {

                            JOptionPane.showOptionDialog(null, "Saque invàlido", "Saque", JOptionPane.DEFAULT_OPTION, JOptionPane.OK_CANCEL_OPTION, null, opcao3, opcao3[0]);

                        }
                    } else {

                        JOptionPane.showOptionDialog(null, "Saque cancelado", "Saque", JOptionPane.DEFAULT_OPTION, JOptionPane.OK_CANCEL_OPTION, null, opcao3, opcao3[0]);

                    }

                } else {
                    JOptionPane.showOptionDialog(null, "Número da conta inexistente", "Saque", JOptionPane.DEFAULT_OPTION, JOptionPane.OK_CANCEL_OPTION, null, opcao3, opcao3[0]);

                }

            }

            if (j == 1) {
                conta1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Numero da conta para deposito", " Depósito", JOptionPane.QUESTION_MESSAGE));
                depo = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor do deposito(R$)", "Depósito", JOptionPane.QUESTION_MESSAGE));
                if (conta1 == comum.getNumero()) {
                    q = JOptionPane.showOptionDialog(null, "Nome do titular da conta:\n" + comum.getNome(), "Depósito", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoes2, opcoes2[0]);

                    if (q == 0) {

                        if (depo > 0) {
                            comum.saldo = comum.depositar(depo);
                            JOptionPane.showOptionDialog(null, "Depósito efetuado com sucesso! ", "Depósito", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcao3, opcao3[0]);

                        } else {
                            JOptionPane.showOptionDialog(null, "Depósito inválido! ", "Depósito", JOptionPane.DEFAULT_OPTION, JOptionPane.OK_CANCEL_OPTION, null, opcao3, opcao3[0]);

                        }

                    } else {
                        JOptionPane.showOptionDialog(null, "Depósito cancelado\n! ", "Depósito", JOptionPane.DEFAULT_OPTION, JOptionPane.OK_CANCEL_OPTION, null, opcao3, opcao3[0]);

                    }

                } else if (conta1 == poupanca.getNumero()) {
                    q = JOptionPane.showOptionDialog(null, "Nome do titular da conta:\n" + comum.getNome(), "Depósito", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoes2, opcoes2[0]);

                    if (q == 0) {

                        if (depo > 0) {
                            poupanca.saldo = poupanca.depositar(depo);
                            JOptionPane.showOptionDialog(null, "Depósito efetuado com sucesso! ", "Depósito", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcao3, opcao3[0]);

                        } else {
                            JOptionPane.showOptionDialog(null, "Depósito inválido! ", "Depósito", JOptionPane.DEFAULT_OPTION, JOptionPane.OK_CANCEL_OPTION, null, opcao3, opcao3[0]);

                        }

                    } else {
                        JOptionPane.showOptionDialog(null, "Depósito cancelado\n! ", "Depósito", JOptionPane.DEFAULT_OPTION, JOptionPane.OK_CANCEL_OPTION, null, opcao3, opcao3[0]);

                    }

                } else if (conta1 == especial.getNumero()) {
                    q = JOptionPane.showOptionDialog(null, "Nome do titular da conta:\n" + comum.getNome(), "Depósito", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoes2, opcoes2[0]);

                    if (q == 0) {

                        if (depo > 0) {
                            especial.saldo = especial.depositar(depo);
                            JOptionPane.showOptionDialog(null, "Depósito efetuado com sucesso! ", "Depósito", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcao3, opcao3[0]);

                        } else {
                            JOptionPane.showOptionDialog(null, "Depósito inválido! ", "Depósito", JOptionPane.DEFAULT_OPTION, JOptionPane.OK_CANCEL_OPTION, null, opcao3, opcao3[0]);

                        }

                    } else {
                        JOptionPane.showOptionDialog(null, "Depósito cancelado\n! ", "Depósito", JOptionPane.DEFAULT_OPTION, JOptionPane.OK_CANCEL_OPTION, null, opcao3, opcao3[0]);

                    }

                } else {
                    JOptionPane.showOptionDialog(null, "Número da conta inexistente!", "Depósito", JOptionPane.DEFAULT_OPTION, JOptionPane.OK_CANCEL_OPTION, null, opcao3, opcao3[0]);
                }

            }
            if (j == 2) {
                conta2 = Integer.parseInt(JOptionPane.showInputDialog(null, " Número da conta que irá transferir: ", " Transferência ", JOptionPane.QUESTION_MESSAGE));
                conta3 = Integer.parseInt(JOptionPane.showInputDialog(null, " Número da conta que irá receber : ", " Transferência ", JOptionPane.QUESTION_MESSAGE));
                if ((conta2 == comum.getNumero() || conta2 == poupanca.getNumero() || conta2 == especial.getNumero()) && (conta3 == comum.getNumero() || conta3 == poupanca.getNumero() || conta3 == especial.getNumero())) {
                    if ((conta2 == comum.getNumero()) && (conta3 == poupanca.getNumero())) {
                        vers = Double.parseDouble(JOptionPane.showInputDialog(null, " Valor da Transferência (R$): ", " Transferência ", JOptionPane.QUESTION_MESSAGE));
                        q = JOptionPane.showOptionDialog(null, "Nome dos titulares da conta:\n " + comum.getNome() + "\n" + poupanca.getNome(), "Saque", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoes2, opcoes2[0]);
                        if (q == 0) {
                            if (vers > 0 && vers <= comum.saldo) {
                                comum.saldo = comum.saldo - vers;
                                poupanca.saldo = poupanca.saldo + vers;
                                JOptionPane.showOptionDialog(null, "Transferência efetuada com sucesso!\n", "Transferência", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcao3, opcao3[0]);
                            } else {
                                JOptionPane.showOptionDialog(null, "transferência invalida ou valor excedeo saldo da conta de " + comum.getNome() + ", N°" + comum.getNumero() + "!\n", "Transferência", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcao3, opcao3[0]);
                            }
                        } else {
                            JOptionPane.showOptionDialog(null, "Transferência cancelada!\n", "Transferência", JOptionPane.DEFAULT_OPTION, JOptionPane.OK_CANCEL_OPTION, null, opcao3, opcao3[0]);
                        }

                    }
                    if ((conta2 == comum.getNumero()) && (conta3 == especial.getNumero())) {
                        vers = Double.parseDouble(JOptionPane.showInputDialog(null, " Valor da Transferência (R$): ", " Transferência ", JOptionPane.QUESTION_MESSAGE));
                        q = JOptionPane.showOptionDialog(null, "Nome dos titulares da conta:\n " + comum.getNome() + "\n" + especial.getNome(), "Saque", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoes2, opcoes2[0]);

                        if (q == 0) {
                            if (vers > 0 && vers <= comum.saldo) {
                                comum.saldo = comum.saldo - vers;
                                especial.saldo = especial.saldo + vers;
                                JOptionPane.showOptionDialog(null, "Transferência efetuada com sucesso!\n", "Transferência", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcao3, opcao3[0]);

                            } else {
                                JOptionPane.showOptionDialog(null, "transferência invalida ou valor excede saldo da conta de " + comum.getNome() + ", N°" + comum.getNumero() + "!\n", "Transferência", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcao3, opcao3[0]);

                            }
                        } else {
                            JOptionPane.showOptionDialog(null, "Transferência cancelada!\n", "Transferência", JOptionPane.DEFAULT_OPTION, JOptionPane.OK_CANCEL_OPTION, null, opcao3, opcao3[0]);

                        }
                    }
                    if ((conta2 == poupanca.getNumero()) && (conta3 == comum.getNumero())) {

                        vers = Double.parseDouble(JOptionPane.showInputDialog(null, " Valor da Transferência(R$): ", " Transferência ", JOptionPane.QUESTION_MESSAGE));
                        q = JOptionPane.showOptionDialog(null, "Nome dos titulares das conta:\n " + poupanca.getNome() + "\n" + comum.getNome(), "Saque", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoes2, opcoes2[0]);
                        if (q == 0) {
                            if (vers > 0 && vers <= poupanca.saldo) {
                                poupanca.saldo = poupanca.saldo - vers;
                                comum.saldo = comum.saldo + vers;
                                JOptionPane.showOptionDialog(null, "Transferência efetuada com sucesso!\n", "Transferência", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcao3, opcao3[0]);

                            } else {
                                JOptionPane.showOptionDialog(null, "transferência invalida ou valor excede saldo da conta de " + poupanca.getNome() + ", N°" + poupanca.getNumero() + "!\n", "Transferência", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcao3, opcao3[0]);

                            }
                        } else {
                            JOptionPane.showOptionDialog(null, "Transferência cancelada!\n", "Transferência", JOptionPane.DEFAULT_OPTION, JOptionPane.OK_CANCEL_OPTION, null, opcao3, opcao3[0]);

                        }
                    }
                    if ((conta2 == poupanca.getNumero()) && (conta3 == especial.getNumero())) {
                        vers = Double.parseDouble(JOptionPane.showInputDialog(null, " Valor da Transferência (R$): ", " Transferência ", JOptionPane.QUESTION_MESSAGE));
                        q = JOptionPane.showOptionDialog(null, "Nome dos titulares das conta:\n " + poupanca.getNome() + "\n" + especial.getNome(), "Saque", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoes2, opcoes2[0]);

                        if (q == 0) {
                            if (vers > 0 && vers <= poupanca.saldo) {
                                poupanca.saldo = poupanca.saldo - vers;
                                especial.saldo = especial.saldo + vers;
                                JOptionPane.showOptionDialog(null, "Transferência efetuada com sucesso!\n", "Transferência", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcao3, opcao3[0]);

                            } else {
                                JOptionPane.showOptionDialog(null, "transferência invalida ou valor excede saldo da conta de " + poupanca.getNome() + ", N°" + poupanca.getNumero() + "!\n", "Transferência", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcao3, opcao3[0]);

                            }
                        } else {
                            JOptionPane.showOptionDialog(null, "Transferência cancelada!\n", "Transferência", JOptionPane.DEFAULT_OPTION, JOptionPane.OK_CANCEL_OPTION, null, opcao3, opcao3[0]);

                        }
                    }
                    if ((conta2 == especial.getNumero()) && (conta3 == comum.getNumero())) {
                        vers = Double.parseDouble(JOptionPane.showInputDialog(null, " Valor da Transferência (R$): ", " Transferência ", JOptionPane.QUESTION_MESSAGE));
                        q = JOptionPane.showOptionDialog(null, "Nome dos titulares das conta:\n " + especial.getNome() + "\n" + comum.getNome(), "Saque", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoes2, opcoes2[0]);

                        if (q == 0) {
                            if (vers > 0 && vers <= especial.saldo) {
                                especial.saldo = especial.saldo - vers;
                                comum.saldo = comum.saldo + vers;
                                JOptionPane.showOptionDialog(null, "Transferência efetuada com sucesso!\n", "Transferência", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcao3, opcao3[0]);

                            } else {
                                JOptionPane.showOptionDialog(null, "transferência invalida ou valor excede saldo da conta de " + especial.getNome() + ", N°" + especial.getNumero() + "!\n", "Transferência", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcao3, opcao3[0]);

                            }
                        } else {
                            JOptionPane.showOptionDialog(null, "Transferência cancelada!\n", "Transferência", JOptionPane.DEFAULT_OPTION, JOptionPane.OK_CANCEL_OPTION, null, opcao3, opcao3[0]);

                        }
                    }
                    if ((conta2 == especial.getNumero()) && (conta3 == poupanca.getNumero())) {
                        vers = Double.parseDouble(JOptionPane.showInputDialog(null, " Valor da Transferência de valor (R $): ", " Transferência ", JOptionPane.QUESTION_MESSAGE));
                        q = JOptionPane.showOptionDialog(null, "Nome dos titulares das conta:\n " + especial.getNome() + "\n" + poupanca.getNome(), "Saque", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoes2, opcoes2[0]);

                        if (q == 0) {
                            if (vers > 0 && vers <= especial.saldo) {
                                especial.saldo = especial.saldo - vers;
                                poupanca.saldo = poupanca.saldo + vers;
                                JOptionPane.showOptionDialog(null, "Transferência efetuada com sucesso!\n", "Transferência", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcao3, opcao3[0]);

                            } else {
                                JOptionPane.showOptionDialog(null, "transferência invalida ou valor excede saldo da conta de " + especial.getNome() + ", N°" + especial.getNumero() + "!\n", "Transferência", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcao3, opcao3[0]);

                            }
                        } else {
                            JOptionPane.showOptionDialog(null, "Transferência cancelada!\n", "Transferência", JOptionPane.DEFAULT_OPTION, JOptionPane.OK_CANCEL_OPTION, null, opcao3, opcao3[0]);

                        }
                    }
                } else if (conta2 == conta3) {
                    JOptionPane.showOptionDialog(null, "Numeros das contas iguais!\n", "Transferência", JOptionPane.DEFAULT_OPTION, JOptionPane.OK_CANCEL_OPTION, null, opcao3, opcao3[0]);

                } else {
                    JOptionPane.showOptionDialog(null, "Numeros das contas diferente dos do cadastro!\n", "Transferência", JOptionPane.DEFAULT_OPTION, JOptionPane.OK_CANCEL_OPTION, null, opcao3, opcao3[0]);

                }
            }

            if (j == 3) {
                try {
                    trans = Double.parseDouble(JOptionPane.showInputDialog(null, " Taxa de conversão para a conta poupança(%): ", " Lucro da Conta Poupança ", JOptionPane.QUESTION_MESSAGE));
                    poupanca.saldo = poupanca.reajustar(trans);
                    JOptionPane.showOptionDialog(null, "Reajuste realizado com sucesso!\n", "Reajuste", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcao3, opcao3[0]);

                } catch (NumberFormatException s) {
                    poupanca.saldo = poupanca.reajustar();
                    JOptionPane.showOptionDialog(null, "Reajuste realizado com sucesso!\n", "Reajuste", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcao3, opcao3[0]);

                }
            }
            if (j == 4) {
                JOptionPane.showMessageDialog(null, "Saldo " + comum.tipoConta() + "," + comum.getNome() + ", N°" + comum.getNumero() + ":\n " + comum.saldo + " Reais\n Saldo " + poupanca.tipoConta() + "," + poupanca.getNome() + ", N°" + poupanca.getNumero() + ":\n " + poupanca.saldo + " Reais\n Saldo " + especial.tipoConta() + "," + especial.getNome() + ", N°" + especial.getNumero() + ":\n " + especial.saldo + " Reais");

            }
            if (j == 5) {
                System.exit(0);
            }
            q = 1;
        } while (q != 0);
    }
}
