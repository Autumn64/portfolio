% Made by Mónica Gómez (Autumn64)

clear all;
clc;

f = @(x) 400*x^5 - 900*x^4 + 675*x^3 - 200*x^2 + 25*x + 0.2;

fprintf("***** MÉTODO DE ROMBERG *****\n\n");
fprintf("Integrando la función f(x) = 400x^5 - 900x&4 + 675x^3 - 200x^2 + 25x + 0.2\n\n");
n = input("Dame el número de segmentos (n): ");
a = input("Dame el límite inferior (a): ");
b = input("Dame el límite superior (b): ");

h = (b - a) / n;
r = zeros(2, n+1);
r(1, 1) = (f(a) + f(b))/2 * h;

for i = 2:n
  sum = 0;
  for k = 1:2^(i - 2)
    sum = sum + f(a+(k - 0.5) * h);
  end
  r(2, 1) = (r(1, 1) + h * sum) / 2;

  for j = 2:i
    l = 2^(2 * (j - 1));
    r(2, j) = r(2, j - 1) + r(2, j - 1) - r(1, j - 1) / (l - 1);
  end

  h = h / 2;

  for j = 1:i
    r(1, j) = r(2, j);
  end
end

fprintf("RESULTADO: %.4f\n", r(end, end - 1));
