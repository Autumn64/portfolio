% 660103897.
% Este código hace que la computadora explote xD.

syms y(t) T;
f = 0.01 * y * (1 - y / 10);

y0 = 6.18;
t0 = 0;
tf = 23;


i = 10;
F = y0;

for k = 1:i
    F = y0 + int(subs(f, y, F), T, t0, t);
    F = simplify(F);
    fprintf("  Iteración %d: ", k);
    disp(F);
end

fprintf("Resultado: %.2f\n", double(subs(F, t, tf)));