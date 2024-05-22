// Made by Mónica Gómez (Autumn64).
#include <stdio.h>

int main(){
		int calif, n, acum = 0;

		printf("Dame el número de calificaciones: ");
		scanf("%d", &n);

		for(int i = 0; i < n; i++){
			printf("Dame la calificación del alumno %d: ", i + 1);
			scanf("%d", &calif);
			acum += calif;

		}

		float prom = (float)acum / (float) n;
		printf("Valor de la suma: %d\n", acum);
		printf("Valor del promedio: %f\n", prom);

		return 0;
}
