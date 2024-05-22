% Made by Mónica Gómez (Autumn64), 2024

clear all;
clc;

fprintf("***** JACOBI ***** \n\n");
n = input("Número de ecuaciones (n): ");
A = input("Matriz A: ");
b = input("Matriz b: ");
m = input("Número máximo de iteraciones (m): ");
E = input("Margen de error (norma): ");

X0 = zeros(1,n);
X = X0;
K = 0;
Norma = 1;

while Norma > E
    K = K + 1;
    fprintf("%d", K);
    for i = 1 : n
        suma = 0;
        for j = 1 : n
            if i ~= j
                suma = suma + A(i,j)*X(j);
            end
        end
        X(i) = (b(i) - suma)/A(i,i);
        fprintf("%10.6f", X(i))
    end
    Norma = norm(X0-X);
    fprintf(" Norma:%10.6f\n", Norma);
    X0 = X;

    if K > m
        break;
    end
end

