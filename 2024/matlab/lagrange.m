% Made by Mónica Gómez (Autumn64), 2024

fprintf("***** INTERPOLACIÓN DE LAGRANGE *****\n");
X = input("Valores de X: ");
Y = input("Valores de Y: ");
x = input("Valor a interpolar: ");

function [y]=Lagrange(x, X, Y)
  y = 0;
  for i = 1:numel(X)
    L = 1;
    for j = 1:numel(X)
      if j~=i
        L = L*(x-X(j))/(X(i)-X(j));
      endif
    endfor
    y = y+L*Y(i);
  endfor
end

fprintf("\n   RESULTADO: %2.5f\n", Lagrange(x, X, Y));
