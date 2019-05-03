# Trabalho-Java

**MANUAL DO USUÁRIO**

Ao entrar no repositório no site do github, você deve clicar em clonar or download e copiar o URL, caso você baixe o .ZIP do trabalho no site, você deve descompactar no seu computador e abrir como projeto no **NETBEANS**.

Quando ja estiver com o URl copiado, abra o Netbeans e clique nas seguintes opções respectivamente:
                                 
                                 Equipe>Git>Clonar

Após seguir esses passos irá aparecer uma tela, na parte onde tem URL do repositório você deve colar o URL que foi copiado, depois clique em próximo.
Irá aparecer outra tela mandando você escolher as ramificações remotas, nesse caso escolha somente a master* e clique em próximo.
Na outra tela que apareceu, você deve escolher o diretório-pai do clone que foi feito e assim deixe do jeito que está e clique em finalizar.
Logo após aparecerá outra tela exibindo uma mensagem afirmando que o projeto foi clonado e se você deseja abrir, diante disso clique em Abrir Projeto.
Depois disso basta execultar o programa. após ser execultado o programa vai clonar e compilar os arquivos da pasta.

Como as classes **Contas.java**, **ContaPoupanca.java**, e **ContaEspecial.java** não tem uma função principal se você tentar execultar vai aparecer uma mensagem dizendo que as classes não tem uma função **main**, por isso você deve execultar a classe **Principal.java**.
logo após ter execultado o programa aparecerá uma mensagem de boas_vindas para você.

logo em seguida aparecerá uma tela para você pedindo o nome do titular, numero da conta e o saldo da sua conta comum, o mesmo processo se repete para a conta poupança.

após ter cadastrado sua conta comum e a poupança, você terá que cadastrar a conta especial, que se repete o processo da conta comum acrescentado do limite e da multa por ter sacado um valor maior do que o do saque, assim você deve cadastrar o limite e a multa para a conta especial.

**OBS**: caso o numero das contas tiverem sido cadastrado iguais o programa ira mostrar uma mensagem avisando e pedindo para cadastrar numeros de contas diferentes. 

**OBS**: O programa só irá continuar se os numeros das contas tiverem sido cadastrados diferentes!

logo em seguida aparecerá uma tela afirmando que o cadastro foi feito, e você deve clicar em continuar.

Diante disso aparecerá uma outra tela mostrando as opções disponiveis para o usuário:

- Se você clicar na opção **Saque** aparecerá uma outra tela pedindo o numero da conta que você deseja sacar e o valor do saque, diante disso confirme os dados. Dependendo das condições o saque será feito e será exibida uma mensagem em outra tela afirmando que a operação foi realizada, quando se tratar de sacar dinheiro da conta especial o valor do saque obrigatóriamente tem que esá entre 0 e o valor saldo ou ser igual ao valor do limite, casdo contrário o saldo será atualizado tomando como base, como você utilizou todo o limite.
Caso você cancelar, aparecerá uma mensagem afirmando que o saque foi cancelado.
- Se você clicar na opção **Deposito** aparecerá uma outra tela com uma mensagem solicitando ao usuário que digite o numero da conta e o valor para realizar o depósito, diante disso confirme os dados. Se o valor do depósito for válido aparecerá uma outra tela informando que a operação foi realizada com sucesso.
Caso você cancelar, aparecerá uma mensagem afirmando que o depósito foi cancelado.
- Se você clicar na opção **Transferência** aparecerá uma tela solicitando ao usuário que digite o número da conta que será feito a transferência , após isso solicitará ao usuário o número da conta que irá receber a transferência, diante disso insira o valor da transferência e confirme, aparecerá uma mensagem informando a conclusão da operação.
Caso você cancelar, aparecerá uma mensagem afirmando que a tranferência foi cancelada.
- Se você clicar na opção **Reajustar** aparecerá uma tela solicitando a taxa de conversão para a conta poupança, caso você não digite nada o programa irá tomar como reajuste de 10% para a conta poupança, caso contrário você deve digitar o valor do reajuste e logo após afirmará que o reajuste foi realizado com sucesso.
- Se você clicar na opção **Ver Saldo** aparecerá uma tela mostrando todos os saldos atualizados, inclusive mostra também os nomes dos titulares das contas e os numeros das contas, que é uma otima opção caso você esqueça o numero da conta.
-Se você clicar na opção **Sair** encerrará todo o programa.


**Aluno: Francisco Johnes Queiroz Sousa**

**Matrícula: 428374** 
