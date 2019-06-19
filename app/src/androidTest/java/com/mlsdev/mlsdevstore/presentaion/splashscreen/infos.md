# Android

No Android tentei fazer o máximo para reaproveitar código, como fiz no iOS. Dentro da pasta pages, tem a abstração das ações de cada page acessada nos testes.

Exemplo: adicionei método que acessa uma categoria, por título ou por posição, que pode ser usado sempre que o teste precisar acessar uma categoria na listagem de categorias.
O mesmo serve para selecionar um item dentro de uma loja, mas este foi acessado por posição, mas nada impede que seja criado um método que acesso pelo título, por exemplo.

Em helpers, foi adicionado método para validar se um texto está presente na tela, e outro que fecha a mensagem de erro (bug que será citado ao longo do texto).

OBS: dentro de ItemPage foi adicionado um método que fecha a mensagem de erro. Este método fiz somente para contornar o problema e continuar o teste, mas sei que não é o certo, pois o problema deve ser reportado e corrigido para o cenário ser executado com sucesso. Ainda, ao add um item como favorito, estou clicando 2 vezes na ação, pois é um bug, e será reportado ao longo do texto.

OBS2: Estou usando alguns sleep() nos testes, mas sei que não é uma boa prática, o correto é fazer algo que espere o elemento estar presente na tela.

Acredito que alguns casos poderia ter feito métodos mais genéricos fazendo com que o código fosse ainda mais reaproveitado durante os testes, e ter feito outras validações durante a passagem das telas, mas fiz o máximo com o tempo que tinha disponível.

Bugs: Alguns bugs foram encontrados, como por exemplo:

#1 - Mensagem de erro ao acesso item

*Passos:*
- Escolher uma categoria
- Acessar um item

*Resultado atual:* ao acessar um item uma mensagem de erro é apresentada na tela
*Resultado esperado:* não exibir mensagem de erro


#2 - Erro ao finalizar pedido (checkout)

*Passos:*
- Escolher uma categoria
- Acessar um item
- Adicionar no carrinho
- Acessar carrinho
- Checkout
- Preencher todos os dados obrigatórios
- Fazer pedido

*Resultado atual:* mensagem de erro informado que algo de errado aconteceu é exibida.
*Resultado esperado:* fazer o pedido com sucesso.