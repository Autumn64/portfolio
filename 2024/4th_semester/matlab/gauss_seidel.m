% Made by Mónica Gómez (Autumn64), 2024

clear;
clc;
pause(0.5);

fprintf("GAUSS-SEIDEL\n");
A = input("Matriz A: ");
B = input("Vector B: ");
X = input("Vector inicial: ");
n = input("Número de aproximaciones: ");
N = length(X);

for k=1:n
    for i=1:N
        s=A(i,1:i-1)*X(1:i-1) + A(i,i+1:N)*X(i+1:N);
        X(i)=(B(i)-s)/A(i,i);
    end
    fprintf("ITERACIÓN %.0f:\n", k);
    for i=1:N
        fprintf("    x(%1.0f)=%6.8f\n", i, X(i));
    end
end