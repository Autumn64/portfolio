% Made by Mónica Gómez (Autumn64)

clear all;
clc;

f = @(x) 400*x^5 - 900*x^4 + 675*x^3 - 200*x^2 + 25*x + 0.2;

fprintf("***** MÉTODO DEL TRAPECIO *****\n\n");
fprintf("Integrando la función f(x) = 400x^5 - 900x&4 + 675x^3 - 200x^2 + 25x + 0.2\n\n");
n = input("Dame el número de segmentos (n): ");
a = input("Dame el límite inferior (a): ");
b = input("Dame el límite superior (b): ");

h = (b - a) / n;
x = a;
sum = f(x);
for i = 1:(n-1)
  x = x + h;
  sum = sum + 2 * f(x);
end
sum = sum + f(b);

r = (b - a) * sum / (2 * n);

fprintf("RESULTADO: %.4f\n", r);
