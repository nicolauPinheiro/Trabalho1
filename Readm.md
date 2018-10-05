# Trabalho1
trabalho de técnicas de programação

ANTONIO NICOLAU PINHEIRO SOARES



Abra o netbeans, clique na aba arquivo e selecionar a opção Abrir Projeto e seleciona a pasta do projeto enviado. Entre no pacote trabalho1 do projeto, na classe principal e pressione a tecla F6 
do seu teclado para iniciar a execução. 
Ao executar o programa desenvolvido aparecerá uma tela de boas vindas informando o objetivo do programa (cadastro de contas). Para iniciar o cadastro das 
contas é preciso que o usuário clique no botão CLIQUE AQUI PARA INICIAR. Então aparecerá um formulário com os campos nome, número(inteiro) e saldo(Double) para ser preenchido com os dados 
referente a criação de uma conta comum. Para finalizar o cadastro da conta comum é preciso clicar no botão CADASTRAR. Depois do passo anterior, irá aparecer um tela com formulário cujos campos 
são nome(String), número(int), saldo(Double) e reajuste(%)(Double) referentes a criação da conta poupança.  Depois irá aparecer o próximo formulário com os campos nome, numero(inteiro), 
saldo(Double), limite (int) e  multa (Double), novamente para finalizar o cadastro é preciso clicar no botão CADASTRAR. Pronto, agora existe as operações que você realizar nas contas cadastradas, 
como a de saque, deposito, transferência, ver saldo ou reajustar(para conta poupança). Cada operação  para ser realizada precisa ser passado o numero da conta que se deseja realizar a operação 
em questão, o valor ou mesmo outro numero de conta(no caso da transferência) para que seja realizada a operação utilizando os dados informados. Ainda existe uma tela de confirmação  no qual o 
usuário pode continuar a operação selecionada ou cancelá-la.

COMENTÁRIOS  SOBRE A IMPLEMENTAÇÃO: a classe principal possui os objetos de contas, criados de forma estática para que ao alterar o 
JFraes, não se perca os valores guardados  nas variáveis e objetos propriamente dito. Lá também está os principais métodos de atribuição de objetos conforme a operação na qual eles estão 
submetidos. Os demais JFrames possui objetos do tipo Principal para que faça uma ligação com o JFrame da classe principal e repasse os valores que foram inseridos nestes JFrames de forma 
a preencher os 3 principais objetos do programa conforme as operações realizadas sobre eles.

