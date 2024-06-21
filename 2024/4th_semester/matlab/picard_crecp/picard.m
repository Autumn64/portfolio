f = @(t, y) 0.0088 * y .* (1 + y / 10000000000);

y0 = 6148898975;
t0 = 0;
tf = 23;

iteraciones = 1000;


num_points = 1000;
t = linspace(t0, tf, num_points);

y = y0 * ones(size(t));

for k = 1:iteraciones
    y_prev = y;
    for i = 2:length(t)
        y(i) = y0 + trapz(t(1:i), f(t(1:i), y_prev(1:i)));
    end
end

figure;
plot(t, y, 'LineWidth', 2);
xlabel('Tiempo t');
ylabel('Población y');
title('Aproximación con Picard');
grid on;
