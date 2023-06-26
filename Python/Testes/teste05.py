n1 = int(input('Digite um número '))
n2 = int(input("Digite outro "))
print('A soma de {} e {} é: {}, sendo seu antecessor: {} e seu sucessor: {}'
      .format(n1, n2, n1+n2, (n1+n2)-1, (n1+n2)+1))
print('Sendo o dobro: {}, o triplo: {}, e sua raiz quadrada: {:.3f}'.format((n1+n2)*2, (n1+n2)*3, (n1+n2)**(1/2)))

#ex media
print('Cálculo de média')
n3 = float(input('Digite sua nota '))
n4 = float(input('Digite sua nota '))
print('Sua média é: {}'.format((n3+n4)/2))

#ex distancia
km = float(input('Quantos kilômetros você anda? '))
print('Essa distância em metros é: {}, em centímetros: {}, em milímetros: {}'.format(km*1000, km*100000, km*1000000))

#ex tabuada
print('Tabuada')
t = int(input('Digite um número inteiro '))
print('1x={}, 2x={}, 3x={}, 4x={}, 5x={}, 6x={}, 7x={}, 8x={}, 9x={}, 10x={}'
      .format(t*1, t*2, t*3, t*4, t*5, t*6, t*7, t*8, t*9, t*10))

#ex conversor
print('Conversor de reais para dólares, sendo o dólar: 3,27')
d = float(input('Digite um valor em reais '))
print('O valor em dólares é: {:.2f}'.format((d*1)/3.27))

#ex tinta
print('Cálculo de quantidade de tinta necessária para pintar uma parede, sendo que cada litro pintara 2m²')
l = float(input('Comprimento da parede '))
h = float(input('Altura da parede '))
print('Sendo a parede {}x{} com uma área total de: {:.3}m², será necessário {:.3} litros de tinta'
      .format(l, h,l*h, (l*h)/2 ))

#ex desconto
print('Aplicar 5% de desconto em um produto')
pd = float(input('Insira o valor do produto '))
print('Novo valor com deconto aplicado: {:.2f}'.format((pd*95)/100))

#ex aumento de 15%
print('Aplicar um aumento de 15% a um valor ')
am = float(input('Insira um valor'))
print('Novo valor com aumento aplicado: {}'.format((am*115)/100))

#ex graus
print('Converter Celsius para Fahrenheit')
c = float(input('Digite o valor em Celsius '))
print('Este valor em Celsius {:.1f} convertido para Fahrenheit é {:.1f}'.format(c, ((c*9)/5)+32))

#aluguel de carro
print('Total a pagar pela locação')
km = float(input('Digite o total de Kilometros rodados '))
d = int(input('Digite a quantidade de dias utilizados '))
print('O total a pagar pela quantidade de dias {} e kilometros {} rodados é R$:{:.2f}'.format(d, km, (d*60) + (km*0.15)))
