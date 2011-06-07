#TimeAgo

###Proposta
Dado uma data deve-se calcular quanto tempo atrás esta data está e devolver em formato texto seguindo as seguintes condições:

	Se data < 60s então exibir: agora
	Se data = 1m então exibir: 1 minuto atrás
	Se data < 1h então exibir: {x} minutos atrás
	Se data = 1h então exibir: 1 hora atrás
	Se data < 24h então exibir: {x} horas atrás
	Se data = 24h então exibir: 1 dia atrás
	Se data < 7d então exibir: {x} dias atrás
	Se data = 7d então exibir: 1 semana atrás
	Se data < 30d então exibir: {x} semanas atrás
	Se data = 1M então exibir: 1 mês atrás
	Se data < 12M então exibir: {x} meses atrás
	Se data = 1a então exibir: 1 ano atrás
	Se data <= 5a então exibir: {x} anos atrás
	Se data > 5a então exibir a data no formato dd/mm/aaaa
	
Onde {x} é a quantidade inteira da unidade de tempo pedida e não deve ser maior do que o próximo limite estabelecido.

###Resultado

Boa parte dos casos foram implementados, mas não todos.
Sinta-se à vontade para dar continuidade ao exercício ou fazer uso desse código como desejar.
