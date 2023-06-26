import math
import random
from random import shuffle

#arredondar um número para baixo (floor) / arredondar para cima (ceil) / para exibir valor inteiro (trunc)
n1 = float(input('Digite um número real '))
print('Esse número real arredondada para um número inteiro é {}'.format(math.floor(n1)))

#soma do valor da hipotenusa
co = float(input('Digite o valor do cateto oposto '))
ca = float(input('Digite o valor do cate adjacente '))
hi = math.hypot(co, ca)
print('O valor da hipotenusa é {:.2f}'.format(hi))

#exibir valores de Seno, Cosseno, Tangente
n1 = float(input('Digite o valor do ângulo '))
sen = math.sin(math.radians(n1))
cos = math.cos(math.radians(n1))
tan = math.tan(math.radians(n1))
print('Este ângulo de {} em: seno: {:.2f} cosseno: {:.2f} tangente: {:.2f}'.format(n1, sen, cos, tan))

#sortear nome aleatório
n1 = input('Primeiro nome ')
n2 = input('Segundo nome ')
n3 = input('Terceiro nome ')
n4 = input('Quarto nome ')
lista = [n1, n2, n3, n4]
re = random.choice(lista)
print('O nome do sorteado é {}'.format(re))

#sorterar lista de ordem aleatória
from random import shuffle
n1 = input('Primeiro nome ')
n2 = input('Segundo nome ')
n3 = input('Terceiro nome ')
n4 = input('Quarto nome ')
lista = [n1, n2, n3, n4]
shuffle(lista)
print('A ordem de apresentação será')
print(lista)
